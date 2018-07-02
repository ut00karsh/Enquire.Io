package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class button_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Space Clicker</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <p id=\"hits\">1<p>\n");
      out.write("    <script>\n");
      out.write("     var flag=1\n");
      out.write("      var flag1=1\n");
      out.write("     function click1()\n");
      out.write("    {\n");
      out.write("      if(flag==1)\n");
      out.write("      {\n");
      out.write("         var clicks = document.getElementById(\"hits\").value; \n");
      out.write("      var c1 = ParseInt(clicks);\n");
      out.write("        c1 += 1;\n");
      out.write("        document.getElementById(\"hits\").innerHTML = c1;\n");
      out.write("        flag=0\n");
      out.write("        flag1=1\n");
      out.write("        }\n");
      out.write("        else\n");
      out.write("        {\n");
      out.write("            alert(\"you can click only once\");\n");
      out.write("        }\n");
      out.write("       \n");
      out.write("    }\n");
      out.write("    function declick()\n");
      out.write("    {\n");
      out.write("        if(flag1==1)\n");
      out.write("        \n");
      out.write("        {\n");
      out.write("            var clicks1 = document.getElementById(\"hits\").value; \n");
      out.write("        var c2=  ParseInt(clicks1);\n");
      out.write("         c2 -= 1;\n");
      out.write("        document.getElementById(\"hits\").innerHTML = c2;\n");
      out.write("        flag1=0\n");
      out.write("        flag=1\n");
      out.write("    }\n");
      out.write("    else\n");
      out.write("    {\n");
      out.write("        window.alert(\"you can click only once\");\n");
      out.write("    }\n");
      out.write("    }\n");
      out.write("   \n");
      out.write("    </script>\n");
      out.write("  \n");
      out.write("     <button  onclick=\"click1()\"> Click me</button>\n");
      out.write("     <button  onclick=\"declick()\"> DeClick me</button>\n");
      out.write("   \n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("   ");
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
