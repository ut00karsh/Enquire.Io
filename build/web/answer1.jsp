
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="res/Site.css"/>
<link rel="stylesheet" href="res/css1.css"/>
<%@page import="action.jdbc"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.io.*"%>
<html>
    <head>
         <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
            <script>
   function myFunction(name,name1)
   {
      
      var xttp = new XMLHttpRequest();
       xttp.onreadystatechange = function(){
           if((this.readyState==4) && (this.status == 200))
           {
           document.getElementById("count").innerHTML=this.responseText;
          }
           };
           
           xttp.open("GET","votes?query_id="+name+"&user_id="+name1,true);
           
          xttp.send();
       }
       
       
         function myFunction1(name,name1)
   {
      
      var xttp = new XMLHttpRequest();
       xttp.onreadystatechange = function(){
           if((this.readyState==4) && (this.status == 200))
           {
           document.getElementById("count").innerHTML=this.responseText;
          }
           };
           
           xttp.open("GET","Decrement?query_id="+name+"&user_id="+name1,true);
           
          xttp.send();
       }
  
          
     function myFunction2(name,name1)
   {
      
      var xttp = new XMLHttpRequest();
       xttp.onreadystatechange = function(){
           if((this.readyState==4) && (this.status == 200))
           {
           document.getElementById(name).innerHTML=this.responseText;
          }
           };
           
           xttp.open("GET","Avote_count?answer_id="+name+"&user_id="+name1+"&flag=increment",true);
           
          xttp.send();
       }
       
       
         function myFunction3(name,name1)
   {
      
      var xttp = new XMLHttpRequest();
       xttp.onreadystatechange = function(){
           if((this.readyState==4) && (this.status == 200))
           {
           document.getElementById(name).innerHTML=this.responseText;
          }
           };
           
           xttp.open("GET","Avote_count?answer_id="+name+"&user_id="+name1+"&flag=decrement",true);
           
          xttp.send();
       }
    
</script>
  
  
  
  <style>

      
      
      a:link, a:visited {
    border: 1px solid black;
    color: black;
    padding: 6px 10px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
}
      #division {
    border: 1px solid black;
    color: black;
    padding: 7px 9px;
   
    text-decoration: none;
    display: inline-block;
}

#division:hover
{
    background-color: skyblue;
}

a:hover, a:active {
    background-color: skyblue;
}




div
{
    
      position: relative;
      left: 15%;
}
#demo
{
    
      position: relative;
      left: 9%;
}
            
 

</style>
 </head>
 
 
 
    <body bgcolor="#e1e1e1">
  
        <h1 align="center"><font color="black" face="comic sans ms'">Inquisitive-Queries</font></h1><br>
    
     
  <s:setDataSource driver="com.mysql.jdbc.Driver" 
                 url="jdbc:mysql://localhost:3306/rcpl"
                 user="uttu" password="Piyush1998"/>
  
  
  <%!
      String s,s1,s2,status,vote_count,v_count,file_status,f_status;
      String u_id,techno,Su_id;
      int x;
  
  
  
  %>
      

   <%
           s=  request.getParameter("query_id");
           s1=request.getParameter("role");
           %>
           <%
           x = Integer.parseInt(s);%>
           
           
           
              <%
           s2="select img_status from query_details where query_id="+x;
            file_status="select file_status from query_details where query_id="+x;
          vote_count = "select vote_count,time,user_id,technology from query_details where query_id='"+x+"'";
          
            ResultSet rs4=jdbc.selectData(s2);
              ResultSet rs5=jdbc.selectData( vote_count);
              ResultSet rs6=jdbc.selectData(file_status);
            rs4.next();
            rs5.next();
            rs6.next();
        v_count = rs5.getString("vote_count");
          status =  rs4.getString("img_status");
             f_status =  rs6.getString("file_status");
            u_id = rs5.getString("user_id");
            techno = rs5.getString("technology");
            %>
           
            <%
        Su_id = (String)session.getAttribute("u_id");
          %> 
          
          <div class="row">
              <div class="col-sm-2">
                  <div style=" margin-top:60%">
          
              <button class="btn btn-info btn-block" onclick="myFunction('<%=x%>','<%=Su_id%>')" > Like </button><br>
                <%=v_count%>
               <button class="btn btn-info btn-block" onclick= "myFunction1('<%=x%>','<%=Su_id%>')"> Dislike </button>
       
              </div>
          </div>    
    <div class="col-sm-8">      
        <h3><font color="CornflowerBlue" face="comic sans ms'"> Query :-</font></h3> <hr><br>
<div>
           <s:query  var="s2"> select * from query_details where query_id=<%=x%>; </s:query>
             <c:forEach var="rs2" items="${s2.rows}">
           <br><div name="answer" style="width:55%;   position: relative; left: 23%;"> ${rs2.query_string} </div>
      </c:forEach>
</div>
        <br>
        <textarea rows="10 cols=35 disabled">
              
         
             
           <%       
          if(f_status.equalsIgnoreCase("true"))
                       
          {
           %>
         
         
               <%       
      
                       
         
          String fname = "D:\\image\\file"+ x +".txt";
         String line = null;
        
   
            FileReader fileReader = new FileReader(fname);
            
           
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            while((line = bufferedReader.readLine()) != null)
            {
              %>
              
               <%=line%>
                
               <br>
               
          <%  
            }
            bufferedReader.close();
      
             %>
             
          
          
             
          
             <br/>
           <%
          }
          %>
        </textarea>
        <br>
          <div style="float:right">
          asked on :- <%=rs5.getString("time")%>&nbsp;<b>by</b>&nbsp;&nbsp;<%=u_id%> 
          </div>   
    
            <%
            
          if(status.equalsIgnoreCase("true"))
                       
          {
           %>
           
        
          
              <br>
     
              <a  href="DownloadServlet?query_id=<%=x%>">download the image</a> 
              
           
    
     
           
           <%
          }
          %>
          
          </div>
          
          <div class="cols-sm-2" style="margin-top:10%;"> 
          <a href="techno_tag.jsp?techno=<%=techno%>"><%=techno%></a>
           </div>
              
       </div>
           <hr>
            <br>
           
          <h3><font color="CornflowerBlue" face="comic sans ms'">Answers:-</font></h3> <hr>
          
      
          <%!
      
      String ans_str,img_st,fl_status;
        %>
          
          <%
               ans_str="select * from answer_details where query_id="+x;    
                 ResultSet rs = jdbc.selectData(ans_str);
                
                 while(rs.next())
                 {
                img_st = rs.getString("img_status");
                String a_id= rs.getString("answer_id");
                fl_status=  rs.getString("file_status");
      %>       
      
      
      <br><div name="answer" style=""> <%= rs.getString("answer_String")%>  </div> <br>
      <div id="division"  style="left:30%; position:absolute;">  <%= rs.getString("user_id")%> </div>  <div id="division"  style="left:39%; position:absolute;">  <%= rs.getString("role")%> </div>
     <a  href="techno_tag.jsp?techno=<%=techno%>"> <%=techno%> </a></div>
                                       
                                         <%= rs.getString("file_status")%>
                                         <%= rs.getString("img_status")%>
                                    <%=rs.getInt("answer_id")%>
                                         <%=rs.getDate("time")%>
                                          <%=rs.getInt("vote_count")%>

<button onclick="myFunction2('<%=rs.getInt("answer_id")%>','<%=Su_id%>')" > Like </button> <%=rs.getInt("vote_count")%> <button onclick= "myFunction3('<%=rs.getString("answer_id")%>','<%=Su_id%>')"> Dislike </button>
                                          
   <%   if(img_st.equalsIgnoreCase("true"))
                       
          {
           %>
         
           <br><a href="Download_image?answer_id=<%=rs.getString("answer_id")%>">download the image</a>  
         
           
           <%
          }
          %>
          
          
          
               
           <%       
          if(f_status.equalsIgnoreCase("true"))
                       
          {
           %>
         
          
               <%       
      
                       
         
          String fname = "D:\\image\\answers\\file"+ a_id +".txt";
         String line = null;
        
   
            FileReader fileReader = new FileReader(fname);
            
           
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            while((line = bufferedReader.readLine()) != null)
            {
              %>
              
               <%=line%>
                
               <br>
               
          <%  
            }
            bufferedReader.close();
      
             %>
             
          
         </div>
           
           <%
          }
          %> 
          
                                         
                                         
      
          <%
              }
               %>
           <% session.setAttribute("query",x); 
           String z1= request.getParameter("u_id");
           session.setAttribute("person",s1);
            session.setAttribute("id",z1);
            
             %>
            

  
  <form method ="post" action="answer_register" enctype="multipart/form-data">
    <br>
 
  
  
      <label for="comment"><h3>Answer -:</h3></label>
      <textarea class="form-control" rows="8"  id="comment" name="answer1" ></textarea>

  upload image:-&nbsp;
<br><br><input type="file" name="photo" accept="image/*" value="upload image"/><br/> 


upload your code:-&nbsp;
<br><br><input type="file" name="file"  value="upload file"/><br/> 

 <br><input type="submit" value="submit your Answer">
  </form>

    </body>
</html>
