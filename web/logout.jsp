

<%
  HttpSession vsn=request.getSession(false);

  String nid=(String)vsn.getAttribute("u_id");
 
    if(nid !=null)
    {
        
        request.setAttribute("log_msg","vote casted  SUCCESSFULLY!!");
    vsn.invalidate();
    
    }
%>

    <jsp:forward page="login3.jsp"/>