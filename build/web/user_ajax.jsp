<%@page import="action.jdbc"%>
<%@page import="java.sql.*;"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 3.2 Final//EN">

<%!
String name;
String query;
String  q;
%>
<%
     
name=request.getParameter("name");

query = "select * from user_details where user_id like '"+name+"%'";

     ResultSet rs=jdbc.selectData(query);
     while(rs.next())
     {
    %>
      <span id="demo"  style="padding:5px; margin-top: 10px" >
      <a id="anchor" class="btn-info btn-outline-light"  href="#techno_tag.jsp?techno=<%=rs.getString("user_id")%>" style=" background-color:#95a5a6;font-size:80%;padding:6px;margin-top: 20px; margin-left:24px; font-family: cursive">
          <h5>#<%=rs.getString("user_id")%></h5> <%=rs.getString("user_name")%><br>
                <%=rs.getString("mail_id")%> </a>
               
             
      </span>
                
<%
     }
%>

<hr>