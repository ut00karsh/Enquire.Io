package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import action.jdbc;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSetMetaData;
import java.sql.ResultSet;
import java.io.*;

public final class answer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


      String s,s1,s2,status,vote_count,v_count,file_status,f_status;
      String u_id,techno,Su_id;
      String [] techno1;
      int x,i;
  
  
  
  

      
      String ans_str,img_st,fl_status;
        
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_query_var;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_setDataSource_user_url_password_driver_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_query_var = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_setDataSource_user_url_password_driver_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_s_query_var.release();
    _jspx_tagPool_s_setDataSource_user_url_password_driver_nobody.release();
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
      out.write("<link rel=\"stylesheet\" href=\"res/Site.css\"/>\n");
      out.write("<link rel=\"stylesheet\" href=\"res/css1.css\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("      href=\"res/default.css\">\n");
      out.write("<script src=\"res/highlight.pack.js\"></script>\n");
      out.write("\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"res/bootstrap.min.css\">\n");
      out.write("      <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
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
      out.write("    \n");
      out.write("    <script>\n");
      out.write("          function myFunction(name,name1)\n");
      out.write("   {\n");
      out.write("      \n");
      out.write("      var xttp = new XMLHttpRequest();\n");
      out.write("       xttp.onreadystatechange = function(){\n");
      out.write("           if((this.readyState==4) && (this.status == 200))\n");
      out.write("           {\n");
      out.write("           document.getElementById(\"count\").innerHTML=this.responseText;\n");
      out.write("          }\n");
      out.write("           };\n");
      out.write("           \n");
      out.write("           xttp.open(\"GET\",\"votes?query_id=\"+name+\"&user_id=\"+name1,true);\n");
      out.write("           \n");
      out.write("          xttp.send();\n");
      out.write("       }\n");
      out.write("       \n");
      out.write("       \n");
      out.write("         function myFunction1(name,name1)\n");
      out.write("   {\n");
      out.write("      \n");
      out.write("      var xttp = new XMLHttpRequest();\n");
      out.write("       xttp.onreadystatechange = function(){\n");
      out.write("           if((this.readyState==4) && (this.status == 200))\n");
      out.write("           {\n");
      out.write("           document.getElementById(\"count\").innerHTML=this.responseText;\n");
      out.write("          }\n");
      out.write("           };\n");
      out.write("           \n");
      out.write("           xttp.open(\"GET\",\"Decrement?query_id=\"+name+\"&user_id=\"+name1,true);\n");
      out.write("           \n");
      out.write("          xttp.send();\n");
      out.write("       }\n");
      out.write("  \n");
      out.write("          \n");
      out.write("     function myFunction2(name,name1)\n");
      out.write("   {\n");
      out.write("      \n");
      out.write("      var xttp = new XMLHttpRequest();\n");
      out.write("       xttp.onreadystatechange = function(){\n");
      out.write("           if((this.readyState==4) && (this.status == 200))\n");
      out.write("           {\n");
      out.write("           document.getElementById(name).innerHTML=this.responseText;\n");
      out.write("          }\n");
      out.write("           };\n");
      out.write("           \n");
      out.write("           xttp.open(\"GET\",\"Avote_count?answer_id=\"+name+\"&user_id=\"+name1+\"&flag=increment\",true);\n");
      out.write("           \n");
      out.write("          xttp.send();\n");
      out.write("       }\n");
      out.write("       \n");
      out.write("       \n");
      out.write("         function myFunction3(name,name1)\n");
      out.write("   {\n");
      out.write("      \n");
      out.write("      var xttp = new XMLHttpRequest();\n");
      out.write("       xttp.onreadystatechange = function(){\n");
      out.write("           if((this.readyState==4) && (this.status == 200))\n");
      out.write("           {\n");
      out.write("           document.getElementById(name).innerHTML=this.responseText;\n");
      out.write("          }\n");
      out.write("           };\n");
      out.write("           \n");
      out.write("           xttp.open(\"GET\",\"Avote_count?answer_id=\"+name+\"&user_id=\"+name1+\"&flag=decrement\",true);\n");
      out.write("           \n");
      out.write("          xttp.send();\n");
      out.write("       }\n");
      out.write("    \n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("    \n");
      out.write("          #anchor:link, #anchor:visited {\n");
      out.write("   \n");
      out.write("    border-radius: 3px;\n");
      out.write("    color: white;\n");
      out.write("    padding: 6px 10px;\n");
      out.write("    text-align: center;\n");
      out.write("    text-decoration: none;\n");
      out.write("    display: inline-block;\n");
      out.write("     background-color: #5bc0de ;\n");
      out.write("}\n");
      out.write("\n");
      out.write("    \n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\".container-fluid\" style=\"margin-top: 70px\">\n");
      out.write("    \n");
      out.write("    <script>\n");
      out.write("    hljs.initHighlightingOnLoad(); \n");
      out.write("    </script>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("       \n");
      out.write("    \n");
      out.write("     \n");
      out.write("  ");
      if (_jspx_meth_s_setDataSource_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  ");
      out.write("\n");
      out.write("      \n");
      out.write("\n");
      out.write("   ");

           s=  request.getParameter("query_id");
           s1=request.getParameter("role");
           
      out.write("\n");
      out.write("           ");

           x = Integer.parseInt(s);
      out.write("\n");
      out.write("           \n");
      out.write("           \n");
      out.write("           \n");
      out.write("              ");

           s2="select img_status from query_details where query_id="+x;
            file_status="select file_status from query_details where query_id="+x;
          vote_count = "select vote_count,time,user_id,technology from query_details where query_id='"+x+"'";
          
            ResultSet rs4=jdbc.selectData(s2);
              ResultSet rs5=jdbc.selectData( vote_count);
              ResultSet rs6=jdbc.selectData(file_status);
            rs4.next();
            rs5.next();
            rs6.next();
        v_count = rs5.getString("vote_count");
          status =  rs4.getString("img_status");
             f_status =  rs6.getString("file_status");
            u_id = rs5.getString("user_id");
           
            techno = rs5.getString("technology");
            
            techno1=  new String[5];
            
           techno1= techno.split(",");
            
      out.write("\n");
      out.write("           \n");
      out.write("            ");

        Su_id = (String)session.getAttribute("u_id");
          
      out.write(" \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <nav class=\"navbar navbar-expand-sm navbar-light bg-light fixed-top\">\n");
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
      out.write("        <br><br>\n");
      out.write("    </nav>\n");
      out.write("          \n");
      out.write("<br>\n");
      out.write("          \n");
      out.write("          \n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-sm-2\">\n");
      out.write("            <div style=\"margin-top: 70%; width:40%; margin-left: 20%;\" >\n");
      out.write("               <button class=\"btn btn-sm btn-info btn-block\" onclick=\"myFunction('");
      out.print(x);
      out.write("','");
      out.print(Su_id);
      out.write("')\"  > Like </button>\n");
      out.write("               <h3 style=\"margin-left: 40%;\"> <div id=\"count\">    ");
      out.print(v_count);
      out.write("</div></h3>\n");
      out.write("               <button class=\"btn btn-sm btn-info btn-block\" onclick= \"myFunction1('");
      out.print(x);
      out.write("','");
      out.print(Su_id);
      out.write("')\" > Dislike </button>\n");
      out.write("                <h1> <font size=\"150%\" color=\"grey\"><span class=\"glyphicon glyphicon-star\"> </span></font> </h1>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("            \n");
      out.write("              \n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-8\">\n");
      out.write("            <h2>Query:-</h2><br>\n");
      out.write("            <hr>\n");
      out.write("            <div>\n");
      out.write("                 ");
      //  s:query
      org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_s_query_0 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_s_query_var.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
      _jspx_th_s_query_0.setPageContext(_jspx_page_context);
      _jspx_th_s_query_0.setParent(null);
      _jspx_th_s_query_0.setVar("s2");
      int[] _jspx_push_body_count_s_query_0 = new int[] { 0 };
      try {
        int _jspx_eval_s_query_0 = _jspx_th_s_query_0.doStartTag();
        if (_jspx_eval_s_query_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          if (_jspx_eval_s_query_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
            out = _jspx_page_context.pushBody();
            _jspx_push_body_count_s_query_0[0]++;
            _jspx_th_s_query_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
            _jspx_th_s_query_0.doInitBody();
          }
          do {
            out.write(" select * from query_details where query_id=");
            out.print(x);
            out.write(';');
            out.write(' ');
            int evalDoAfterBody = _jspx_th_s_query_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
          if (_jspx_eval_s_query_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
            out = _jspx_page_context.popBody();
            _jspx_push_body_count_s_query_0[0]--;
        }
        if (_jspx_th_s_query_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_s_query_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_s_query_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_s_query_0.doFinally();
        _jspx_tagPool_s_query_var.reuse(_jspx_th_s_query_0);
      }
      out.write("\n");
      out.write("             ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </div>\n");
      out.write("           \n");
      out.write("             \n");
      out.write("              ");
       
          if(f_status.equalsIgnoreCase("true"))
                       
          {
           
      out.write("\n");
      out.write("           <pre>\n");
      out.write("           <code class=\"java\" class=\"form-control\"  style=\" background-color: whitesmoke; width:700px;\">\n");
      out.write("             ");
       
       String fname = "D:\\image\\file"+ x +".txt";
         String line = null;
       FileReader fileReader = new FileReader(fname);
             BufferedReader bufferedReader = new BufferedReader(fileReader);
           while((line = bufferedReader.readLine()) != null)
            {
              
      out.write("\n");
      out.write("              ");
      out.print(line);
      out.write("\n");
      out.write("                ");
  
            }
            bufferedReader.close(); 
      out.write("\n");
      out.write("         </code>\n");
      out.write("         </pre>\n");
      out.write("          ");

          }
          
      out.write("\n");
      out.write("        <br>\n");
      out.write("            <div style=\"float:right\">asked on :- ");
      out.print(rs5.getString("time"));
      out.write("&nbsp;<b>by</b>&nbsp;&nbsp;");
      out.print(u_id);
      out.write("</div>\n");
      out.write("            <br>\n");
      out.write("            <div style=\"\">\n");
      out.write("            ");

            
          if(status.equalsIgnoreCase("true"))
                       
          {
           
      out.write("\n");
      out.write("           \n");
      out.write("        \n");
      out.write("          \n");
      out.write("              <br>\n");
      out.write("     \n");
      out.write("              <a id=\"anchor\" href=\"DownloadServlet?query_id=");
      out.print(x);
      out.write("\">download the image</a> \n");
      out.write("              \n");
      out.write("           \n");
      out.write("    \n");
      out.write("     \n");
      out.write("           \n");
      out.write("           ");

          }
          
      out.write("<br></div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("       \n");
      out.write("        <div class=\"col-sm-2\" style=\"margin-top:10%; \">\n");
      out.write("             ");

          for(i=0;i<techno1.length;i++)
          {
        
      out.write("\n");
      out.write("            <a id=\"anchor\" class=\"btn-info\" href=\"techno_tag.jsp?techno=");
      out.print(techno1[i]);
      out.write("\" style=\"font-size:70%; \"><b>#</b>");
      out.print(techno1[i]);
      out.write("</a>\n");
      out.write("            <br><br>\n");
      out.write("            ");
 }
      out.write("\n");
      out.write("        </div>\n");
      out.write("       </div>\n");
      out.write("    <hr>\n");
      out.write("    <br>\n");
      out.write("    \n");
      out.write("    <h2>Answers:-</h2><br>\n");
      out.write(" \n");
      out.write("          ");
      out.write("\n");
      out.write("        \n");
      out.write("        ");

        ans_str="select * from answer_details where query_id="+x;  
        ResultSet rs = jdbc.selectData(ans_str);
           while(rs.next())
                 {
                img_st = rs.getString("img_status");
                String a_id= rs.getString("answer_id");
                 
          fl_status=  rs.getString("file_status");
        
      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-sm-2\">\n");
      out.write("            <div style=\"margin-top: 60% ; width:40%; margin-left: 20%; \">\n");
      out.write("           <button class=\"btn btn-info btn-block\" onclick=\"myFunction2('");
      out.print(rs.getInt("answer_id"));
      out.write("','");
      out.print(Su_id);
      out.write("')\" > Like </button>\n");
      out.write("         <h3  style=\"margin-left: 40%;\">  <div id=\"");
      out.print(rs.getInt("answer_id"));
      out.write("\">      ");
      out.print(rs.getInt("vote_count"));
      out.write(" </div> </h3>\n");
      out.write("           <button class=\"btn btn-info btn-block\" onclick= \"myFunction3('");
      out.print(rs.getString("answer_id"));
      out.write("','");
      out.print(Su_id);
      out.write("')\"> Dislike </button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-8\">\n");
      out.write("        \n");
      out.write("            <hr>\n");
      out.write("            <div Style=\"margin-left:13%;\">\n");
      out.write("                ");
      out.print( rs.getString("answer_String"));
      out.write("\n");
      out.write("                </div>\n");
      out.write("           \n");
      out.write("          ");
       
          if(fl_status.equalsIgnoreCase("true"))
                       
          {
           
      out.write("\n");
      out.write("           <pre>\n");
      out.write("           <code class=\"form-control\"  style=\" background-color: whitesmoke; width:700px;\">\n");
      out.write("    \n");
      out.write("           ");
       
          String fname = "D:\\image\\answers\\file"+ a_id +".txt";
         String line = null;
        FileReader fileReader = new FileReader(fname);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while((line = bufferedReader.readLine()) != null)
               
                    
            { 
           
           
           
      out.write("\n");
      out.write("               ");

              out.println (line);
              
              
      out.write("\n");
      out.write("                ");
  }
            bufferedReader.close();
      out.write("\n");
      out.write("            \n");
      out.write("             </code>\n");
      out.write("        </pre>\n");
      out.write("            ");

          }
          
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("            \n");
      out.write("            <br>\n");
      out.write("            <div style=\"float:right\">\n");
      out.write("                answered on :- ");
      out.print( rs.getDate("time"));
      out.write("&nbsp;<b>by</b>&nbsp;&nbsp;");
      out.print(rs.getString("User_id"));
      out.write("<br>\n");
      out.write("                <h5> Role is:-");
      out.print( rs.getString("role"));
      out.write(" </h5>\n");
      out.write("                  \n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("           <div style=\"\">\n");
      out.write("            ");

            
          if(img_st.equalsIgnoreCase("true"))
                       
          {
           
      out.write("\n");
      out.write("           \n");
      out.write("        \n");
      out.write("          \n");
      out.write("              <br>\n");
      out.write("     <a id=\"anchor\" href=\"Download_image?answer_id=");
      out.print(rs.getString("answer_id"));
      out.write("\">download the image</a>  \n");
      out.write("              \n");
      out.write("           \n");
      out.write("    \n");
      out.write("     \n");
      out.write("           \n");
      out.write("           ");

          }
          
      out.write("<br></div>\n");
      out.write("      \n");
      out.write("        \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-2\" style=\"margin-top:10%;\">\n");
      out.write("                 <a id=\"anchor\" href=\"techno_tag.jsp?techno=");
      out.print(techno);
      out.write("\" style=\"font-size: 70%;\"> <b>#</b>");
      out.print(techno);
      out.write(" </a></div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <br>\n");
      out.write("    ");

    }
    
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("                                      \n");
      out.write("      \n");
      out.write("          \n");
      out.write("           ");
 session.setAttribute("query",x); 
           String z1= request.getParameter("u_id");
           session.setAttribute("person",s1);
            session.setAttribute("id",z1);
            
             
      out.write("\n");
      out.write("            \n");
      out.write("\n");
      out.write("  \n");
      out.write("  <form method =\"post\" action=\"answer_register\" enctype=\"multipart/form-data\">\n");
      out.write("    <br>\n");
      out.write(" \n");
      out.write("  \n");
      out.write("  \n");
      out.write("      <label for=\"comment\"><h3>Answer -:</h3></label>\n");
      out.write("      <div style=\"padding:24px\">    <textarea class=\"form-control\" rows=\"15\"   name=\"answer1\" id=\"froala-editor\" placeholder=\"put your Answer here\"  >\n");
      out.write("                               <br><br><br><br><br><br><br>\n");
      out.write("\n");
      out.write("          </textarea></div>\n");
      out.write("\n");
      out.write("  upload image:-&nbsp;\n");
      out.write("<br><br><input class =\"btn-info btn\" type=\"file\" name=\"photo\" accept=\"image/*\" value=\"upload image\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("upload your code:-&nbsp;\n");
      out.write("<br><br><input  class =\"btn-info btn\" type=\"file\" name=\"file\"  value=\"upload file\"/><br/> \n");
      out.write("\n");
      out.write(" <br><input class=\"btn-dark btn \" type=\"submit\" value=\"Submit Your Answer\">\n");
      out.write("  </form>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("    \n");
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
      out.write("<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/codemirror/5.25.0/codemirror.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/codemirror/5.25.0/mode/xml/xml.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/froala-editor/2.6.0//js/froala_editor.pkgd.min.js\"></script>\n");
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

  private boolean _jspx_meth_s_setDataSource_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:setDataSource
    org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag _jspx_th_s_setDataSource_0 = (org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag) _jspx_tagPool_s_setDataSource_user_url_password_driver_nobody.get(org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag.class);
    _jspx_th_s_setDataSource_0.setPageContext(_jspx_page_context);
    _jspx_th_s_setDataSource_0.setParent(null);
    _jspx_th_s_setDataSource_0.setDriver("com.mysql.jdbc.Driver");
    _jspx_th_s_setDataSource_0.setUrl("jdbc:mysql://localhost:3306/rcpl");
    _jspx_th_s_setDataSource_0.setUser("uttu");
    _jspx_th_s_setDataSource_0.setPassword("Piyush1998");
    int _jspx_eval_s_setDataSource_0 = _jspx_th_s_setDataSource_0.doStartTag();
    if (_jspx_th_s_setDataSource_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_setDataSource_user_url_password_driver_nobody.reuse(_jspx_th_s_setDataSource_0);
      return true;
    }
    _jspx_tagPool_s_setDataSource_user_url_password_driver_nobody.reuse(_jspx_th_s_setDataSource_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("rs2");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s2.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                     ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rs2.query_string}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" \n");
          out.write("      ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
