package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import action.jdbc;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSetMetaData;
import java.sql.ResultSet;

public final class techno_005ftag_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    String s,S6,s3;
    String  x,y,y1;
    String y3;
    int z;
    String t;
    String z1;
    int l,a_count,vote_count;
    String v_count,time,A_count,techno;
    
    
    
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
      out.write("<html>\n");
      out.write("     <head>\n");
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
      out.write("\n");
      out.write("\n");
      out.write("   \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("       \n");
      out.write("        <title>home Page</title>\n");
      out.write("        <style>\n");
      out.write("   \n");
      out.write("            \n");
      out.write("           #demo:link, #demo:visited {\n");
      out.write("    border: 1px solid cornflowerblue ;\n");
      out.write("    color: black;\n");
      out.write("    padding: 3px 3px;\n");
      out.write("    text-align: center;\n");
      out.write("    text-decoration: none;\n");
      out.write("    display: inline-block;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("#demo:hover, #demo:active {\n");
      out.write("    background-color:cornflowerblue ;\n");
      out.write("}\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("  a\n");
      out.write("  {\n");
      out.write("     color:cornflowerblue;\n");
      out.write("     position:absolute;\n");
      out.write("     left:15%;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  a:visited\n");
      out.write("  {\n");
      out.write("     color:CornflowerBlue;  \n");
      out.write("  }\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body onload = \"myFunction()\">\n");
      out.write("        <script>\n");
      out.write("            function myFunction1() \n");
      out.write("            {\n");
      out.write("            window.location = \"http://localhost:8080/mini_project/home.jsp\";\n");
      out.write("        }\n");
      out.write("            </script>\n");
      out.write("       \n");
      out.write("            <h1 align=\"center\"><font color=\"CornflowerBlue \" face=\"comic sans ms'\">Expert-Exchange</h1><br>\n");
      out.write("        <a href=\"unanswered.jsp\" style=\"\" id=\"demo\">UnAnswered Queries</a>     <a href=\"query.jsp\" style=\"left:65%;\" id =\"demo\">Ask Question</a> <br>\n");
      out.write("         \n");
      out.write("        <hr>\n");
      out.write("        \n");
      out.write("         ");
      out.write("\n");
      out.write("\n");
      out.write("   ");

        
        s3="DBMS";
        s="select query_string from query_details where technology = '"+s3+"' order by time desc";
        t="select q_description from query_details where technology = '"+s3+"' order by time desc";
        
       
          
       
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
               v_count="select vote_count,technology from query_details where query_id='"+z+"'";
               A_count= "select count(answer_id) as a_count from answer_details where query_id ='"+z+"'";
              
                ResultSet rs3=jdbc.selectData(y1);
                 ResultSet rs4=jdbc.selectData(v_count);
                 ResultSet rs5=jdbc.selectData(A_count);
                rs3.next();
                rs4.next();
                rs5.next();
                y3=rs3.getString("user_id");
                time=rs3.getString("time");
                 S6=(String)session.getAttribute("u_id");
                 vote_count=rs4.getInt("vote_count");
                 techno =rs4.getString("technology");
                a_count=rs5.getInt("a_count");
               
               
        
      out.write("\n");
      out.write("         \n");
      out.write("<a style=\"border:1px solid cornflowerblue; text-align:center; color:black; font-size: 13px;\">");
      out.print(vote_count);
      out.write("<br>votes</a> <a style=\"border:1px solid cornflowerblue; text-align:center; color:black; left:19%;font-size: 12px; \">");
      out.print(a_count);
      out.write("<br>Answers</a>  <h3><a  href=\"answer.jsp?query_id=");
      out.print(z);
      out.write("&role=");
      out.print("user");
      out.write("&u_id=");
      out.print(S6);
      out.write("\" style=\" text-decoration: none; left:25%;\"><font color=\"CornflowerBlue \">");
      out.print(  rs2.getString(1)  );
      out.write("</font></a></h3><br><br>\n");
      out.write("            <a style=\"border:1px solid cornflowerblue; text-align:center; color:black; font-size: 15px; left:28% ;background-color:#99ccff\"> ");
      out.print(techno);
      out.write("   </a>  <div style=\"position:absolute;left:34%; font-size: 13px;\">   asked on :- ");
      out.print(time);
      out.write(" &nbsp;<b>by</b>&nbsp;&nbsp;");
      out.print(y3);
      out.write(" </div><br>\n");
      out.write("         <br>   <a href=\"answer.jsp?query_id=");
      out.print(z);
      out.write("&role=");
      out.print("user");
      out.write("&u_id=");
      out.print(S6);
      out.write("\" style=\" text-decoration: none; font-size:14px; left:39%\" id=\"demo\" > Answer It</a> \n");
      out.write("          \n");
      out.write(" \n");
      out.write("          \n");
      out.write("          \n");
      out.write("          \n");
      out.write("         ");

         
         if(y3.equalsIgnoreCase(S6))
         {    
         
      out.write("\n");
      out.write("      &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   <a href=\"delete.jsp?query_id=");
      out.print(z);
      out.write("\" id=\"demo\" style=\"text-decoration: none; position:absolute;left:28%; font-size:14px;\"> Delete this Query </a>\n");
      out.write("        <br>\n");
      out.write("       \n");
      out.write("        ");

        }
         
      out.write("\n");
      out.write("         <br> <hr style=\"width:100%;\"></b>\n");
      out.write("        ");

      
        }
        
      out.write("\n");
      out.write("   \n");
      out.write("        <pre>\n");
      out.write("         \n");
      out.write("    </pre>\n");
      out.write("      </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("    \n");
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
