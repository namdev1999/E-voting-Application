package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class candidateregister_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            function readURL(input) {\n");
      out.write("                if (input.files && input.files[0]) {\n");
      out.write("                    var reader = new FileReader();\n");
      out.write("\n");
      out.write("                    reader.onload = function (e) {\n");
      out.write("                        preview.src = e.target.result;\n");
      out.write("                    };\n");
      out.write("\n");
      out.write("                    reader.readAsDataURL(input.files[0]);\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function confirmDelete() {\n");
      out.write("                if (!confirm(\"The Record will be Deleted Permanently <br> Want to Proceed ?\"))\n");
      out.write("                    return false;\n");
      out.write("\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body style=\" background-image: url('img/bg5.jpg');\n");
      out.write("          background-repeat: no-repeat;\n");
      out.write("          background-attachment: fixed;\n");
      out.write("          background-size: 100% 100%;\">\n");
      out.write("         <nav class=\"navbar navbar-expand-md bg-dark navbar-dark\" style=\"margin-top: -23px\">\n");
      out.write("             <a class=\"navbar-brand\" href=\"adminhome.jsp\" style=\"color: wheat\"> HOME</a>\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#collapsibleNavbar\">\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("  </button>\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"collapsibleNavbar\">\n");
      out.write("      <ul class=\"navbar-nav\" style=\"padding-left: 900px\">\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"#cr\" style=\"color: wheat\">CR</a>\n");
      out.write("      </li>\n");
      out.write("      \n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"#tpr\" style=\"color: wheat\">TPR</a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"#ex\" style=\"color: wheat\">EXECUTIVE</a>\n");
      out.write("      </li>    \n");
      out.write("    </ul>\n");
      out.write("  </div>  \n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("        <h1 style=\"font-family:Georgia; padding-left: 290px ;color: white;font-size: 50px\">CANDIDATE &nbsp; REGISTRATION</h1>\n");
      out.write("            \n");
      out.write("        <div class=\"container\">\n");
      out.write("           \n");
      out.write("            <div class=\"row\">\n");
      out.write("                 <div class=\"col-sm-3\">\n");
      out.write("                     <img src=\"img/candidate.jpg\" width=\"350px\" height=\"600px\" class=\"rounded-circle\" style=\"position:fixed ;padding-top:100px;margin-top: -80px;margin-left: 10px \">\n");
      out.write("        </div>\n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("\n");
      out.write("                    <centre>\n");
      out.write("                    <form action=\"candidatecontroller?op=add\" method=\"post\" class=\"col-sm-12\" enctype=\"multipart/form-data\" runat=\"server\" style=\"border-style: solid; width: 650%;border-radius: 50px 50px 50px 50px;margin-left: 250px;margin-top: 30px;background-color:white\"> \n");
      out.write("\n");
      out.write("                        <div class=\"col-md-7\" style=\"padding-left: 200px\">\n");
      out.write("                            <centre>\n");
      out.write("                            <img src=\"img/blank.png\"id=\"output\" width=\"130px\" class=\"rounded-circle\" height=\"130px\">\n");
      out.write("                             <input type=\"file\" name=\"Pic\" id=\"Pic\" accept=\"image/*\" onchange=\"loadFile(event)\">\n");
      out.write("                            <script>\n");
      out.write("                                    var loadFile = function (event) {\n");
      out.write("                                        var output = document.getElementById('output');\n");
      out.write("                                        output.src = URL.createObjectURL(event.target.files[0]);\n");
      out.write("                                        output.onload = function () {\n");
      out.write("                                            URL.revokeObjectURL(output.src) // free memory\n");
      out.write("                                        }\n");
      out.write("                                    };\n");
      out.write("                            </script>\n");
      out.write("                            </centre>\n");
      out.write("                            <!--<img src=\"\"   class=\"rounded\" style=\"width: 200px;height: 200px; margin-top: 30px; border:5px solid #000 \"/>\n");
      out.write("                            <br/> <br/>\n");
      out.write("                            <input type=\"button\" value=\"UPLOAD PICTURE\" class=\"btn btn-primary\" onclick=\"Pic.click();\"/><br/>\n");
      out.write("                            <input type=\"file\" name=\"Pic\" id=\"Pic\" onchange=\"readURL(this)\" required=\"required\" />-->\n");
      out.write("                        </div>\n");
      out.write("                        <centre>\n");
      out.write("                            <table class =\"table\" >\n");
      out.write("                            <tr style=\"color: darkblue\">\n");
      out.write("                                <td><input type=\"text\" name=\"Name\" id=\"Name\" placeholder=\"Candidate's Name\" class=\"form-control\" style=\"border: 2px solid #000\" required=\"required\" /></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr style=\"color: darkblue\">\n");
      out.write("                                <td><input type=\"number\" name=\"ScholarNo\" id=\"ScholarNo\" placeholder=\"Scholar Number\" class=\"form-control\" style=\"border: 2px solid #000\" required=\"required\"/></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr style=\"color: darkblue\">\n");
      out.write("                                <td><input type=\"text\" name=\"MobileNo\" id=\"MobileNo\" placeholder=\"Mobile Number\" class=\"form-control\" style=\"border: 2px solid #000\" required=\"required\"/></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr style=\"color: gray\">\n");
      out.write("                                <td><input type=\"text\" name=\"Cgpa\" id=\"Cgpa\" placeholder=\"Cgpa\" class=\"form-control\" style=\"border: 2px solid #000\" required=\"required\"/></td>\n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("                            <tr style=\"color: black\">\n");
      out.write("                                <td> Select Post : <span style=\"font-weight: bold;color:red\" id=\"s2\"></span> <br/>\n");
      out.write("                                    <input type=\"radio\" name=\"Post\" value=\"CR\" id=\"post1\"/> CR <br/>\n");
      out.write("                                    <input type=\"radio\" name=\"Post\" value=\"EXCECUTIVE\" id=\"post2\"/> EXECUTIVE <br/>\n");
      out.write("                                    <input type=\"radio\" name=\"Post\" value=\"TPR\" id=\"post3\"/> TPR <br/>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("                            <tr style=\"color: black\">\n");
      out.write("                                <td> Select Skilles :<span style=\"font-weight: bold;color:red\" id=\"s3\"></span> <br/>\n");
      out.write("                                    <input type=\"checkbox\" name=\"Skills\" value=\"ML\" id=\"skill1\"/> Machine learning <br/>\n");
      out.write("                                    <input type=\"checkbox\" name=\"Dkills\" value=\"MYSQL\" id=\"skill1\"/> Internet of Things <br/>\n");
      out.write("                                    <input type=\"checkbox\" name=\"Skills\" value=\"DATASCIENCE\" id=\"skill3\"/> Full Stack Web Development <br/>\n");
      out.write("                                    <input type=\"checkbox\" name=\"Skills\" value=\"PYTHON\" id=\"skill4\"/> Blockchain <br/>\n");
      out.write("                                    <input type=\"checkbox\" name=\"Skills\" value=\"JAVASCRIPT\" id=\"skill5\"/> Cloud Computing <br/>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td><input type=\"submit\" class=\"btn btn-dark form-control\" value=\"Register\" name=\"submit\"/></td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                        </centre>\n");
      out.write("\n");
      out.write("                        <!--</center>-->\n");
      out.write("                    </form>\n");
      out.write("                    </centre>\n");
      out.write("                </div> \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                    <!--<a href=\"candidateregister.jsp\" class=\"btn btn-primary\"> Add More records <i class=\"fa fa-plus-square-o\" aria-hidden=\"true\"></i></a> -->\n");
      out.write("\n");
      out.write("                </div>                    \n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
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
