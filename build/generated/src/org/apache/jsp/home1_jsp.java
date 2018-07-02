package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/nav.jsp");
  }

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

      out.write("       ");

        String rol=(String)session.getAttribute("role");
        if(rol.equalsIgnoreCase("user"))
        {
        
      out.write("\n");
      out.write("    <nav class=\"navbar navbar-expand-sm navbar-light bg-light fixed-top\">\n");
      out.write("        <a class=\"navbar-brand\" href=\"home.jsp\" style=\"font-family: cursive ; color:seagreen;\"><b>Inquire.io</b></a>\n");
      out.write("      ");

        }
        
        else  if(rol.equalsIgnoreCase("admin"))
        {
      
      out.write("\n");
      out.write("      \n");
      out.write("        <nav class=\"navbar navbar-expand-sm navbar-light bg-light fixed-top\">\n");
      out.write("        <a class=\"navbar-brand\" href=\"ad_home.jsp\" style=\"font-family: cursive ; color:seagreen;\"><b>Inquire.io</b></a>\n");
      out.write("      \n");
      out.write("      ");

        }
         else  if(rol.equalsIgnoreCase("expert"))
         {
      
      out.write("\n");
      out.write("     <nav class=\"navbar navbar-expand-sm navbar-light bg-light fixed-top\">\n");
      out.write("        <a class=\"navbar-brand\" href=\"ex_home.jsp\" style=\"font-family: cursive ; color:seagreen;\"><b>Inquire.io</b></a>\n");
      out.write("      \n");
      out.write("      ");

        }
        
      out.write("\n");
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
      out.write("               \n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("            <a class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" id=\"Preview\" href=\"profile.jsp\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\"\n");
      out.write("                style=\"position:relative\">\n");
      out.write("                   utkarsh shukla </a>\n");
      out.write("            <div class=\"dropdown-menu\" aria-labelledby=\"Preview\">\n");
      out.write("                <a class=\"dropdown-item\" href=\"#\">one</a>\n");
      out.write("                <a class=\"dropdown-item\" href=\"#\">two</a>\n");
      out.write("                <a class=\"dropdown-item\" href=\"#\">three</a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <form class=\"form-inline my-2 my-lg-0\">\n");
      out.write("                <input class=\"form-control mr-sm-2\" type=\"text\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("                <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Search</button>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </nav>\n");
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
