
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


public class authenticate extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
         response.setContentType("text/html");
         
          String s1=  request.getParameter("id");
         
          String i1= (request.getParameter("user_mail"));
  
          String s5=request.getParameter("pwd");
       PrintWriter out = response.getWriter();
       
        RequestDispatcher rd;
        
       try
        {
           
           Connection c=jdbc.getCon();
           Statement s=c.createStatement();
           HttpSession session=request.getSession();
           
       
         
        s1 = s1.replace("'", "\\'");
        s5= s5.replace("'", "\\'");
   
   
         String q="select user_id,user_name from user_details where user_id='"+s1+"'and password='"+s5+"'";
         
       
         
        
     
           ResultSet rs = jdbc.selectData(q);
     
            
            if(s1.equalsIgnoreCase("admin")&& s5.equalsIgnoreCase("Piyush1998"))
                     {     session.setAttribute("name","admin"); 
                         session.setAttribute("role","admin");
                         session.setAttribute("ad_id",s1);
               
                rd=request.getRequestDispatcher("ad_home.jsp");
               rd.forward(request,response);  
            }
           
      
               
               if(rs.next() )
             { session.setAttribute("name",rs.getString("user_name"));
                 session.setAttribute("u_id",s1);
                 session.setAttribute("role","user");
                 request.setAttribute("u_id",rs.getString(1));
                
                 rd=request.getRequestDispatcher("home.jsp");
               rd.include(request,response);
               
             }
               else
               {
                   request.setAttribute("msg","Invalid Credentials");
                 
               rd=request.getRequestDispatcher("login3.jsp");
               rd.forward(request,response);
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
