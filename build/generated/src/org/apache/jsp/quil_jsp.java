package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class quil_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("       \n");
      out.write("<script src=\"//cdn.quilljs.com/1.0.0/quill.js\"></script>\n");
      out.write("<script src=\"//cdn.quilljs.com/1.0.0/quill.min.js\"></script>\n");
      out.write("<link href=\"//cdn.quilljs.com/1.0.0/quill.snow.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"//cdn.quilljs.com/1.0.0/quill.bubble.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"//cdn.quilljs.com/1.0.0/quill.core.css\" rel=\"stylesheet\">\n");
      out.write("<script src=\"//cdn.quilljs.com/1.0.0/quill.core.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("<link href=\"https://cdn.quilljs.com/1.0.0/quill.snow.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"toolbar\">\n");
      out.write("  <button class=\"ql-bold\">Bold</button>\n");
      out.write("  <button class=\"ql-italic\">Italic</button>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"editor\" >\n");
      out.write("  <p>Hello World!</p>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script src=\"https://cdn.quilljs.com/1.0.0/quill.js\"></script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("  var editor = new Quill('#editor', {\n");
      out.write("    modules: { toolbar: '#toolbar' },\n");
      out.write("    theme: 'snow'\n");
      out.write("  });\n");
      out.write("</script>\n");
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
