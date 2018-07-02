<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="s" %>
     
  <s:setDataSource driver="com.mysql.jdbc.Driver" 
                 url="jdbc:mysql://localhost:3306/rcpl"
                 user="uttu" password="Piyush1998"/>

<s:update var="dr" sql="delete from answer_details where answer_id =${param.answer_id}"/>

<c:set var="msg" value="record  DELETED SUCCESSFULLY!!" scope="request"/>

<jsp:forward page="ad_home.jsp"/>
