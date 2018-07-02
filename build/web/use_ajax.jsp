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

query = "select name from student where name like '"+name+"%'";

     ResultSet rs=jdbc.selectData(query);
     while(rs.next())
     {
    %>
    <%= rs.getString("name")%>
<%
     }
%>

