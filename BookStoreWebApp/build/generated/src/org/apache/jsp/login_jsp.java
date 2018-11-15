package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<style>\r\n");
      out.write("body {\r\n");
      out.write("    font-family: Arial, Helvetica, sans-serif;\r\n");
      out.write("    background-image: url(\"./img/r1.png\");\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=text], select, textarea {\r\n");
      out.write("    width: 50%;\r\n");
      out.write("    padding: 12px;\r\n");
      out.write("    border: 1px solid #ccc;\r\n");
      out.write("    border-radius: 4px;\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("    margin-top: 6px;\r\n");
      out.write("    margin-bottom: 16px;\r\n");
      out.write("    resize: vertical;\r\n");
      out.write("}\r\n");
      out.write("input[type=password], select, textarea {\r\n");
      out.write("    width: 50%;\r\n");
      out.write("    padding: 12px;\r\n");
      out.write("    border: 1px solid #ccc;\r\n");
      out.write("    border-radius: 4px;\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("    margin-top: 6px;\r\n");
      out.write("    margin-bottom: 16px;\r\n");
      out.write("    resize: vertical;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button[type=button] {\r\n");
      out.write("    background-color: #5F9EA0;\r\n");
      out.write("    color: white;\r\n");
      out.write("    padding: 12px 20px;\r\n");
      out.write("    border: none;\r\n");
      out.write("    border-radius: 4px;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("button[type=submit] {\r\n");
      out.write("    background-color: #5F9EA0;\r\n");
      out.write("    color: white;\r\n");
      out.write("    padding: 12px 20px;\r\n");
      out.write("    border: none;\r\n");
      out.write("    border-radius: 4px;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button[type=button]:hover {\r\n");
      out.write("    background-color: #73B2B4;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".container {\r\n");
      out.write("    width: 30%;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    background-color:rgba(50,50,50,0.6);\r\n");
      out.write("    margin-right: auto;\r\n");
      out.write("    margin-left: auto;\r\n");
      out.write("    margin-top: 150px;\r\n");
      out.write("    margin-bottom: auto;\r\n");
      out.write("    padding: 20px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <h3 >Login your Account</h3>\r\n");
      out.write("    <form action=\"Login\" method=\"post\">\r\n");
      out.write("    <label for=\"email2\" class=\"mb-2 mr-sm-2\">username</label><br>\r\n");
      out.write("    <input type=\"text\" class=\"form-control mb-2 mr-sm-2\" id=\"email2\" name=\"username\" placeholder=\"Enter username\"><br>\r\n");
      out.write("    <label for=\"pwd2\" class=\"mb-2 mr-sm-2\">Password</label><br>\r\n");
      out.write("    <input type=\"password\" class=\"form-control mb-2 mr-sm-2\" id=\"pwd2\" name=\"password\" placeholder=\"Enter password\"><br>\r\n");
      out.write("    <div class=\"form-check mb-2 mr-sm-2\">\r\n");
      out.write("     ");
      out.write("\r\n");
      out.write("    </div><br>    \r\n");
      out.write("    <button type=\"submit\" class=\"btn btn-primary mb-2\">Login</button>\r\n");
      out.write("    <a href=\"./CreateA.html\"><button type=\"button\" class=\"btn btn-primary mb-2\">Create Account</button></a>\r\n");
      out.write("  </form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
