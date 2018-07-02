

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
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="res/bootstrap.min.css">
       <link rel="stylesheet" href="res/media.css">
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

<script>
   
       function frequent(name,name1)
       {
           
          
      
            
              
      var xttp = new XMLHttpRequest();
       xttp.onreadystatechange = function(){
           if((this.readyState==4) && (this.status == 200))
           {
              
          }
           };
           
           xttp.open("GET","frequent?query_id="+name+"&user_id="+name1,true);
           
          xttp.send();
            
          
       }

   function myFunction(name)
   {
       if (name.length==0)
       {
        document.getElementById("demo3").innerHTML= "";
        return;
       }
     
       var xttp = new XMLHttpRequest();
       xttp.onreadystatechange = function(){
           if((this.readyState==4) && (this.status == 200))
           {
               
               
               
                  document.getElementById("demo4").innerHTML=this.responseText;
                  
               
        }
           };
           
           xttp.open("GET","SearchQuery.jsp?name="+name,true);
           
          xttp.send();
       }
  
            
</script>

    </head>
    
    
    <body onload = "myFunction()">
        <div class="wrap">
        
        
        
        
           <nav class="navbar navbar-expand-sm navbar-light bg-light fixed-top"  style=" height:12%; border-top:3px solid sandybrown">
               <a class="navbar-brand" href="home.jsp" style="font-family: cursive ; color:seagreen;"><b>Inquire.io</b></a>

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
              &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;
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
            <a  class="nav-link dropdown-toggle"  href="profile.jsp" >
                <%=name%> </a>
            

            <form class="form-inline my-2 my-lg-0">
                <input class="form-control mr-sm-2" type="text" placeholder="Search" aria-label="Search" style="margin-right: 30%;" onkeyup = "myFunction(this.value)">
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
            <div style="size: 45%; ">
           
        <a id= "demo" href="unanswered.jsp" style="left:55%;" id="demo">UnAnswered Queries</a>     <a href="query.jsp" style="left:65%;" id ="demo">Ask Question</a> <br>
        <hr>
        <br>
        
        <div class="container">
 

<ul class="nav nav-tabs">
  <li class="nav-item">
      <a class="nav-link active" href="home.jsp" style="font-family: cursive; font-size: 120%;"><b>Home</b></a>
  </li>
  <li class="nav-item">
      <a class="nav-link" href="top.jsp" style="font-family: cursive;font-size: 120%;">Top</a>
  </li>
  <li class="nav-item">
      <a class="nav-link" href="frequent.jsp"style="font-family: cursive; font-size: 120%;">Frequent</a>
  </li>
  <li class="nav-item">
      <a class="nav-link" href="marked.jsp"style="font-family: cursive; font-size: 120%;">Marked</a>
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
    String techno1[];
    String q_count;
    int page_count1;
    
    int lim ,rem;
    %>
    <div id="demo2"></div>
    
    
    <div>  <a  class="btn btn-outline-warning " href="unanswered.jsp" style="left:15%; position: absolute;" >UnAnswered Queries</a>     <a href="query.jsp"  class= "btn btn-outline-warning" style="left:78%; position: absolute;" >Ask Question</a> <br><br><br></div>
       <div id="demo4" >
   <%
         HttpSession vsn=request.getSession(false);
    String nid=(String)vsn.getAttribute("u_id");
    if(nid !=null)
    {
       
         q_count= "select count(*) from query_details;";
       ResultSet page_count= jdbc.selectData(q_count);
       page_count.next();
       
       page_count1=page_count.getInt(1);
       if(page_count1<=4)
       {
           lim=1;
           rem=0;
       }
       else
       {
       lim = page_count1/3;
       rem = page_count1%3; 
       }
         
    if(page_count1<=4)
    {
          s="select query_string from query_details order by time";
        t="select q_description from query_details order by time";  
     
    }
    else
    {
         s="select query_string from query_details order by time desc limit 0,3 ";
        t="select q_description from query_details order by time desc limit 0,3 ";
    }
       
     
         ResultSet rs=jdbc.selectData(s);
         ResultSet rs2=jdbc.selectData(t);
         
            
            
        while(rs.next())
        {
         
              x=rs.getString(1);
            
            
              y="select query_id,q_description from query_details where query_string='"+x+"'";
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
         
  
    <div id="demo3" >
    
        <div class="card" style="width:76%; margin-left: 13% ; border-color:#e0e0e0 ; border-width:2px; padding-top: 15px;">
          <div class="card-block">


<a  href="#" class="btn btn-outline-success btn-sm" style=" position:absolute;left:11%;"><%=vote_count%><br>votes</a>
<a  href="#" class="btn btn-outline-success btn-sm" style=" left:17%; position:absolute;"><%=a_count%><br>Answers</a> 
<h5>
 <a id="anchor" href="answer.jsp?query_id=<%=z%>&role=<%="user"%>&u_id=<%=S6%>" style=" text-decoration: none; left:25%;" onclick= "frequent('<%=z%>','<%=S6%>')">
 <font color="CornflowerBlue "><%=  rs1.getString("q_description")  %>
        </font></a></h5><br>
           
     
    <%
       for(i=0;i<techno1.length;i++)
    {
            %>
           
      <div> 
     <a class="btn btn-info btn-sm" href="techno_tag.jsp?techno=<%=techno1[i]%>"  style=" color:whitesmoke;  font-size: 75%;margin-left:78%;"> <%="#"+techno1[i]%> </a>
       </div>
                <%}%>
             
          
 <div style="position:absolute;left:75%; padding-top: 19px; font-size: 12px; font-family: cursive"> 
     <b>  asked on :- <%=time%> &nbsp;<b>by</b>&nbsp;&nbsp;<%=y3%></b>
 </div>
 
<div style="align:center;"> <a href="answer.jsp?query_id=<%=z%>&role=<%="user"%>&u_id=<%=S6%>" style=" text-decoration: none; position:absolute ;font-size:14px; left:34% ;" class="btn btn-outline-success" > Answer It</a> </div>
          
 
          
          
          
         <%
         
         if(y3.equalsIgnoreCase(S6))
         {    
         %>
      &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   <a class="btn btn-outline-danger" href="delete.jsp?query_id=<%=z%>" style="text-decoration: none; position:absolute;left:45%; font-size:14px;"> Delete this Query </a>
     
       
        <%
        }
         %>
         <br><br> </b>
            </div>
         
            </div>
         <br>
           </div>
        <%
      
        }
        %>
   
      
    
        </div>
      <div style="margin-left:30%">
   <nav aria-label="...">
  <ul class="pagination pagination-lg">
    <li class="page-item disabled">
      <a class="page-link" href="#" tabindex="-1">Pages</a>
    </li>
    <% if (rem !=0)
    {
        lim=lim+1;
    }
    
    for(i=0;i<lim;i++)
    {
    %>
    
    <li class="page-item"><a class="page-link"  href="home1.jsp?page=<%=i%>" onclick="myFunction('<%=i%>')"><%=i+1%></a></li>
  
    <% }
    }
    else
    {
        %>  <jsp:forward page="login3.jsp"/>
   <% }
    %>
    
     </ul>
   </nav>
    <br><br> <br>
    <%@ include file = "footer.jsp" %>
            </div>
        </div>   
    </body>
</html>
    










