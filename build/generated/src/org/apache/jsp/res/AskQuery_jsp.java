package org.apache.jsp.res;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AskQuery_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<body style=\"background-color:#e1e1e1;\">\n");
      out.write("<select class=\"new\" name=\"t1\">\n");
      out.write("<option value=\"python\">python</option><br>\n");
      out.write("<option value=\"java\">java</option><br>\n");
      out.write("<option value=\"c-language\">c-language</option><br\n");
      out.write("    <option value=\"DS\">Data-Structure</option><br>\n");
      out.write("<option value=\"DA\">design and analysis of algorithms </option><br>\n");
      out.write("<option value=\"TAFL\">AutoMata</option><br>\n");
      out.write("<option value=\"DBMS\">DBMS</option><br>\n");
      out.write("</select><br><br>    \n");
      out.write("    <h1 align=\"center\"><font color=\"red\" face=\"comic sans ms'\">Expert-Exchange</h1><br><br><hr>\n");
      out.write("    <h3 align=\"left\"><font color=\"red\" face=\"comic sans ms'\">Put Your Query :-</h3><br>\n");
      out.write("<form  class =\"new\" action=\"\">\n");
      out.write("    <textarea name=\"h\" rows=\"12\" cols=\"100\" bgcolor=\"#cacfd2\"></textarea>\n");
      out.write("    <br><br>\n");
      out.write("<input type=\"submit\" class=\"button\" bgcolor=\"#cacfd2\"  value=\"submit query\"/> <input type=\"reset\" class=\"button\" value=\"RESET\"/>\n");
      out.write("</form>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("    ");
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
