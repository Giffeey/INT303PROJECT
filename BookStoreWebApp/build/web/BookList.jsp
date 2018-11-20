<%-- 
    Document   : Book
    Created on : Nov 11, 2018, 3:20:43 PM
    Author     : GIFS
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
    </head>
    <jsp:include page="Head.jsp"></jsp:include>
        <body>

            <div class="card-deck">
            <c:forEach items="${books}" var="book">
                <div class="col-3 container">
                    <div class="card" >
                        <img class="card-img-top" src=".../100px180/" alt="Card image cap">
                        <div class="card-body">
                            <h5 class="card-title">${book.bookname}</h5>
                            <p class="card-text">ผู้แต่ง: ${book.author}</p>
                            <p class="card-text">สำนักพิมพ์: ${book.publisher}</p>
                            <p class="card-text">ราคา: ${book.price} บาท</p>
                        </div>
                        <div class="card-footer">
                            <form action="AddItemToCart" method="post">
                                <input type="hidden" name="isbn" value="${book.isbn}">
                                <a type="submit" class="btn btn-primary">Add to Cart</a>
                            </form>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
    </body>
    <jsp:include page="Footer.jsp"></jsp:include>
</html>
