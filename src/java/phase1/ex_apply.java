
package phase1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import action.jdbc;
import java.sql.Connection;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;

public class ex_apply extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
           RequestDispatcher rd;
        try  {
    
            String name=request.getParameter("name");
             String email=request.getParameter("email");
             String ex_id=request.getParameter("ex_id"); 
             String pwd=request.getParameter("pwd");
            
              String spec=request.getParameter("spec"); 
             String about=request.getParameter("about");
             
             
             String input= "insert into ex_apply values('"+name+"','"+email+"','"+ex_id+"','"+pwd+"','"+spec+"','"+about+"')";
          
             out.println(input);
             
           Connection con=jdbc.getCon();
            Statement s3 = con.createStatement();
		s3.executeUpdate(input);
                request.setAttribute("msg2","Your Request has been sent successfully");
                rd=request.getRequestDispatcher("exlogin_signup.jsp");
               rd.forward(request,response);
            
            
            
            
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
