
package phase1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class image1 extends HttpServlet {

  
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
             RequestDispatcher rd;
        response.setContentType("text/html;charset=UTF-8");
        try  {
           
           Class.forName("com.mysql.jdbc.Driver");  
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rcpl","uttu","Piyush1998");
                
          int flag1= (int) request.getAttribute("flag_image");
          out.println("flag");
          
             if (flag1 == 1)
                {     
                int q_id = (int) request.getAttribute("q_id");
                PreparedStatement ps=con.prepareStatement("select image from query_details where query_id = ?");
               ps.setInt(1, q_id);
                ResultSet rs=ps.executeQuery();
while(rs.next())
{ 
Blob b=rs.getBlob(1);
byte barr[]=new byte[(int)b.length()]; 
barr=b.getBytes(1,(int)b.length());
			
FileOutputStream fout=new FileOutputStream("D:\\image\\img"+q_id+".png");
fout.write(barr);
		    
fout.close();

}
  }
                             
                 out.println("piyush");
                out.println("piyush1");
                int flag=(int) request.getAttribute("flag_file");
                out.println(flag);
     if((int) request.getAttribute("flag_file")==1)
        {     
         int q_id = (int) request.getAttribute("q_id");
         out.println(q_id);
         
        PreparedStatement ps=con.prepareStatement("select file from query_details where query_id = ?");
         ps.setInt(1, q_id);
         ResultSet rs=ps.executeQuery();
while(rs.next())
{ 
Blob b=rs.getBlob(1);
byte barr[]=new byte[(int)b.length()]; 
barr=b.getBytes(1,(int)b.length());
			
FileOutputStream fout=new FileOutputStream("D:\\image\\file"+q_id+".txt");
fout.write(barr);
		    
fout.close();

}
 }
     
out.println(" file uploaded to the server succesfully");

 rd=request.getRequestDispatcher("home.jsp");
 rd.forward(request, response);

           
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
