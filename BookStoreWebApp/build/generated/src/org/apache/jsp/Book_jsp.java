package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Book_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Head.jsp", out, false);
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("            <!-- Product Detail -->\r\n");
      out.write("\t<div class=\"container bgwhite p-t-35 p-b-80\">\r\n");
      out.write("\t\t<div class=\"flex-w flex-sb\">\r\n");
      out.write("\t\t\t<div class=\"w-size13 p-t-30 respon5\">\r\n");
      out.write("\t\t\t\t<div class=\"wrap-slick3 flex-sb flex-w\">\r\n");
      out.write("\t\t\t\t\t<div class=\"wrap-slick3-dots\"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"slick3\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"item-slick3\" data-thumb=\"images/thumb-item-01.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"wrap-pic-w\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/product-detail-01.jpg\" alt=\"IMG-PRODUCT\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"item-slick3\" data-thumb=\"images/thumb-item-02.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"wrap-pic-w\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/product-detail-02.jpg\" alt=\"IMG-PRODUCT\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"w-size14 p-t-30 respon5\">\r\n");
      out.write("\t\t\t\t<h4 class=\"product-detail-name m-text16 p-b-13\">\r\n");
      out.write("\t\t\t\t\tBook Name\r\n");
      out.write("\t\t\t\t</h4>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<span class=\"m-text17\">\r\n");
      out.write("\t\t\t\t\t฿250.00\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t<!--  -->\r\n");
      out.write("\t\t\t\t<div class=\"p-t-33 p-b-60\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"flex-r-m flex-w p-t-10\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"w-size16 flex-m flex-w\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"flex-w bo5 of-hidden m-r-22 m-t-10 m-b-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button class=\"btn-num-product-down color1 flex-c-m size7 bg8 eff2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fs-12 fa fa-minus\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<input class=\"size8 m-text18 t-center num-product\" type=\"number\" name=\"num-product\" value=\"1\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<button class=\"btn-num-product-up color1 flex-c-m size7 bg8 eff2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fs-12 fa fa-plus\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"btn-addcart-product-detail size9 trans-0-4 m-t-10 m-b-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- Button -->\r\n");
      out.write("\t\t\t\t\t\t\t\t<button class=\"flex-c-m sizefull bg1 bo-rad-23 hov1 s-text1 trans-0-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\tAdd to Cart\r\n");
      out.write("\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!--  -->\r\n");
      out.write("\t\t\t\t<div class=\"wrap-dropdown-content bo6 p-t-15 p-b-14 active-dropdown-content\">\r\n");
      out.write("\t\t\t\t\t<h5 class=\"js-toggle-dropdown-content flex-sb-m cs-pointer m-text19 color0-hov trans-0-4\">\r\n");
      out.write("\t\t\t\t\t\tDescription\r\n");
      out.write("\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-content dis-none p-t-15 p-b-23\">\r\n");
      out.write("\t\t\t\t\t\t<p class=\"s-text8\">\r\n");
      out.write("\t\t\t\t\t\t\tdetail\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
