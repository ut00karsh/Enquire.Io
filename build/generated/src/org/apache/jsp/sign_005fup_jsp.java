package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sign_005fup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<head>\n");
      out.write("      <meta charset=\"utf-8\">\n");
      out.write("      <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("      <title>Sign Up Form</title>\n");
      out.write("      <link rel=\"stylesheet\" href=\"res/css/normalize.css\">\n");
      out.write("      <link href='https://fonts.googleapis.com/css?family=Nunito:400,300' rel='stylesheet' type='text/css'>\n");
      out.write("      <link rel=\"stylesheet\" href=\"res/register.css\">\n");
      out.write(" \n");
      out.write("<style>\n");
      out.write("  body {\n");
      out.write("    background-image: url(\"res/02_1.jpg\");\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=submit] {\n");
      out.write("    width: 100%;\n");
      out.write("    background-color: #4CAF50;\n");
      out.write("    color: white;\n");
      out.write("    padding: 14px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    cursor: pointer;\n");
      out.write("    font-size: 21px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=submit]:hover {\n");
      out.write("    background-color: #45a049;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" </head>\n");
      out.write("  <body>\n");
      out.write("\n");
      out.write("      <form action=\"register\" method=\"post\">\n");
      out.write("\n");
      out.write("      <h1>Sign Up</h1>\n");
      out.write("\n");
      out.write("      <fieldset>\n");
      out.write("        <legend style=\"color:\">Your basic info</legend>\n");
      out.write("\t\t\n");
      out.write("        <br><label for=\"name\">Name:</label>\n");
      out.write("        <input  type=\"text\" name=\"name\" placeholder=\"your  name\" required>\n");
      out.write("\t\t\n");
      out.write("\t\t  <label for=\"u_id\">User Id:</label>\n");
      out.write("        <input  type=\"text\" name=\"u_id\" placeholder=\"your user id\" required>\n");
      out.write("\n");
      out.write("        <label for=\"mail\">Email:</label>\n");
      out.write("        <input  type=\"email\" name=\"user_mail\" placeholder=\"your email address\" required>\n");
      out.write("\n");
      out.write("        <label for=\"password\">Password:</label>\n");
      out.write("       <input  type=\"password\" name=\"pwd\" placeholder=\"your password\" required>\n");
      out.write("\n");
      out.write("       <label for=\"confirm_Password\">confirm_Password</label>\n");
      out.write("<input  type=\"password\" name=\"cnf_pwd\" placeholder=\" Enter your password\" required >\n");
      out.write("       \n");
      out.write("      <label for=\"qualifiacation\">Qualification</label>\n");
      out.write("<select class=\"new\" name=\"q1\">\n");
      out.write("<option value=\"undergraduate\">Under-Graduate</option>\n");
      out.write("<option value=\"graduate\">Graduate</option>\n");
      out.write("<option value=\"postgraduate\">Post-Graduate</option>\n");
      out.write("</select>\n");
      out.write("      </fieldset>\n");
      out.write("      <input type=\"submit\" value=\"SignUp\">\n");
      out.write("    </form>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
