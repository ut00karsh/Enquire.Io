
<%
  HttpSession vsn=request.getSession(false);
  HttpSession vsn1=request.getSession(false);
 
   String nid1=(String)vsn1.getAttribute("ex_id");
    if( nid1!=null)
    {
        
        request.setAttribute("log_msg","vote casted  SUCCESSFULLY!!");
    vsn.invalidate();

    
   
%>

    <jsp:forward page="exlogin_signup.jsp"/>
    <%
    }
    %>
    
   <jsp:forward page="exlogin_signup.jsp"/>