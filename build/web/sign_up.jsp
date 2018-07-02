<head>
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <title>Sign Up Form</title>
      <link rel="stylesheet" href="res/css/normalize.css">
      <link href='https://fonts.googleapis.com/css?family=Nunito:400,300' rel='stylesheet' type='text/css'>
      <link rel="stylesheet" href="res/register.css">
 
<style>
  body {
    background-image: url("res/02_1.jpg");
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

      <form action="register" method="post">

      <h1>Sign Up</h1>

      <fieldset>
        <legend style="color:">Your basic info</legend>
		
        <br><label for="name">Name:</label>
        <input  type="text" name="name" placeholder="your  name" required>
		
		  <label for="u_id">User Id:</label>
        <input  type="text" name="u_id" placeholder="your user id" required>

        <label for="mail">Email:</label>
        <input  type="email" name="user_mail" placeholder="your email address" required>

        <label for="password">Password:</label>
       <input  type="password" name="pwd" placeholder="your password" required>

       <label for="confirm_Password">confirm_Password</label>
<input  type="password" name="cnf_pwd" placeholder=" Enter your password" required >
       
      <label for="qualifiacation">Qualification</label>
<select class="new" name="q1">
<option value="undergraduate">Under-Graduate</option>
<option value="graduate">Graduate</option>
<option value="postgraduate">Post-Graduate</option>
</select>
      </fieldset>
      <input type="submit" value="SignUp">
    </form>
</body>
</html>

