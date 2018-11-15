package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script src=\"fashe-colorlib/js/main.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"fashe-colorlib/css/main.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"fashe-colorlib/css/util.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <section class=\"cart bgwhite p-t-70 p-b-100\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<!-- Cart item -->\n");
      out.write("\t\t\t<div class=\"container-table-cart pos-relative\">\n");
      out.write("\t\t\t\t<div class=\"wrap-table-shopping-cart bgwhite\">\n");
      out.write("\t\t\t\t\t<table class=\"table-shopping-cart\">\n");
      out.write("\t\t\t\t\t\t<tr class=\"table-head\">\n");
      out.write("\t\t\t\t\t\t\t<th class=\"column-1\"></th>\n");
      out.write("\t\t\t\t\t\t\t<th class=\"column-2\">Product</th>\n");
      out.write("\t\t\t\t\t\t\t<th class=\"column-3\">Price</th>\n");
      out.write("\t\t\t\t\t\t\t<th class=\"column-4 p-l-70\">Quantity</th>\n");
      out.write("\t\t\t\t\t\t\t<th class=\"column-5\">Total</th>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<tr class=\"table-row\">\n");
      out.write("\t\t\t\t\t\t\t<td class=\"column-1\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"cart-img-product b-rad-4 o-f-hidden\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"images/item-10.jpg\" alt=\"IMG-PRODUCT\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"column-2\">Men Tshirt</td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"column-3\">$36.00</td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"column-4\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"flex-w bo5 of-hidden w-size17\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<button class=\"btn-num-product-down color1 flex-c-m size7 bg8 eff2\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"fs-12 fa fa-minus\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t</button>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"size8 m-text18 t-center num-product\" type=\"number\" name=\"num-product1\" value=\"1\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<button class=\"btn-num-product-up color1 flex-c-m size7 bg8 eff2\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"fs-12 fa fa-plus\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"column-5\">$36.00</td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<tr class=\"table-row\">\n");
      out.write("\t\t\t\t\t\t\t<td class=\"column-1\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"cart-img-product b-rad-4 o-f-hidden\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"images/item-05.jpg\" alt=\"IMG-PRODUCT\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"column-2\">Mug Adventure</td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"column-3\">$16.00</td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"column-4\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"flex-w bo5 of-hidden w-size17\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<button class=\"btn-num-product-down color1 flex-c-m size7 bg8 eff2\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"fs-12 fa fa-minus\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t</button>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"size8 m-text18 t-center num-product\" type=\"number\" name=\"num-product2\" value=\"1\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<button class=\"btn-num-product-up color1 flex-c-m size7 bg8 eff2\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"fs-12 fa fa-plus\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"column-5\">$16.00</td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"flex-w flex-sb-m p-t-25 p-b-25 bo8 p-l-35 p-r-60 p-lr-15-sm\">\n");
      out.write("\t\t\t\t<div class=\"flex-w flex-m w-full-sm\">\n");
      out.write("\t\t\t\t\t<div class=\"size11 bo4 m-r-10\">\n");
      out.write("\t\t\t\t\t\t<input class=\"sizefull s-text7 p-l-22 p-r-22\" type=\"text\" name=\"coupon-code\" placeholder=\"Coupon Code\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"size12 trans-0-4 m-t-10 m-b-10 m-r-10\">\n");
      out.write("\t\t\t\t\t\t<!-- Button -->\n");
      out.write("\t\t\t\t\t\t<button class=\"flex-c-m sizefull bg1 bo-rad-23 hov1 s-text1 trans-0-4\">\n");
      out.write("\t\t\t\t\t\t\tApply coupon\n");
      out.write("\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"size10 trans-0-4 m-t-10 m-b-10\">\n");
      out.write("\t\t\t\t\t<!-- Button -->\n");
      out.write("\t\t\t\t\t<button class=\"flex-c-m sizefull bg1 bo-rad-23 hov1 s-text1 trans-0-4\">\n");
      out.write("\t\t\t\t\t\tUpdate Cart\n");
      out.write("\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<!-- Total -->\n");
      out.write("\t\t\t<div class=\"bo9 w-size18 p-l-40 p-r-40 p-t-30 p-b-38 m-t-30 m-r-0 m-l-auto p-lr-15-sm\">\n");
      out.write("\t\t\t\t<h5 class=\"m-text20 p-b-24\">\n");
      out.write("\t\t\t\t\tCart Totals\n");
      out.write("\t\t\t\t</h5>\n");
      out.write("\n");
      out.write("\t\t\t\t<!--  -->\n");
      out.write("\t\t\t\t<div class=\"flex-w flex-sb-m p-b-12\">\n");
      out.write("\t\t\t\t\t<span class=\"s-text18 w-size19 w-full-sm\">\n");
      out.write("\t\t\t\t\t\tSubtotal:\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<span class=\"m-text21 w-size20 w-full-sm\">\n");
      out.write("\t\t\t\t\t\t$39.00\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<!--  -->\n");
      out.write("\t\t\t\t<div class=\"flex-w flex-sb bo10 p-t-15 p-b-20\">\n");
      out.write("\t\t\t\t\t<span class=\"s-text18 w-size19 w-full-sm\">\n");
      out.write("\t\t\t\t\t\tShipping:\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"w-size20 w-full-sm\">\n");
      out.write("\t\t\t\t\t\t<p class=\"s-text8 p-b-23\">\n");
      out.write("\t\t\t\t\t\t\tThere are no shipping methods available. Please double check your address, or contact us if you need any help.\n");
      out.write("\t\t\t\t\t\t</p>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<span class=\"s-text19\">\n");
      out.write("\t\t\t\t\t\t\tCalculate Shipping\n");
      out.write("\t\t\t\t\t\t</span>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"rs2-select2 rs3-select2 rs4-select2 bo4 of-hidden w-size21 m-t-8 m-b-12\">\n");
      out.write("\t\t\t\t\t\t\t<select class=\"selection-2\" name=\"country\">\n");
      out.write("\t\t\t\t\t\t\t\t<option>Select a country...</option>\n");
      out.write("\t\t\t\t\t\t\t\t<option>US</option>\n");
      out.write("\t\t\t\t\t\t\t\t<option>UK</option>\n");
      out.write("\t\t\t\t\t\t\t\t<option>Japan</option>\n");
      out.write("\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"size13 bo4 m-b-12\">\n");
      out.write("\t\t\t\t\t\t<input class=\"sizefull s-text7 p-l-15 p-r-15\" type=\"text\" name=\"state\" placeholder=\"State /  country\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"size13 bo4 m-b-22\">\n");
      out.write("\t\t\t\t\t\t\t<input class=\"sizefull s-text7 p-l-15 p-r-15\" type=\"text\" name=\"postcode\" placeholder=\"Postcode / Zip\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"size14 trans-0-4 m-b-10\">\n");
      out.write("\t\t\t\t\t\t\t<!-- Button -->\n");
      out.write("\t\t\t\t\t\t\t<button class=\"flex-c-m sizefull bg1 bo-rad-23 hov1 s-text1 trans-0-4\">\n");
      out.write("\t\t\t\t\t\t\t\tUpdate Totals\n");
      out.write("\t\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<!--  -->\n");
      out.write("\t\t\t\t<div class=\"flex-w flex-sb-m p-t-26 p-b-30\">\n");
      out.write("\t\t\t\t\t<span class=\"m-text22 w-size19 w-full-sm\">\n");
      out.write("\t\t\t\t\t\tTotal:\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<span class=\"m-text21 w-size20 w-full-sm\">\n");
      out.write("\t\t\t\t\t\t$39.00\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"size15 trans-0-4\">\n");
      out.write("\t\t\t\t\t<!-- Button -->\n");
      out.write("\t\t\t\t\t<button class=\"flex-c-m sizefull bg1 bo-rad-23 hov1 s-text1 trans-0-4\">\n");
      out.write("\t\t\t\t\t\tProceed to Checkout\n");
      out.write("\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
