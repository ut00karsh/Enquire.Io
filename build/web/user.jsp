


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="action.jdbc"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="java.sql.ResultSet"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       
        <title>home Page</title>
        
           <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="res/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <title>Inquire.Io</title>
    
    <link rel="stylesheet"
      href="res/default.css">
<script src="res/highlight.pack.js"></script>

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
        
        <style>
   

            
            
            
  #anchor
  {
     color:cornflowerblue;
     position:relative;
     left:5%;
     border: 1 px;
     display:inline-table;
  }
  
  #anchor:visited
  {
     color:CornflowerBlue;  
  }
</style>

     <script>
   function myFunction(name)
   {
       if (name.length==0)
       {
        document.getElementById("demo2").innerHTML= "";
        return;
       }
     
       var xttp = new XMLHttpRequest();
       xttp.onreadystatechange = function(){
           if((this.readyState==4) && (this.status == 200))
           {
               
               
               
                   document.getElementById("demo2").innerHTML=this.responseText;
                  
               
        }
           };
           
           xttp.open("GET","user_ajax.jsp?name="+name,true);
           
          xttp.send();
       }
  
            
</script>
<style>
    
          #anchor:link, #anchor:visited {
   
    border-radius: 3px;
    color: white;
    padding: 6px 10px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
     background-color: #5bc0de ;
}

    
</style>

    </head>
    
    
  
        
        
        
           <%
        String rol=(String)session.getAttribute("role");
        if(rol.equalsIgnoreCase("user"))
        {
        %>
    <nav class="navbar navbar-expand-sm navbar-light bg-light fixed-top" style=" height:12%; border-top:3px solid sandybrown;">
        <a class="navbar-brand" href="home.jsp" style="font-family: cursive ; color:seagreen;"><b>Inquire.io</b></a>
      <%
        }
        
        else  if(rol.equalsIgnoreCase("admin"))
        {
      %>
      
        <nav class="navbar navbar-expand-sm navbar-light bg-light fixed-top"style=" height:12%; border-top:3px solid sandybrown">
        <a class="navbar-brand" href="ad_home.jsp" style="font-family: cursive ; color:seagreen;"><b>Inquire.io</b></a>
      
      <%
        }
         else  if(rol.equalsIgnoreCase("expert"))
         {
      %>
     <nav class="navbar navbar-expand-sm navbar-light bg-light fixed-top"style=" height:12%; border-top:3px solid sandybrown">
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
                          <%
        String rol1=(String)session.getAttribute("role");
        if(rol.equalsIgnoreCase("user"))
        {
        %>
    <li class="nav-item">
                    <a class="nav-link" href="home.jsp">Home</a>
                </li>
      <%
        }
        
        else  if(rol.equalsIgnoreCase("admin"))
        {
      %>
      
 <li class="nav-item">
                    <a class="nav-link" href="ad_home.jsp">Home</a>
                </li>
      
      <%
        }
         else  if(rol.equalsIgnoreCase("expert"))
         {
      %>
   <li class="nav-item">
                    <a class="nav-link" href="ex_home.jsp">Home</a>
                </li>
      
      <%
        }
        %>
                <li class="nav-item">
                    <a class="nav-link" href="logout.jsp">Logout</a>
                </li>
         &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;
                 <li class="nav-item" >
                    <a class="nav-link" href="user.jsp" >Users</a>
                </li>
                 &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;
                
                 <li class="nav-item">
                    <a class="nav-link" href="tags.jsp">Tags</a>
                </li>
                  <%
                String name=(String)session.getAttribute("name");
                %>
            </ul>
            <a class="nav-link dropdown-toggle" data-toggle="dropdown" id="Preview" href="profile.jsp" role="button" aria-haspopup="true" aria-expanded="false"
                style="position:relative">
                   <%=name%> </a>
           

            <form class="form-inline my-2 my-lg-0">
                <input class="form-control mr-sm-2" type="text" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
            </form>
        </div>

    </nav>
        
 
    <br><br><br>
  <br><br>
           

    <div style="width: 90%">
      
        <div style="margin-left:25%" class="">
            <label for="user" style="font-family: cursive; color: #434f5a">Enter user_id to Search</label>
          
        <input type="text" name="text" onkeyup="myFunction(this.value)" class="form-controlsm" style="margin-left:4%" >
    
        </div>
        <hr>
        
        <br>
       
        
        <%!
        String tag,count;
        
        int count_tag;
        
        %>
        <%
                      HttpSession vsn=request.getSession(false);
    String nid=(String)vsn.getAttribute("u_id");
    if(nid !=null)
    {
        tag = "select * from user_details";
        count = "select count(*) from q_tags";
        
        ResultSet rs = jdbc.selectData(tag);
             ResultSet rs1 = jdbc.selectData(count);
             
             rs1.next();
             count_tag = rs1.getInt(1);
              rs.next();
             %>
             <div id="demo2">
                 
              
             </div> 
             <br>
             
          
               <div id="demo">
             <%
            while(rs.next())
            {
            %>
            
            
            <span id="demo1"  style="padding:5px; margin-top: 10px" >
      <a id="anchor" class="btn-info btn-outline-light"  href="profile1.jsp?user_id=<%=rs.getString("user_id")%>" style=" background-color:#e74c3c;font-size:80%;padding:6px;margin-top: 20px; margin-left:24px; font-family: cursive">
          <h5>#<%=rs.getString("user_id")%></h5> <%=rs.getString("user_name")%><br>
                <%=rs.getString("mail_id")%> </a>
             
      </span>
  
           <% 
            }
           }
           else
    {
           %>
           <jsp:forward page="login3.jsp"/>
           <%}%>
            </div>
    </div>
            
            <br><br><br><br><br><br><br><br>
           
            <%@include file="footer.jsp" %>
            
         </body>
</html>