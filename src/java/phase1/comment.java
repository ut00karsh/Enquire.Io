
package phase1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.sql.*;
import action.jdbc;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;


public class comment extends HttpServlet {

 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
         RequestDispatcher rd;
        try  {
            
        HttpSession session=request.getSession();
        String s1= (String) session.getAttribute("u_id");
       
        int i= Integer.parseInt(request.getParameter("q_id"));
          
        String c_string = request.getParameter("comment");
     
       
            
           String input= "insert into comments(user_id,answer_id,c_str,time)values('"+s1+"',"+""+i+""+",'"+c_string+"',now())";
          
           Connection con=jdbc.getCon();
            Statement s3 = con.createStatement();
		s3.executeUpdate(input);
                
                rd=request.getRequestDispatcher("home.jsp");
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
