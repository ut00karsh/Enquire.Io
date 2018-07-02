
package phase1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import action.jdbc;

import java.sql.*;

public class approval extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        RequestDispatcher rd;
        try  {
            int flag=Integer.parseInt(request.getParameter("flag"));
            if (flag == 1)
            {
                   String u_id=request.getParameter("ex_id");
                String select = "select * from ex_apply where ex_id='"+u_id +"'";
                ResultSet rs= jdbc.selectData(select);
                rs.next();
                String ex_id=rs.getString("ex_id");
                String name=rs.getString("name");
                String mail=rs.getString("Email");
                String password=rs.getString("password");
                String spec=rs.getString("specialization");
                
                
                  String insert ="insert into expert_details values('"+ex_id+"','"+name+"','"+mail+"','"+password+"','expert','"+spec+"')";
                   Connection c=jdbc.getCon();
              
                Statement s3 = c.createStatement();
		s3.executeUpdate(insert);
                  String query="delete from ex_apply where ex_id='"+ u_id+"'";
                   Statement s4 = c.createStatement();
		s4.executeUpdate(query);
                rd=request.getRequestDispatcher("view.jsp");
                rd.forward(request, response);
            }
            
            else
            {
                String u_id=request.getParameter("ex_id");
                
                String query="delete from ex_apply where ex_id='"+ u_id+"'";
                
               Connection c=jdbc.getCon();
              
                Statement s3 = c.createStatement();
		s3.executeUpdate(query);
                 rd=request.getRequestDispatcher("view.jsp");
                rd.forward(request, response);
            }
            
      
        }
        catch(Exception e)
        {
            out.println(""+e.getMessage());
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
