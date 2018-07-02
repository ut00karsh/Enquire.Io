
package phase1;

import action.jdbc;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class tags extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         PrintWriter out = response.getWriter();
        response.setContentType("text/html;charset=UTF-8");
        try {
            int i;
            Connection c=jdbc.getCon();
             String tag="abcd,defgg,jkl";
                      String techno1[] =  new String[5];
            techno1 = tag.split(",");
               for(i=0;i<techno1.length;i++)
               {
                  
              String insert ="insert into q_tags values('"+techno1[i]+"')";
                Statement s3 = c.createStatement();
		s3.executeUpdate(insert);
               }
               out.println("records add successfully");
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
