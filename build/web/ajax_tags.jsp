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

  String query = "select distinct(tags) from q_tags where tags like '"+name+"%'";

     ResultSet rs=jdbc.selectData(query);
     while(rs.next())
     {
    %>
    
        <span id="demo"  style="padding:5px; margin-top: 10px" >
      <a id="anchor" class="btn-info"  href="techno_tag.jsp?techno=<%=rs.getString("tags")%>" style=" background-color: lightseagreen;font-size:90%;padding:6px;margin-top: 20px; margin-left:20px; font-family: cursive"><<b>#</b><%=rs.getString("tags")%> </a>
    
      </span>
  
    
<%
     }
%>

<hr>