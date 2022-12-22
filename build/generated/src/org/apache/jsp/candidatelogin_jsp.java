package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class candidatelogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('[');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link href=\"assets/css/bootstrap.min.css\" type=\"text/css\" rel=\"stylesheet\"/>\n");
      out.write("        <script src=\"assets/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("   \n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function validateForm(){\n");
      out.write("                gender=document.getElementsByName(\"gender\");\n");
      out.write("                hobbies = document.getElementsByName(\"hobbies\");\n");
      out.write("                pass=document.getElementById(\"pass\").value;\n");
      out.write("                cpass =document.getElementById(\"cpass\").value;\n");
      out.write("               // alert('ok');\n");
      out.write("               g = 0;\n");
      out.write("               h = 0;\n");
      out.write("               \n");
      out.write("               for (i=0;i<gender.length;i++){\n");
      out.write("                   //alert('gender '+gender[i].checked);\n");
      out.write("                   if(gender[i].checked)\n");
      out.write("                       g++;\n");
      out.write("               }\n");
      out.write("               for (j=0;j<hobbies.length;j++) {\n");
      out.write("                  // alert('hobbies : '+ hobbies[i].checked);\n");
      out.write("                   if (hobbies[j].checked)\n");
      out.write("                       h++;\n");
      out.write("               }\n");
      out.write("               if(pass!=cpass)\n");
      out.write("                {\n");
      out.write("                    document.getElementById(\"s1\").innerHTML=\"Password and confirm password doesn't matched\";\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("                if (g==0)\n");
      out.write("                {\n");
      out.write("                   s2.innerHTML=\"Please Select any Gender\";\n");
      out.write("                   return false;\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("                if(h==0)\n");
      out.write("                {\n");
      out.write("                    s3.innerHTML=\"Please Select atleast one hobby \";\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            t =70;\n");
      out.write("            var timer;\n");
      out.write("    function setTimer(){        \n");
      out.write("    timer = setInterval(updateTime,1000);\n");
      out.write("}\n");
      out.write("            function updateTime(){\n");
      out.write("                time.innerHTML =  parseInt(t/60) +\" : \" + t%60;\n");
      out.write("                t = t-1; \n");
      out.write("                if (t==-1){\n");
      out.write("                     clearInterval(timer);\n");
      out.write("                     window.location.assign(\"https://www.google.com\");\n");
      out.write("                }\n");
      out.write("             }   \n");
      out.write("             \n");
      out.write("             \n");
      out.write("             \n");
      out.write("\n");
      out.write("                function readURL(input) {\n");
      out.write("                    if (input.files && input.files[0]) {\n");
      out.write("                        var reader = new FileReader();\n");
      out.write("\n");
      out.write("                        reader.onload = function (e) {\n");
      out.write("                            preview.src = e.target.result;\n");
      out.write("                        };\n");
      out.write("\n");
      out.write("                        reader.readAsDataURL(input.files[0]);\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            \n");
      out.write("           </script>\n");
      out.write("    </head>\n");
      out.write("    <body onload=\"setTimer();\" class=\"bg-dark text-white>\n");
      out.write("        <!--<input type=\"button\" value=\"close window\" onclick=\"window.close();\"/> -->\n");
      out.write("        \n");
      out.write("        <div class=\"container\" \">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <center> <h2> This link will be closed in :<span id=\"time\"></span>    seconds</h2>\n");
      out.write("                        <form action=\"UserController?op=add\" method=\"post\" class=\"form_container\" onsubmit=\"return validateForm()\" enctype=\"multipart/form-data\"> \n");
      out.write("                <table class =\"table\">\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"text\" name=\"name\" id=\"nm\" placeholder=\"Enter name here\" class=\"form-control\" required=\"required\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"number\" name=\"age\" id=\"age\" placeholder=\"Enter age here\" class=\"form-control\" required=\"required\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"email\" name=\"username\" id=\"username\" placeholder=\"Enter Username[your email]\" class=\"form-control\" required=\"required\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><b>Password must contain atleast one upppercase, one lowercase , one digit   and min 8 character long<br/></b>\n");
      out.write("                        <input type=\"password\" name=\"pass\" id=\"pass\" placeholder=\"Enter Password\" class=\"form-control\" required=\"required\" onfocus=\"s1.innerHTML='';\" pattern=\"(?=^.{8,}$)((?=.*\\d)|(?=.*\\W+))(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"password\" name=\"cpass\" id=\"cpass\" placeholder=\"Confirm Password\" class=\"form-control\" required=\"required\" onfocus=\"s1.innerHTML='';\"/>\n");
      out.write("                        <br/> <span id=\"s1\" style=\"color:red\"></span>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td> Select Gender : <span style=\"font-weight: bold;color:red\" id=\"s2\"></span> <br/>\n");
      out.write("                        <input type=\"radio\" name=\"gender\" value=\"Male\" id=\"gender1\"/> Male <br/>\n");
      out.write("                        <input type=\"radio\" name=\"gender\" value=\"Female\" id=\"gender2\"/> FeMale <br/>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td> Select Hobbies :<span style=\"font-weight: bold;color:red\" id=\"s3\"></span> <br/>\n");
      out.write("                        <input type=\"checkbox\" name=\"hobbies\" value=\"Singing\" id=\"hobby1\"/> Singing <br/>\n");
      out.write("                          <input type=\"checkbox\" name=\"hobbies\" value=\"Dancing\" id=\"hobby2\"/> Dancing <br/>\n");
      out.write("                            <input type=\"checkbox\" name=\"hobbies\" value=\"Playing\" id=\"hobby3\"/> Playing <br/>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"submit\" class=\"btn btn-primary form-control\" value=\"Register\" name=\"submit\"/></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("                     \n");
      out.write("                    </center>\n");
      out.write("                </div> \n");
      out.write("                  \n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <img src=\"\"  id=\"preview\" class=\"rounded\" style=\"width: 200px;height: 200px\"/>\n");
      out.write("                    <br/> <br/>\n");
      out.write("                    <input type=\"button\" value=\"Upload your Pic\" class=\"btn btn-primary\" onclick=\"pic.click();\"/><br/>\n");
      out.write("                    <input type=\"file\" name=\"pic\" id=\"pic\" onchange=\"readURL(this)\" required=\"required\" style=\"display: none;\"/>\n");
      out.write("                </div>\n");
      out.write("                 </form> \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <input type=\"button\" value=\"print\" onclick=\"window.print();\"/>\n");
      out.write("        <input type=\"button\" value=\"Open google\" onclick=\"window.location.assign('http://www.google.com');\"/>\n");
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
