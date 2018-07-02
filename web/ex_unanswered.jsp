

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="res/Site.css"/>
<link rel="stylesheet" href="res/css1.css"/>
<%@page import="action.jdbc"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="java.sql.ResultSet"%>
<!DOCTYPE html>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>home Page</title>
    </head>
    <body style="background-color:#e1e1e1;">
       
        <h1 align="center"><font color="red" face="comic sans ms'"></h1>
         <%!
    String s,s1,s2,s3,S6;
    String  x,y,y1;
    String y3;
    int z;
    String t,time;
    String z1;
    
    
    
    %>
        <h1> Inquisitive Queries</h1>
      <%
         s1 = (String)session.getAttribute("ex_id");
         s2 = "select specialization from expert_details where expert_id = '"+s1+"'";
         ResultSet rs4=jdbc.selectData(s2);
         rs4.next();
         s3= rs4.getString("specialization");
       
          
        s="select query_string from query_details where technology = '"+s3+"' and status ='not answered' order by time ";
        t="select q_description from query_details where technology = '"+s3+"' and status = 'not answered' order by time";
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
               
                ResultSet rs3=jdbc.selectData(y1);
                rs3.next();
                y3=rs3.getString("user_id");
                  time= rs3.getString("time");
                S6=(String)session.getAttribute("ex_id");
              
               
               
        %>
        
         <pre><div style="background-color: white; width:44%; height:7%;"><a href="answer.jsp?query_id=<%=z%>&role=<%="expert"%>&u_id=<%=S6%>"><font color="red"><%= "Query:-"   +rs2.getString(1)  %></font></a></div></pre>
         <div style="float:center;" > <%=y3%>
          &nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;query asked on :- <%=time%></div><br>
         <br> <a href="answer.jsp?query_id=<%=z%>&role=<%="expert"%>&u_id=<%=S6%>">answer it</a>
        
        <%
      
        }
        %>
  
  &nbsp; &nbsp;&nbsp;  &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;&nbsp;<a href="ex_home.jsp"style="width:170px; height:60px; background-color: lightpink">Back To Home</a>   
       
      </div>
    </body>
    
