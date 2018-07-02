

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 3.2 Final//EN">
<html>
    <head>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="res/tagsinput.js"></script>
<link rel="stylesheet" type="text/css" href="res/tagsinput.css" />
<script>
    $(function(){
        $('#tags').tagsInput();
    });
    </script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <input id="tags" type="text"  data-role="tagsinput" >
    </body>
</html>
