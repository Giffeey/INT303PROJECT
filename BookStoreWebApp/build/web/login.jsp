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
<style>
body {
    font-family: Arial, Helvetica, sans-serif;
    background-image: url("./img/r1.png");

}

input[type=text], select, textarea {
    width: 50%;
    padding: 12px;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
    margin-top: 6px;
    margin-bottom: 16px;
    resize: vertical;
}

button[type=button] {
    background-color: #5F9EA0;
    color: white;
    padding: 12px 20px;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}
button[type=submit] {
    background-color: #5F9EA0;
    color: white;
    padding: 12px 20px;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}

button[type=button]:hover {
    background-color: #73B2B4;
}

.container {
    width: 30%;
    text-align: center;
    border-radius: 5px;
    background-color:rgba(50,50,50,0.6);
    margin-right: auto;
    margin-left: auto;
    margin-top: 150px;
    margin-bottom: auto;
    padding: 20px;
}
</style>
</head>
<body>


<div class="container">
    <h3 >Login your Account</h3>
  <form action="loginservlet">
    <label for="email2" class="mb-2 mr-sm-2">Email</label><br>
    <input type="text" class="form-control mb-2 mr-sm-2" id="email2" placeholder="Enter email"><br>
    <label for="pwd2" class="mb-2 mr-sm-2">Password</label><br>
    <input type="text" class="form-control mb-2 mr-sm-2" id="pwd2" placeholder="Enter password"><br>
    <div class="form-check mb-2 mr-sm-2">
      <label class="form-check-label">
        <input class="form-check-input "type="checkbox"> Remember me
      </label>
    </div><br>    
    <button type="submit" class="btn btn-primary mb-2">Login</button>
    <a href="./CreateA.html"><button type="button" class="btn btn-primary mb-2">Create Account</button></a>
  </form>
</div>

</body>
</html>
