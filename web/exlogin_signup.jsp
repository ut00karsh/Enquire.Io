<!DOCTYPE html>
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

<body >
  <div class="form">
      
      <ul class="tab-group">
        <li class="tab active"><a href="#signup">Apply Here</a></li>
        <li class="tab"><a href="#login">Log In</a></li>
      </ul>
      
      <div class="tab-content">
        <div id="signup">   
          <h1>Apply for Free</h1>
          
          <form action="ex_apply" method="post">
          
         
           
        
            <div class="field-wrap">
              <label>
                 Name<span class="req">*</span>
              </label>
                <input type="text"required name="name" autocomplete="off" maxlength="100"  pattern="[a-z\sA-z]*" title="Must Contain Alphabets" minlength='6'/>
            </div>
         

          <div class="field-wrap">
            <label>
              Email Address<span class="req">*</span>
            </label>
              <input type="email" name="email" required autocomplete="off" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" maxlength="100"/>
          </div>
		  
		   
          <div class="field-wrap">
            <label>
              Expert_Id<span class="req">*</span>
            </label>
              <input type="text" name="ex_id" required autocomplete="off" pattern="[a-zA-z0-9]*" maxlength="10" minlength="6"/>
          </div>
          
          <div class="field-wrap">
            <label>
              Set A Password<span class="req">*</span>
            </label>
              <input type="password" name="pwd" required autocomplete="off" pattern="[a-zA-z0-9]*" maxlenght="10" minlength="6"/>
          </div>
		  
		 
		  
		  <div class="field-wrap">
            <label>
              Specialization<span class="req">*</span>
            </label>
                      <input type="text" name="spec" pattern="[a-zA-z0-9]*" title="Must Match This Pattern" required autocomplete="off"  maxlength="10"/>
          </div>
		  
		   <div class="field-wrap">
            <label>
              About Your self<span class="req">*</span>
            </label>
                       <input name="about" type="text" autocomplete="off" pattern="[a-z\sA-z]*" maxlength="255" minlength="40"/>
          </div>
          
          <button type="submit" class="button button-block"/>Apply Now</button>
          
          </form>

        </div>
        
        <div id="login">   
          <h1>Welcome Back!</h1>
          
          <form action="expert_auth" method="post">
          
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
          
        
          
          <button class="button button-block"/>Log In</button>
          
          </form>

        </div>
        
      </div><!-- tab-content -->
      
</div> <!-- /form -->




  
    <%
       String s1= (String)request.getAttribute("msg");
        String s2= (String)request.getAttribute("msg2");
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







  <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

    <script  src="res/index.js"></script>
    
    
    
    
    
    
    
    

</body>
</html>

