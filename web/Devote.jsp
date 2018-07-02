<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="s" %>
     
<s:setDataSource driver="com.mysql.jdbc.Driver" 
                 url="jdbc:mysql://localhost:3306/rcpl"
                 user="uttu" password="Piyush1998"/>

<s:update var="dr" sql="update query_details set vote_count= vote_count-1 where query_id=${param.query_id}"/>

<c:set var="msg1" value="Your Feedback added SUCCESSFULLY!!" scope="request"/>

<%@include file="home.jsp"%>


