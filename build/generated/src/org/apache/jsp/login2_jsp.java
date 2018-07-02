package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login2_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("    <title>Signup</title>\n");
      out.write("     \n");
      out.write("        \n");
      out.write("       \n");
      out.write("    <link rel=\"stylesheet\" href=\"res/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"res/style1.css\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("   \n");
      out.write("    \n");
      out.write("   \n");
      out.write("  \n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <form class=\"frm\" method=\"POST\" autocomplete=\"off\" action=\"expert_auth\" >\n");
      out.write("            <h1 class=\"form-heading\">Hi!</h1>\n");
      out.write("            <br>\n");
      out.write("            <input type=\"text\" name=\"id\" class=\"form-control\" placeholder=\"Username\" autofocus>\n");
      out.write("            <br>\n");
      out.write("            <input type=\"password\" name=\"pwd\" class=\"form-control\" placeholder=\"Password\">\n");
      out.write("         \n");
      out.write("            <br>\n");
      out.write("            <div class=\"checkbox\">\n");
      out.write("                <label>\n");
      out.write("                    <input name=\"chkbox\" type=\"checkbox\" value=\"remember\"> Remember me\n");
      out.write("                </label>\n");
      out.write("            </div>\n");
      out.write("            <input class=\"btn btn-lg btn-primary btn-block\" type=\"submit\" value=\"Sign in\">\n");
      out.write("            <span>or</span>\n");
      out.write("            <a href=\"/signup\">Apply ...</a>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("   \n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
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
