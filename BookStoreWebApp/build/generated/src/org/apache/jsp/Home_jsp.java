package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Head.jsp", out, false);
      out.write("\n");
      out.write("        <style>\n");
      out.write(".slide-contaner {\n");
      out.write(" height: 570px;\n");
      out.write(" background-size: cover;\n");
      out.write(" background-repeat: no-repeat;\n");
      out.write(" background-position: center center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".p-b-50 {\n");
      out.write("    padding-bottom: 50px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".col, .col-1, .col-10, .col-11, .col-12, .col-2, .col-3, .col-4, .col-5, .col-6, .col-7, .col-8, .col-9, .col-auto, .col-lg, .col-lg-1, .col-lg-10, .col-lg-11, .col-lg-12, .col-lg-2, .col-lg-3, .col-lg-4, .col-lg-5, .col-lg-6, .col-lg-7, .col-lg-8, .col-lg-9, .col-lg-auto, .col-md, .col-md-1, .col-md-10, .col-md-11, .col-md-12, .col-md-2, .col-md-3, .col-md-4, .col-md-5, .col-md-6, .col-md-7, .col-md-8, .col-md-9, .col-md-auto, .col-sm, .col-sm-1, .col-sm-10, .col-sm-11, .col-sm-12, .col-sm-2, .col-sm-3, .col-sm-4, .col-sm-5, .col-sm-6, .col-sm-7, .col-sm-8, .col-sm-9, .col-sm-auto, .col-xl, .col-xl-1, .col-xl-10, .col-xl-11, .col-xl-12, .col-xl-2, .col-xl-3, .col-xl-4, .col-xl-5, .col-xl-6, .col-xl-7, .col-xl-8, .col-xl-9, .col-xl-auto {\n");
      out.write("    position: relative;\n");
      out.write("    width: 100%;\n");
      out.write("    min-height: 1px;\n");
      out.write("    padding-right: 15px;\n");
      out.write("    padding-left: 15px;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"slide-contaner\" style=\"background-image: url(img/example.jpg);\">\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        <div class=\"product-row\">\n");
      out.write("            <div class=\"col-sm-12 col-md-6 col-lg-4 p-b-50\">\n");
      out.write("\t\t\t\t\t\t\t<!-- Block2 -->\n");
      out.write("\t\t\t\t\t\t\t<div class=\"block2\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"block2-img wrap-pic-w of-hidden pos-relative block2-labelnew\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"images/item-02.jpg\" alt=\"IMG-PRODUCT\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"block2-overlay trans-0-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"block2-btn-addwishlist hov-pointer trans-0-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-wishlist icon_heart_alt\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-wishlist icon_heart dis-none\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"block2-btn-addcart w-size1 trans-0-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<!-- Button -->\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<button class=\"flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tAdd to Cart\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"block2-txt p-t-20\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"product-detail.html\" class=\"block2-name dis-block s-text3 p-b-5\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\tHerschel supply co 25l\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"block2-price m-text6 p-r-5\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$75.00\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-12 col-md-6 col-lg-4 p-b-50\">\n");
      out.write("\t\t\t\t\t\t\t<!-- Block2 -->\n");
      out.write("\t\t\t\t\t\t\t<div class=\"block2\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"block2-img wrap-pic-w of-hidden pos-relative\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"images/item-03.jpg\" alt=\"IMG-PRODUCT\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"block2-overlay trans-0-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"block2-btn-addwishlist hov-pointer trans-0-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-wishlist icon_heart_alt\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-wishlist icon_heart dis-none\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"block2-btn-addcart w-size1 trans-0-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<!-- Button -->\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<button class=\"flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tAdd to Cart\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"block2-txt p-t-20\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"product-detail.html\" class=\"block2-name dis-block s-text3 p-b-5\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\tDenim jacket blue\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"block2-price m-text6 p-r-5\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$92.50\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-12 col-md-6 col-lg-4 p-b-50\">\n");
      out.write("\t\t\t\t\t\t\t<!-- Block2 -->\n");
      out.write("\t\t\t\t\t\t\t<div class=\"block2\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"block2-img wrap-pic-w of-hidden pos-relative\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"images/item-05.jpg\" alt=\"IMG-PRODUCT\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"block2-overlay trans-0-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"block2-btn-addwishlist hov-pointer trans-0-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-wishlist icon_heart_alt\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-wishlist icon_heart dis-none\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"block2-btn-addcart w-size1 trans-0-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<!-- Button -->\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<button class=\"flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tAdd to Cart\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"block2-txt p-t-20\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"product-detail.html\" class=\"block2-name dis-block s-text3 p-b-5\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\tCoach slim easton black\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"block2-price m-text6 p-r-5\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$165.90\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\n");
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
