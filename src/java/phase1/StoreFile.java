
package phase1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.sql.*;
import javax.servlet.annotation.MultipartConfig;


@MultipartConfig(maxFileSize = 16177215) 
public class StoreFile extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          PrintWriter out = response.getWriter();
        response.setContentType("text/html;charset=UTF-8");
        try  
        {
          FileInputStream fin = null;
          Part filePart = request.getPart("file");
          String a= request.getParameter("file");
          
         out.println(filePart.getSize());
            if (filePart.getSize()!= 0) {
                out.println("hii");
                  fin = (FileInputStream) filePart.getInputStream();
                  Class.forName("com.mysql.jdbc.Driver");  
                 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rcpl","uttu","Piyush1998"); 
                 PreparedStatement ps=con.prepareStatement("insert into test1 values(?,?)");   
                  ps.setString(1,"piyush");  
                 ps.setBinaryStream(2,fin,fin.available());  
             int i=ps.executeUpdate();  
           out.println(i+" records affected");  
          
        }
            else
            {
                out.println("please choose file");
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
