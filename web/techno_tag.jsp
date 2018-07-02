

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
    
    
        
        <style>
   
            
           #demo:link, #demo:visited {
    border: 1px solid cornflowerblue ;
    color: black;
    padding: 3px 3px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
}


#demo:hover, #demo:active {
    background-color:cornflowerblue ;
}
            
            
            
  #anchor
  {
     color:cornflowerblue;
     position:absolute;
     left:15%;
     border: 1 px;
  }
  
  #anchor:visited
  {
     color:CornflowerBlue;  
  }
</style>
    </head>
    
    
    <body onload = "myFunction()">
        
        
            <%
        String rol=(String)session.getAttribute("role");
        if(rol.equalsIgnoreCase("user"))
        {
        %>
    <nav class="navbar navbar-expand-sm navbar-light bg-light fixed-top" style=" height:12%; border-top:3px solid sandybrown">
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
        if(rol1.equalsIgnoreCase("user"))
        {
        %>
    <li class="nav-item">
                    <a class="nav-link" href="home.jsp">Home</a>
                </li>
      <%
        }
        
        else  if(rol1.equalsIgnoreCase("admin"))
        {
      %>
      
 <li class="nav-item">
                    <a class="nav-link" href="ad_home.jsp">Home</a>
                </li>
      
      <%
        }
         else  if(rol1.equalsIgnoreCase("expert"))
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

    </nav>
            
        
   <script>
            function myFunction1() 
            {
            window.location = "http://localhost:8080/mini_project/home.jsp";
        }
            </script>
       
<br>
        <hr>
        <br>
        <br>
        <div class="container">
 

<ul class="nav nav-tabs">
  <li class="nav-item">
    <a class="nav-link active" href="top.jsp">Top</a>
  </li>
  
  <li class="nav-item">
    <a class="nav-link" href="frequent.jsp">Frequent</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="marked.jsp">Marked</a>
  </li>
</ul>
</div>      
        <hr>
         <%!
    String s,S6;
    String  x,y,y1;
    String y3;
    int z,i;
    String t;
    String z1;
    int l,a_count,vote_count;
    String v_count,time,A_count,techno;
    String techno1[],s3;
    
    
    %>
    <div>  <a  href="unanswered.jsp" style="left:15%; position: absolute;" class="btn btn-outline-info" >UnAnswered Queries</a>     <a href="query.jsp" style="left:65%; position: absolute;" class="btn btn-info">Ask Question</a> <br><br><br></div>
   <%
        
        
        s3=request.getParameter("techno");
        s="select query_string from query_details where technology  like '%"+s3+"%' order by time desc";
        t="select q_description from query_details where technology like '%"+s3+"%' order by time desc";
       
          
       
        ResultSet rs=jdbc.selectData(s);
         ResultSet rs2=jdbc.selectData(t);
         
            
            
        while(rs.next())
        {
            rs2.next();
              x=rs.getString(1);
              z1= rs2.getString(1);
            
              y="select query_id from query_details where query_string='"+x+"'";
               ResultSet rs1=jdbc.selectData(y);
               rs1.next();
               z=rs1.getInt("Query_id");
               y1="select user_id,time from query_details where query_id='"+z+"'";
               v_count="select vote_count,technology from query_details where query_id='"+z+"'";
               A_count= "select count(answer_id) as a_count from answer_details where query_id ='"+z+"'";
              
                ResultSet rs3=jdbc.selectData(y1);
                 ResultSet rs4=jdbc.selectData(v_count);
                 ResultSet rs5=jdbc.selectData(A_count);
                rs3.next();
                rs4.next();
                rs5.next();
                y3=rs3.getString("user_id");
                time=rs3.getString("time");
                 S6=(String)session.getAttribute("u_id");
                 vote_count=rs4.getInt("vote_count");
                 techno =rs4.getString("technology");
                a_count=rs5.getInt("a_count");
                
                
            techno1=  new String[5];
            
           techno1= techno.split(",");
               
               
        %>
         
 <div id="demo3" style="size: 70%;">
    
<a  href="#" class="btn btn-outline-success btn-sm" style=" position:absolute;left:13%;"><%=vote_count%><br>votes</a>
<a  href="#" class="btn btn-outline-success btn-sm" style=" left:18%; position:absolute;"><%=a_count%><br>Answers</a> 
<h3><a id="anchor" href="answer.jsp?query_id=<%=z%>&role=<%="user"%>&u_id=<%=S6%>" style=" text-decoration: none; left:25%; font-size: 75%;"><font color="CornflowerBlue "><%=  rs2.getString(1)  %></font></a></h3><br><br>
 
    <%
       for(i=0;i<techno1.length;i++)
    {
            %>
           
            <div> 
                <a class="btn btn-info btn-sm" href="techno_tag.jsp?techno=<%=techno1[i]%>"  style=" color:whitesmoke;  font-size: 75%;margin-left:32%;"> <%="#"+techno1[i]%> </a>
            </div>
                <%}%>
             
          
 <div style="position:relative;left:50%; font-size: 13px;">   asked on :- <%=time%> &nbsp;<b>by</b>&nbsp;&nbsp;<%=y3%> </div><br>
<div style="align:center;"> <a href="answer.jsp?query_id=<%=z%>&role=<%="user"%>&u_id=<%=S6%>" style=" text-decoration: none; position:absolute ;font-size:14px; left:34% ;" class="btn btn-outline-success"> Answer It</a> </div>
          
 
          
          
          
         <%
         
         if(y3.equalsIgnoreCase(S6))
         {    
         %>
      &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   <a class="btn btn-outline-danger" href="delete.jsp?query_id=<%=z%>" style="text-decoration: none; position:absolute;left:45%; font-size:14px;"> Delete this Query </a>
        <br>
       
        <%
        }
         %>
         <br> <hr style="width:100%;"></b>
        <%
      
        }
        %>
 </div>
            <br><br> <br>
    <%@ include file = "footer.jsp" %>
          
    </body>
</html>
    










