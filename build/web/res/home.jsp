<%-- 
    Document   : home
    Created on : 27 Aug, 2017, 10:59:25 PM
    Author     : Piyush Shukla
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<link rel="stylesheet" href="res/Site.css"/>
<link rel="stylesheet" href="res/css1.css"/>
<%@page import="action.jdbc"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="java.sql.ResultSet"%>


        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>home Page</title>
    
   <body style="background-color:#e1e1e1;">
   
    <h1 align="center"><font color='firebrick' face='comic sans ms'>Expert-Exchange</font> </h1>
   </body>
   <%!
   
   String s;
   
   
   %>
   <%
      Connection conn=jdbc.getCon();
      Statement s1= conn.createStatement();
      s="select query_string from query_details";
       ResultSet rs = jdbc.selectData(s);
       while(rs.next())
       {
       %>
       <%=rs.getString(1)%>
       
       <h1>hello</h1>
    
       <%       
       }
     %>
  
