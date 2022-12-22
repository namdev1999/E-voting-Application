package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/logincss.css\">\n");
      out.write("        <script type=\"text/javascript\" src=\"assets/js/userjs.js\"></script>\n");
      out.write("         <script type=\"text/javascript\" src=\"assets/js/jquery.js\"></script>\n");
      out.write("         <script src=\"//code.jquery.com/jquery-1.11.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        \n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("           var  status = true;\n");
      out.write("            function validateForm(){\n");
      out.write("            \n");
      out.write("                pass=document.getElementById(\"pass\").value;\n");
      out.write("                cpass =document.getElementById(\"cpass\").value;\n");
      out.write("             \n");
      out.write("               \n");
      out.write("              \n");
      out.write("              \n");
      out.write("               if(pass!=cpass)\n");
      out.write("                {\n");
      out.write("                    document.getElementById(\"s1\").innerHTML=\"Password and confirm password doesn't matched\";\n");
      out.write("                  status=false;\n");
      out.write("                }\n");
      out.write("                return status;\n");
      out.write("                              \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("           \n");
      out.write("            \n");
      out.write("            \n");
      out.write("           \n");
      out.write(" \n");
      out.write("           </script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <div class=\"container\" id=\"container\">\n");
      out.write("      <div class=\"form-container sign-up-container\">\n");
      out.write("        <form>\n");
      out.write("         \n");
      out.write("          <input type=\"text\" placeholder=\"Name\" />\n");
      out.write("          <input type=\"email\" placeholder=\"Email\" />\n");
      out.write("          <input type=\"password\" placeholder=\"Password\" />\n");
      out.write("          <button onclick=\"return false;\">Sign Up</button>\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"form-container sign-in-container\">\n");
      out.write("        <form action=\"Controller?op=login\" method=\"post\" class=\"form\">\n");
      out.write("            <input type=\"hidden\" name=\"req\" value=\"login\"/>\n");
      out.write("          <h1>Sign In</h1>\n");
      out.write("          \n");
      out.write("          \n");
      out.write("          <input type=\"text\" placeholder=\"ScholarNo\"  name=\"ScholarNo\"/>\n");
      out.write("          \n");
      out.write("          <input type=\"password\" placeholder=\"Password\" name=\"Password\" />\n");
      out.write("          <a href=\"#\">Forgot your password?</a>\n");
      out.write("          <button type=\"submit\"  value=\"Submit\">Sign In</button>\n");
      out.write("          \n");
      out.write("          ");
      out.write("\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"overlay-container\">\n");
      out.write("        <div class=\"overlay\">\n");
      out.write("          <div class=\"overlay-panel overlay-left\">\n");
      out.write("            <h1>Welcome Back!</h1>\n");
      out.write("            <p>Please login with your personal info</p>\n");
      out.write("            <button class=\"ghost\" id=\"signIn\">Sign In</button>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"overlay-panel overlay-right\">\n");
      out.write("            <h1>Not registered yet?</h1>\n");
      out.write("            <h2> register here</h2>\n");
      out.write("            \n");
      out.write("          <form action=\"Controller?op=add\" method=\"post\" class=\"form\" onsubmit=\"return validateForm()\">\n");
      out.write("            <input type=\"hidden\" name=\"req\" value=\"add\"/>\n");
      out.write("         \n");
      out.write("          <input type=\"text\" placeholder=\"Name\" name=\"Name\" required=\"required\"/>\n");
      out.write("          <input type=\"text\" placeholder=\"Mobile no.\" id=\"PhoneNo\" name=\"PhoneNo\" required=\"required\"/>\n");
      out.write("          <input type=\"number\" placeholder=\"Scholar no.\" name=\"ScholarNo\" id=\"ScholarNo\" required=\"required\" />\n");
      out.write("          <span id=\"s4\" style=\"color:black \"  ></span>\n");
      out.write("          \n");
      out.write("          <input type=\"password\" placeholder=\"Password\" id=\"pass\" name=\"Password\" required=\"required\" onfocus=\"s1.innerHTML='';\" pattern=\"(?=^.{8,}$)((?=.*\\d)|(?=.*\\W+))(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$\"/>\n");
      out.write("          <input type=\"password\" placeholder=\"Confirm Password\" name=\"cpass\" id=\"cpass\" required=\"required\" onfocus=\"s1.innerHTML='';\" />\n");
      out.write("          <span id=\"s1\" style=\"color:black \"  ></span>\n");
      out.write("         <button type=\"submit\"  value=\"Submit\">Sign Up</button>\n");
      out.write("          \n");
      out.write("        </form>.\n");
      out.write("          \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("       <script type=\"text/javascript\">\n");
      out.write("           \n");
      out.write("           //var status =true;\n");
      out.write("           \n");
      out.write("           function validate(){\n");
      out.write("               return \n");
      out.write("           }\n");
      out.write("         \n");
      out.write("        $(\"#ScholarNo\").blur(function(){\n");
      out.write("           \n");
      out.write("            xml = new XMLHttpRequest();\n");
      out.write("            xml.open(\"GET\", \"Controller?op=checkid&ScholarNo=\"+$(this).val()+\"&PhoneNo=\"+$(\"#PhoneNo\").val(),true);\n");
      out.write("            xml.send();\n");
      out.write("            \n");
      out.write("            xml.onreadystatechange = function(){\n");
      out.write("                if(this.readyState==4 && this.status==200){\n");
      out.write("                    result = this.responseText;\n");
      out.write("                    \n");
      out.write("                    if(result.contains(\"sorry\")|| or result.contains(\"No\")) \n");
      out.write("\n");
      out.write("                    status = false;\n");
      out.write("                    $(\"#s4\").html(result);\n");
      out.write("                }\n");
      out.write("            };\n");
      out.write("        });\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        </script>\n");
      out.write("\n");
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
