
package phase1;
import action.jdbc;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Decrement extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter(); 
                RequestDispatcher rd;
        try {
            
          
           int  s1 = Integer.parseInt(request.getParameter("query_id"));
            String user_id = request.getParameter("user_id");
            Connection c=jdbc.getCon();
            Statement s=c.createStatement();
            String q = "select * from vote_count where query_id="+s1+" and user_id='"+user_id+"'";
            ResultSet rs = jdbc.selectData(q);
            
           if(rs.next() == false)
           
           {
               
           String q1= "update query_details set vote_count= vote_count-1 where query_id='"+s1+"'";
           int i = jdbc.updateData(q1);
           String insert ="insert into vote_count values("+s1+",'"+user_id+"')";
                Statement s3 = c.createStatement();
		s3.executeUpdate(insert);
       
              String q2= "select vote_count from query_details where query_id='"+s1+"'";
                    ResultSet rs1 =  jdbc.selectData(q2);
                    rs1.next();
                    out.println(rs1.getInt("vote_count"));
      
    }
        
           else
           {
                   String q2= "select vote_count from query_details where query_id='"+s1+"'";
                    ResultSet rs1 =  jdbc.selectData(q2);
                    rs1.next();
                    out.println(rs1.getInt("vote_count"));
           } 
        }
  
        catch(Exception e)
        {
            out.println(""+ e.getMessage());
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
