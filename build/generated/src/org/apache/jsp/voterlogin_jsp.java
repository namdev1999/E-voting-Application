package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class voterlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("         <link href=\"assets/css/bootstrap.min.css\" type=\"text/css\" rel=\"stylesheet\"/>\n");
      out.write("         <link rel=\"stylesheet\" href=\"assets/css/newcss.css\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <script src=\"assets/js/bootstrap.min.js\" type=\"text/js\"></script>\n");
      out.write("        \n");
      out.write("        <title>Admin Login</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-3 col-md-2\"></div>\n");
      out.write("            <div class=\"col-lg-6 col-md-8 login-box\">\n");
      out.write("                <div class=\"col-lg-12 login-key\">\n");
      out.write("                    <i class=\"fa fa-key\" aria-hidden=\"true\"></i>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-12 login-title\">\n");
      out.write("                    ADMIN PANEL\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-lg-12 login-form\">\n");
      out.write("                    <div class=\"col-lg-12 login-form\">\n");
      out.write("                        <form action=\"adminlogincheck.jsp\" method=\"POST\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"form-control-label\">USERNAME</label>\n");
      out.write("                                <input type=\"text\" name=\"uname\" class=\"form-control\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"form-control-label\">PASSWORD</label>\n");
      out.write("                                <input type=\"password\" name=\"pass\" class=\"form-control\" i>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"col-lg-12 loginbttm\">\n");
      out.write("                                <div class=\"col-lg-6 login-btm login-text\">\n");
      out.write("                                    <!-- Error Message -->\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-lg-6 login-btm login-button\">\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-outline-primary\">LOGIN</button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-3 col-md-2\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </body>\n");
      out.write("\n");
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
