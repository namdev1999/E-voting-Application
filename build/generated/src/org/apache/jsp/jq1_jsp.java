package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class jq1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <script src=\"assets/js/jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"assets/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"assets/css/bootstrap.min.css\" type=\"text/css\" rel=\"stylesheet\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h2>Jquery Example </h2>\n");
      out.write("        \n");
      out.write("        <input type=\"button\" id=\"b1\" value=\"Button 1\" class=\"btn btn-success\"/>\n");
      out.write("        <input type=\"button\" id=\"b2\" value=\"Button 2\" class=\"btn btn-primary\"/>\n");
      out.write("        <br/>\n");
      out.write("        <p id=\"p1\" style=\"width:400px;height: 200px;border-style: solid;border-width: 2px\">\n");
      out.write("            \n");
      out.write("        </p>\n");
      out.write("        \n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("     $(\"#b1\").click(function(){\n");
      out.write("                alert('hello all');\n");
      out.write("            });\n");
      out.write("     \n");
      out.write("           \n");
      out.write("        </script>\n");
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
