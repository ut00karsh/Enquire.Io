package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import action.jdbc;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSetMetaData;
import java.sql.ResultSet;

public final class ad_005fhome_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
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
      out.write("   \n");
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
      out.write("\n");
      out.write("   function myFunction(name)\n");
      out.write("   {\n");
      out.write("       if (name.length==0)\n");
      out.write("       {\n");
      out.write("        document.getElementById(\"demo2\").innerHTML= \"\";\n");
      out.write("        return;\n");
      out.write("       }\n");
      out.write("     \n");
      out.write("       var xttp = new XMLHttpRequest();\n");
      out.write("       xttp.onreadystatechange = function(){\n");
      out.write("           if((this.readyState==4) && (this.status == 200))\n");
      out.write("           {\n");
      out.write("               \n");
      out.write("               \n");
      out.write("               \n");
      out.write("                  document.getElementById(\"demo2\").innerHTML=this.responseText;\n");
      out.write("                  \n");
      out.write("               \n");
      out.write("        }\n");
      out.write("           };\n");
      out.write("           \n");
      out.write("           xttp.open(\"GET\",\"SearchQuery.jsp?name=\"+name,true);\n");
      out.write("           \n");
      out.write("          xttp.send();\n");
      out.write("       }\n");
      out.write("  \n");
      out.write("            \n");
      out.write("</script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <body onload = \"myFunction()\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("           <nav class=\"navbar navbar-expand-sm navbar-light bg-light fixed-top\">\n");
      out.write("               <a class=\"navbar-brand\" href=\"home.jsp\" style=\"font-family: cursive ; color:seagreen;\"><b>Inquire.io</b></a>\n");
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
      out.write("              &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;\n");
      out.write("                 <li class=\"nav-item\" >\n");
      out.write("                    <a class=\"nav-link\" href=\"user.jsp\" >Users</a>\n");
      out.write("                </li>\n");
      out.write("                 &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;\n");
      out.write("                \n");
      out.write("                 <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"tags.jsp\">Tags</a>\n");
      out.write("                </li>\n");
      out.write("                \n");
      out.write("            </ul>\n");
      out.write("            <a  class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" id=\"Preview\" href=\"profile.jsp\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\"\n");
      out.write("                style=\"position:relative\">\n");
      out.write("                   utkarsh shukla </a>\n");
      out.write("            <div class=\"dropdown-menu\" aria-labelledby=\"Preview\">\n");
      out.write("                <a class=\"dropdown-item\" href=\"#\">one</a>\n");
      out.write("                <a class=\"dropdown-item\" href=\"#\">two</a>\n");
      out.write("                <a class=\"dropdown-item\" href=\"#\">three</a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <form class=\"form-inline my-2 my-lg-0\">\n");
      out.write("                <input class=\"form-control mr-sm-2\" type=\"text\" placeholder=\"Search\" aria-label=\"Search\" style=\"margin-right: 30%;\" onkeyup = \"myFunction(this.value)\">\n");
      out.write("                <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Search</button>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </nav>\n");
      out.write("        \n");
      out.write("   <script>\n");
      out.write("            function myFunction1() \n");
      out.write("            {\n");
      out.write("            window.location = \"http://localhost:8080/mini_project/home.jsp\";\n");
      out.write("        }\n");
      out.write("            </script>\n");
      out.write("       \n");
      out.write("           \n");
      out.write("        <a id= \"demo\" href=\"unanswered.jsp\" style=\"left:55%;\" id=\"demo\">UnAnswered Queries</a>     <a href=\"query.jsp\" style=\"left:65%;\" id =\"demo\">Ask Question</a> <br>\n");
      out.write("        <hr>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"container\">\n");
      out.write(" \n");
      out.write("\n");
      out.write("<ul class=\"nav nav-tabs\">\n");
      out.write("  <li class=\"nav-item\">\n");
      out.write("    <a class=\"nav-link active\" href=\"home.jsp\">Home</a>\n");
      out.write("  </li>\n");
      out.write("  <li class=\"nav-item\">\n");
      out.write("    <a class=\"nav-link\" href=\"top.jsp\">Top</a>\n");
      out.write("  </li>\n");
      out.write("  <li class=\"nav-item\">\n");
      out.write("    <a class=\"nav-link\" href=\"frequent.jsp\">Frequent</a>\n");
      out.write("  </li>\n");
      out.write("  <li class=\"nav-item\">\n");
      out.write("    <a class=\"nav-link\" href=\"marked.jsp\">Marked</a>\n");
      out.write("  </li>\n");
      out.write("</ul>\n");
      out.write("</div>      \n");
      out.write("        <hr>\n");
      out.write("         ");
      out.write("\n");
      out.write("    <div id=\"demo2\"></div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <div>  <a id= \"demo\" href=\"unanswered.jsp\" style=\"left:15%; position: absolute;\"  id=\"demo\">UnAnswered Queries</a>     <br><br><br></div>\n");
      out.write("   ");

         HttpSession vsn=request.getSession(false);
    String nid=(String)vsn.getAttribute("ad_id");
    if(nid !=null)
    {
       
         q_count= "select count(*) from query_details;";
       ResultSet page_count= jdbc.selectData(q_count);
       page_count.next();
       
       page_count1=page_count.getInt(1);
       if(page_count1<=4)
       {
           lim=1;
           rem=0;
       }
       else
       {
       lim = page_count1/3;
       rem = page_count1%3; 
       }
         
    if(page_count1<=4)
    {
          s="select query_string from query_details order by time";
        t="select q_description from query_details order by time";  
     
    }
    else
    {
         s="select query_string from query_details order by time desc limit 0,3 ";
        t="select q_description from query_details order by time desc limit 0,3 ";
    }
       
     
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
                 S6=(String)session.getAttribute("ad_id");
                 vote_count=rs4.getInt("vote_count");
                 techno =rs4.getString("technology");
                a_count=rs5.getInt("a_count");
              techno1=  new String[5];
            techno1= techno.split(",");
               
      out.write("\n");
      out.write("         \n");
      out.write("  \n");
      out.write("    \n");
      out.write("    \n");
      out.write("<a id=\"anchor\" style=\"border:1px solid cornflowerblue; text-align:center; color:black; font-size: 13px;\">");
      out.print(vote_count);
      out.write("<br>votes</a> <a id=\"anchor\" style=\"border:1px solid cornflowerblue; text-align:center; color:black; left:19%;font-size: 12px; \">");
      out.print(a_count);
      out.write("<br>Answers</a> \n");
      out.write("<h5>\n");
      out.write(" <a id=\"anchor\" href=\"answer.jsp?query_id=");
      out.print(z);
      out.write("&role=");
      out.print("user");
      out.write("&u_id=");
      out.print(S6);
      out.write("\" style=\" text-decoration: none; left:25%;\" onclick= \"frequent('");
      out.print(z);
      out.write("','");
      out.print(S6);
      out.write("')\">\n");
      out.write(" <font color=\"CornflowerBlue \">");
      out.print(  rs2.getString(1)  );
      out.write("\n");
      out.write("        </font></a></h5><br><br>\n");
      out.write(" \n");
      out.write("    ");

       for(i=0;i<techno1.length;i++)
    {
            
      out.write("\n");
      out.write("           \n");
      out.write("      <div> \n");
      out.write("     <a class=\"btn btn-info btn-sm\" href=\"techno_tag.jsp?techno=");
      out.print(techno1[i]);
      out.write("\"  style=\" color:whitesmoke;  font-size: 75%;margin-left:32%;\"> ");
      out.print("#"+techno1[i]);
      out.write(" </a>\n");
      out.write("       </div>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("             \n");
      out.write("          \n");
      out.write(" <div style=\"position:relative;left:50%; font-size: 13px;\">   asked on :- ");
      out.print(time);
      out.write(" &nbsp;<b>by</b>&nbsp;&nbsp;");
      out.print(y3);
      out.write(" </div><br>\n");
      out.write("<div style=\"align:center;\"> <a href=\"answer.jsp?query_id=");
      out.print(z);
      out.write("&role=");
      out.print("admin");
      out.write("&ad_id=");
      out.print(S6);
      out.write("\" style=\" text-decoration: none; position:absolute ;font-size:14px; left:34% ;\" id=\"demo\" > Answer It</a> </div>\n");
      out.write("          \n");
      out.write(" \n");
      out.write("          \n");
      out.write("          \n");
      out.write("       \n");
      out.write("      &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   <a id=\"demo\" href=\"delete.jsp?query_id=");
      out.print(z);
      out.write("\" style=\"text-decoration: none; position:absolute;left:45%; font-size:14px;\"> Delete this Query </a>\n");
      out.write("        <br>\n");
      out.write("       \n");
      out.write("       \n");
      out.write("         <br> <hr style=\"width:100%;\"></b>\n");
      out.write("        ");

      
        }
        
      out.write("\n");
      out.write("   \n");
      out.write("      \n");
      out.write("      </div>\n");
      out.write("      <div style=\"margin-left:30%\">\n");
      out.write("   <nav aria-label=\"...\">\n");
      out.write("  <ul class=\"pagination pagination-lg\">\n");
      out.write("    <li class=\"page-item disabled\">\n");
      out.write("      <a class=\"page-link\" href=\"#\" tabindex=\"-1\">Pages</a>\n");
      out.write("    </li>\n");
      out.write("    ");
 if (rem !=0)
    {
        lim=lim+1;
    }
    
    for(i=0;i<lim;i++)
    {
    
      out.write("\n");
      out.write("    \n");
      out.write("    <li class=\"page-item\"><a class=\"page-link\"  href=\"ad_home1.jsp?page=");
      out.print(i);
      out.write("\" onclick=\"myFunction('");
      out.print(i);
      out.write("')\">");
      out.print(i+1);
      out.write("</a></li>\n");
      out.write("  \n");
      out.write("    ");
 }
    }
    else
    {
        
      out.write(' ');
      out.write(' ');
      if (true) {
        _jspx_page_context.forward("login1.jsp");
        return;
      }
      out.write("\n");
      out.write("   ");
 }
    
      out.write("\n");
      out.write("    \n");
      out.write("     </ul>\n");
      out.write("   </nav>\n");
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
