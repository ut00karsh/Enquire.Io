<%-- 
    Document   : usetag
    Created on : 25 Oct, 2017, 8:28:12 PM
    Author     : Piyush Shukla
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 3.2 Final//EN">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>

<%
String s [] = request.getParameterValues("tags");
%>
<%
int i;
for (i=0;i<s.length;i++)
{
    %>
    <%=s[i]%>
<%    
}        %>
