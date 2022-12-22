package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!--\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"> \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\" integrity=\"sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\" integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-image: url('img/carousel1.jpeg'); background-repeat: no-repeat; background-attachment: fixed;\n");
      out.write("  background-size: 100% 100%; \">\n");
      out.write("      <div class=\"container\">\n");
      out.write("            <div class=\"row\">  \n");
      out.write("            <div>\n");
      out.write("                <form action=\"adminlogincheck.jsp\" method=\"POST\" >\n");
      out.write("                    \n");
      out.write("                 <div class=\"form-group\">\n");
      out.write("                     <h2>Login</h2>\n");
      out.write("                </div>    \n");
      out.write("     \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                   <label>User Name</label>\n");
      out.write("                   <input type=\"text\" name=\"uname\" class=\"form-control\"> \n");
      out.write("                </div>\n");
      out.write("               \n");
      out.write("                 <div class=\"form-group\">\n");
      out.write("                   <label>Password</label>\n");
      out.write("                     <input type=\"password\" name=\"pass\" class=\"form-control\">\n");
      out.write("                </div>\n");
      out.write(" \n");
      out.write("                    \n");
      out.write("               <div class=\"form-group\">        \n");
      out.write("                <button type=\"submit\" class=\"btn btn-success\">Submit</button>\n");
      out.write("               </div>    \n");
      out.write("                \n");
      out.write("              </form>  \n");
      out.write("           </div>       \n");
      out.write("           </div>   \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("-->\n");
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
