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
import org.hibernate.Transaction;
import tables.query_details;
import tables.user_details;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import action.jdbc;
import java.io.FileInputStream;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Part;
 import java.io.*;
import java.sql.*;
import java.io.PrintWriter;


@MultipartConfig(maxFileSize = 16177215)
public class query_register extends HttpServlet {
    
  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                RequestDispatcher rd;
   PrintWriter out=response.getWriter();
  HttpSession session=request.getSession();
  int flag=0;
  int Fflag=0;
  int IFlag=0;
        try
        {
            
              response.setContentType("text/html");
            String s1=request.getParameter("tag");
            String s2=request.getParameter("query");
               String s6=request.getParameter("query_desc");
             
            String user_id = (String) session.getAttribute("u_id");
                 

            out.println(s1);
            String s5=(String)s1;
           
           out.println(s2);
           out.println(s6);
            
            
            Session s=dao.getSession();
           Transaction t=s.beginTransaction();
           query_details q1 = new query_details();
             Connection c=jdbc.getCon();
           Statement x=c.createStatement();
           q1.setQuery_string(s2);
           q1.setStatus("Not Answered");
           q1.setTechnology(s5);
           q1.setUser_id(user_id);
           q1.setRole("user");
           q1.setQ_type("Q_String");
           q1.setQ_description(s6);
           
           
         q1.setVote_count(0);
         out.println(s1);
          
           s.save(q1);
            out.println("hii");
            t.commit();
            
             int i1;
            String techno1[] =  new String[5];
            techno1 = s5.split(",");
               for(i1=0;i1<techno1.length;i1++)
               {
                String insert ="insert into q_tags values('"+techno1[i1]+"')";
                Statement s3 = c.createStatement();
		s3.executeUpdate(insert);
               }
            
            
            int j=q1.getQuery_id();
            String j1="update query_details set time=now() where query_id="+j;
            int j2=jdbc.updateData(j1);
        
            
                 String j3 ="update query_details set img_status ='False'where query_id="+j;
            int j4=jdbc.updateData(j3);
            
              String j5 ="update query_details set file_status ='False' where query_id="+j;
            int j6=jdbc.updateData(j5);
           
            
                     FileInputStream fin = null;
                        
         
 
        Part filePart = request.getPart("photo");
     
        
        if (filePart.getSize() != 0) {
            
            fin = (FileInputStream) filePart.getInputStream();
         Class.forName("com.mysql.jdbc.Driver");  
      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rcpl","uttu","Piyush1998"); 
      
        PreparedStatement ps=con.prepareStatement("update query_details set image = ?"+ "where query_id=? ");   
           
   ps.setBinaryStream(1,fin,fin.available());  
   ps.setInt(2, j);

             int i=ps.executeUpdate();  
           out.println(i+" records affected");
           flag=1;
           IFlag=1;
         con.close();
          request.setAttribute("q_id", j);
           
          
             String img_flag="update query_details set img_status ='true' where query_id="+j;
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
                    PreparedStatement ps=con.prepareStatement("update query_details set file = ?"+ "where query_id=? "); 
                    
                 ps.setBinaryStream(1,fin1,fin1.available()); 
                  ps.setInt(2, j);
                  flag=1;
                  Fflag=1;
             int i=ps.executeUpdate();  
           out.println(i+" records affected"); 
             request.setAttribute("q_id", j);
          
                  String file_flag="update query_details set file_status ='true' where query_id="+j;
            int f=jdbc.updateData(file_flag);
         
    }
              
              
         
        if(flag == 1)
        {
            
            
              if(IFlag==1)
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
              rd=request.getRequestDispatcher("image1");
               rd.forward(request,response);
        }
        
        else 
        {
            
            
              rd=request.getRequestDispatcher("home.jsp");
               rd.forward(request,response);
    }
     
        }
      
        
      catch(Exception e)
      {
          out.println("error Message:- "+e.getMessage());
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
