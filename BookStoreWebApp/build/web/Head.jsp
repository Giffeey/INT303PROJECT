<%-- 
    Document   : Head
    Created on : Nov 13, 2018, 10:57:46 PM
    Author     : Admin
--%>

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
        </style>
    </head>
    <body>
        
        <div class="header">
    <!--Logo-->
            <div class="logo">
                <a href="Home.jsp" class="logo">
            <img src="img/logo-demo2.png" alt="IMG-LOGO">
                </a>
            </div>
        <!--Menu -->	
        <div class="wrap_menu">
                <ul class="main_menu">
                    <li>
                        <a href="BookLst.jsp">BOOK</a>
                    </li> 
                    <li>
                        <a href="Register.jsp">SIGN UP</a>
                    </li>
                    <li>
                        <a href="Login.jsp">SIGN IN</a>
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
