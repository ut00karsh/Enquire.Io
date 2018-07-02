package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import action.jdbc;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSetMetaData;
import java.sql.ResultSet;

public final class query_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("       <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"res/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("    <title>Document</title>\n");
      out.write("    \n");
      out.write("     <meta name=\"viewport\" content=\"width=device-width, height=device-height, initial-scale=1.0, maximum-scale=1.0\"/>\n");
      out.write("  <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.4.0/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/codemirror/5.25.0/codemirror.min.css\">\n");
      out.write("  <link href=\"https://cdnjs.cloudflare.com/ajax/libs/froala-editor/2.6.0/css/froala_editor.pkgd.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("  <link href=\"https://cdnjs.cloudflare.com/ajax/libs/froala-editor/2.6.0/css/froala_style.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("  \n");
      out.write("\n");
      out.write("  <script>\n");
      out.write("    $(function() {\n");
      out.write("        $('textarea#froala-editor').froalaEditor({\n");
      out.write("            toolbarButtons: ['bold', 'italic', 'underline', 'strikeThrough', 'fontFamily', 'fontSize', '|', 'inlineStyle', 'paragraphFormat', 'align', 'undo', 'redo', 'html'],\n");
      out.write("        })\n");
      out.write("    });\n");
      out.write("  </script>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("                  \n");
      out.write("        <script src=\"res/tagsinput.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"res/tagsinput.css\" />\n");
      out.write("<script>\n");
      out.write("    $(function(){\n");
      out.write("        $('#tags').tagsInput();\n");
      out.write("    });\n");
      out.write("    </script> \n");
      out.write("  \n");
      out.write("  \n");
      out.write("    \n");
      out.write("  \n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: white\">\n");
      out.write("        \n");
      out.write("           <nav class=\"navbar navbar-expand-sm navbar-light bg-light fixed-top\">\n");
      out.write("        <a class=\"navbar-brand\" href=\"#\">Inquire.io</a>\n");
      out.write("\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarsExampleDefault\" aria-controls=\"navbarsExampleDefault\"\n");
      out.write("            aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                          <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarsExampleDefault\">\n");
      out.write("            <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                <li class=\"nav-item active\">\n");
      out.write("                    <a class=\"nav-link\" href=\"/home\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"/logout\">Logout</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"/login\">Login</a>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("            <a class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" id=\"Preview\" href=\"#\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\"\n");
      out.write("                style=\"position:relative\">\n");
      out.write("                   Utkarsh Shukla </a>\n");
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
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("    </nav>\n");
      out.write("    <br><br>  <br>\n");
      out.write("    \n");
      out.write("    <div>\n");
      out.write("     \n");
      out.write("        <h3 align=\"left\" class=\"btn-danger btn btn-lg \" style=\"margin-left:40%\"><font color=\"\" face=\"comic sans ms'\">Ask Question   </font></h3>\n");
      out.write("     <form  method =\"post\" action=\"query_register\"  enctype=\"multipart/form-data\">\n");
      out.write("          <!---  \n");
      out.write("  <select name=\"subject\"\n");
      out.write(" <option value=\"PYthon\">python</option>\n");
      out.write("  <option value=\"Data-Structure\">Data-Structure</option>\n");
      out.write("  <option value=\"dbms\">DBMS</option>\n");
      out.write("  <option value=\"C-language\">C-Language</option>\n");
      out.write("  <option value=\"java\">JAVA</option>\n");
      out.write("  <option value=\"Design And Analysis Of Alogorithms\">Design And Analysis Of Algorithms</option>\n");
      out.write("  <option value=\"AUTOMATA\">AUTOMATA</option>\n");
      out.write("  </select><br><br>\n");
      out.write("!--->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" <div class=\"form-group\">\n");
      out.write("     <div style=\"padding:30px;\" >\n");
      out.write("      <label for=\"comment\"><h3 class=\"btn-danger btn\" >Query_Description </h3></label>\n");
      out.write("      <textarea class=\"form-control\" rows=\"3\"  id=\"comment\" name=\"query_desc\"  required></textarea>\n");
      out.write("     </div>\n");
      out.write("     </div>\n");
      out.write("\n");
      out.write("<div class=\"form-group\">\n");
      out.write("      <div style=\"padding:30px;\">\n");
      out.write("      <label for=\"comment\"><h3 class=\"btn-danger btn btn-lg\">Query </h3></label>\n");
      out.write("     \n");
      out.write("      <textarea class=\"form-control\" rows=\"8\"    name=\"query\" id=\"froala-editor\" placeholder=\"put your Question here\" required >\n");
      out.write("        <br><br><br><br>\n");
      out.write("        \n");
      out.write("      </textarea>\n");
      out.write("           </div>\n");
      out.write("    </div>\n");
      out.write("<div>\n");
      out.write("    \n");
      out.write("   \n");
      out.write("    \n");
      out.write("<input type=\"file\" class=\"btn-info btn btn-sm\" name=\"photo\" accept=\"image/*\" value=\"upload image\"/>\n");
      out.write("\n");
      out.write("  \n");
      out.write("<input style=\"float:right; margin-right: 46%\" type=\"file\" class=\"btn-info btn btn-sm\" name=\"file\"  value=\"upload file\"/>\n");
      out.write(" \n");
      out.write("<br>\n");
      out.write("  <div style=\"padding:30px;\">\n");
      out.write("<h4  class=\"btn-danger btn \"> Enter The Tags </h4><br>\n");
      out.write("      <input type=\"text\" id=\"tags\"  name= \"tag\"  class=\"form-control\"   data-role=\"tagsinput\" required >\n");
      out.write("      </div>\n");
      out.write("   \n");
      out.write("\n");
      out.write("    <br>\n");
      out.write("<input style=\"margin-left:20%;\"type=\"submit\" class=\"btn-danger btn btn-lg btn-outline-danger\" value=\"submit your query\"> \n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("     \n");
      out.write("     \n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js\" integrity=\"sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js\" integrity=\"sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/codemirror/5.25.0/codemirror.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/codemirror/5.25.0/mode/xml/xml.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/froala-editor/2.6.0//js/froala_editor.pkgd.min.js\"></script>\n");
      out.write("     \n");
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
