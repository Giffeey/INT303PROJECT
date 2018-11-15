package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script> \n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("<style>\n");
      out.write("/*@import url(https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css);\n");
      out.write("@import url(https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.4.3/css/mdb.min.css);*/\n");
      out.write("\n");
      out.write(".hm-gradient {\n");
      out.write("    background-image: linear-gradient(to top, #f3e7e9 0%, #e3eeff 99%, #e3eeff 100%);\n");
      out.write("}\n");
      out.write(".darken-grey-text {\n");
      out.write("    color: #2E2E2E;\n");
      out.write("}\n");
      out.write(".danger-text {\n");
      out.write("    color: #ff3547; }\n");
      out.write(".default-text {\n");
      out.write("    color: #2BBBAD; \n");
      out.write("}\n");
      out.write(".info-text {\n");
      out.write("    color: #33b5e5; \n");
      out.write("}\n");
      out.write(".form-white .md-form label {\n");
      out.write("  color: #fff; \n");
      out.write("}\n");
      out.write(".form-white input[type=text]:focus:not([readonly]) {\n");
      out.write("    border-bottom: 1px solid #fff;\n");
      out.write("    -webkit-box-shadow: 0 1px 0 0 #fff;\n");
      out.write("    box-shadow: 0 1px 0 0 #fff; \n");
      out.write("}\n");
      out.write(".form-white input[type=text]:focus:not([readonly]) + label {\n");
      out.write("    color: #fff; \n");
      out.write("}\n");
      out.write(".form-white input[type=password]:focus:not([readonly]) {\n");
      out.write("    border-bottom: 1px solid #fff;\n");
      out.write("    -webkit-box-shadow: 0 1px 0 0 #fff;\n");
      out.write("    box-shadow: 0 1px 0 0 #fff; \n");
      out.write("}\n");
      out.write("        </style> \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Head.jsp", out, false);
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"row\">\n");
      out.write("                <!-- Grid column -->\n");
      out.write("                <div class=\"col-md-6 mb-4\">\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <h3 class=\"text-center default-text py-3\"><i class=\"fa fa-lock\"></i> SIGN IN</h3>\n");
      out.write("                            <!--Body-->\n");
      out.write("                            <div class=\"md-form\">\n");
      out.write("                                <i class=\"fa fa-envelope prefix grey-text\"></i>\n");
      out.write("<!--                                <input type=\"text\" id=\"fname\" class=\"form-control\">\n");
      out.write("                                <label for=\"firstname\">First Name</label>-->\n");
      out.write("                                <input type=\"text\" class=\"form-control mb-2 mr-sm-2\" id=\"fname\" name=\"firstname\" placeholder=\"First Name\"><br>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"md-form\">\n");
      out.write("                                <i class=\"fa fa-lock prefix grey-text\"></i>\n");
      out.write("<!--                                <input type=\"text\" id=\"lname\" class=\"form-control\">\n");
      out.write("                                <label for=\"lastname\">Last Name</label>-->\n");
      out.write("                                <input type=\"text\" class=\"form-control mb-2 mr-sm-2\" id=\"lname\" name=\"lastname\" placeholder=\"Last Name\"><br>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"md-form\">\n");
      out.write("                                <i class=\"fa fa-lock prefix grey-text\"></i>\n");
      out.write("<!--                                <input type=\"text\" id=\"username\" class=\"form-control\">\n");
      out.write("                                <label for=\"username\">User Name</label>-->\n");
      out.write("                                <input type=\"text\" class=\"form-control mb-2 mr-sm-2\" id=\"user\" name=\"username\" placeholder=\"User Name\"><br>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"md-form\">\n");
      out.write("                                <i class=\"fa fa-lock prefix grey-text\"></i>\n");
      out.write("<!--                                <input type=\"password\" id=\"pwd\" class=\"form-control\">\n");
      out.write("                                <label for=\"password\">Password</label>-->\n");
      out.write("                                <input type=\"password\" class=\"form-control mb-2 mr-sm-2\" id=\"psw\" name=\"password\" placeholder=\"Password\"><br>\n");
      out.write("                            </div>\n");
      out.write("<!--                            <div class=\"md-form\">\n");
      out.write("                                <i class=\"fa fa-lock prefix grey-text\"></i>\n");
      out.write("                                <input type=\"password\" id=\"pwd\" class=\"form-control\">\n");
      out.write("                                <label for=\"password\">Password</label>\n");
      out.write("                            </div>-->\n");
      out.write("                            <div class=\"md-form\">\n");
      out.write("                                <i class=\"fa fa-lock prefix grey-text\"></i>\n");
      out.write("<!--                                <input type=\"text\" id=\"phone\" class=\"form-control\">\n");
      out.write("                                <label for=\"phone\">Phone</label>-->\n");
      out.write("                                <input type=\"text\" class=\"form-control mb-2 mr-sm-2\" id=\"tel\" name=\"phone\" placeholder=\"Phone\"><br>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"md-form\">\n");
      out.write("                                <i class=\"fa fa-lock prefix grey-text\"></i>\n");
      out.write("<!--                                <input type=\"text\" id=\"email\" class=\"form-control\">\n");
      out.write("                                <label for=\"email\">E-Mail</label>-->\n");
      out.write("                                <input type=\"text\" class=\"form-control mb-2 mr-sm-2\" id=\"email\" name=\"email\" placeholder=\"E-mail\"><br>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"md-form\">\n");
      out.write("                                <i class=\"fa fa-lock prefix grey-text\"></i>\n");
      out.write("<!--                                <input type=\"text\" id=\"address\" class=\"form-control\">\n");
      out.write("                                <label for=\"address\">Address</label>-->\n");
      out.write("                                <input type=\"text\" class=\"form-control mb-2 mr-sm-2\" id=\"add\" name=\"address\" placeholder=\"Address\"><br>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"md-form\">\n");
      out.write("                                <i class=\"fa fa-lock prefix grey-text\"></i>\n");
      out.write("                                <input type=\"text\" class=\"form-control mb-2 mr-sm-2\" id=\"dis\" name=\"district\" placeholder=\"District\"><br>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"md-form\">\n");
      out.write("                                <i class=\"fa fa-lock prefix grey-text\"></i>\n");
      out.write("                                <input type=\"text\" class=\"form-control mb-2 mr-sm-2\" id=\"amp\" name=\"amphur\" placeholder=\"Amphur\"><br>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"md-form\">\n");
      out.write("                                <i class=\"fa fa-lock prefix grey-text\"></i>\n");
      out.write("                                <input type=\"text\" class=\"form-control mb-2 mr-sm-2\" id=\"pv\" name=\"province\" placeholder=\"Province\"><br>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"md-form\">\n");
      out.write("                                <i class=\"fa fa-lock prefix grey-text\"></i>\n");
      out.write("                                <input type=\"text\" class=\"form-control mb-2 mr-sm-2\" id=\"zip\" name=\"zipcode\" placeholder=\"Zip Code\"><br>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"text-center\">\n");
      out.write("                                <button class=\"btn btn-default waves-effect waves-light\">SIGN IN</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("        </div>\n");
      out.write(" \n");
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
