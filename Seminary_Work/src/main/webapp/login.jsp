<%@page contentType="text/html" pageEncoding="UTF-8"%>
  
<!DOCTYPE html>
<html>
  <head>
    <title>LOGIN</title>
    <link rel="stylesheet" href="css/style.css">
    <meta name="viewport" content="width=device-width">
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="css/login.css" />
    <script src="main.js"></script>
  </head>

    <body oncontextmenu="return false">
       <!-- <header id="top" class="main-headertwo"> -->
       <!-- </header> -->
        <form class="box" action="check" method="post">
          <h1>Login</h1>
          <input type="text" name="userid" placeholder="Username">
          <input type="password" name="pswrd" placeholder="Password">
          <input type="submit" name="" value="Login">
          <font color="red">${requestScope.wrongMessage}</font>
        </form>
    </body>
</html>
