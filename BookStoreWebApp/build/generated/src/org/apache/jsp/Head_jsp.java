package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Head_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script> \n");
      out.write("        <style>\n");
      out.write(".header {\n");
      out.write("  display: -webkit-box;\n");
      out.write("  display: -webkit-flex;\n");
      out.write("  display: -moz-box;\n");
      out.write("  display: -ms-flexbox;\n");
      out.write("  display: flex;\n");
      out.write("  flex-wrap: wrap;\n");
      out.write("  width: 100%;\n");
      out.write("  height: 80px;\n");
      out.write("  background-color: #4D4845;\n");
      out.write("  justify-content: center;\n");
      out.write("  align-items: center;\n");
      out.write("  position: relative;\n");
      out.write("  -webkit-transition: all 0.3s;\n");
      out.write("  -o-transition: all 0.3s;\n");
      out.write("  -moz-transition: all 0.3s;\n");
      out.write("  transition: all 0.3s;\n");
      out.write("  list-style-type: none;\n");
      out.write("  overflow: hidden;\n");
      out.write("}\n");
      out.write(".logo {\n");
      out.write("  display: block;\n");
      out.write("  position: absolute;\n");
      out.write("  left: 52px;\n");
      out.write("  top: 50%;\n");
      out.write("  -webkit-transform: translateY(-50%);\n");
      out.write("  -moz-transform: translateY(-50%);\n");
      out.write("  -ms-transform: translateY(-50%);\n");
      out.write("  -o-transform: translateY(-50%);\n");
      out.write("  transform: translateY(-50%);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".logo img {\n");
      out.write("  max-height: 50px;\n");
      out.write("}\n");
      out.write(".main_menu {\n");
      out.write("  list-style-type: none;\n");
      out.write("  margin: 0px;\n");
      out.write("  display: -webkit-box;\n");
      out.write("  display: -webkit-flex;\n");
      out.write("  display: -moz-box;\n");
      out.write("  display: -ms-flexbox;\n");
      out.write("  display: flex;\n");
      out.write("  flex-wrap: wrap;\n");
      out.write("  align-items: center;\n");
      out.write("  justify-content: center;\n");
      out.write("}\n");
      out.write(".main_menu > li {\n");
      out.write("  display: block;\n");
      out.write("  position: relative;\n");
      out.write("  padding-top: 20px;  \n");
      out.write("  padding-bottom: 20px; \n");
      out.write("  padding-left: 15px;\n");
      out.write("  padding-right: 15px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".main_menu > li > a {\n");
      out.write("  font-family: Segoe UI;\n");
      out.write("  font-size: 15px;\n");
      out.write("  color: white;\n");
      out.write("  padding: 0;\n");
      out.write("}\n");
      out.write("/* icon */\n");
      out.write(".header-icons {\n");
      out.write("  display: -webkit-box;\n");
      out.write("  display: -webkit-flex;\n");
      out.write("  display: -moz-box;\n");
      out.write("  display: -ms-flexbox;\n");
      out.write("  display: flex;\n");
      out.write("  align-items: center;\n");
      out.write("  position: absolute;\n");
      out.write("  right: 52px;\n");
      out.write("  top: 50%;\n");
      out.write("  -webkit-transform: translateY(-50%);\n");
      out.write("  -moz-transform: translateY(-50%);\n");
      out.write("  -ms-transform: translateY(-50%);\n");
      out.write("  -o-transform: translateY(-50%);\n");
      out.write("  transform: translateY(-50%);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".header-wrapicon1,\n");
      out.write(".header-wrapicon2 {\n");
      out.write("  height: 27px;\n");
      out.write("  position: relative;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".header-wrapicon1 img,\n");
      out.write(".header-wrapicon2 img {\n");
      out.write("  height: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".header-icon1:hover,\n");
      out.write(".header-icon2:hover {\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write(".linedivide1 {\n");
      out.write("  display: block;\n");
      out.write("  height: 20px;\n");
      out.write("  width: 1px;\n");
      out.write("  background-color: #e5e5e5;\n");
      out.write("  margin-left: 23px;\n");
      out.write("  margin-right: 23px;\n");
      out.write("  margin-top: 5px;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"header\">\n");
      out.write("    <!--Logo-->\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <a href=\"Home.jsp\" class=\"logo\">\n");
      out.write("            <img src=\"img/logo-demo2.png\" alt=\"IMG-LOGO\">\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("        <!--Menu -->\t\n");
      out.write("        <div class=\"wrap_menu\">\n");
      out.write("                <ul class=\"main_menu\">\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"BookLst.jsp\">BOOK</a>\n");
      out.write("                    </li> \n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"Register.jsp\">SIGN UP</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"Login.jsp\">SIGN IN</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("            <div class=\"header-icons\">\n");
      out.write("\t\t<a href=\"ShowItemInCart.jsp\" class=\"header-wrapicon1 dis-block\">\n");
      out.write("                    <img src=\"img/shopping-cart.png\" class=\"header-icon1\" alt=\"cart\">\n");
      out.write("\t\t</a>\n");
      out.write("\t\t<span class=\"linedivide1\"></span>\n");
      out.write("                    <div class=\"header-wrapicon2\">\n");
      out.write("                        <a href=\"#\" class=\"header-wrapicon1 dis-block\">\n");
      out.write("                        <img src=\"img/magnifying-glass.png\" class=\"header-icon1 js-show-header-dropdown\" alt=\"search\">\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("            </div>\n");
      out.write("\t</div>\n");
      out.write("    </body>\n");
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
