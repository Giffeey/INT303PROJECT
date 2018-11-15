package org.apache.jsp.img;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <style>\n");
      out.write("            .footer-distributed{\n");
      out.write("\tbackground-color: #292c2f;\n");
      out.write("\tbox-shadow: 0 1px 1px 0 rgba(0, 0, 0, 0.12);\n");
      out.write("\tbox-sizing: border-box;\n");
      out.write("\twidth: 100%;\n");
      out.write("\ttext-align: left;\n");
      out.write("\tfont: normal 16px sans-serif;\n");
      out.write("\n");
      out.write("\tpadding: 45px 50px;\n");
      out.write("\tmargin-top: 80px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".footer-distributed .footer-left p{\n");
      out.write("\tcolor:  #8f9296;\n");
      out.write("\tfont-size: 14px;\n");
      out.write("\tmargin: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Footer links */\n");
      out.write("\n");
      out.write(".footer-distributed p.footer-links{\n");
      out.write("\tfont-size:18px;\n");
      out.write("\tfont-weight: bold;\n");
      out.write("\tcolor:  #ffffff;\n");
      out.write("\tmargin: 0 0 10px;\n");
      out.write("\tpadding: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".footer-distributed p.footer-links a{\n");
      out.write("\tdisplay:inline-block;\n");
      out.write("\tline-height: 1.8;\n");
      out.write("\ttext-decoration: none;\n");
      out.write("\tcolor:  inherit;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".footer-distributed .footer-right{\n");
      out.write("\tfloat: right;\n");
      out.write("\tmargin-top: 6px;\n");
      out.write("\tmax-width: 180px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".footer-distributed .footer-right a{\n");
      out.write("\tdisplay: inline-block;\n");
      out.write("\twidth: 35px;\n");
      out.write("\theight: 35px;\n");
      out.write("\tbackground-color:  #33383b;\n");
      out.write("\tborder-radius: 2px;\n");
      out.write("\n");
      out.write("\tfont-size: 20px;\n");
      out.write("\tcolor: #ffffff;\n");
      out.write("\ttext-align: center;\n");
      out.write("\tline-height: 35px;\n");
      out.write("\n");
      out.write("\tmargin-left: 3px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* If you don't want the footer to be responsive, remove these media queries */\n");
      out.write("\n");
      out.write("@media (max-width: 600px) {\n");
      out.write("\n");
      out.write("\t.footer-distributed .footer-left,\n");
      out.write("\t.footer-distributed .footer-right{\n");
      out.write("\t\ttext-align: center;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t.footer-distributed .footer-right{\n");
      out.write("\t\tfloat: none;\n");
      out.write("\t\tmargin: 0 auto 20px;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t.footer-distributed .footer-left p.footer-links{\n");
      out.write("\t\tline-height: 1.8;\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <footer class=\"footer-distributed\">\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"footer-right\">\n");
      out.write("\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <i class=\"fa fa-facebook\">\n");
      out.write("                                    <img src=\"facebook.png\">\n");
      out.write("                                </i>\n");
      out.write("                            </a>\n");
      out.write("\t\t\t\t<a href=\"#\">\n");
      out.write("                                    <i class=\"fa fa-twitter\">\n");
      out.write("                                        <img src=\"twitter.png\">\n");
      out.write("                                    </i>\n");
      out.write("                                </a>\n");
      out.write("\t\t\t\t<a href=\"#\"><i class=\"fa fa-linkedin\"></i></a>\n");
      out.write("\t\t\t\t<a href=\"#\"><i class=\"fa fa-github\"></i></a>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"footer-left\">\n");
      out.write("\n");
      out.write("\t\t\t\t<p class=\"footer-links\">\n");
      out.write("\t\t\t\t\t<a href=\"#\">Home</a>\n");
      out.write("\t\t\t\t\t·\n");
      out.write("\t\t\t\t\t<a href=\"#\">Blog</a>\n");
      out.write("\t\t\t\t\t·\n");
      out.write("\t\t\t\t\t<a href=\"#\">Pricing</a>\n");
      out.write("\t\t\t\t\t·\n");
      out.write("\t\t\t\t\t<a href=\"#\">About</a>\n");
      out.write("\t\t\t\t\t·\n");
      out.write("\t\t\t\t\t<a href=\"#\">Faq</a>\n");
      out.write("\t\t\t\t\t·\n");
      out.write("\t\t\t\t\t<a href=\"#\">Contact</a>\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\n");
      out.write("\t\t\t\t<p>Company Name &copy; 2015</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t</footer>\n");
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
