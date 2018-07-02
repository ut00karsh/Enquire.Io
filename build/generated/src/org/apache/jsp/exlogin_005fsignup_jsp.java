package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class exlogin_005fsignup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html >\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <title>Sign-Up/Login Form</title>\n");
      out.write("  <link href='https://fonts.googleapis.com/css?family=Titillium+Web:400,300,600' rel='stylesheet' type='text/css'>\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css\">\n");
      out.write("\n");
      out.write("  \n");
      out.write("      <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\n");
      out.write("  \n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("  <div class=\"form\">\n");
      out.write("      \n");
      out.write("      <ul class=\"tab-group\">\n");
      out.write("        <li class=\"tab active\"><a href=\"#signup\">Apply Here</a></li>\n");
      out.write("        <li class=\"tab\"><a href=\"#login\">Log In</a></li>\n");
      out.write("      </ul>\n");
      out.write("      \n");
      out.write("      <div class=\"tab-content\">\n");
      out.write("        <div id=\"signup\">   \n");
      out.write("          <h1>Apply for Free</h1>\n");
      out.write("          \n");
      out.write("          <form action=\"/\" method=\"post\">\n");
      out.write("          \n");
      out.write("          <div class=\"top-row\">\n");
      out.write("            <div class=\"field-wrap\">\n");
      out.write("              <label>\n");
      out.write("                First Name<span class=\"req\">*</span>\n");
      out.write("              </label>\n");
      out.write("              <input type=\"text\" required autocomplete=\"off\" />\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("            <div class=\"field-wrap\">\n");
      out.write("              <label>\n");
      out.write("                Last Name<span class=\"req\">*</span>\n");
      out.write("              </label>\n");
      out.write("              <input type=\"text\"required autocomplete=\"off\"/>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"field-wrap\">\n");
      out.write("            <label>\n");
      out.write("              Email Address<span class=\"req\">*</span>\n");
      out.write("            </label>\n");
      out.write("            <input type=\"email\"required autocomplete=\"off\"/>\n");
      out.write("          </div>\n");
      out.write("\t\t  \n");
      out.write("\t\t   \n");
      out.write("          <div class=\"field-wrap\">\n");
      out.write("            <label>\n");
      out.write("              Expert_Id<span class=\"req\">*</span>\n");
      out.write("            </label>\n");
      out.write("            <input type=\"text\"required autocomplete=\"off\"/>\n");
      out.write("          </div>\n");
      out.write("          \n");
      out.write("          <div class=\"field-wrap\">\n");
      out.write("            <label>\n");
      out.write("              Set A Password<span class=\"req\">*</span>\n");
      out.write("            </label>\n");
      out.write("            <input type=\"password\"required autocomplete=\"off\"/>\n");
      out.write("          </div>\n");
      out.write("\t\t  \n");
      out.write("\t\t \n");
      out.write("\t\t  \n");
      out.write("\t\t  <div class=\"field-wrap\">\n");
      out.write("            <label>\n");
      out.write("              Specialization<span class=\"req\">*</span>\n");
      out.write("            </label>\n");
      out.write("            <input type=\"text\"required autocomplete=\"off\"/>\n");
      out.write("          </div>\n");
      out.write("\t\t  \n");
      out.write("\t\t   <div class=\"field-wrap\">\n");
      out.write("            <label>\n");
      out.write("              About Your self<span class=\"req\">*</span>\n");
      out.write("            </label>\n");
      out.write("            <input style=\" height:150%;\" type=\"text\"required autocomplete=\"off\"/>\n");
      out.write("          </div>\n");
      out.write("          \n");
      out.write("          <button type=\"submit\" class=\"button button-block\"/>Get Started</button>\n");
      out.write("          \n");
      out.write("          </form>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div id=\"login\">   \n");
      out.write("          <h1>Welcome Back!</h1>\n");
      out.write("          \n");
      out.write("          <form action=\"expert_auth\" method=\"post\">\n");
      out.write("          \n");
      out.write("            <div class=\"field-wrap\">\n");
      out.write("            <label>\n");
      out.write("              User_Id<span class=\"req\">*</span>\n");
      out.write("            </label>\n");
      out.write("            <input type=\"text\" name=\"id\" required autocomplete=\"off\"/>\n");
      out.write("          </div>\n");
      out.write("          \n");
      out.write("          <div class=\"field-wrap\">\n");
      out.write("            <label>\n");
      out.write("              Password<span class=\"req\">*</span>\n");
      out.write("            </label>\n");
      out.write("            <input type=\"password\" name=\"pwd\" required autocomplete=\"off\"/>\n");
      out.write("          </div>\n");
      out.write("          \n");
      out.write("        \n");
      out.write("          \n");
      out.write("          <button class=\"button button-block\"/>Log In</button>\n");
      out.write("          \n");
      out.write("          </form>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("      </div><!-- tab-content -->\n");
      out.write("      \n");
      out.write("</div> <!-- /form -->\n");
      out.write("  <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>\n");
      out.write("\n");
      out.write("    <script  src=\"js/index.js\"></script>\n");
      out.write("\n");
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
