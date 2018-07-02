<!DOCTYPE html>

  <%@ page errorPage="myerror.jsp" %>
<html >
<head>
  <meta charset="UTF-8">
  <title>Sign-Up/Login Form</title>
  <link href='https://fonts.googleapis.com/css?family=Titillium+Web:400,300,600' rel='stylesheet' type='text/css'>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">

  
      <link rel="stylesheet" href="res/style.css">
      
      
      <style>
                      	  body {
    background-image: url("res/coding_1.jpg");
}
          </style>


</head>

<body>
  <div class="form">
      
      <ul class="tab-group">
        <li class="tab active"><a href="#signup" style="font-family: cursive">Get Registered Here</a></li>
        <li class="tab"><a href="#login" style="font-family: cursive">Log In</a></li>
      </ul>
      
      <div class="tab-content">
        <div id="signup" style="font-size: 70%;">   
          <h1 style="font-family: cursive">SignUp</h1>
          
          <form action="register" method="post">
          
         
           
        
            <div class="field-wrap">
              <label>
                 Name<span class="req">*</span>
              </label>
                <input type="text" required name="name" pattern="[a-z\sA-z]*" title="Contain Only Alphabets" autocomplete="off" maxlength="255"/>
            </div>
         

          <div class="field-wrap">
            <label>
              Email Address<span class="req">*</span>
            </label>
              <input type="email" name="user_mail" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" required autocomplete="off" maxlength="255"/>
          </div>
		  
		   
          <div class="field-wrap">
            <label>
             User_Id<span class="req">*</span>
            </label>
              <input type="text" name="u_id" required autocomplete="off" pattern="[a-z0-9A-z]*"maxlength="15" minlength="6"/>
          </div>
          
          <div class="field-wrap">
            <label>
              Set A Password<span class="req">*</span>
            </label>
              <input type="password" name="pwd" required autocomplete="off" maxlength="8" minlength="6" />
          </div>
		  
		 
		  
		  <div class="field-wrap">
                      <label>
             Confirm Password<span class="req">*</span>
                      </label>
                      <input  type="password" name="cnf_pwd"  required autocomplete="off" maxlength="8"/> 
          </div>
		  
		   <div class="field-wrap">
            <label>
              specialization<span class="req">*</span>
            </label>
                       <input type="text" name="q1" pattern="[a-z\sA-z]*" title="Contain Only Alphabets" maxlength="15" required autocomplete="off"/>
          </div>
          
          <button type="submit" class="button button-block" style="font-family: cursive"/>Register Now</button>
          
          </form>

        </div>
        
        <div id="login">   
          <h1 style="font-family: cursive">Welcome Back!</h1>
          
          <form action="authenticate" method="post">
          
            <div class="field-wrap">
            <label>
              User_Id<span class="req">*</span>
            </label>
            <input type="text" name="id" required autocomplete="off"/>
          </div>
          
          <div class="field-wrap">
            <label>
              Password<span class="req">*</span>
            </label>
            <input type="password" name="pwd" required autocomplete="off"/>
          </div>
          
        
          
          <button class="button button-block" style="font-family: cursive"/>Log In</button>
          
          </form>

        </div>
        
      </div><!-- tab-content -->
      
</div> <!-- /form -->
  <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

    <script  src="res/index.js"></script>
    
    
    <%
       String s1= (String)request.getAttribute("msg");
        String s2= (String)request.getAttribute("msg1");
       if(s1!=null)
           
       {
        %>
        
        <script>alert('<%=s1%>');</script>
        
        <%
       }
        
        %>
        
        <% 
        if(s2!=null)
           
       {
        %>
        
        <script>alert('<%=s2%>');</script>
        
        <%
       }
        
        %>
        
      

</body>
</html>

