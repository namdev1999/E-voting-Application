package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class showcandidate_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"assets/css/bootstrap.min.css\" type=\"text/css\" rel=\"stylesheet\"/>\n");
      out.write("        <script src=\"assets/js/bootstrap.min.js\" type=\"text/js\"></script>\n");
      out.write("    \n");
      out.write("     <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write(" <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\"> <style>\n");
      out.write("      .sliderImg{\n");
      out.write("          width:100%;\n");
      out.write("          height:200px;\n");
      out.write("      }\n");
      out.write("  </style>\n");
      out.write("  <script type=\"text/javascript\">\n");
      out.write("      function confirmDelete(){\n");
      out.write("          if (!confirm(\"The Record will be Deleted Permanently <br> Want to Proceed ?\"))\n");
      out.write("                return false;\n");
      out.write("      }\n");
      out.write("      </script>\n");
      out.write("    </head>\n");
      out.write("    <body style=\" background-image: url('img/bg5.jpg');\n");
      out.write("          background-repeat: no-repeat;\n");
      out.write("          background-attachment: fixed;\n");
      out.write("          background-size: 100% 100%;\">\n");
      out.write("<nav class=\"navbar navbar-expand-md bg-dark navbar-dark\">\n");
      out.write("  <a class=\"navbar-brand\" href=\"adminhome.jsp\">HOME</a>\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#collapsibleNavbar\">\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("  </button>\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"collapsibleNavbar\">\n");
      out.write("    <ul class=\"navbar-nav\">\n");
      out.write("      \n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"https://www.linkedin.com/feed/\">VOTERS</a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"https://google.com\">RESULTS</a>\n");
      out.write("      </li>    \n");
      out.write("    </ul>\n");
      out.write("  </div>  \n");
      out.write("</nav>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("        \n");
      out.write("            <div class=\"row\" style=\"margin-bottom:30px\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <h1 style=\"color:wheat;font-family:Garamond;margin-left: 300px;font-size: 50px\">LIST &nbsp; OF &nbsp; CANDIDATES</h1>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("              <div class=\"row\">\n");
      out.write("                  <div class=\"col-md-12\" style=\"color:brown\">\n");
      out.write("                    <table class=\"table table-hover table-striped table-bordered\" style=\"color:wheat\">\n");
      out.write("            <tr>\n");
      out.write("                <!--<th>Id</th>-->\n");
      out.write("                            <th>NAME</th>\n");
      out.write("                            <th>SCHOLAR NO</th>\n");
      out.write("                            <th>PHONE NO</th>\n");
      out.write("                            <!--<th>gender</th>-->\n");
      out.write("                            <th>CGPA</th>\n");
      out.write("                            <th>Post</th>\n");
      out.write("                            <th>IMAGE</th>\n");
      out.write("                            <th>OPERATIONS</th>\n");
      out.write("            </tr>\n");
      out.write("            ");
  
                try {
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kucchbhi", "root", "");
                                String sql = "select * from users";
                                PreparedStatement smt = con.prepareStatement(sql);
                                ResultSet rs = smt.executeQuery();
                                int i = 1;
                                while (rs.next()) {
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <!--<td>");
      out.print(i++);
      out.write("</td>-->\n");
      out.write("                            <!--<td>");
      out.print(rs.getInt("id"));
      out.write("</td>-->\n");
      out.write("                            <td>");
      out.print(rs.getString("Name"));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getInt("ScholarNo"));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString("MobileNo"));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString("Cgpa"));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString("Post"));
      out.write("</td>\n");
      out.write("                            <td><img src=\"");
      out.print(rs.getString("image"));
      out.write("\" style=\"width:50px;height: 50px;\" class=\"rounded-circle\"/></td>\n");
      out.write("                            <td> <a href=\"editUser.jsp?id=");
      out.print(rs.getString("id"));
      out.write("\" class=\"btn btn-success\">  <i class=\"fa fa-pencil\" aria-hidden=\"true\"></i> </a> | <a href=\"candidatecontroller?op=delete&&id=");
      out.print(rs.getInt("id"));
      out.write("\" class=\"btn btn-dark\" onclick=\"return confirmDelete();\"> <i class=\"fa fa-trash\" aria-hidden=\"true\"></i></a> </td>\n");
      out.write("                        <a href=\"votecr.jsp\"></a>\n");
      out.write("                        </tr>\n");
      out.write("                        ");
}
                                con.close();
                            } catch (Exception e) {
                                System.out.println("Error " + e.getMessage());
                            }
                        
      out.write("\n");
      out.write("        </table>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("        </div>\n");
      out.write("    <centre>\n");
      out.write("        <a href=\"candidateregister.jsp\" class=\"btn btn-dark\"> Add More Records <i class=\"fa fa-plus-square-o\" aria-hidden=\"true\"></i></a> \n");
      out.write("    </centre>\n");
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
