package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login1_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>\n");
      out.write("        login/sinup\n");
      out.write("    </title>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"res/project.css\">\n");
      out.write("</head>\n");
      out.write("<body background=\"res/blur.jpg\">\n");
      out.write("<div class=\"login-wrap\" style=\"margin-top: 15px; \">\n");
      out.write("    <div class=\"login-html\">\n");
      out.write("        <input id=\"tab-1\" type=\"radio\" name=\"tab\" class=\"sign-in \" checked><label for=\"tab-1\" class=\"tab\">Sign In</label>\n");
      out.write("        <input id=\"tab-2\" type=\"radio\" name=\"tab\" class=\"sign-up\"><label for=\"tab-2\" class=\"tab\">Sign Up</label>\n");
      out.write("        <div class=\"login-form\">\n");
      out.write("            <div class=\"sign-in-htm\">\n");
      out.write("                  <form action=\"authenticate\" method=\"post\">\n");
      out.write("                <div class=\"group\">\n");
      out.write("                     \n");
      out.write("                    <label for=\"user\" class=\"label\">Username</label>\n");
      out.write("                    <input id=\"user\" type=\"text\" name=\"id\" class=\"input\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"group\">\n");
      out.write("                    <label for=\"pass\" class=\"label\">Password</label>\n");
      out.write("                    <input id=\"pass\"  name=\"pwd\" type=\"password\" class=\"input\" data-type=\"password\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"group\">\n");
      out.write("                    <input id=\"check\" type=\"checkbox\" class=\"check\" checked>\n");
      out.write("                    <label for=\"check\"><span class=\"icon\"></span> Keep me Signed in</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"group\">\n");
      out.write("                    <input type=\"submit\" class=\"button\" value=\"Sign In\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"hr\"></div>\n");
      out.write("                <div class=\"foot-lnk\">\n");
      out.write("                    <a href=\"#forgot\">Forgot Password?</a>\n");
      out.write("                </div>\n");
      out.write("                </form> \n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("            <div class=\"sign-up-htm\">\n");
      out.write("                <div class=\"group\">\n");
      out.write("                    <label for=\"user\" class=\"label\">Username</label>\n");
      out.write("                    <input id=\"user\" type=\"text\" class=\"input\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"group\">\n");
      out.write("                    <label for=\"pass\" class=\"label\">Password</label>\n");
      out.write("                    <input id=\"pass\" type=\"password\" class=\"input\" data-type=\"password\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"group\">\n");
      out.write("                    <label for=\"pass\" class=\"label\">Repeat Password</label>\n");
      out.write("                    <input id=\"pass\" type=\"password\" class=\"input\" data-type=\"password\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"group\">\n");
      out.write("                    <label for=\"pass\" class=\"label\">Email Address</label>\n");
      out.write("                    <input id=\"pass\" type=\"text\" class=\"input\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"group\">\n");
      out.write("                    <input type=\"submit\" class=\"button\" value=\"Sign Up\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"hr\"></div>\n");
      out.write("                <div class=\"foot-lnk\">\n");
      out.write("                    <label for=\"tab-1\"><a href=\"#\">Already Member?</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
