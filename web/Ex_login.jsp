
<head>
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <title>LogIn Form</title>
      <link rel="stylesheet" href="res/css/normalize.css">
      <link href='https://fonts.googleapis.com/css?family=Nunito:400,300' rel='stylesheet' type='text/css'>
      <link rel="stylesheet" href="res/login_form.css">
	  <style>
	  body {
    background-image: url("res/04.jpg");
}

input[type=submit] {
    width: 100%;
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
    font-size: 21px;
}

input[type=submit]:hover {
    background-color: #45a049;
}
</style>
  </head>
  <body>

    <form action="expert_auth" method="post">

      <h1>Login Page</h1>

      <fieldset>
        <legend>SignIn</legend><br> 
        <label for="mail">Id:</label>
        <input type="text"  name="id">

        <label for="password">Password:</label>
        <input type="password"  name="pwd">
         <input type="submit" value="LogIn">
        <br>
        <br>
    
      </fieldset>
    </form>

  </body>
</html>
