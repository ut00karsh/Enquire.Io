package org.apache.jsp.res;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import action.jdbc;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSetMetaData;
import java.sql.ResultSet;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


   
   String s;
   
   
   
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
      out.write("<link rel=\"stylesheet\" href=\"res/Site.css\"/>\n");
      out.write("<link rel=\"stylesheet\" href=\"res/css1.css\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>home Page</title>\n");
      out.write("    \n");
      out.write("   <body style=\"background-color:#e1e1e1;\">\n");
      out.write("   \n");
      out.write("    <h1 align=\"center\"><font color='firebrick' face='comic sans ms'>Expert-Exchange</font> </h1>\n");
      out.write("   </body>\n");
      out.write("   ");
      out.write("\n");
      out.write("   ");

      Connection conn=jdbc.getCon();
      Statement s1= conn.createStatement();
      s="select query_string from query_details";
       ResultSet rs = jdbc.selectData(s);
       while(rs.next())
       {
       
      out.write("\n");
      out.write("       ");
      out.print(rs.getString(1));
      out.write("\n");
      out.write("       \n");
      out.write("       <h1>hello</h1>\n");
      out.write("    \n");
      out.write("       ");
       
       }
     
      out.write("\n");
      out.write("  \n");
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
