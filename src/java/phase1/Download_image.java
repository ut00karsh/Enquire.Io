package phase1;
import java.io.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
  
public class Download_image extends HttpServlet {  
  
public void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
int j= Integer.parseInt(request.getParameter("answer_id"));
String filename = "img"+j+".png";   
String filepath = "D:\\image\\answers\\";   
response.setContentType("APPLICATION/OCTET-STREAM");   
response.setHeader("Content-Disposition","attachment; filename=\"" + filename + "\"");   
  
FileInputStream fileInputStream = new FileInputStream(filepath + filename);  
            
int i;   
while ((i=fileInputStream.read()) != -1) {  
out.write(i);   
}   
fileInputStream.close();   
out.close();   
}  
  
}  