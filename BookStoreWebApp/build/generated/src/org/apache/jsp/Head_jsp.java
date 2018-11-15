package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Head_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_when_test.release();
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\r\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script> \r\n");
      out.write("        <style>\r\n");
      out.write(".header {\r\n");
      out.write("  display: -webkit-box;\r\n");
      out.write("  display: -webkit-flex;\r\n");
      out.write("  display: -moz-box;\r\n");
      out.write("  display: -ms-flexbox;\r\n");
      out.write("  display: flex;\r\n");
      out.write("  flex-wrap: wrap;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  height: 80px;\r\n");
      out.write("  background-color: #4D4845;\r\n");
      out.write("  justify-content: center;\r\n");
      out.write("  align-items: center;\r\n");
      out.write("  position: relative;\r\n");
      out.write("  -webkit-transition: all 0.3s;\r\n");
      out.write("  -o-transition: all 0.3s;\r\n");
      out.write("  -moz-transition: all 0.3s;\r\n");
      out.write("  transition: all 0.3s;\r\n");
      out.write("  list-style-type: none;\r\n");
      out.write("  overflow: hidden;\r\n");
      out.write("}\r\n");
      out.write(".logo {\r\n");
      out.write("  display: block;\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  left: 52px;\r\n");
      out.write("  top: 50%;\r\n");
      out.write("  -webkit-transform: translateY(-50%);\r\n");
      out.write("  -moz-transform: translateY(-50%);\r\n");
      out.write("  -ms-transform: translateY(-50%);\r\n");
      out.write("  -o-transform: translateY(-50%);\r\n");
      out.write("  transform: translateY(-50%);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".logo img {\r\n");
      out.write("  max-height: 50px;\r\n");
      out.write("}\r\n");
      out.write(".main_menu {\r\n");
      out.write("  list-style-type: none;\r\n");
      out.write("  margin: 0px;\r\n");
      out.write("  display: -webkit-box;\r\n");
      out.write("  display: -webkit-flex;\r\n");
      out.write("  display: -moz-box;\r\n");
      out.write("  display: -ms-flexbox;\r\n");
      out.write("  display: flex;\r\n");
      out.write("  flex-wrap: wrap;\r\n");
      out.write("  align-items: center;\r\n");
      out.write("  justify-content: center;\r\n");
      out.write("}\r\n");
      out.write(".main_menu > li {\r\n");
      out.write("  display: block;\r\n");
      out.write("  position: relative;\r\n");
      out.write("  padding-top: 20px;  \r\n");
      out.write("  padding-bottom: 20px; \r\n");
      out.write("  padding-left: 15px;\r\n");
      out.write("  padding-right: 15px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".main_menu > li > a {\r\n");
      out.write("  font-family: Segoe UI;\r\n");
      out.write("  font-size: 15px;\r\n");
      out.write("  color: white;\r\n");
      out.write("  padding: 0;\r\n");
      out.write("}\r\n");
      out.write("/* icon */\r\n");
      out.write(".header-icons {\r\n");
      out.write("  display: -webkit-box;\r\n");
      out.write("  display: -webkit-flex;\r\n");
      out.write("  display: -moz-box;\r\n");
      out.write("  display: -ms-flexbox;\r\n");
      out.write("  display: flex;\r\n");
      out.write("  align-items: center;\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  right: 52px;\r\n");
      out.write("  top: 50%;\r\n");
      out.write("  -webkit-transform: translateY(-50%);\r\n");
      out.write("  -moz-transform: translateY(-50%);\r\n");
      out.write("  -ms-transform: translateY(-50%);\r\n");
      out.write("  -o-transform: translateY(-50%);\r\n");
      out.write("  transform: translateY(-50%);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".header-wrapicon1,\r\n");
      out.write(".header-wrapicon2 {\r\n");
      out.write("  height: 27px;\r\n");
      out.write("  position: relative;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".header-wrapicon1 img,\r\n");
      out.write(".header-wrapicon2 img {\r\n");
      out.write("  height: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".header-icon1:hover,\r\n");
      out.write(".header-icon2:hover {\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write(".linedivide1 {\r\n");
      out.write("  display: block;\r\n");
      out.write("  height: 20px;\r\n");
      out.write("  width: 1px;\r\n");
      out.write("  background-color: #e5e5e5;\r\n");
      out.write("  margin-left: 23px;\r\n");
      out.write("  margin-right: 23px;\r\n");
      out.write("  margin-top: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("li {\r\n");
      out.write("    float: left;\r\n");
      out.write("}\r\n");
      out.write("li a, .dropbtn {\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    color: white;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    padding: 14px 16px;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("li.dropdown {\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown-content {\r\n");
      out.write("    display: none;\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    background-color: #f9f9f9;\r\n");
      out.write("    min-width: 160px;\r\n");
      out.write("    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\r\n");
      out.write("    z-index: 1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown-content a {\r\n");
      out.write("    color: black;\r\n");
      out.write("    padding: 12px 16px;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    display: block;\r\n");
      out.write("    text-align: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown-content a:hover {background-color: #f1f1f1}\r\n");
      out.write("\r\n");
      out.write(".dropdown:hover .dropdown-content {\r\n");
      out.write("    display: block;\r\n");
      out.write("}\r\n");
      out.write("        </style>\r\n");
      out.write("         \r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"header\">\r\n");
      out.write("    <!--Logo-->\r\n");
      out.write("            <div class=\"logo\">\r\n");
      out.write("                <a href=\"Home\" class=\"logo\">\r\n");
      out.write("            <img src=\"img/logo-demo2.png\" alt=\"IMG-LOGO\">\r\n");
      out.write("                </a>\r\n");
      out.write("            </div>\r\n");
      out.write("        <!--Menu -->\t\r\n");
      out.write("        <div class=\"wrap_menu\">\r\n");
      out.write("                <ul class=\"main_menu\">\r\n");
      out.write("\r\n");
      out.write("                    <li class=\"dropdown\">\r\n");
      out.write("                        <a href=\"Booklist.jsp\" class=\"dropbtn\">BOOK</a>\r\n");
      out.write("                            <div class=\"dropdown-content\">\r\n");
      out.write("                                <a href=\"#\">Link 1</a>\r\n");
      out.write("                                <a href=\"#\">Link 2</a>\r\n");
      out.write("                                <a href=\"#\">Link 3</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"BookList.jsp\">BOOK</a>\r\n");
      out.write("                    </li> \r\n");
      out.write("\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"Register.jsp\">SIGN UP</a>\r\n");
      out.write("\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"header-icons\">\r\n");
      out.write("\t\t<a href=\"ShowItemInCart.jsp\" class=\"header-wrapicon1 dis-block\">\r\n");
      out.write("                    <img src=\"img/shopping-cart.png\" class=\"header-icon1\" alt=\"cart\">\r\n");
      out.write("\t\t</a>\r\n");
      out.write("\t\t<span class=\"linedivide1\"></span>\r\n");
      out.write("                    <div class=\"header-wrapicon2\">\r\n");
      out.write("                        <a href=\"#\" class=\"header-wrapicon1 dis-block\">\r\n");
      out.write("                        <img src=\"img/magnifying-glass.png\" class=\"header-icon1 js-show-header-dropdown\" alt=\"search\">\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("    </body>\r\n");
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

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                            ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                <a href=\"Logout\"> LOGOUT </a>\r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                        <a href=\"Login.jsp\">SIGN IN</a>\r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }
}
