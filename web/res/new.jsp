

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.io.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 3.2 Final//EN">

 


       <%       
      
                       
         
          String fname = "E:\\Java_PRog\\anagram.java";
         String line = null;
        
   
            FileReader fileReader = new FileReader(fname);
            
           
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            while((line = bufferedReader.readLine()) != null)
            {
              %>
              
               <%=line%>
                
               <br>
               
          <%  
            }
            bufferedReader.close();
      
             %>
             
 