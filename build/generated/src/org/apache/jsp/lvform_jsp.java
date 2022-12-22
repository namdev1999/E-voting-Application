package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class lvform_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Live Voting Form</title>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link href=\"assets/css/bootstrap.min.css\" type=\"text/css\" rel=\"stylesheet\"/>\n");
      out.write("        <script src=\"assets/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-image: url('img/concert.jpg');\n");
      out.write("          background-repeat: no-repeat;\n");
      out.write("          background-attachment: fixed;\n");
      out.write("          background-size: 100% 100%;filter: grayscale(100%)\">\n");
      out.write("        <h1 style=\"text-align: center; font-family: Georgia;font-size: 60px;color: wheat\">BE READY FOR LIVE VOTING</h1>\n");
      out.write("        <div >\n");
      out.write("        <form action=\"lv.jsp\" style=\"width: 500px;height: 300px;border-style: solid;border-radius: 20px 20px 20px 20px;margin-left:  400px;margin-top: 100px;background-color: white;\">\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("      <label  style=\"padding-left: 10px;padding-top:10px \"><strong>SCHOLAR NUMBER</strong></label>\n");
      out.write("    <input type=\"text\" class=\"form-control\" aria-describedby=\"emailHelp\" placeholder=\"SCHOLAR NO.\">\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("      <label for=\"exampleInputPassword1\"  style=\"padding-left: 10px;padding-top:10px \"><strong>NAME</strong></label>\n");
      out.write("    <input type=\"text\" class=\"form-control\" id=\"exampleInputPassword1\" placeholder=\"FULL NAME\">\n");
      out.write("  </div>\n");
      out.write("  <div class=\"form-check\">\n");
      out.write("    <input type=\"checkbox\" class=\"form-check-input\" id=\"exampleCheck1\">\n");
      out.write("    <label class=\"form-check-label\" for=\"exampleCheck1\">Check me out</label>\n");
      out.write("  </div>\n");
      out.write("            <button type=\"submit\" class=\"btn btn-dark\" style=\"margin-left: 200px\" onclick=\"window.location.href='lv.jsp'\">Submit</button>\n");
      out.write("</form>\n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("   \n");
      out.write("</html>");
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
