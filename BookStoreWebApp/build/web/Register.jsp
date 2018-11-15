<%-- 
    Document   : Register
    Created on : Nov 13, 2018, 2:06:57 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script> 
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<style>
/*@import url(https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css);
@import url(https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.4.3/css/mdb.min.css);*/

.hm-gradient {
    background-image: linear-gradient(to top, #f3e7e9 0%, #e3eeff 99%, #e3eeff 100%);
}
.darken-grey-text {
    color: #2E2E2E;
}
.danger-text {
    color: #ff3547; }
.default-text {
    color: #2BBBAD; 
}
.info-text {
    color: #33b5e5; 
}
.form-white .md-form label {
  color: #fff; 
}
.form-white input[type=text]:focus:not([readonly]) {
    border-bottom: 1px solid #fff;
    -webkit-box-shadow: 0 1px 0 0 #fff;
    box-shadow: 0 1px 0 0 #fff; 
}
.form-white input[type=text]:focus:not([readonly]) + label {
    color: #fff; 
}
.form-white input[type=password]:focus:not([readonly]) {
    border-bottom: 1px solid #fff;
    -webkit-box-shadow: 0 1px 0 0 #fff;
    box-shadow: 0 1px 0 0 #fff; 
}
        </style> 
        <jsp:include page="Head.jsp"></jsp:include>
    </head>
    <body>
        <div class="row">
                <!-- Grid column -->
                <div class="col-md-6 mb-4">
                    <div class="card">
                        <div class="card-body">
                            <h3 class="text-center default-text py-3"><i class="fa fa-lock"></i> SIGN IN</h3>
                            <!--Body-->
                            <div class="md-form">
                                <i class="fa fa-envelope prefix grey-text"></i>
<!--                                <input type="text" id="fname" class="form-control">
                                <label for="firstname">First Name</label>-->
                                <input type="text" class="form-control mb-2 mr-sm-2" id="fname" name="firstname" placeholder="First Name"><br>
                            </div>
                            <div class="md-form">
                                <i class="fa fa-lock prefix grey-text"></i>
<!--                                <input type="text" id="lname" class="form-control">
                                <label for="lastname">Last Name</label>-->
                                <input type="text" class="form-control mb-2 mr-sm-2" id="lname" name="lastname" placeholder="Last Name"><br>
                            </div>
                            <div class="md-form">
                                <i class="fa fa-lock prefix grey-text"></i>
<!--                                <input type="text" id="username" class="form-control">
                                <label for="username">User Name</label>-->
                                <input type="text" class="form-control mb-2 mr-sm-2" id="user" name="username" placeholder="User Name"><br>
                            </div>
                            <div class="md-form">
                                <i class="fa fa-lock prefix grey-text"></i>
<!--                                <input type="password" id="pwd" class="form-control">
                                <label for="password">Password</label>-->
                                <input type="password" class="form-control mb-2 mr-sm-2" id="psw" name="password" placeholder="Password"><br>
                            </div>
<!--                            <div class="md-form">
                                <i class="fa fa-lock prefix grey-text"></i>
                                <input type="password" id="pwd" class="form-control">
                                <label for="password">Password</label>
                            </div>-->
                            <div class="md-form">
                                <i class="fa fa-lock prefix grey-text"></i>
<!--                                <input type="text" id="phone" class="form-control">
                                <label for="phone">Phone</label>-->
                                <input type="text" class="form-control mb-2 mr-sm-2" id="tel" name="phone" placeholder="Phone"><br>
                            </div>
                            <div class="md-form">
                                <i class="fa fa-lock prefix grey-text"></i>
<!--                                <input type="text" id="email" class="form-control">
                                <label for="email">E-Mail</label>-->
                                <input type="text" class="form-control mb-2 mr-sm-2" id="email" name="email" placeholder="E-mail"><br>
                            </div>
                            <div class="md-form">
                                <i class="fa fa-lock prefix grey-text"></i>
<!--                                <input type="text" id="address" class="form-control">
                                <label for="address">Address</label>-->
                                <input type="text" class="form-control mb-2 mr-sm-2" id="add" name="address" placeholder="Address"><br>
                            </div>
                            <div class="md-form">
                                <i class="fa fa-lock prefix grey-text"></i>
                                <input type="text" class="form-control mb-2 mr-sm-2" id="dis" name="district" placeholder="District"><br>
                            </div>
                            <div class="md-form">
                                <i class="fa fa-lock prefix grey-text"></i>
                                <input type="text" class="form-control mb-2 mr-sm-2" id="amp" name="amphur" placeholder="Amphur"><br>
                            </div>
                            <div class="md-form">
                                <i class="fa fa-lock prefix grey-text"></i>
                                <input type="text" class="form-control mb-2 mr-sm-2" id="pv" name="province" placeholder="Province"><br>
                            </div>
                            <div class="md-form">
                                <i class="fa fa-lock prefix grey-text"></i>
                                <input type="text" class="form-control mb-2 mr-sm-2" id="zip" name="zipcode" placeholder="Zip Code"><br>
                            </div>
                            <div class="text-center">
                                <button class="btn btn-default waves-effect waves-light">SIGN IN</button>
                            </div>
                        </div>
                    </div>
                </div>
        </div>
 
    </body>
</html>
