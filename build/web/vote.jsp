

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="s" %>
     
  <s:setDataSource driver="com.mysql.jdbc.Driver" 
                 url="jdbc:mysql://localhost:3306/rcpl"
                 user="uttu" password="Piyush1998"/>
<%
String q_id=request.getParameter("query_id");
String u_id=request.getParameter("u_id");



%>
<s:update var="dr" sql="update query_details set vote_count= vote_count+1 where query_id=${param.query_id}"/>

<c:set var="msg" value="Your Feedback added SUCCESSFULLY!!" scope="request"/>

<jsp:include page="home.jsp"/>
<%
}
%>
    <!---     <br><br><a href="votes?query_id=<%="z"%>&user_id=<%="S6"%>" style=" text-decoration: none; width:20px; right: 50px;"> Like </a> <div style="left:20%;"><%="vote_count"%> </div><br><a href="Decrement?query_id=<%="z"%>&user_id=<%="S6"%>" style=" text-decoration: none; width:20px;" >Unlike</a>
---!>