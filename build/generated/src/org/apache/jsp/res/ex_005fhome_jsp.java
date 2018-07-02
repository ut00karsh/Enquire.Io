package org.apache.jsp.res;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import action.jdbc;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSetMetaData;
import java.sql.ResultSet;

public final class ex_005fhome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    String s,s1,s2,s3;
    String  x,y,y1;
    String y3;
    int z;
    String t;
    String z1;
    
    
    
    
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
      out.write("<link rel=\"stylesheet\" href=\"res/Site.css\"/>\n");
      out.write("<link rel=\"stylesheet\" href=\"res/css1.css\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>home Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color:#e1e1e1;\">\n");
      out.write("       \n");
      out.write("        <h1 align=\"center\"><font color=\"red\" face=\"comic sans ms'\">Expert-Exchange</h1>\n");
      out.write("         ");
      out.write("\n");
      out.write("\n");
      out.write("   ");

         s1 = (String)request.getAttribute("ex_id");
         s2 = "select specialization from expert_details where expert_id = '"+s1+"'";
         
        
        
        s="select query_string from query_details ";
        t="select q_description from query_details";
        
       
          
        ResultSet rs4=jdbc.selectData(s2);
        ResultSet rs=jdbc.selectData(s);
         ResultSet rs2=jdbc.selectData(t);
         rs4.next();
         s3= rs4.getString("specialization");
         
          
        s="select query_string from query_details where technology = '"+s3+"'";
        t="select q_description from query_details where technology = '"+s3+"'";
            
            
        while(rs.next())
        {
            rs2.next();
              x=rs.getString(1);
              z1= rs2.getString(1);
            
              y="select query_id from query_details where query_string='"+x+"'";
               ResultSet rs1=jdbc.selectData(y);
               rs1.next();
               z=rs1.getInt("Query_id");
               y1="select user_id from query_details where query_id='"+z+"'";
               
                ResultSet rs3=jdbc.selectData(y1);
                rs3.next();
                y3=rs3.getString("user_id");
              
               
               
        
      out.write("\n");
      out.write("           \n");
      out.write("         <pre><div style=\"background-color: white; width:44%; height:7%;\"><a href=\"answer.jsp?query_id=");
      out.print(z);
      out.write("\"><font color=\"red\">");
      out.print( "Query:-"   +rs2.getString(1)  );
      out.write("</font></a></div></pre>\n");
      out.write("         <div style=\"float:center;\" > ");
      out.print(y3);
      out.write("</div><br>\n");
      out.write("         <br> <a href=\"answer.jsp?query_id=");
      out.print(z);
      out.write("\">answer it</a>\n");
      out.write("        <br>\n");
      out.write("        ");

      
        }
        
      out.write("\n");
      out.write("   \n");
      out.write("       \n");
      out.write("            <pre>\n");
      out.write("            <a href=\"query.jsp\" style=\"width:170px; height:60px; background-color: lightpink\">Ask Question</a>       <a href=\"#\"style=\"width:170px; height:60px; background-color: lightpink\">Answered Queries</a>      \n");
      out.write("     </pre>  \n");
      out.write("      </div>\n");
      out.write("    </body>\n");
      out.write("    \n");
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
