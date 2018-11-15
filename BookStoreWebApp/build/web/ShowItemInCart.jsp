<%-- 
    Document   : ShowItemInCart
    Created on : Nov 11, 2018, 6:54:58 PM
    Author     : GIFS
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <jsp:include page="Head.jsp"></jsp:include>
        <link href="css/cartcss.css" rel="stylesheet" type="text/css"/>
        
    </head>
    <body>
       <section class="cart bgwhite p-t-70 p-b-100">
		<div class="container">
			<!-- Cart item -->
			<div class="container-table-cart pos-relative">
				<div class="wrap-table-shopping-cart bgwhite">
					<table class="table-shopping-cart">
						<tr class="table-head">
							<th class="column-1"></th>
							<th class="column-2">Product</th>
							<th class="column-3">Price</th>
							<th class="column-4 p-l-70">Quantity</th>
							<th class="column-5">Total</th>
						</tr>
                                        <c:forEach items="${cart.lineitem}" var="line" varStatus="vs">
						<tr class="table-row">
							<td class="column-1">
								<div class="cart-img-product b-rad-4 o-f-hidden">
									<img src="${line.isbn}" alt="IMG-PRODUCT">
								</div>
							</td>
							<td class="column-2">${line.book.name}</td>
							<td class="column-3">${line.book.price}</td>
							<td class="column-4">
								<div class="flex-w bo5 of-hidden w-size17">
                                                                    <form action="DecreaseItem" method="post"><button type="submit" class="btn-num-product-down color1 flex-c-m size7 bg8 eff2">
										<i class="fs-12 fa fa-minus" aria-hidden="true"></i>
                                                                        </button></form>

                                                                    <input class="size8 m-text18 t-center num-product" type="number" name="num-product1" value="1" min="1">

									<form action="IncreaseItem" method="post"><button type="submit" class="btn-num-product-up color1 flex-c-m size7 bg8 eff2">
										<i class="fs-12 fa fa-plus" aria-hidden="true"></i>
                                                                            </button></form>
								</div>
							</td>
							<td class="column-5">฿250.00</td>
						</tr>
                                        </c:forEach>
					</table>
				</div>
			</div>

			<!-- Total -->
			<div class="bo9 w-size18 p-l-40 p-r-40 p-t-30 p-b-38 m-t-30 m-r-0 m-l-auto p-lr-15-sm">
				<h5 class="m-text20 p-b-24">
					Cart Totals
				</h5>

				<!--  -->
				<div class="flex-w flex-sb-m p-b-12">
					<span class="s-text18 w-size19 w-full-sm">
						Subtotal:
					</span>

					<span class="m-text21 w-size20 w-full-sm">
						฿250.00
					</span>
                                </div><br>

				<div class="size15 trans-0-4">
					<!-- Button -->
					<button class="flex-c-m sizefull bg1 bo-rad-23 hov1 s-text1 trans-0-4">
						Proceed to Checkout
					</button>
				</div>
			</div>
		</div>
	</section> 
        
    </body>
    <jsp:include page="Footer.jsp"></jsp:include>   
</html>
