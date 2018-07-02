package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import action.jdbc;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSetMetaData;
import java.sql.ResultSet;

public final class users_005fquery_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    String s,S6;
    String  x,y,y1;
    String y3;
    int z,i;
    String t;
    String z1;
    int l,a_count,vote_count;
    String v_count,time,A_count,techno,techno1[];
    
    
    
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

      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html >\n");
      out.write("   <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("       \n");
      out.write("        <title>home Page</title>\n");
      out.write("        \n");
      out.write("           <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"res/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("    <title>Inquire.Io</title>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("        \n");
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
      out.write("  #anchor\n");
      out.write("  {\n");
      out.write("     color:cornflowerblue;\n");
      out.write("     position:absolute;\n");
      out.write("     left:15%;\n");
      out.write("     border: 1 px;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  #anchor:visited\n");
      out.write("  {\n");
      out.write("     color:CornflowerBlue;  \n");
      out.write("  }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("       function frequent(name,name1)\n");
      out.write("       {\n");
      out.write("           \n");
      out.write("          \n");
      out.write("      \n");
      out.write("            \n");
      out.write("              \n");
      out.write("      var xttp = new XMLHttpRequest();\n");
      out.write("       xttp.onreadystatechange = function(){\n");
      out.write("           if((this.readyState==4) && (this.status == 200))\n");
      out.write("           {\n");
      out.write("              \n");
      out.write("          }\n");
      out.write("           };\n");
      out.write("           \n");
      out.write("           xttp.open(\"GET\",\"frequent?query_id=\"+name+\"&user_id=\"+name1,true);\n");
      out.write("           \n");
      out.write("          xttp.send();\n");
      out.write("            \n");
      out.write("          \n");
      out.write("       }\n");
      out.write("       </script>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("<body>\n");
      out.write("<hr>\n");
      out.write("         ");
      out.write("\n");
      out.write("\n");
      out.write("   ");

       
        
       
        
        y="select query_id from answer_details where user_id='"+"yash01"+"'";
          
       
        ResultSet rs= jdbc.selectData(y);
      
         
            
            
        while(rs.next())
        {
       
               
            
               z=rs.getInt("Query_id");
              
               v_count="select vote_count,technology,q_description from query_details where query_id='"+z+"'";
              
              
                 ResultSet rs4=jdbc.selectData(v_count);
                 ResultSet rs5=jdbc.selectData(A_count);
               
                rs4.next();
               
               
                 S6= "yash01";
                 vote_count=rs4.getInt("vote_count");
                 techno =rs4.getString("technology");
                a_count=rs5.getInt("a_count");
               
                  techno1=  new String[5];
            
           techno1= techno.split(",");
        
      out.write("\n");
      out.write("        \n");
      out.write("      \n");
      out.write("     <div id=\"demo3\">\n");
      out.write("    \n");
      out.write("<a  href=\"#\" class=\"btn btn-outline-success btn-sm\" style=\" position:absolute;left:18%; font-size: 80%;\">");
      out.print(vote_count);
      out.write("<br>votes</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <h3><a id=\"anchor\" href=\"answer.jsp?query_id=");
      out.print(z);
      out.write("&role=");
      out.print("user");
      out.write("&u_id=");
      out.print(S6);
      out.write("\" style=\" text-decoration: none; left:25%; font-size: 65%;\"><font color=\"CornflowerBlue \">");
      out.print(  rs4.getString("q_description")  );
      out.write("</font></a></h3><br>\n");
      out.write("\n");
      out.write("  ");

       for(i=0;i<techno1.length;i++)
    {
            
      out.write("\n");
      out.write("           \n");
      out.write("    <div style=\"font-size: 75%;\"> \n");
      out.write(" <a class=\"btn btn-info btn-sm\" href=\"techno_tag.jsp?techno=");
      out.print(techno1[i]);
      out.write("\"  style=\" color:whitesmoke;  font-size: 75%;margin-left:32%;\"> ");
      out.print("#"+techno1[i]);
      out.write(" </a>\n");
      out.write("  </div>\n");
      out.write("                ");

    }
         }
        
      out.write("\n");
      out.write("        \n");
      out.write("     </div>\n");
      out.write("        \n");
      out.write("        </body>\n");
      out.write("        </html>");
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
