package phase1;
import java.io.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
  
public class DownloadServlet extends HttpServlet {  
  
public void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
int j= Integer.parseInt(request.getParameter("query_id"));
String filename = "img"+j+".png";   
String filepath = "D:\\image\\";   
response.setContentType("APPLICATION/OCTET-STREAM");   
response.setHeader("Content-Disposition","attachment; filename=\"" + "uttu" + "\"");   
  
FileInputStream fileInputStream = new FileInputStream(filepath + filename);  
            
int i;   
while ((i=fileInputStream.read()) != -1) {  
out.write(i);   
}   
fileInputStream.close();   
out.close();   
}  
  
}  