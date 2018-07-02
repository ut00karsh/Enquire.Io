<%-- 
    Document   : Upload_File
    Created on : 8 Oct, 2017, 9:01:21 AM
    Author     : Piyush Shukla
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
   
       <form action="StoreFile" method="post" enctype="multipart/form-data"> 
            select File :-&nbsp;&nbsp;&nbsp; <input type="file" name="file"><br><br>
            <input type="submit" value="upload file" align="middle">
            </form>
        
    </body>
</html>
