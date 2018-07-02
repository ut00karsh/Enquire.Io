

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
   
}
            
            
            
  #anchor
  {
   
     position:relative;
     left:15%;
     border: 1 px;
  }
  
  #anchor:visited
  {
     
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
           
           xttp.open("GET","SearchQuery.jsp?name="+name,true);
           
          xttp.send();
       }
  
            
</script>

    </head>
       
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
    String nid;
    
    int lim ,rem;
    %>
    
    
    <%
        HttpSession vsn=request.getSession(false);
    String nid1=(String)vsn.getAttribute("u_id");
    
     
    if(nid1 !=null)
    {
     String nid = request.getParameter("ex_id");
       
         s= "select * from ex_apply where ex_id='"+nid+"'";
      
         ResultSet rs=jdbc.selectData(s);
         
            while(rs.next())
                
            {
                
               %>
    
 <body class=".container-fluid" style="margin-top: 100px">
     
  
        
        
        
           <nav class="navbar navbar-expand-sm navbar-light bg-light fixed-top"style=" height:12%; border-top:3px solid sandybrown">
               <a class="navbar-brand" href="ad_home.jsp"style="font-family: cursive ; color:seagreen;"><b>Inquire.io</b></a>

        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault"
            aria-expanded="false" aria-label="Toggle navigation">
                          <span class="navbar-toggler-icon"></span>
                </button>
        <div class="collapse navbar-collapse" id="navbarsExampleDefault">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="ad_home.jsp">Home <span class="sr-only">(current)</span></a>
                </li>
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
                
            </ul>
            <a class="nav-link dropdown-toggle" data-toggle="dropdown" id="Preview" href="#" role="button" aria-haspopup="true" aria-expanded="false"
                style="position:relative">
                   Admin </a>
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
          <h1><span style="font-family: cursive; ">    <%=rs.getString("name")%></span></h1><br>
            <span style="font-family: cursive; ">    <%=rs.getString("ex_id")%></span><br>
            <span style="font-family: cursive; ">    <%=rs.getString("Email")%></span><br>
            
            <span style="font-family: cursive; ">Expert</span><br><br>
          
            
            <span style="font-family: cursive; ">Interest : &nbsp;&nbsp;  <%=rs.getString("specialization")%> </span><br>
        </div>
      
        <div class="col-sm-4" style="text-align: center">
            <span style="font-family: cursive; color: salmon"><h4> More Info Here </h4></span><br>
            
                    <span  style="font-family: cursive; font-size: 130%">About</span><br>
                    
                    <span style="font-family: cursive; "><%=rs.getString("about")%></span><br>
            <a href="">edit this</a><br><br>
            
                 
                 <div style="float:right;font-family: cursive; color:whitesmoke; ">
                   
                 <a href="approval?ex_id=<%=nid%>&flag=0" id="anchor" class="btn btn-danger btn-sm"><b>DisApprove This Expert</b></a>
                 
        
        </div>
            
            <div style="font-family: cursive; color:whitesmoke; float:right;  margin-right:10%;">
            <a href="approval?ex_id=<%=nid%>&flag=1" id="anchor" class="btn btn-success btn-sm"><b>Approve This Expert</b></a>
              </div> 
            
               
    </div>
     
     <%
            }
    }
                  %>
        
                
    </body>
</html>
