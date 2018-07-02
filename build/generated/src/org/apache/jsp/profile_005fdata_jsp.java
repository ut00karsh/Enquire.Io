package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import action.jdbc;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSetMetaData;
import java.sql.ResultSet;

public final class profile_005fdata_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    String s,S6;
    String  x,y,y1;
    String y3;
    int z,i;
    String t;
    String z1;
    int l,a_count,vote_count;
    String v_count,time,A_count,techno;
    String techno1[];
    String q_count;
    int page_count1;
    
    int lim ,rem;
    
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

      out.write("<html>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("   ");
      out.write("\n");
      out.write("    <div id=\"demo2\"></div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("  ");

       /*  HttpSession vsn=request.getSession(false);
    String nid=(String)vsn.getAttribute("u_id");
    if(nid !=null)
    {
               */
       
         s= "select * from user_details where user_id='"+"ut00karsh"+"'";
        q_count ="select count(query_id) from query_details where user_id='ut00karsh'";
    String  a_count ="select count(answer_id) from answer_details where user_id='ut00karsh'";  
      String  favourite ="select count(query_id) from marked where user_id='ut00karsh'";  
         ResultSet rs=jdbc.selectData(s);
         ResultSet rs1=jdbc.selectData(q_count);
           ResultSet rs2=jdbc.selectData(a_count);
            ResultSet rs3=jdbc.selectData(favourite);
            
            while(rs.next())
                
            {
               
      out.write("\n");
      out.write("               \n");
      out.write("               ");
      out.print(rs.getString("user_name"));
      out.write("<br>\n");
      out.write("               ");
      out.print(rs.getString("user_Id"));
      out.write("<br>\n");
      out.write("                ");
      out.print(rs.getString("mail_id"));
      out.write("<br>\n");
      out.write("                \n");
      out.write("               ");
      out.print(rs1.getInt(1));
      out.write("<br>\n");
      out.write("               ");
      out.print(rs2.getInt(1));
      out.write("<br>\n");
      out.write("               ");
      out.print(rs3.getInt(1));
      out.write("<br>\n");
      out.write("               \n");
      out.write("               ");

            }
          /*  }*/

          
      out.write("\n");
      out.write("          \n");
      out.write("            </body>\n");
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
