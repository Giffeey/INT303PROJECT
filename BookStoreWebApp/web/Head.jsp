<%-- 
    Document   : Head
    Created on : Nov 13, 2018, 10:57:46 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script> 
        <style>
.header {
  display: -webkit-box;
  display: -webkit-flex;
  display: -moz-box;
  display: -ms-flexbox;
  display: flex;
  flex-wrap: wrap;
  width: 100%;
  height: 80px;
  background-color: #4D4845;
  justify-content: center;
  align-items: center;
  position: relative;
  -webkit-transition: all 0.3s;
  -o-transition: all 0.3s;
  -moz-transition: all 0.3s;
  transition: all 0.3s;
  list-style-type: none;
  overflow: hidden;
}
.logo {
  display: block;
  position: absolute;
  left: 52px;
  top: 50%;
  -webkit-transform: translateY(-50%);
  -moz-transform: translateY(-50%);
  -ms-transform: translateY(-50%);
  -o-transform: translateY(-50%);
  transform: translateY(-50%);
}

.logo img {
  max-height: 50px;
}
.main_menu {
  list-style-type: none;
  margin: 0px;
  display: -webkit-box;
  display: -webkit-flex;
  display: -moz-box;
  display: -ms-flexbox;
  display: flex;
  flex-wrap: wrap;
  align-items: center;
  justify-content: center;
}
.main_menu > li {
  display: block;
  position: relative;
  padding-top: 20px;  
  padding-bottom: 20px; 
  padding-left: 15px;
  padding-right: 15px;
}

.main_menu > li > a {
  font-family: Segoe UI;
  font-size: 15px;
  color: white;
  padding: 0;
}
/* icon */
.header-icons {
  display: -webkit-box;
  display: -webkit-flex;
  display: -moz-box;
  display: -ms-flexbox;
  display: flex;
  align-items: center;
  position: absolute;
  right: 52px;
  top: 50%;
  -webkit-transform: translateY(-50%);
  -moz-transform: translateY(-50%);
  -ms-transform: translateY(-50%);
  -o-transform: translateY(-50%);
  transform: translateY(-50%);
}

.header-wrapicon1,
.header-wrapicon2 {
  height: 27px;
  position: relative;
}

.header-wrapicon1 img,
.header-wrapicon2 img {
  height: 100%;
}

.header-icon1:hover,
.header-icon2:hover {
  cursor: pointer;
}
.linedivide1 {
  display: block;
  height: 20px;
  width: 1px;
  background-color: #e5e5e5;
  margin-left: 23px;
  margin-right: 23px;
  margin-top: 5px;
}


li {
    float: left;
}
li a, .dropbtn {
    display: inline-block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

li.dropdown {
    display: inline-block;
}

.dropdown-content {
    display: none;
    position: absolute;
    background-color: #f9f9f9;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
    z-index: 1;
}

.dropdown-content a {
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
    text-align: left;
}

.dropdown-content a:hover {background-color: #f1f1f1}

.dropdown:hover .dropdown-content {
    display: block;
}
        </style>
         
    </head>
    <body>
        
        <div class="header">
    <!--Logo-->
            <div class="logo">
                <a href="Home" class="logo">
            <img src="img/logo-demo2.png" alt="IMG-LOGO">
                </a>
            </div>
        <!--Menu -->	
        <div class="wrap_menu">
                <ul class="main_menu">
<<<<<<< HEAD
                    <li class="dropdown">
                        <a href="Booklist.jsp" class="dropbtn">BOOK</a>
                            <div class="dropdown-content">
                                <a href="#">Link 1</a>
                                <a href="#">Link 2</a>
                                <a href="#">Link 3</a>
                            </div>
                    </li>
=======
                    <li>
                        <a href="AllBook">BOOK</a>
                    </li> 
>>>>>>> 90d7ebd0bc6d1f0964f52ab35986638a296b6795
                    <li>
                        <a href="RegisterPage">SIGN UP</a>

                    </li>
                    <li>
                        <c:choose>
                            <c:when test="${customer != null}">
                                <a href="Logout"> LOGOUT </a>
                            </c:when>
                            <c:otherwise>
                        <a href="Login">SIGN IN</a>
                            </c:otherwise>
                        </c:choose>
                    </li>
                </ul>
        </div>

            <div class="header-icons">
		<a href="ShowItemInCart.jsp" class="header-wrapicon1 dis-block">
                    <img src="img/shopping-cart.png" class="header-icon1" alt="cart">
		</a>
		<span class="linedivide1"></span>
                    <div class="header-wrapicon2">
                        <a href="#" class="header-wrapicon1 dis-block">
                        <img src="img/magnifying-glass.png" class="header-icon1 js-show-header-dropdown" alt="search">
                        </a>
                    </div>
            </div>
	</div>
    </body>
    </body>
</html>
