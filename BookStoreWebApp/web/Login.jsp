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

    </form>
    </div>
</div>
</div>

</body>
</html>
