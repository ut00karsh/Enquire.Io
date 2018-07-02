<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Signup</title>
     
        
       
    <link rel="stylesheet" href="res/bootstrap.min.css">
    <link rel="stylesheet" href="res/style1.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
   
    
   
  
</head>

<body>
    <div class="container">
        <form class="frm" method="POST" autocomplete="off" action="expert_auth" >
            <h1 class="form-heading">Hi!</h1>
            <br>
            <input type="text" name="id" class="form-control" placeholder="Username" autofocus>
            <br>
            <input type="password" name="pwd" class="form-control" placeholder="Password">
         
            <br>
            <div class="checkbox">
                <label>
                    <input name="chkbox" type="checkbox" value="remember"> Remember me
                </label>
            </div>
            <input class="btn btn-lg btn-primary btn-block" type="submit" value="Sign in">
            <span>or</span>
            <a href="/signup">Apply ...</a>
        </form>

   
    </div>
</body>

</html>
