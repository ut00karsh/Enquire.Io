 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="action.jdbc"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="java.sql.ResultSet"%>

<html >
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
       </script>
    </head>
    
<body>
<hr>
         <%!
    String s,S6;
    String  x,y,y1;
    String y3;
    int z,i;
    String t;
    String z1;
    int l,a_count,vote_count;
    String v_count,time,A_count,techno,techno1[];
    
    
    %>

   <%
       
                          HttpSession vsn=request.getSession(false);
    String nid=(String)vsn.getAttribute("ex_id");
       
        
        y="select query_id from answer_details where user_id='"+nid+"'";
          
       
        ResultSet rs= jdbc.selectData(y);
      
         
            
            
        while(rs.next())
        {
       
               
            
               z=rs.getInt("Query_id");
              
               v_count="select vote_count,technology,q_description from query_details where query_id='"+z+"'";
              
              
                 ResultSet rs4=jdbc.selectData(v_count);
              
               
                rs4.next();
               
               
                 S6= "yash01";
                 vote_count=rs4.getInt("vote_count");
                 techno =rs4.getString("technology");
               
               
                  techno1=  new String[5];
            
           techno1= techno.split(",");
        %>
        
      
     <div id="demo3">
    
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
        
        </body>
        </html>