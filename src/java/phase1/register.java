
package phase1;

import action.dao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.Transaction;
import tables.user_details;


public class register extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
    RequestDispatcher rd;
   PrintWriter out=response.getWriter();
   try{
          String s1=  request.getParameter("name");
          String s2=  request.getParameter("u_id");
         
          String i1= (request.getParameter("user_mail"));
          String s4= request.getParameter("q1");
          String s5=request.getParameter("pwd");
           String s6=request.getParameter("cnf_pwd");
           
           out.println(s5);
           out.println(s6);
               out.println(s4);
                 out.println(s2);
                 out.println(s1);
               
                 out.println(i1);
           
              Session s=dao.getSession();
              Transaction t=s.beginTransaction();
              user_details u1=new user_details();
              
             if(s5.equals(s6))
             {     
             
              
              
              
              u1.setUser_id(s2);
              u1.setUser_name(s1);
              u1.setPassword(s5);
             
              u1.setQualification(s4);
              u1.setMail_id(i1);
              s.save(u1);
              t.commit();
               request.setAttribute("msg1","...Succesfully Signed Up...");
              
             }
             else
             {
                   request.setAttribute("msg1","..your password is mismatched ...please reEnter your password...");
             }
             rd=request.getRequestDispatcher("login3.jsp");
               rd.forward(request,response);
   }
             
   catch(Exception e)
   {
      out.println("exception"+e);
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
