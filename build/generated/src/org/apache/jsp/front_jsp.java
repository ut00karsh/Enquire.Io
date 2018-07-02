package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class front_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("    <link rel=\"stylesheet\" href=\"res/bootstrap.min.css\">\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("     <title>Footer with Button and Logo</title>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css\">\n");
      out.write("   \n");
      out.write("    <link rel=\"stylesheet\" href=\"res/Footer-with-button-logo.css\">\n");
      out.write("    <title>Title</title>\n");
      out.write("</head>\n");
      out.write("<body >\n");
      out.write("<nav class=\"navbar navbar-expand-sm navbar-light bg-light fixed-top\" style=\"background-image :url(res/01.jpg); height:13%; border-top:3px solid sandybrown\">\n");
      out.write("    <a class=\"navbar-brand\" href=\"front.jsp\" style=\"font-family:cursive ; color:seagreen \"><b>Inquire.io</b></a>\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarsExampleDefault\" aria-controls=\"navbarsExampleDefault\"\n");
      out.write("            aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                  <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("        </button>\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarsExampleDefault\">\n");
      out.write("            <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                <li class=\"nav-item active\">\n");
      out.write("                    <a class=\"nav-link\" style=\"color: #dc3545;\" href=\"login3.jsp\">Create an Account <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" style=\"color: #0069d9\" href=\"login3.jsp\">Login</a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("            <ul class=\"navbar-nav navbar-right\">\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"exlogin_signup.jsp\" style=\"color: rebeccapurple\">Apply for Expert<span class=\"sr-only\">(current)</span></a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"exlogin_signup.jsp\" style=\"color: mediumseagreen\">Login as Expert<span class=\"sr-only\">(current)</span></a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("    <div style=\" background-image:url(res/coding_1.jpg) ; \">\n");
      out.write("    <br><br><br>    <br><br><br>\n");
      out.write("    <div style=\" margin-left:13%; \">\n");
      out.write("        <span style=\"font-family: cursive ; font-size: 190%;\">\n");
      out.write("            <h1><e><b>Questioning</b></e></h1>\n");
      out.write("            <h1 style=\"margin-left:4%; color: #dc3545\"><e><b>The</b></e></h1>\n");
      out.write("            <h1 style=\"margin-left:8%;\" ><e><b>Code</b></e></h1>\n");
      out.write("        </span>\n");
      out.write("        <br>\n");
      out.write("    </div>\n");
      out.write("    <div  style=\" margin-left:10%;\" >\n");
      out.write("        <a class=\"btn btn-danger btn-lg\" href=\"exlogin_signup.jsp\">Apply for Expert<span class=\"sr-only\">(current)</span></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("        <a class=\"btn btn-danger btn-lg\" href=\"exlogin_signup.jsp\">Login as Expert<span class=\"sr-only\">(current)</span></a>\n");
      out.write("    \n");
      out.write("    </div>\n");
      out.write("<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>\n");
      out.write("    </div>\n");
      out.write("    <footer id=\"myFooter\" >\n");
      out.write("        <div class=\"container\" >\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-3\" >\n");
      out.write("                    <h3 ><a  href=\"front.jsp\" style=\"font-family:cursive ; color: lightcoral; font-size:135% ;\"><b>Inquire.io</b></a></h3>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-2\">\n");
      out.write("                    <h5>Get started</h5>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"#\">Home</a></li>\n");
      out.write("                        <li><a href=\"#\">Sign up</a></li>\n");
      out.write("                        \n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-2\">\n");
      out.write("                    <h5>About us</h5>\n");
      out.write("                    <ul>\n");
      out.write("                        \n");
      out.write("                        <li><a href=\"#\">Contact us</a></li>\n");
      out.write("                        <li><a href=\"#\">Reviews</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-2\">\n");
      out.write("                    <h5>Support</h5>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"#\">FAQ</a></li>\n");
      out.write("                        <li><a href=\"#\">Help desk</a></li>\n");
      out.write("                        <li><a href=\"#\">Forums</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <div class=\"social-networks\">\n");
      out.write("                        <a href=\"#\" class=\"twitter\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("                        <a href=\"#\" class=\"facebook\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("                        <a href=\"#\" class=\"google\"><i class=\"fa fa-google-plus\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                    <button type=\"button\" class=\"btn btn-default\">Contact us</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"footer-copyright\" >\n");
      out.write("            <p>© 2017 Copyright Inquire.io </p>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("    <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.2.1.min.js\" integrity=\"sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4=\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"res/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"res/popper.min.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
