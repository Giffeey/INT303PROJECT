<%-- 
    Document   : ShowItemInCart
    Created on : Nov 11, 2018, 6:54:58 PM
    Author     : GIFS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <jsp:include page="Head.jsp"></jsp:include>
<style>
   .wrap-table-shopping-cart {
  overflow: auto;
}

.container-table-cart::before {
  content: '';
  display: block;
  position: absolute;
  width: 1px;
  height: calc(100% - 51px);
  background-color: #e6e6e6;
  top: 51px;
  left: 0;
}

.container-table-cart::after {
  content: '';
  display: block;
  position: absolute;
  width: 1px;
  height: calc(100% - 51px);
  background-color: #e6e6e6;
  top: 51px;
  right: 0;
}

.table-shopping-cart {
  border-collapse: collapse;
  width: 100%;
  min-width: 992px;
}

.table-shopping-cart .table-row {
  border-top: 1px solid #e6e6e6;
  border-bottom: 1px solid #e6e6e6;
}

.table-shopping-cart .column-1 {
  width: 225px;
  padding-left: 50px;
}
.table-shopping-cart .column-2 {
  width: 330px;
  padding-right: 30px;
}
.table-shopping-cart .column-3 {
  width: 133px;
  padding-right: 30px;
}
.table-shopping-cart .column-4 {
  width: 355px;
  padding-right: 30px;
}
.table-shopping-cart .column-5 {
  padding-right: 30px;
}

.table-shopping-cart .table-head th {
  font-family: Montserrat-Bold;
  font-size: 13px;
  color: #555555;
  line-height: 1.5;
  text-transform: uppercase;
  padding-top: 16px;
  padding-bottom: 16px;
}

.table-shopping-cart td {
  font-family: Montserrat-Regular;
  font-size: 16px;
  color: #555555;
  line-height: 1.5;
  padding-top: 37px;
  padding-bottom: 30px;
}

.table-shopping-cart .table-row .column-2 {
  font-size: 15px;
}    
</style>
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

						<tr class="table-row">
							<td class="column-1">
								<div class="cart-img-product b-rad-4 o-f-hidden">
									<img src="images/item-10.jpg" alt="IMG-PRODUCT">
								</div>
							</td>
							<td class="column-2">Book</td>
							<td class="column-3">฿250.00</td>
							<td class="column-4">
								<div class="flex-w bo5 of-hidden w-size17">
									<button class="btn-num-product-down color1 flex-c-m size7 bg8 eff2">
										<i class="fs-12 fa fa-minus" aria-hidden="true"></i>
									</button>

									<input class="size8 m-text18 t-center num-product" type="number" name="num-product1" value="1">

									<button class="btn-num-product-up color1 flex-c-m size7 bg8 eff2">
										<i class="fs-12 fa fa-plus" aria-hidden="true"></i>
									</button>
								</div>
							</td>
							<td class="column-5">฿250.00</td>
						</tr>
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
				</div>

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
</html>
