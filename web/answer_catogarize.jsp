


<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="action.jdbc"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.io.*"%>
<html>
    <head>
        <script src="https://cloud.tinymce.com/stable/tinymce.min.js?apiKey=zy6w9djp0gif31rebjppa7nstggngix6k2vwz94kyk4tw77e"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.6/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script>
         <script src="https://cloud.tinymce.com/stable/tinymce.min.js"></script>
  <script>tinymce.init({ selector:'textarea#demo0' });</script>
  
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
 
  

  <script>
    $(function() {
        $('textarea#froala-editor').froalaEditor({
            toolbarButtons: ['bold', 'italic', 'underline', 'strikeThrough', 'fontFamily', 'fontSize', '|', 'inlineStyle', 'paragraphFormat', 'align', 'undo', 'redo', 'html'],
        })
    });
  </script>
    
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
       
       function marked(name,name1)
       {
           
          
       
            
              
      var xttp = new XMLHttpRequest();
       xttp.onreadystatechange = function(){
           if((this.readyState==4) && (this.status == 200))
           {
              document.getElementById("marked").innerHTML=this.responseText;
          }
           };
           
           xttp.open("GET","marked?query_id="+name+"&user_id="+name1,true);
           
          xttp.send();
            
           
       }
         function catagory()
       {
           
         
            
        var x = document.getElementById("demo0").value
        if (x.length<200)
        {
            alert(" length of Input String must be greater then 250");
        return false;
    }  
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

<body class=".container-fluid" style="margin-top: 70px">
    
    <script>
    hljs.initHighlightingOnLoad(); 
    </script>
    
    
       
    
     
  <s:setDataSource driver="com.mysql.jdbc.Driver" 
                 url="jdbc:mysql://localhost:3306/rcpl"
                 user="uttu" password="Piyush1998"/>
  
  
  <%!
      String s,s1,s2,status,vote_count,v_count,file_status,f_status;
      String u_id,techno,Su_id;
      String [] techno1;
      int x,i;
       String flag;
  %>
      

   <%
                      HttpSession vsn=request.getSession(false);
    String nid=(String)vsn.getAttribute("u_id");
    String nid1=(String)vsn.getAttribute("ex_id");
    if(nid !=null || nid1!=null)
    {
           s=  request.getParameter("query_id");
           s1=request.getParameter("role");
          flag=request.getParameter("flag");
           out.println(flag);
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
            
            techno1=  new String[5];
            
           techno1= techno.split(",");
            %>
           
            <%
        Su_id = (String)session.getAttribute("u_id");
          %> 
    
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
        <br><br>
    </nav>
          
<br>
<br>
          
    <div class="row">
        <div class="col-sm-2">
            <div style="margin-top: 70%; width:40%; margin-left: 20%;" >
               <button class="btn btn-sm btn-info btn-block" onclick="myFunction('<%=x%>','<%=Su_id%>')"  > Like </button>
               <h3 style="margin-left: 40%;"> <div id="count">    <%=v_count%></div></h3>
               <button class="btn btn-sm btn-info btn-block" onclick= "myFunction1('<%=x%>','<%=Su_id%>')" > Dislike </button>
               <button class="btn btn-sm btn-outline-info" id="marked" style="margin-top:80% ; float:left;" onclick= "marked('<%=x%>','<%=Su_id%>')">  
               Add To Favourites
               </button>
            </div>
           
            
              
        </div>
        <div class="col-sm-8">
            <h2 style="font-family:cursive">Question</h2><br>
            <hr  style='border:3px solid sandybrown'>
            <div>
                 <s:query  var="s2"> select * from query_details where query_id=<%=x%>; </s:query>
             <c:forEach var="rs2" items="${s2.rows}">
                    
                 <h3 style="font-family: cursive">${rs2.q_description} </h3><br><br>
                 
                 ${rs2.query_string} 
      </c:forEach>
                </div>
           
             
              <%       
          if(f_status.equalsIgnoreCase("true"))
                       
          {
           %>
           
           <pre>
           <code class="python" class="form-control"  style=" background-color: whitesmoke; width:70%;">
             <%       
       String fname = "D:\\image\\file"+ x +".txt";
         String line = null;
       FileReader fileReader = new FileReader(fname);
             BufferedReader bufferedReader = new BufferedReader(fileReader);
           while((line = bufferedReader.readLine()) != null)
            {
               if (!line.isEmpty())
                        {
              %>
              <%=line%>
                <%  
                        }
            }
            bufferedReader.close(); %>
         </code>
         </pre>
           
          <%
          }
          %>
       
            <div style="float:right">asked on :- <%=rs5.getString("time")%>&nbsp;<b>by</b>&nbsp;&nbsp;<%=u_id%></div>
            <br>
            <div style="">
            <%
            
          if(status.equalsIgnoreCase("true"))
                       
          {
           %>
     
     <a id="anchor" href="DownloadServlet?query_id=<%=x%>">download the image</a> 
               <%
          }
          request.setAttribute("query_id",x);
          %></div>
        
          <br>
          
        
          
        </div>
        
        
        
       
        <div class="col-sm-2" style="margin-top:10%; ">
             <%
          for(i=0;i<techno1.length;i++)
          {
        %>
            <a id="anchor" class="btn-info" href="techno_tag.jsp?techno=<%=techno1[i]%>" style="font-size:70%; "><b>#</b><%=techno1[i]%></a>
            <br><br>
            <% }%>
             
        </div>
       </div>
       <div >
      <hr style='border:2px solid tan '>
 </div>
        <br>
        
     
     
  
  
   <div class="container" style="margin-left: 10%;">
 
  
 
  <ul class="nav nav-tabs" role="tablist">
      <%if(flag==null)
              {
                  
        %>
         <p style="font-family: cursive;font-size: 200%; "class="label">Answers</p>
    <li class="nav-item" style="margin-left:50%;">
        <a class="nav-link active" href="answer.jsp" style="font-family: cursive;font-size: 120%;" >Home</a>
    </li>
    <li class="nav-item">
      <a class="nav-link"  href="answer_catogarize.jsp?query_id=<%=x%>&flag=<%="top"%>&u_id=<%=Su_id%>"  style="font-family: cursive; font-size: 120%;" >Top</a>
    </li>
    <li class="nav-item">
      <a class="nav-link"  href="answer_catogarize.jsp?query_id=<%=x%>&flag=<%="featured"%>&u_id=<%=Su_id%>" style="font-family: cursive; font-size:120%;">Featured</a>
    </li>
     
     <li class="nav-item">
      <a class="nav-link"  href="answer_catogarize.jsp?query_id=<%=x%>&flag=<%="newest"%>&u_id=<%=Su_id%>" style="font-family:cursive; font-size:120%;">Newest</a>
    </li>
  </ul>
   <%
} 
   
   else if(flag.equalsIgnoreCase("top"))
              {
                  
        %>
         <p style="font-family: cursive;font-size: 200%; "class="label">Answers</p>
    <li class="nav-item" style="margin-left:50%;">
        <a class="nav-link" href="answer.jsp" style="font-family: cursive;font-size: 120%;" >Home</a>
    </li>
    <li class="nav-item">
      <a class="nav-link  active"  href="answer_catogarize.jsp?query_id=<%=x%>&flag=<%="top"%>&u_id=<%=Su_id%>"  style="font-family: cursive; font-size: 120%;" >Top</a>
    </li>
    <li class="nav-item">
      <a class="nav-link"  href="answer_catogarize.jsp?query_id=<%=x%>&flag=<%="featured"%>&u_id=<%=Su_id%>" style="font-family: cursive; font-size:120%;">Featured</a>
    </li>
     
     <li class="nav-item">
      <a class="nav-link"  href="answer_catogarize.jsp?query_id=<%=x%>&flag=<%="newest"%>&u_id=<%=Su_id%>" style="font-family:cursive; font-size:120%;">Newest</a>
    </li>
  </ul>
   <%} 
      
 
    else if(flag.equalsIgnoreCase("featured"))
              {
                  
        %>
         <p style="font-family: cursive;font-size: 200%; "class="label">Answers</p>
    <li class="nav-item" style="margin-left:50%;">
        <a class="nav-link" href="answer.jsp" style="font-family: cursive;font-size: 120%;" >Home</a>
    </li>
    <li class="nav-item">
      <a class="nav-link  "  href="answer_catogarize.jsp?query_id=<%=x%>&flag=<%="top"%>&u_id=<%=Su_id%>"  style="font-family: cursive; font-size: 120%;" >Top</a>
    </li>
    <li class="nav-item">
      <a class="nav-link active"  href="answer_catogarize.jsp?query_id=<%=x%>&flag=<%="featured"%>&u_id=<%=Su_id%>" style="font-family: cursive; font-size:120%;">Featured</a>
    </li>
     
     <li class="nav-item">
      <a class="nav-link"  href="answer_catogarize.jsp?query_id=<%=x%>&flag=<%="newest"%>&u_id=<%=Su_id%>" style="font-family:cursive; font-size:120%;">Newest</a>
    </li>
  </ul>
   <%}
       else if(flag.equalsIgnoreCase("newest"))
              {
                  
        %>
         <p style="font-family: cursive;font-size: 200%; "class="label">Answers</p>
    <li class="nav-item" style="margin-left:50%;">
        <a class="nav-link" href="answer.jsp" style="font-family: cursive;font-size: 120%;" >Home</a>
    </li>
    <li class="nav-item">
      <a class="nav-link  "  href="answer_catogarize.jsp?query_id=<%=x%>&flag=<%="top"%>&u_id=<%=Su_id%>"  style="font-family: cursive; font-size: 120%;" >Top</a>
    </li>
    <li class="nav-item">
      <a class="nav-link "  href="answer_catogarize.jsp?query_id=<%=x%>&flag=<%="featured"%>&u_id=<%=Su_id%>" style="font-family: cursive; font-size:120%;">Featured</a>
    </li>
     
     <li class="nav-item">
      <a class="nav-link active"  href="answer_catogarize.jsp?query_id=<%=x%>&flag=<%="newest"%>&u_id=<%=Su_id%>" style="font-family:cursive; font-size:120%;">Newest</a>
    </li>
  </ul>
   <%}%> 
    <br>

   </div>

    

 
       <%!
      
      String ans_str,img_st,fl_status;
        %>
        
       
        <%
        if(flag!=null)
        {
        if(flag.equalsIgnoreCase("top"))
        {
        ans_str="select * from answer_details where query_id="+x+" order by vote_count";
        }
         else if(flag.equalsIgnoreCase("newest"))
        {
        ans_str="select * from answer_details where query_id="+x+" order by time desc";
        }
          else if(flag.equalsIgnoreCase("featured"))
        {
        ans_str="select * from answer_details where query_id="+x+" and role='expert'";
        }
        }
          else
        {
        ans_str="select * from answer_details where query_id="+x;
        }
       
        ResultSet rs = jdbc.selectData(ans_str);
           while(rs.next())
                 {
                img_st = rs.getString("img_status");
                String a_id= rs.getString("answer_id");
                 
          fl_status=  rs.getString("file_status");
        %>
        

    <div class="row" >
        <div class="col-sm-2">
            <div style="margin-top: 60% ; width:40%; margin-left: 20%; ">
           <button class="btn btn-info btn-block" onclick="myFunction2('<%=rs.getInt("answer_id")%>','<%=Su_id%>')" > Like </button>
         <h3  style="margin-left: 40%;">  <div id="<%=rs.getInt("answer_id")%>">      <%=rs.getInt("vote_count")%> </div> </h3>
           <button class="btn btn-info btn-block" onclick= "myFunction3('<%=rs.getString("answer_id")%>','<%=Su_id%>')"> Dislike </button>
            </div>
        </div>
        <div class="col-sm-8">
        
           <hr style='border:3px solid sandybrown'>
            <div>
                <%= rs.getString("answer_String")%>
                </div>
            <%       
          if(fl_status.equalsIgnoreCase("true"))
                       
          {
           %>
           <pre>
           <code class="form-control"  style=" background-color: whitesmoke; width:650px; font-size: 90%;">
    <%       
          String fname = "D:\\image\\answers\\file"+ a_id +".txt";
         String line = null;
        FileReader fileReader = new FileReader(fname);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while((line = bufferedReader.readLine()) != null)
               { 
                   if (!line.isEmpty())
                        {
           %><%out.println (line);%>
                <% }
               }
            bufferedReader.close();%>
             </code>
        </pre>
            <%
          }
          %> 


            
            <br>
            <div style="float:right">
               <span class="badge badge-pill" style='color: #000; font-family: cursive'> answered on :- <%= rs.getDate("time")%>&nbsp;<b>by</b>&nbsp;&nbsp;<%=rs.getString("User_id")%><br>
                   <h5> Role is:-<%= rs.getString("role")%> </h5></span>
                  
            </div>
            <br>
            
            
            <script>
function funDisplay(name) {
    
    var x = document.getElementById(name);
    if (x.style.display === "none") 
    {
        x.style.display = "block";
    } 
  
}
</script>
            
            
           <div style="">
            <%
            
          if(img_st.equalsIgnoreCase("true"))
                       
          {
           %>
          <br>
     <a id="anchor" href="Download_image?answer_id=<%=rs.getString("answer_id")%>">download the image</a>  
     
         <br>
     
               <%
          }
          
         
          %><br></div>
          <%  if(rol.equalsIgnoreCase("admin"))
        {%>
          <div>
            <a class="btn btn-danger" href="delete_answer.jsp?answer_id=<%=rs.getInt("answer_id")%>"
             style="text-decoration: none; position:relative; font-size:14px;">
              Delete this Answer </a> 
          </div>
             <br>
             <%}%>
           
          <h4 style="font-family: cursive "> Comments</h4>
          <hr style='border: 1.5px solid lightsalmon'>
          <div Style="margin-left:13%; width:48%;  font-family: cursive; ">
          <%
                String comment="select * from comments where answer_id="+a_id;         
                ResultSet c_value=jdbc.selectData(comment);
                
                while (c_value.next())
                        {
          %>
         
             <%=c_value.getString("c_Str")%> 
             <span style="margin-left:60%; font-size: 70%;">  <%=c_value.getDate("time")%>&nbsp;<b>by</b>&nbsp;&nbsp;<%=c_value.getString("User_id")%></span>
        
                <hr style='border: 1.5px solid papayawhip'>
               
          <%}%>
          
           
          
          <br>
          <button class="btn btn-outline-success btn-sm" onclick="funDisplay('com+<%=rs.getInt("answer_id")%>')">add a comment</button>
          
           </div>
            <form action="comment" mrthod="post">
                
           <div style="padding: 24px ;display: none; " id="com+<%=rs.getInt("answer_id")%>"> 
               
               <textarea class="form-control" rows="15" name="comment" id="froala-editor"  placeholder="put your Answer here" required >
               </textarea>
               <br>
               
               <input type="hidden" value="<%=rs.getInt("answer_id")%>" name="q_id">
               <input type="submit" value="comment"  class="btn btn-outline-success">
         </div>
              
              
          </form>
          
      
       </div>
        <div class="col-sm-2" style="margin-top:10%;">
                      <%
          for(i=0;i<techno1.length;i++)
          {
        %>
            <a id="anchor" class="btn-info" href="techno_tag.jsp?techno=<%=techno1[i]%>" style="font-size:70%; "><b>#</b><%=techno1[i]%></a>
           
            <% }%>
             
      
        </div>
        
    </div>

               
    
     
   
      
 
    
      
 
            <br>
    <%
    }
    }
    else
    {
        if(nid==null)
        {
    %>
    
    <jsp:forward page="login3.jsp"/>
    
    <%
    }
        else
        {
    %>
     <jsp:forward page="exlogin_signup.jsp"/>
   <%
        }
    }
        %>
                                      
      
          
           <% session.setAttribute("query",x); 
           String z1= request.getParameter("u_id");
           session.setAttribute("person",s1);
            session.setAttribute("id",z1);
            
             %>
            
  
  
  <form method ="post" action="answer_register" enctype="multipart/form-data" onsubmit="return catagory()">
      <br><br>
    <span class="badge badge-secondary" style='margin-left: 12%;'> <h4 style="font-family:cursive ;color: white"> Post An Answer</h4></span>
      <div style="padding:24px">
          <textarea   name="answer1" rows="8" cols="1" id="demo0" placeholder="put your Answer here"  minlength="5000" >
          
          </textarea>
      </div>
      <div class="container-fluid">
          <div class="row">
            <div class="col-sm-4" style="text-align:center;">
                <span class="badge badge-warning">Upload Image</span><br>
                <input class ="btn-info btn" type="file" name="photo" accept="image/*" value="upload image"/>
            </div>
            <div class="col-sm-4">
            </div>
            <div class="col-sm-4" style="text-align:center;">
                <span class="badge badge-warning">Upload Code</span><br>
                <input  class ="btn-info btn" type="file" name="file"  value="upload file">     
            </div>
          </div>
          <div class="row">
             <div class="col-sm-4">
             </div>
             <div class="col-sm-4" style="text-align:center;">
                 <input class="btn-outline-success btn " type="submit" value="Submit Your Answer" >
             </div>
             <div class="col-sm-4">
             </div>
          </div>
      </div>
  </form>


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