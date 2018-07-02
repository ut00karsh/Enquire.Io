package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import action.jdbc;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSetMetaData;
import java.sql.ResultSet;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("       \n");
      out.write("        <title>home Page</title>\n");
      out.write("        \n");
      out.write("           <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"res/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("    <title>Inquire.Io</title>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("   \n");
      out.write("            \n");
      out.write("            \n");
      out.write("           #demo:link, #demo:visited {\n");
      out.write("    border: 1px solid cornflowerblue ;\n");
      out.write("    color: black;\n");
      out.write("    padding: 3px 3px;\n");
      out.write("    text-align: center;\n");
      out.write("    text-decoration: none;\n");
      out.write("    display: inline-block;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("#demo:hover, #demo:active {\n");
      out.write("    background-color:cornflowerblue ;\n");
      out.write("}\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("  #anchor\n");
      out.write("  {\n");
      out.write("     color:cornflowerblue;\n");
      out.write("     position:absolute;\n");
      out.write("     left:15%;\n");
      out.write("     border: 1 px;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  #anchor:visited\n");
      out.write("  {\n");
      out.write("     color:CornflowerBlue;  \n");
      out.write("  }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("   \n");
      out.write("       function frequent(name,name1)\n");
      out.write("       {\n");
      out.write("           \n");
      out.write("          \n");
      out.write("      \n");
      out.write("            \n");
      out.write("              \n");
      out.write("      var xttp = new XMLHttpRequest();\n");
      out.write("       xttp.onreadystatechange = function(){\n");
      out.write("           if((this.readyState==4) && (this.status == 200))\n");
      out.write("           {\n");
      out.write("              \n");
      out.write("          }\n");
      out.write("           };\n");
      out.write("           \n");
      out.write("           xttp.open(\"GET\",\"frequent?query_id=\"+name+\"&user_id=\"+name1,true);\n");
      out.write("           \n");
      out.write("          xttp.send();\n");
      out.write("            \n");
      out.write("          \n");
      out.write("       }\n");
      out.write("\n");
      out.write("   function myFunction(name)\n");
      out.write("   {\n");
      out.write("       if (name.length==0)\n");
      out.write("       {\n");
      out.write("        document.getElementById(\"demo2\").innerHTML= \"\";\n");
      out.write("        return;\n");
      out.write("       }\n");
      out.write("     \n");
      out.write("       var xttp = new XMLHttpRequest();\n");
      out.write("       xttp.onreadystatechange = function(){\n");
      out.write("           if((this.readyState==4) && (this.status == 200))\n");
      out.write("           {\n");
      out.write("               \n");
      out.write("               \n");
      out.write("               \n");
      out.write("                  document.getElementById(\"demo2\").innerHTML=this.responseText;\n");
      out.write("                  \n");
      out.write("               \n");
      out.write("        }\n");
      out.write("           };\n");
      out.write("           \n");
      out.write("           xttp.open(\"GET\",\"SearchQuery.jsp?name=\"+name,true);\n");
      out.write("           \n");
      out.write("          xttp.send();\n");
      out.write("       }\n");
      out.write("  \n");
      out.write("            \n");
      out.write("</script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <body onload = \"myFunction()\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("           <nav class=\"navbar navbar-expand-sm navbar-light bg-light fixed-top\">\n");
      out.write("        <a class=\"navbar-brand\" href=\"#\">Inquire.io</a>\n");
      out.write("\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarsExampleDefault\" aria-controls=\"navbarsExampleDefault\"\n");
      out.write("            aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                          <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarsExampleDefault\">\n");
      out.write("            <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                <li class=\"nav-item active\">\n");
      out.write("                    <a class=\"nav-link\" href=\"home.jsp\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"logout.jsp\">Logout</a>\n");
      out.write("                </li>\n");
      out.write("              &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;\n");
      out.write("                 <li class=\"nav-item\" >\n");
      out.write("                    <a class=\"nav-link\" href=\"user.jsp\" >Users</a>\n");
      out.write("                </li>\n");
      out.write("                 &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;\n");
      out.write("                \n");
      out.write("                 <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"tags.jsp\">Tags</a>\n");
      out.write("                </li>\n");
      out.write("                \n");
      out.write("            </ul>\n");
      out.write("            <a class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" id=\"Preview\" href=\"#\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\"\n");
      out.write("                style=\"position:relative\">\n");
      out.write("                   utkarsh shukla </a>\n");
      out.write("            <div class=\"dropdown-menu\" aria-labelledby=\"Preview\">\n");
      out.write("                <a class=\"dropdown-item\" href=\"#\">one</a>\n");
      out.write("                <a class=\"dropdown-item\" href=\"#\">two</a>\n");
      out.write("                <a class=\"dropdown-item\" href=\"#\">three</a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <form class=\"form-inline my-2 my-lg-0\">\n");
      out.write("                <input class=\"form-control mr-sm-2\" type=\"text\" placeholder=\"Search\" aria-label=\"Search\" style=\"margin-right: 30%;\" onkeyup = \"myFunction(this.value)\">\n");
      out.write("                <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Search</button>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </nav>\n");
      out.write("    </body>\n");
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
