<html>
    <body>

<%@page import="action.jdbc"%>
<%@page import="java.sql.*;"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<hr>
    </body>
</html>

    <%!
    String s,S6,name;
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
  
<%
         HttpSession vsn=request.getSession(false);
    String nid=(String)vsn.getAttribute("u_id");
    if(nid !=null)
    {
        
    name=request.getParameter("name");


       
     
         
        t= "select q_description from query_details where q_description like '%"+name+"%'" ;
     
   
  
       
     
        
         ResultSet rs2=jdbc.selectData(t);
         
            
            
        while(rs2.next())
        {
           
             
              z1= rs2.getString(1);
            
              y="select query_id from query_details where q_description='"+z1+"'";
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
         
  
  
    
<a id="anchor" style="border:1px solid cornflowerblue; text-align:center; color:black; font-size: 13px;"><%=vote_count%><br>votes</a> <a id="anchor" style="border:1px solid cornflowerblue; text-align:center; color:black; left:19%;font-size: 12px; "><%=a_count%><br>Answers</a> 
<h5>
 <a id="anchor" href="answer.jsp?query_id=<%=z%>&role=<%="user"%>&u_id=<%=S6%>" style=" text-decoration: none; left:25%;" onclick= "frequent('<%=z%>','<%=S6%>')">
 <font color="CornflowerBlue "><%=  rs2.getString(1)  %>
        </font></a></h5><br><br>
 
    <%
       for(i=0;i<techno1.length;i++)
    {
            %>
           
      <div> 
     <a class="btn btn-info btn-sm" href="techno_tag.jsp?techno=<%=techno1[i]%>"  style=" color:whitesmoke;  font-size: 75%;margin-left:32%;"> <%="#"+techno1[i]%> </a>
       </div>
                <%}%>
             
          
 <div style="position:relative;left:50%; font-size: 13px;">   asked on :- <%=time%> &nbsp;<b>by</b>&nbsp;&nbsp;<%=y3%> </div><br>
<div style="align:center;"> <a href="answer.jsp?query_id=<%=z%>&role=<%="user"%>&u_id=<%=S6%>" style=" text-decoration: none; position:absolute ;font-size:14px; left:34% ;" id="demo" > Answer It</a> </div>
          
 
          
          
          
         <%
         
         if(y3.equalsIgnoreCase(S6))
         {    
         %>
      &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   <a  href="delete.jsp?query_id=<%=z%>" style="text-decoration: none; position:absolute;left:45%; font-size:14px;"> Delete this Query </a>
        <br>
       
        <%
        }
         %>
         <br> <hr style="width:100%;"></b>
        <%
      
        }
    }
        %>
   
      
      </div>