
<%@page import="java.io.*"%>
<%    
  String filename = "retrieve2.py";   
  String filepath = "D:\\image\\";  
  response.setContentType("APPLICATION/OCTET-STREAM");   
  
  
  FileInputStream fileInputStream=new FileInputStream(filepath + filename);  
            
  int i;   
  while ((i=fileInputStream.read()) != -1) {  
    %> 
    out.write(i);   
 <% }  
  fileInputStream.close();   
%>   
        
        
        
        
        
        
        
  
