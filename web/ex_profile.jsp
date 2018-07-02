

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
 

  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.6/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script>
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
   
       

   function question()
   {
    
                
       var xttp = new XMLHttpRequest();
       xttp.onreadystatechange = function(){
           if((this.readyState==4) && (this.status == 200))
           {
              
               alert(hii)
               
                  document.getElementById("menu1").innerHTML=this.responseText;
                  
               
        }
           };
           
           xttp.open("GET","exp_answers.jsp",true);
           
          xttp.send();
       }
  
            
</script>

    </head>
       
   <%!
   
    int l,a_count,vote_count;
   
    String techno1[];
    String q_count;
    int page_count1;
    String nid,s;
    
    int lim ,rem;
    %>
    
    
    <%
        HttpSession vsn=request.getSession(false);
    String nid=(String)vsn.getAttribute("ex_id");
    
     
    if(nid !=null)
    {
  
       
         s= "select * from expert_details where expert_id='"+nid+"'";
        q_count ="select count(query_id) from query_details where user_id='"+nid+"'";
    String  a_count ="select count(answer_id) from answer_details where user_id='"+nid+"'";  
      String  favourite ="select count(query_id) from marked where user_id='"+nid+"'";  
      String  qvote_count ="select count(query_id) from vote_count where user_id='"+nid+"'";
      String  Avote_count ="select count(answer_id) from Avote_count where user_id='"+nid+"'";
         ResultSet rs=jdbc.selectData(s);
         ResultSet rs1=jdbc.selectData(q_count);
           ResultSet rs2=jdbc.selectData(a_count);
            ResultSet rs3=jdbc.selectData(favourite);
              ResultSet rs4=jdbc.selectData(qvote_count);
              ResultSet rs5=jdbc.selectData(Avote_count);
            while(rs.next())
                
            {
                rs1.next();
                rs2.next();
                rs3.next();
                 rs4.next();
                  rs5.next();
               %>
    
 <body class=".container-fluid" style="margin-top: 100px">
     
  
        
             <%
        String rol=(String)session.getAttribute("role");
        if(rol.equalsIgnoreCase("user"))
        {
        %>
    <nav class="navbar navbar-expand-sm navbar-light bg-light fixed-top">
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
              &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;
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
            <div class="dropdown-menu" aria-labelledby="Preview">
                <a class="dropdown-item" href="#">one</a>
                <a class="dropdown-item" href="#">two</a>
                <a class="dropdown-item" href="#">three</a>
            </div>

            <form class="form-inline my-2 my-lg-0">
                <input class="form-control mr-sm-2" type="text" placeholder="Search" aria-label="Search" style="margin-right: 30%;" onkeyup = "myFunction(this.value)">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
            </form>
            
         
        </div>

 

    </nav>
       <div class="row" style="margin-left: 5%;">
       <div class="col-sm-4" style="text-align: center; border:4px solid antiquewhite; background-color: whitesmoke">
          <img src="res/img.jpg" alt="" srcset="" style="width:250px; height:175px; border:5px solid blanchedalmond; "  class="rounded-circle"><br>
         <h3><span style="font-family: cursive; ">Reputation : 20</span></h3>
       </div>
         
      <div class="col-sm-2" style="text-align: center ; float:right;">
          <h1><span style="font-family: cursive; ">    <%=rs.getString("expert_name")%></span></h1><br>
            <span style="font-family: cursive; ">    <%=rs.getString("expert_id")%></span><br>
            <span style="font-family: cursive; ">    <%=rs.getString("mail_id")%></span><br>
            
           <span style="font-family: cursive; ">USER</span><br>
          
            <span>About</span><br>
            <a href="">edit this</a><br><br>
            <span style="font-family: cursive; ">Interest : JAVA , C++, Python ,MySql </span><br>
        </div>
      
        <div class="col-sm-4" style="text-align: center">
            <span style="font-family: cursive; color: salmon"><h4> More Info Here </h4></span><br>
            <span style="font-family: cursive; ">Questions asked : <b><%=rs1.getInt(1)%></b></span><br>
            <span style="font-family: cursive; ">Answers given :<b><%=rs2.getInt(1)%></b> </span><br>
             <span style="font-family: cursive; ">Questions added to favourite :<b><%=rs3.getInt(1)%></b> </span><br>
              <span style="font-family: cursive; ">Upvoted/Downvoted Questions :<b><%=rs4.getInt(1)%></b> </span><br>
               <span style="font-family: cursive; "> Upvoted/Downvoted Answers :<b><%=rs5.getInt(1)%></b> </span><br>
        </div>
    </div>
        
        
     
     <%
            }
    }
                  %>
                  
                  <div class="row" style="margin-left: 5%;">
                      
                      
                      
                    

<br>

<div class="container">
 
  <br>
 
  <ul class="nav nav-tabs" role="tablist">
    <li class="nav-item">
        <a class="nav-link active" data-toggle="tab" href="#menu2" style="font-family: cursive;font-size: 120%;" >Tags</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" data-toggle="tab" href="#menu1" style="font-family: cursive; font-size: 120%;" onclick="question()">Answers</a>
    </li>
    
  </ul>


  <div class="tab-content">
   
    <div id="menu1" class="container tab-pane fade"><br>
         <%!
    String s1,S6;
    String  x,y,y1;
    String y3;
    int z,i;
    String t;
    String z1;
    int l1,a_count1,vote_count1;
    String v_count1,time1,A_count1,techno2,techno3[];
    
    
    %>

   <%
       
                          HttpSession vsn1=request.getSession(false);
    String nid1=(String)vsn.getAttribute("ex_id");
       
        
        y="select query_id from answer_details where user_id='"+nid+"'";
          
       
        ResultSet rs= jdbc.selectData(y);
      
         
            
            
        while(rs.next())
        {
       
               
            
               z=rs.getInt("Query_id");
              
               v_count1="select vote_count,technology,q_description from query_details where query_id='"+z+"'";
              
              
                 ResultSet rs4=jdbc.selectData(v_count1);
              
               
                rs4.next();
               
               
                 S6= "yash01";
                 vote_count=rs4.getInt("vote_count");
                 techno2 =rs4.getString("technology");
               
               
                  techno1=  new String[5];
            
           techno1= techno2.split(",");
        %>
        
      
  
    
<a  href="#" class="btn btn-outline-success btn-sm" style=" position:absolute;left:18%; font-size: 80%;"><%=vote_count%><br>votes</a>


    <h3><a id="anchor" href="answer.jsp?query_id=<%=z%>&role=<%="user"%>&u_id=<%=nid%>" style=" text-decoration: none; left:25%; font-size: 65%;"><font color="CornflowerBlue "><%=  rs4.getString("q_description")  %></font></a></h3><br>

  <%
       for(i=0;i<techno1.length;i++)
    {
            %>
           
    <div style="font-size: 75%;"> 
 <a class="btn btn-info btn-sm" href="techno_tag.jsp?techno=<%=techno1[i]%>"  style=" color:whitesmoke;  font-size: 75%;margin-left:32%;"> <%="#"+techno1[i]%> </a>
  </div>
                <%
    }
         }
        %>
        
 
      
    </div>
      
    <div id="menu2" class="container tab-pane fade"><br>
      <h3>Menu 2</h3>
      
    </div>
  <br><br><br><br><br><br>
</div>
      
                  </div>
      
      
    </body>
</html>

