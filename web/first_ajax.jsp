

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 3.2 Final//EN">
<html>
    <head>
            <script>
   function myFunction(name)
   {
       if (name.length==0)
       {
        document.getElementById("hii").innerHTML="  ";
        return;
       }
     
       var xttp = new XMLHttpRequest();
       xttp.onreadystatechange = function(){
           if((this.readyState==4) && (this.status == 200))
           {
               
               
               
                   document.getElementById("demo").innerHTML=this.responseText;
                  
               
        }
           };
           
           xttp.open("GET","use_ajax.jsp?name="+name,true);
           
          xttp.send();
       }
  
            
</script>
    </head>
   
    <body>
       <p id="demo"></p>
        <form action="">
    enter name:- <input type="text" name="text" onkeyup="myFunction(this.value)">
          </form>
         </body>
</html>
