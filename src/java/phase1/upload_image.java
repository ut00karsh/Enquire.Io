
package phase1;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import com.oreilly.servlet.MultipartRequest;

public class upload_image extends HttpServlet {

public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {

response.setContentType("text/html");
PrintWriter out = response.getWriter();
		
MultipartRequest m=new MultipartRequest(request,"d:/new");
out.print("successfully uploaded");
}
}
