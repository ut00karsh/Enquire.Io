
package phase1;

import action.jdbc;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class expert_auth extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          response.setContentType("text/html");
         
          String s1=  request.getParameter("id");
         
        
  
          String s5=request.getParameter("pwd");
       PrintWriter out = response.getWriter();
       
        RequestDispatcher rd;
        
       try
        {
           
           Connection c=jdbc.getCon();
           Statement s=c.createStatement();
           HttpSession session=request.getSession();
     
      
   
   
         String q="select expert_id,expert_name from expert_details where expert_id='"+s1+"'";
         
         String q1="select password from expert_details where password='"+s5+"'";
         
         
         
         
           ResultSet rs = jdbc.selectData(q);
            ResultSet rs1 = jdbc.selectData(q1);
     
      
               
               if(rs.next() && rs1.next())
             {
                            session.setAttribute("name",rs.getString("expert_name"));

                   session.setAttribute("role","expert");
                 session.setAttribute("ex_id",s1);
                 request.setAttribute("ex_id",rs.getString(1));
                
                 rd=request.getRequestDispatcher("ex_home.jsp");
               rd.include(request,response);
               
             }
               else
               {
                   request.setAttribute("msg","Invalid Credentials");
               rd=request.getRequestDispatcher("exlogin_signup.jsp");
               rd.include(request,response);
               }
                     
                   
        }
        catch(Exception e)
        {
            System.out.println(e);
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
