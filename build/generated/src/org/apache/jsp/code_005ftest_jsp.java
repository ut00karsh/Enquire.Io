package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class code_005ftest_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<input type=\"file\" id=\"file-input\" />\n");
      out.write("<h3>Contents of the file:</h3>\n");
      out.write("<pre id=\"file-content\"></pre>\n");
      out.write("<script>\n");
      out.write("function readSingleFile(e) {\n");
      out.write("  var file = e.target.files[0];\n");
      out.write("  if (!file) {\n");
      out.write("    return;\n");
      out.write("  }\n");
      out.write("  var reader = new FileReader();\n");
      out.write("  reader.onload = function(e) {\n");
      out.write("    var contents = e.target.result;\n");
      out.write("    displayContents(contents);\n");
      out.write("  };\n");
      out.write("  reader.readAsText(file);\n");
      out.write("}\n");
      out.write("\n");
      out.write("function displayContents(contents) {\n");
      out.write("  var element = document.getElementById('file-content');\n");
      out.write("  element.textContent = contents;\n");
      out.write("}\n");
      out.write("\n");
      out.write("document.getElementById('file-input')\n");
      out.write("  .addEventListener('change', readSingleFile, false);\n");
      out.write("  </script>\n");
      out.write("\n");
      out.write("  </body>\n");
      out.write("  </html>\n");
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
