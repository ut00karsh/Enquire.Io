
package phase1;

import action.jdbc;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class frequent extends HttpServlet {

 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try  {
            
            
              int  s1 = Integer.parseInt(request.getParameter("query_id"));
            String user_id = request.getParameter("user_id");
            
            
            
          
            Connection c=jdbc.getCon();
            String q = "select * from frequent where query_id="+s1+" and user_id='"+user_id+"'";
            ResultSet rs = jdbc.selectData(q);
            
           if(rs.next() == false)
           {
            
                  String insert ="insert into frequent values("+s1+",'"+user_id+"',"+1+")";
                Statement s3 = c.createStatement();
		int i=s3.executeUpdate(insert);
               
          }
        else
           {
               String q1= "update frequent set count= count+1 where  query_id="+s1+" and user_id='"+user_id+"'";
           int i = jdbc.updateData(q1);
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
