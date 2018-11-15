<%-- 
    Document   : login
    Created on : 11-Nov-2018, 21:26:05
    Author     : IAMIN
--%>

<%--<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>--%>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">  
    <link href="css/csslogin.css" rel="stylesheet" type="text/css"/>
    <jsp:include page="Head.jsp"></jsp:include>
</head>
<body>
    <div class="container">
        <h1 class="form-heading">login Form</h1>
            <div class="login-form">
                <div class="main-div">
                <div class="panel">
                    <h2>SIGN IN</h2>
                </div><br>
    <form id="Login">

        <div class="form-group">
            <input type="text" class="form-control" id="inputEmail" placeholder="Username">

        </div>

        <div class="form-group">

            <input type="password" class="form-control" id="inputPassword" placeholder="Password">

        </div>
        <button type="submit" class="btn btn-primary">SIGN IN</button>

<<<<<<< HEAD
    </form>
    </div>
</div>
=======
<div class="container">
    <h3 >Login your Account</h3>
    <form action="Login" method="post">
        <label for="email2" class="mb-2 mr-sm-2">username</label><br>
        <center><input type="text" class="form-control mb-2 mr-sm-2" id="email2" name="username" placeholder="Enter username"></center><br>
    <label for="pwd2" class="mb-2 mr-sm-2">Password</label><br>
        <center><input type="password" class="form-control mb-2 mr-sm-2" id="pwd2" name="password" placeholder="Enter password"></center><br>
    <div class="form-check mb-2 mr-sm-2">
     <%-- <label class="form-check-label">
        <input class="form-check-input "type="checkbox"> Remember me
      </label>--%>
    </div><br>    
    <center><button type="submit" class="btn btn-primary mb-2">Login</button></center>
    <a href="RegisterPage"><button type="button" class="btn btn-primary mb-2">Create Account</button></a>
  </form>
>>>>>>> 90d7ebd0bc6d1f0964f52ab35986638a296b6795
</div>

</body>
</html>
