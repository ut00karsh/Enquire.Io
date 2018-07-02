





<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="action.jdbc"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="java.sql.ResultSet"%>



<html>
    <head>
          <script src="https://cloud.tinymce.com/stable/tinymce.min.js?apiKey=zy6w9djp0gif31rebjppa7nstggngix6k2vwz94kyk4tw77e"></script>
        <script src="https://cloud.tinymce.com/stable/tinymce.min.js"></script>
  
        <script>tinymce.init({ selector:'textarea#demo0' });</script>
  
       <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="res/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <title>Document</title>
    
     <meta name="viewport" content="width=device-width, height=device-height, initial-scale=1.0, maximum-scale=1.0"/>
  <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.4.0/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/codemirror/5.25.0/codemirror.min.css">
  <link href="https://cdnjs.cloudflare.com/ajax/libs/froala-editor/2.6.0/css/froala_editor.pkgd.min.css" rel="stylesheet" type="text/css" />
  <link href="https://cdnjs.cloudflare.com/ajax/libs/froala-editor/2.6.0/css/froala_style.min.css" rel="stylesheet" type="text/css" />
  

  <script>
    $(function() {
        $('textarea#froala-editor').froalaEditor({
            toolbarButtons: ['bold', 'italic', 'underline', 'strikeThrough', 'fontFamily', 'fontSize', '|', 'inlineStyle', 'paragraphFormat', 'align', 'undo', 'redo', 'html'],
        })
    });
    
    
    
  </script>
  
  
  
                  
        <script src="res/tagsinput.js"></script>
<link rel="stylesheet" type="text/css" href="res/tagsinput.css" />
<script>
    $(function(){
        $('#tags').tagsInput();
    });
       
       
       
        function catagory()
       {
           
         alert(x.length);
            
        var x = document.getElementById("demo0").value
        if (x.length<200)
        {
            alert(" length of Input String must be greater then 250");
        return false;
    }  
       }
     
    </script> 
  
  
    
  

    </head>
    <body style="background-color: white">
        <%
        
                  HttpSession vsn=request.getSession(false);
    String nid=(String)vsn.getAttribute("u_id");
    if(nid !=null)
    {
        
   
        %>
        
        
            <%
        String rol=(String)session.getAttribute("role");
        if(rol.equalsIgnoreCase("user"))
        {
        %>
    <nav class="navbar navbar-expand-sm navbar-light bg-light fixed-top" style="height:12%; border-top:3px solid sandybrown">
        <a class="navbar-brand" href="home.jsp" style="font-family: cursive ; color:seagreen;"><b>Inquire.io</b></a>
      <%
        }
        
        else  if(rol.equalsIgnoreCase("admin"))
        {
      %>
      
        <nav class="navbar navbar-expand-sm navbar-light bg-light fixed-top">
        <a class="navbar-brand" href="ad_home.jsp" style="font-family: cursive ; color:seagreen;"><b>Inquire.io</b></a>
      
      <%
        }
         else  if(rol.equalsIgnoreCase("expert"))
         {
      %>
     <nav class="navbar navbar-expand-sm navbar-light bg-light fixed-top">
        <a class="navbar-brand" href="ex_home.jsp" style="font-family: cursive ; color:seagreen;"><b>Inquire.io</b></a>
      
      <%
        }
        %>

        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault"
            aria-expanded="false" aria-label="Toggle navigation">
                          <span class="navbar-toggler-icon"></span>
                </button>
        <div class="collapse navbar-collapse" id="navbarsExampleDefault">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="home.jsp">Home <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="logout.jsp">Logout</a>
                </li>
              
  <%
                String name=(String)session.getAttribute("name");
                %>
            </ul>
            <a class="nav-link dropdown-toggle" data-toggle="dropdown" id="Preview" href="profile.jsp" role="button" aria-haspopup="true" aria-expanded="false"
                style="position:relative">
                 <%=name%> </a>
            <div class="dropdown-menu" aria-labelledby="Preview">
                <a class="dropdown-item" href="#">one</a>
                <a class="dropdown-item" href="#">two</a>
                <a class="dropdown-item" href="#">three</a>
            </div>

            <form class="form-inline my-2 my-lg-0">
                <input class="form-control mr-sm-2" type="text" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
            </form>
        </div>
        <br>
        <br>
    </nav>
    <br><br>  <br>
    
    <div>
        
        <%
    
    }
    else
    
    {
        %>
        <jsp:forward page="login3.jsp"/>   
        <%
    }
        %>
     
        <br>
        
        
        
        <h3 align="left" class="btn-danger btn btn-lg " style="margin-left:40%"><font color="" face="comic sans ms'">Ask Question   </font></h3>
    
        
      
        
      
          



  <form  method ="post" action="query_register"  enctype="multipart/form-data" onsubmit="return catagory() ">

     <div style="padding:30px;" >
         
      <label for="comment"><h3 class="btn-danger btn" >Query_Description </h3></label>
      <textarea class="form-control" rows="2" name="query_desc" id="hii" style="height:10%;" minlength="40" maxlength="255"  required/></textarea>
     </div>
    


      <div style="padding:30px;">
      <label for="comment"><h3 class="btn-danger btn btn-lg" >Query </h3></label>
     
       <textarea rows="7"  name="query" id="demo0"   ></textarea>
      
      </div>
      <div class="container-fluid">
          <div class="row">
            <div class="col-sm-4" style="text-align:center;">
                <span class="badge badge-danger">Upload Image</span><br>
                <input class ="btn-info btn-sm" type="file" name="photo" accept="image/*" value="upload image"/>
            </div>
            <div class="col-sm-4">
            </div>
            <div class="col-sm-4" style="text-align:center;">
                <span class="badge badge-danger">Upload Code</span><br>
                <input  class ="btn-info btn-sm" type="file" name="file"  value="upload file">     
            </div>
          </div>
          <div class="row">
             <div class="col-sm-4">
             </div>
            
             <div class="col-sm-4">
             </div>
          </div>
      </div>
  <div style="padding:30px;">
<h4  class="btn-danger btn "> Enter The Tags </h4><br>
      <input type="text" id="tags"  name= "tag"  class="form-control"  data-role="tagsinput" required maxlength="255" >
      </div>
   

    <br>
    
<input style="margin-left:30%;" type="submit" class=" btn-lg btn  btn-outline-danger" value="submit your query"> 
</form>

</div>




     
     
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4"
        crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1"
        crossorigin="anonymous"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/codemirror/5.25.0/codemirror.min.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/codemirror/5.25.0/mode/xml/xml.min.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/froala-editor/2.6.0//js/froala_editor.pkgd.min.js"></script>


</body>
</html>