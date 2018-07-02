package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class first_005fajax_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


      String  x;    
    
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 3.2 Final//EN\">\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("            <script>\n");
      out.write("   function myFunction(name)\n");
      out.write("   {\n");
      out.write("       if (name.length==0)\n");
      out.write("       {\n");
      out.write("        document.getElementById(\"hii\").innerHTML=\"  \";\n");
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
      out.write("                   document.getElementById(\"demo\").innerHTML=this.responseText;\n");
      out.write("                  \n");
      out.write("               \n");
      out.write("        }\n");
      out.write("           };\n");
      out.write("           \n");
      out.write("           xttp.open(\"GET\",\"use_ajax.jsp?name=\"+name,true);\n");
      out.write("           \n");
      out.write("          xttp.send();\n");
      out.write("       }\n");
      out.write("  \n");
      out.write("            \n");
      out.write("</script>\n");
      out.write("    </head>\n");
      out.write("    ");
      out.write("\n");
      out.write("    ");

        x = "a" ;
        
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <h1 id=\"hii\">Hello World!</h1>\n");
      out.write("        <p id=\"demo\"></p>\n");
      out.write("        <form action=\"\">\n");
      out.write("    enter name:- <input type=\"text\" name=\"text\" onkeyup=\"myFunction(this.value)\">\n");
      out.write("    \n");
      out.write("     </form>\n");
      out.write("        <button onclick=\"myFunction('");
      out.print(x);
      out.write("')\">click me</button>\n");
      out.write("  \n");
      out.write("        </body>\n");
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
