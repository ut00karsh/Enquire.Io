<html>
    <body>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="action.jdbc"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="java.sql.ResultSet"%>


   <%!
    String s,S6;
    String  x,y,y1;
    String y3;
    int z,i;
    String t;
    String z1;
    int l,a_count,vote_count;
    String v_count,time,A_count,techno;
    String techno1[];
    String q_count;
    int page_count1;
    
    int lim ,rem;
    %>
    <div id="demo2"></div>
    
    
  <%
       /*  HttpSession vsn=request.getSession(false);
    String nid=(String)vsn.getAttribute("u_id");
    if(nid !=null)
    {
               */
       
         s= "select * from user_details where user_id='"+"ut00karsh"+"'";
        q_count ="select count(query_id) from query_details where user_id='ut00karsh'";
    String  a_count ="select count(answer_id) from answer_details where user_id='ut00karsh'";  
      String  favourite ="select count(query_id) from marked where user_id='ut00karsh'";  
      String  qvote_count ="select count(query_id) from vote_count where user_id='ut00karsh'";
      String  Avote_count ="select count(answer_id) from Avote_count where user_id='ut00karsh'";
         ResultSet rs=jdbc.selectData(s);
         ResultSet rs1=jdbc.selectData(q_count);
           ResultSet rs2=jdbc.selectData(a_count);
            ResultSet rs3=jdbc.selectData(favourite);
              ResultSet rs4=jdbc.selectData(qvote_count);
              ResultSet rs5=jdbc.selectData(Avote_count);
            while(rs.next())
                
            {
                rs1.next();
                rs2.next();
                rs3.next();
                 rs4.next();
                  rs5.next();
               %>
               
               <%=rs.getString("user_name")%><br>
               <%=rs.getString("user_Id")%><br>
                <%=rs.getString("mail_id")%><br>
                
               <%=rs1.getInt(1)%><br>
               <%=rs2.getInt(1)%><br>
               <%=rs3.getInt(1)%><br>
                <%=rs4.getInt(1)%><br>
                 <%=rs5.getInt(1)%><br>
               
               <%
            }
          /*  }*/

          %>
          
            </body>
</html>