package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class tag_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!doctype html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <title>Tag-it! Example</title>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"http://yui.yahooapis.com/2.9.0/build/reset-fonts/reset-fonts.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"http://yui.yahooapis.com/2.9.0/build/base/base-min.css\">\n");
      out.write("    <link href=\"http://fonts.googleapis.com/css?family=Brawler\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <link href=\"res/css/jquery.tagit.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    <link href=\"res/css/tagit.ui-zendesk.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("   \n");
      out.write("    <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jqueryui/1.9.2/jquery-ui.min.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    <script src=\"res/js/tag-it.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        $(function(){\n");
      out.write("            var sampleTags = ['c++', 'java', 'php', 'coldfusion', 'javascript', 'asp', 'ruby', 'python', 'c', 'scala', 'groovy', 'haskell', 'perl', 'erlang', 'apl', 'cobol', 'go', 'lua'];\n");
      out.write("\n");
      out.write("            $('#myTags').tagit();\n");
      out.write("\n");
      out.write("         \n");
      out.write("            $('#singleFieldTags').tagit({\n");
      out.write("                availableTags: sampleTags,\n");
      out.write("               \n");
      out.write("                singleField: true,\n");
      out.write("                singleFieldNode: $('#mySingleField')\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            $('#singleFieldTags2').tagit({\n");
      out.write("                availableTags: sampleTags\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            $('#myULTags').tagit({\n");
      out.write("                availableTags: sampleTags, \n");
      out.write("               \n");
      out.write("                itemName: 'item',\n");
      out.write("                fieldName: 'tags'\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            var eventTags = $('#eventTags');\n");
      out.write("\n");
      out.write("            var addEvent = function(text) {\n");
      out.write("                $('#events_container').append(text + '<br>');\n");
      out.write("            };\n");
      out.write("\n");
      out.write("            eventTags.tagit({\n");
      out.write("                availableTags: sampleTags,\n");
      out.write("                beforeTagAdded: function(evt, ui) {\n");
      out.write("                    if (!ui.duringInitialization) {\n");
      out.write("                        addEvent('beforeTagAdded: ' + eventTags.tagit('tagLabel', ui.tag));\n");
      out.write("                    }\n");
      out.write("                },\n");
      out.write("                afterTagAdded: function(evt, ui) {\n");
      out.write("                    if (!ui.duringInitialization) {\n");
      out.write("                        addEvent('afterTagAdded: ' + eventTags.tagit('tagLabel', ui.tag));\n");
      out.write("                    }\n");
      out.write("                },\n");
      out.write("                beforeTagRemoved: function(evt, ui) {\n");
      out.write("                    addEvent('beforeTagRemoved: ' + eventTags.tagit('tagLabel', ui.tag));\n");
      out.write("                },\n");
      out.write("                afterTagRemoved: function(evt, ui) {\n");
      out.write("                    addEvent('afterTagRemoved: ' + eventTags.tagit('tagLabel', ui.tag));\n");
      out.write("                },\n");
      out.write("                onTagClicked: function(evt, ui) {\n");
      out.write("                    addEvent('onTagClicked: ' + eventTags.tagit('tagLabel', ui.tag));\n");
      out.write("                },\n");
      out.write("                onTagExists: function(evt, ui) {\n");
      out.write("                    addEvent('onTagExists: ' + eventTags.tagit('tagLabel', ui.existingTag));\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            $('#readOnlyTags').tagit({\n");
      out.write("                readOnly: true\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            $('#methodTags').tagit({\n");
      out.write("                availableTags: sampleTags\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            $('#allowSpacesTags').tagit({\n");
      out.write("                availableTags: sampleTags,\n");
      out.write("                allowSpaces: true\n");
      out.write("            });\n");
      out.write("\n");
      out.write("        \n");
      out.write("            $('#removeConfirmationTags').tagit({\n");
      out.write("                availableTags: sampleTags,\n");
      out.write("                removeConfirmation: true\n");
      out.write("            });\n");
      out.write("            \n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body style=\"background-color:white;\">\n");
      out.write("\n");
      out.write("<h2>enter your tags</h2>\n");
      out.write("<form action=\"usetag.jsp\">\n");
      out.write("\n");
      out.write("            <ul id=\"myTags\" style=\"width:35%;\"></ul>\n");
      out.write("            <input  type=\"submit\" value=\"Submit\">\n");
      out.write("        </form>\n");
      out.write("    \n");
      out.write("</body>\n");
      out.write("</html>\n");
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
