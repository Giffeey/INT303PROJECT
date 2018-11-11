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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\t<div class=\"nav\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li><img class=\"logobar\" src=\"./pic/logo.jpg\"></li>\n");
      out.write("\t\t\t\t<br>\n");
      out.write("\t\t\t\t<li><a href=\"index.html\">HOME</a> </li>\n");
      out.write("\t\t\t\t<li><a class=\"active\" href=\"product.html\">PRODUCT</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"about.html\">ABOUT US</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"loginRegister.html\">LOGIN/REGISTER</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t<div class=\"option\">\n");
      out.write("\t\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"catalog\">\n");
      out.write("\n");
      out.write("\t\t<div class=\"space\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t<div class=\"category\">\n");
      out.write("\t\t\t\t\t\t<a href=\"product.html\"><h1>ALL</h1></a>\n");
      out.write("\t\t\t\t\t\t<a href=\"backpack.html\">Backpack</a><br>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\">Shoulder Bag</a><br>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\">Tote Bag</a><br>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\">Body Bag</a><br>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\">Boston Bag</a><br>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\">Clutch Bag</a><br>\n");
      out.write("\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\">Women+</a><br>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\">Men+</a><br>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<span class=\"productPic\"><center><img class=\"pic\" src=\"./pic/anello1.jpg\"></center></span>\n");
      out.write("\t\t<span class=\"productName\"><a class=\"product\" href=\"retrostar.html\">RETROSTAR/BP Cotton Nylon Backpack</a></span><br>\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t\t<span class=\"productPic\"><center><img class=\"pic\" src=\"./pic/anello8.jpg\"></center></span>\n");
      out.write("\t\t\t<span class=\"productName\"><a class=\"product\" href=\"#\">M.F Beta Multi-purpose Backpack</a></span><br>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t\t<span class=\"productPic\"><center><img class=\"pic\" src=\"./pic/anello9.jpg\"></center></span>\n");
      out.write("\t\t\t<span class=\"productName\"><a class=\"product\" href=\"#\">Mottled Sweatshirt Fabric Hinge Clasp Backpack</a></span><br>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t\t<span class=\"productPic\"><center><img class=\"pic\" src=\"./pic/anello2.jpg\"></center></span>\n");
      out.write("\t\t\t<span class=\"productName\"><a class=\"product\" href=\"#\">3 Way Backpack</a></span><br>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<span class=\"productPic\"><center><img class=\"pic\" src=\"./pic/anello5.jpg\"></center></span>\n");
      out.write("\t\t\t\t<span class=\"productName\"><a class=\"product\" href=\"#\">Daypack</a></span><br>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<span class=\"productPic\"><center><img class=\"pic\" src=\"./pic/anello6.jpg\"></center></span>\n");
      out.write("\t\t\t\t<span class=\"productName\"><a class=\"product\" href=\"#\">Logo Print Oval Backpack</a></span><br>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<span class=\"productPic\"><center><img class=\"pic\" src=\"./pic/anello10.jpg\"></center></span>\n");
      out.write("\t\t\t\t\t<span class=\"productName\"><a class=\"product\" href=\"#\">Cotton Canvas Hinge Clasp Backpack</a></span><br>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<span class=\"productPic\"><center><img class=\"pic\" src=\"./pic/anello12.jpg\"></center></span>\n");
      out.write("\t\t\t\t\t<span class=\"productName\"><a class=\"product\" href=\"#\">Canvas Hinge Clasp Mini Backpack</a></span><br>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<span class=\"productPic\"><center><img class=\"pic\" src=\"./pic/anello13.jpg\"></center></span>\n");
      out.write("\t\t\t\t\t<span class=\"productName\"><a class=\"product\" href=\"#\">Cotton Canvas Hinged Clasp Mini Backpack</a></span><br>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<span class=\"productPic\"><center><img class=\"pic\" src=\"./pic/anello16.jpg\"></center></span>\n");
      out.write("\t\t\t\t\t<span class=\"productName\"><a class=\"product\" href=\"#\">Vertical Crossbody Bag</a></span><br>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<span class=\"productPic\"><center><img class=\"pic\" src=\"./pic/anello19.jpg\"></center></span>\n");
      out.write("\t\t\t\t\t<span class=\"productName\"><a class=\"product\" href=\"#\">Premium Hinged Class Daypack</a></span><br>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<span class=\"productPic\"><center><img class=\"pic\" src=\"./pic/anello23.jpg\"></center></span>\n");
      out.write("\t\t\t\t\t<span class=\"productName\"><a class=\"product\" href=\"#\">Canvas Hinge Clasp Mini Backpack</a></span><br>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<span class=\"productPic\"><center><img class=\"pic\" src=\"./pic/anello20.jpg\"></center></span>\n");
      out.write("\t\t\t\t\t<span class=\"productName\"><a class=\"product\" href=\"#\">URBAN STREET Backpack</a></span><br>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<span class=\"productPic\"><center><img class=\"pic\" src=\"./pic/anello24.jpg\"></center></span>\n");
      out.write("\t\t\t\t\t<span class=\"productName\"><a class=\"product\" href=\"#\">Cotton Canvas Hinged Clasp Mini Backpack</a></span><br>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<span class=\"productPic\"><center><img class=\"pic\" src=\"./pic/anello30.jpg\"></center></span>\n");
      out.write("\t\t\t\t\t<span class=\"productName\"><a class=\"product\" href=\"#\">2 Shoulder-Styles Multi-purpose Backpack</a></span><br>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"page\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"backpack.html\">&lt;</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a class=\"active\" href=\"backpack.html\">1</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">2</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">3</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">&gt;</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t\n");
      out.write("\t<div class=\"footer\">\n");
      out.write("\t&copy; anello® shop by suphawan choocherd\n");
      out.write("\t</div>\n");
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
