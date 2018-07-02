
<%
  
  HttpSession vsn1=request.getSession(false);
 
   String nid1=(String)vsn1.getAttribute("ad_id");
    if( nid1!=null)
    {
        
        request.setAttribute("log_msg","vote casted  SUCCESSFULLY!!");
    vsn1.invalidate();

    
   
%>

    <jsp:forward page="login3.jsp"/>
    <%
    }
    %>
    
 