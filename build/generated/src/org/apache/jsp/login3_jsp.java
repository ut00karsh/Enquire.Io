package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login3_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      			"myerror.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("  \n");
      out.write("<html >\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <title>Sign-Up/Login Form</title>\n");
      out.write("  <link href='https://fonts.googleapis.com/css?family=Titillium+Web:400,300,600' rel='stylesheet' type='text/css'>\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css\">\n");
      out.write("\n");
      out.write("  \n");
      out.write("      <link rel=\"stylesheet\" href=\"res/style.css\">\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      <style>\n");
      out.write("                      \t  body {\n");
      out.write("    background-image: url(\"res/01.jpg\");\n");
      out.write("}\n");
      out.write("          </style>\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("  <div class=\"form\">\n");
      out.write("      \n");
      out.write("      <ul class=\"tab-group\">\n");
      out.write("        <li class=\"tab active\"><a href=\"#signup\" style=\"font-family: cursive\">Get Registered Here</a></li>\n");
      out.write("        <li class=\"tab\"><a href=\"#login\" style=\"font-family: cursive\">Log In</a></li>\n");
      out.write("      </ul>\n");
      out.write("      \n");
      out.write("      <div class=\"tab-content\">\n");
      out.write("        <div id=\"signup\">   \n");
      out.write("          <h1>SignUp</h1>\n");
      out.write("          \n");
      out.write("          <form action=\"register\" method=\"post\">\n");
      out.write("          \n");
      out.write("         \n");
      out.write("           \n");
      out.write("        \n");
      out.write("            <div class=\"field-wrap\">\n");
      out.write("              <label>\n");
      out.write("                 Name<span class=\"req\">*</span>\n");
      out.write("              </label>\n");
      out.write("                <input type=\"text\" required name=\"name\" pattern=\"[a-z\\sA-z]*\" title=\"Contain Only Alphabets\" autocomplete=\"off\" maxlength=\"255\"/>\n");
      out.write("            </div>\n");
      out.write("         \n");
      out.write("\n");
      out.write("          <div class=\"field-wrap\">\n");
      out.write("            <label>\n");
      out.write("              Email Address<span class=\"req\">*</span>\n");
      out.write("            </label>\n");
      out.write("              <input type=\"email\" name=\"user_mail\" required autocomplete=\"off\" maxlength=\"255\"/>\n");
      out.write("          </div>\n");
      out.write("\t\t  \n");
      out.write("\t\t   \n");
      out.write("          <div class=\"field-wrap\">\n");
      out.write("            <label>\n");
      out.write("             User_Id<span class=\"req\">*</span>\n");
      out.write("            </label>\n");
      out.write("              <input type=\"text\" name=\"u_id\" required autocomplete=\"off\" pattern=\"[a-z0-9A-z]*\"maxlength=\"15\" minlength=\"6\"/>\n");
      out.write("          </div>\n");
      out.write("          \n");
      out.write("          <div class=\"field-wrap\">\n");
      out.write("            <label>\n");
      out.write("              Set A Password<span class=\"req\">*</span>\n");
      out.write("            </label>\n");
      out.write("              <input type=\"password\" name=\"pwd\" required autocomplete=\"off\" maxlength=\"8\" minlength=\"6\" />\n");
      out.write("          </div>\n");
      out.write("\t\t  \n");
      out.write("\t\t \n");
      out.write("\t\t  \n");
      out.write("\t\t  <div class=\"field-wrap\">\n");
      out.write("                      <label>\n");
      out.write("             Confirm Password<span class=\"req\">*</span>\n");
      out.write("                      </label>\n");
      out.write("                      <input  type=\"password\" name=\"cnf_pwd\"  required autocomplete=\"off\" maxlength=\"8\"/> \n");
      out.write("          </div>\n");
      out.write("\t\t  \n");
      out.write("\t\t   <div class=\"field-wrap\">\n");
      out.write("            <label>\n");
      out.write("              specialization<span class=\"req\">*</span>\n");
      out.write("            </label>\n");
      out.write("                       <input type=\"text\" name=\"q1\" pattern=\"[a-z\\sA-z]*\" title=\"Contain Only Alphabets\" maxlength=\"15\" required autocomplete=\"off\"/>\n");
      out.write("          </div>\n");
      out.write("          \n");
      out.write("          <button type=\"submit\" class=\"button button-block\" style=\"font-family: cursive\"/>Register Now</button>\n");
      out.write("          \n");
      out.write("          </form>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div id=\"login\">   \n");
      out.write("          <h1 style=\"font-family: cursive\">Welcome Back!</h1>\n");
      out.write("          \n");
      out.write("          <form action=\"authenticate\" method=\"post\">\n");
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
      out.write("          <button class=\"button button-block\" style=\"font-family: cursive\"/>Log In</button>\n");
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
      out.write("    <script  src=\"res/index.js\"></script>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    ");

       String s1= (String)request.getAttribute("msg");
        String s2= (String)request.getAttribute("msg1");
       if(s1!=null)
           
       {
        
      out.write("\n");
      out.write("        \n");
      out.write("        <script>alert('");
      out.print(s1);
      out.write("');</script>\n");
      out.write("        \n");
      out.write("        ");

       }
        
        
      out.write("\n");
      out.write("        \n");
      out.write("        ");
 
        if(s2!=null)
           
       {
        
      out.write("\n");
      out.write("        \n");
      out.write("        <script>alert('");
      out.print(s2);
      out.write("');</script>\n");
      out.write("        \n");
      out.write("        ");

       }
        
        
      out.write("\n");
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
