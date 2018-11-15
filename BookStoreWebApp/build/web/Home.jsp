<%-- 
    Document   : Home
    Created on : Nov 13, 2018, 4:20:39 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <jsp:include page="Head.jsp"></jsp:include>
            <style>
                .slide-contaner {
                    height: 570px;
                    background-size: cover;
                    background-repeat: no-repeat;
                    background-position: center center;
                }


                .p-b-50 {
                    padding-bottom: 50px;
                }

                .col, .col-1, .col-10, .col-11, .col-12, .col-2, .col-3, .col-4, .col-5, .col-6, .col-7, .col-8, .col-9, .col-auto, .col-lg, .col-lg-1, .col-lg-10, .col-lg-11, .col-lg-12, .col-lg-2, .col-lg-3, .col-lg-4, .col-lg-5, .col-lg-6, .col-lg-7, .col-lg-8, .col-lg-9, .col-lg-auto, .col-md, .col-md-1, .col-md-10, .col-md-11, .col-md-12, .col-md-2, .col-md-3, .col-md-4, .col-md-5, .col-md-6, .col-md-7, .col-md-8, .col-md-9, .col-md-auto, .col-sm, .col-sm-1, .col-sm-10, .col-sm-11, .col-sm-12, .col-sm-2, .col-sm-3, .col-sm-4, .col-sm-5, .col-sm-6, .col-sm-7, .col-sm-8, .col-sm-9, .col-sm-auto, .col-xl, .col-xl-1, .col-xl-10, .col-xl-11, .col-xl-12, .col-xl-2, .col-xl-3, .col-xl-4, .col-xl-5, .col-xl-6, .col-xl-7, .col-xl-8, .col-xl-9, .col-xl-auto {
                    position: relative;
                    width: 100%;
                    min-height: 1px;
                    padding-right: 15px;
                    padding-left: 15px;
                }
            </style>
        </head>
        <body>
            <div class="slide-contaner" style="background-image: url(img/example.jpg);">

            </div>
            <div class="product-row">
            <c:forEach items="${showBook}" var="book" >
                <div class="col-sm-12 col-md-6 col-lg-4 p-b-50">
                    <!-- Block2 -->

                    <div class="block2">
                        <div class="block2-img wrap-pic-w of-hidden pos-relative block2-labelnew">
                            <img src="images/item-02.jpg" alt="IMG-PRODUCT">

                            <div class="block2-overlay trans-0-4">
                                <a href="#" class="block2-btn-addwishlist hov-pointer trans-0-4">
                                    <i class="icon-wishlist icon_heart_alt" aria-hidden="true"></i>
                                    <i class="icon-wishlist icon_heart dis-none" aria-hidden="true"></i>
                                </a>

                            </div>
                        </div>

                        <div class="block2-txt p-t-20">
                            <a href="product-detail.html" class="block2-name dis-block s-text3 p-b-5">
                                ${book.bookname}
                            </a>
                            <br>
                            <span class="block2-price m-text6 p-r-5">
                                ${book.price} baht
                            </span>
                        </div>

                        <div class="block2-btn-addcart w-size1 trans-0-4">
                            <!-- Button -->
                            <form action="AddItemToCart" method="post">
                                <input type="hidden" value="${book.isbn}" name="isbn" />
                                <button type="submit" class="flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4">
                                Add to Cart
                            </button>
                            </form>
                        </div>
                    </div>
                </div>
            </c:forEach>



        </div>
    </body>
    <jsp:include page="Footer.jsp"></jsp:include>
</html>
