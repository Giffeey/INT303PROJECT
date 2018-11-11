package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<style>\n");
      out.write("body {\n");
      out.write("    font-family: Arial, Helvetica, sans-serif;\n");
      out.write("    background-image: url(\"./img/r1.png\");\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=text], select, textarea {\n");
      out.write("    width: 50%;\n");
      out.write("    padding: 12px;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("    margin-top: 6px;\n");
      out.write("    margin-bottom: 16px;\n");
      out.write("    resize: vertical;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button[type=button] {\n");
      out.write("    background-color: #5F9EA0;\n");
      out.write("    color: white;\n");
      out.write("    padding: 12px 20px;\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write("button[type=submit] {\n");
      out.write("    background-color: #5F9EA0;\n");
      out.write("    color: white;\n");
      out.write("    padding: 12px 20px;\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button[type=button]:hover {\n");
      out.write("    background-color: #73B2B4;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("    width: 30%;\n");
      out.write("    text-align: center;\n");
      out.write("    border-radius: 5px;\n");
      out.write("    background-color:rgba(50,50,50,0.6);\n");
      out.write("    margin-right: auto;\n");
      out.write("    margin-left: auto;\n");
      out.write("    margin-top: 150px;\n");
      out.write("    margin-bottom: auto;\n");
      out.write("    padding: 20px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    <h3 >Login your Account</h3>\n");
      out.write("  <form action=\"loginservlet\">\n");
      out.write("    <label for=\"email2\" class=\"mb-2 mr-sm-2\">Email</label><br>\n");
      out.write("    <input type=\"text\" class=\"form-control mb-2 mr-sm-2\" id=\"email2\" placeholder=\"Enter email\"><br>\n");
      out.write("    <label for=\"pwd2\" class=\"mb-2 mr-sm-2\">Password</label><br>\n");
      out.write("    <input type=\"text\" class=\"form-control mb-2 mr-sm-2\" id=\"pwd2\" placeholder=\"Enter password\"><br>\n");
      out.write("    <div class=\"form-check mb-2 mr-sm-2\">\n");
      out.write("      <label class=\"form-check-label\">\n");
      out.write("        <input class=\"form-check-input \"type=\"checkbox\"> Remember me\n");
      out.write("      </label>\n");
      out.write("    </div><br>    \n");
      out.write("    <button type=\"submit\" class=\"btn btn-primary mb-2\">Login</button>\n");
      out.write("    <a href=\"./CreateA.html\"><button type=\"button\" class=\"btn btn-primary mb-2\">Create Account</button></a>\n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
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
