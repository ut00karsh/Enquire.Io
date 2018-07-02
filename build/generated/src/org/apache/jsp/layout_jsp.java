package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class layout_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"res/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("    <title>Document</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\".container-fluid\" style=\"margin-top: 70px\">\n");
      out.write("    <nav class=\"navbar navbar-expand-sm navbar-light bg-light fixed-top\">\n");
      out.write("        <a class=\"navbar-brand\" href=\"#\">Scribble.io</a>\n");
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
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-sm-2\">\n");
      out.write("            <div style=\"margin-top: 60%\">\n");
      out.write("                <button class=\"btn btn-info btn-block\">Like</button><br>\n");
      out.write("                <button class=\"btn btn-info btn-block\">Dislike</button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-8\">\n");
      out.write("            <h2>Query:-</h2><br>\n");
      out.write("            <hr>\n");
      out.write("            <div>orem ipsum, dolor sit amet c ducimus quia beatae ea corporis quisquam perferendis, aspernatur optio inventore\n");
      out.write("                doloribus suscipit voluptates!</div>\n");
      out.write("            <br>\n");
      out.write("            <textarea rows=10 cols=35 disabled>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Numquam tempora modi nemo id in impedit distinctio voluptas quos nobis quo similique fuga repudiandae eveniet, ratione accusamus aliquid, dolorem voluptates accusantium.Magni nesciunt voluptatem eaque odio molestias deleniti voluptatibus labore, praesentium nobis cumque totam doloribus quibusdam hic in ad ex vel pariatur optio aut. Enim similique, vel doloribus fugiat ipsam aperiam!</textarea>\n");
      out.write("            <br>\n");
      out.write("            <div style=\"float:right\">Asked by.....</div>\n");
      out.write("            <br>\n");
      out.write("            <div style=\"\"><button class=\"btn btn-info btn-block\">Download Image</button><br></div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-2\" style=\"margin-top:10%;\">\n");
      out.write("            <a href=\"#\">Tags</a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <hr>\n");
      out.write("    <br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-sm-2\">\n");
      out.write("            <div style=\"margin-top: 60%\">\n");
      out.write("                <button class=\"btn btn-info btn-block\">Like</button><br>\n");
      out.write("                <button class=\"btn btn-info btn-block\">Dislike</button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-8\">\n");
      out.write("            <h2>Answers:-</h2><br>\n");
      out.write("            <hr>\n");
      out.write("            <div>orem ipsum, dolor sit amet c ducimus quia beatae ea corporis quisquam perferendis, aspernatur optio inventore\n");
      out.write("                doloribus suscipit voluptates!</div>\n");
      out.write("            <br>\n");
      out.write("            <h2>Lorem, ipsum dolor sit amet consectetur adipisicing elit. Deleniti et, rerum magni at nam consequuntur nostrum\n");
      out.write("                aperiam porro ullam quia exercitationem architecto accusantium officiis vitae ea modi! Veniam, sunt odio.</h2>\n");
      out.write("            <br>\n");
      out.write("            <div style=\"float:right\">Asked by.....</div>\n");
      out.write("            <br>\n");
      out.write("            <div style=\"\"><button class=\"btn btn-info btn-block\">Download Image</button><br></div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-2\" style=\"margin-top:10%;\">\n");
      out.write("            <a href=\"#\">Tags</a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <footer class=\"footer\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <span class=\"text-muted\">Place sticky footer content here.</span>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js\" integrity=\"sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js\" integrity=\"sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
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
