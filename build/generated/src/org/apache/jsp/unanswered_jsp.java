package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import action.jdbc;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSetMetaData;
import java.sql.ResultSet;

public final class unanswered_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    String s,S6;
    String  x,y,y1;
    String y3;
    int z;
    String t;
    String z1;
    int l,vote_count;
    String v_count,time;
    
    
    
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("       \n");
      out.write("        <title>home Page</title>\n");
      out.write("        <style>\n");
      out.write("  \n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color:#e1e1e1;\" onload = \"myFunction()\">\n");
      out.write("        <script>\n");
      out.write("            function myFunction1() \n");
      out.write("            {\n");
      out.write("            window.location = \"http://localhost:8080/mini_project/home.jsp\";\n");
      out.write("        }\n");
      out.write("            </script>\n");
      out.write("       \n");
      out.write("        <h1 align=\"center\"><font color=\"red\" face=\"comic sans ms'\">Expert-Exchange</h1>\n");
      out.write("         ");
      out.write("\n");
      out.write("\n");
      out.write("   ");

        
        
        s="select query_string from query_details where status='not answered' order by time";
        t="select q_description from query_details where status='not answered' order by time";
        
     
        
       
          
       
        ResultSet rs=jdbc.selectData(s);
         ResultSet rs2=jdbc.selectData(t);
         
            
            
        while(rs.next())
        {
            rs2.next();
              x=rs.getString(1);
              z1= rs2.getString(1);
            
              y="select query_id from query_details where query_string='"+x+"'";
               ResultSet rs1=jdbc.selectData(y);
               rs1.next();
               z=rs1.getInt("Query_id");
               y1="select user_id,time from query_details where query_id='"+z+"'";
               v_count="select vote_count from query_details where query_id='"+z+"'";
              
                ResultSet rs3=jdbc.selectData(y1);
                 ResultSet rs4=jdbc.selectData(v_count);
                rs3.next();
                rs4.next();
                y3=rs3.getString("user_id");
                time=rs3.getString("time");
                 S6=(String)session.getAttribute("u_id");
                 vote_count=rs4.getInt("vote_count");
              
               
               
        
      out.write("\n");
      out.write("           \n");
      out.write("         <pre><div style=\"background-color: white; width:44%; height:7%;\"><a href=\"answer.jsp?query_id=");
      out.print(z);
      out.write("&role=");
      out.print("user");
      out.write("&u_id=");
      out.print(S6);
      out.write("\" style=\" text-decoration: none;\"><font color=\"red\">");
      out.print( "Query:-"   +rs2.getString(1)  );
      out.write("</font></a></div></pre>\n");
      out.write("         <div style=\"float:center;\"> ");
      out.print(y3);
      out.write(" &nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;query asked on :- ");
      out.print(time);
      out.write("</div><br>\n");
      out.write("          <a href=\"answer.jsp?query_id=");
      out.print(z);
      out.write("&role=");
      out.print("user");
      out.write("&u_id=");
      out.print(S6);
      out.write("\" style=\" text-decoration: none;\" > Answer It</a> \n");
      out.write("          \n");
      out.write("          <br><br><a href=\"vote.jsp?query_id=");
      out.print(z);
      out.write("&u_id=");
      out.print(S6);
      out.write("\" style=\" text-decoration: none; width:20px; right: 50px;\"> Like </a> <div>");
      out.print(vote_count);
      out.write(" </div><a href=\"Devote.jsp?query_id=");
      out.print(z);
      out.write("&u_id=");
      out.print(S6);
      out.write("\" style=\" text-decoration: none; width:20px;\" >Unlike</a>\n");
      out.write("          \n");
      out.write("          \n");
      out.write("          \n");
      out.write("         ");

         
         if(y3.equalsIgnoreCase(S6))
         {    
         
      out.write("\n");
      out.write("         <a href=\"delete.jsp?query_id=");
      out.print(z);
      out.write("\" style=\"text-decoration: none;\"> &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Delete this Query </a>\n");
      out.write("        <br>\n");
      out.write("       \n");
      out.write("        ");

        }
         
      out.write("\n");
      out.write("        \n");
      out.write("        ");

      
        }
        
      out.write("\n");
      out.write("   \n");
      out.write("        <pre>\n");
      out.write("           <a href=\"home.jsp\"style=\"width:170px; height:60px; background-color: lightpink\">Back To Home</a>      \n");
      out.write("    </pre>\n");
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
