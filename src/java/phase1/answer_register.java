
package phase1;


import action.dao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.Session;
import org.hibernate.Session;
import org.hibernate.Transaction;
import tables.query_details;
import tables.user_details;
import tables.Answer_Details;
import tables.ems2;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import action.jdbc;
import java.io.*;
import java.sql.*;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Part;
    

@MultipartConfig(maxFileSize = 16177215)
public class answer_register extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     RequestDispatcher rd;
   PrintWriter out=response.getWriter();
  HttpSession session=request.getSession();
  
       try{
           int flag=0;
           int Fflag=0;
           int Iflag=0;
       
             Connection c=jdbc.getCon();
           Statement x=c.createStatement();
          response.setContentType("text/html");
          Session s=dao.getSession();
     Transaction t= s.beginTransaction();
   
       String s1 = (String)session.getAttribute("id");
        String s2 = request.getParameter("answer1");
        
        out.println(s1);
        out.println(s2);
        
    String s5= (String) session.getAttribute("person");
       int  s4= (int) session.getAttribute("query");
           out.println(s5);
        out.println(s4);
        
      
     
     out.println(s5);
      out.println(s1);
         out.println(s4);
       
  Answer_Details a1= new Answer_Details();
      a1.setAnswer_String(s2);
      a1.setQuery_id(s4);
      a1.setRole(s5);
      a1.setUser_id(s1);
   
      a1.setA_type("String");
      s.save(a1);
    
      t.commit();
      request.setAttribute("a_String",s2);
       request.setAttribute("ID",s1);
       
         
       
       
       int j = a1.getAnswer_id();
       
          String j3="update query_details set status='Answered' where query_id="+s4;
            int j4=jdbc.updateData(j3);
       String j1="update answer_details set time=now() where answer_id="+j;
            int j2=jdbc.updateData(j1);
            
               String j5="update answer_details set vote_count=0 where answer_id="+j;
            int j6=jdbc.updateData(j5);
            
            
               String img_flag1= "update answer_details set img_status ='false' where answer_id="+j;
            int f3=jdbc.updateData(img_flag1);
            
            
             
             String file_flag2= "update answer_details set file_status ='false' where answer_id="+j;
            int f2=jdbc.updateData(file_flag2);
            
            
        FileInputStream fin = null;
      Part filePart = request.getPart("photo");
     if (filePart.getSize() != 0) {
            
            fin = (FileInputStream) filePart.getInputStream();
         Class.forName("com.mysql.jdbc.Driver");  
      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rcpl","uttu","Piyush1998"); 
      
        PreparedStatement ps=con.prepareStatement("update answer_details set image = ?"+ "where answer_id=? ");   
           
   ps.setBinaryStream(1,fin,fin.available());  
   ps.setInt(2, j);

             int i=ps.executeUpdate();  
           out.println(i+" records affected");
           flag=1;
           Iflag=1;
           
         con.close();
          request.setAttribute("a_id", j);
           
          
             String img_flag="update answer_details set img_status ='true' where answer_id="+j;
            int f=jdbc.updateData(img_flag);
             
    }
       
          
          FileInputStream fin1 = null;
          Part filePart1 = request.getPart("file");
          String a= request.getParameter("file");
          
         out.println(filePart1.getSize());
            if (filePart1.getSize()!= 0) {
                out.println("hii");
                  fin1 = (FileInputStream) filePart1.getInputStream();
                  Class.forName("com.mysql.jdbc.Driver");  
                 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rcpl","uttu","Piyush1998"); 
                    PreparedStatement ps=con.prepareStatement("update answer_details set file = ?"+ "where answer_id=? "); 
                    
                 ps.setBinaryStream(1,fin1,fin1.available()); 
                  ps.setInt(2, j);
                  flag=1;
                  Fflag=1;
             int i=ps.executeUpdate();  
           out.println(i+" records affected"); 
             request.setAttribute("a_id", j);
          
                  String file_flag="update answer_details set file_status ='true' where answer_id="+j;
            int f=jdbc.updateData(file_flag);
         
    }
              
              
        
        if(flag == 1)
        {
            if(Iflag==1)
            {
             request.setAttribute("flag_image", 1);
            }
            else
            {
                 request.setAttribute("flag_image", 0);
            }
             if(Fflag==1)
            {
             request.setAttribute("flag_file", 1);
            }
            else
            {
                 request.setAttribute("flag_file", 0);
            }
            
            
              rd=request.getRequestDispatcher("image2");
               rd.forward(request,response);
        }
        
  else  if (s5.equalsIgnoreCase("User"))
              {        
                 
                  
             String img_flag= "update answer_details set img_status ='false' where answer_id="+j;
            int f=jdbc.updateData(img_flag);
            
            
             
             String file_flag= "update answer_details set file_status ='false' where answer_id="+j;
            int f1=jdbc.updateData(file_flag);
            
            
      rd= request.getRequestDispatcher("home.jsp");
      rd.forward(request, response);
      
     
       }
      else
      {
          
           String img_flag="update answer_details set img_status ='false' where answer_id="+j;
            int f=jdbc.updateData(img_flag);
            
            
             
             String file_flag="update answer_details set file_status ='false' where answer_id="+j;
            int f1=jdbc.updateData(file_flag);
          
           rd= request.getRequestDispatcher("ex_home.jsp");
      rd.forward(request, response);
      }
        
      }
       
      catch(Exception e)
       {
           out.println(e.getMessage());
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
