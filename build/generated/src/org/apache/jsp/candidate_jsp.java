package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class candidate_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("         <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link href=\"assets/css/bootstrap.min.css\" type=\"text/css\" rel=\"stylesheet\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <script src=\"assets/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"assets/js/bootstrap-modal.js\"></script>\n");
      out.write("       \n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js\" integrity=\"sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js\" integrity=\"sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <title>Candidate Page</title>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-expand-md bg-dark navbar-dark\" style=\"position: fixed;top: 0;width: 100%;\">\n");
      out.write("  <a class=\"navbar-brand\" href=\"index.jsp\"> HOME</a>\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#collapsibleNavbar\" style=\" border-color: transparent;\">\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("  </button>\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"collapsibleNavbar\">\n");
      out.write("      <ul class=\"navbar-nav\" style=\"padding-left: 900px\">\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"#cr\">CR</a>\n");
      out.write("      </li>\n");
      out.write("      \n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"#tpr\">TPR</a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"#ex\">EXECUTIVE</a>\n");
      out.write("      </li>    \n");
      out.write("    </ul>\n");
      out.write("  </div>  \n");
      out.write("</nav>\n");
      out.write("        <div style=\"background-image: url('img/bgd6.jpg');\n");
      out.write("          background-repeat: no-repeat;\n");
      out.write("          background-attachment: fixed;\n");
      out.write("          background-size: 100% 100%;\" id=\"cr\">\n");
      out.write("            <div>\n");
      out.write("            <h1 style=\"font-family:Garamond;font-size: 80px;margin-left: 280px;color: wheat;margin-top: 30px;padding-top: 40px\" >CR CANDIDATES</h1>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    ");

                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kucchbhi", "root", "");
                            String sql = "select * from users where Post='CR' ";
                            PreparedStatement smt = con.prepareStatement(sql);
                            ResultSet rs = smt.executeQuery();
                            int i = 1;
                while (rs.next()) {
      out.write("\n");
      out.write("       \n");
      out.write("             \n");
      out.write("                 <div class=\"card text-center col col-md-3 h-50 w-50\" style=\"width: 28rem;border-radius: 50%;margin-right: 30px;margin-left: 50px;margin-bottom: 10px;background-color: white\">\n");
      out.write("  <img src=\"");
      out.print(rs.getString("image"));
      out.write("\" class=\"card-img-top rounded-circle\" alt=\"...\" width=\"150px\" height=\"250px\" style=\"padding-top: 1px;padding-left: 10px;padding-right: 10px\">\n");
      out.write("  <div class=\"card-body\">\n");
      out.write("    <h5 class=\"card-title\">");
      out.print(rs.getString("Name"));
      out.write("</h5>\n");
      out.write("    <p class=\"card-text\">Proficient in ");
      out.print(rs.getString("Skills"));
      out.write("</p>\n");
      out.write("    <button type=\"button\" class=\"btn btn-dark\" role=\"button\" data-toggle=\"modal\" data-target=\"#Modal-vert-center-demo1\">\n");
      out.write("        <strong>PROCLAIMATION</strong>\n");
      out.write("</button>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write(" \n");
      out.write("    \n");
      out.write("\n");
      out.write("    <div class=\"modal fade\" id=\"Modal-vert-center-demo1\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"Modal-vert-center-demo-label\" aria-hidden=\"true\" >\n");
      out.write("  <div class=\"modal-dialog modal-dialog-centered\" role=\"document\" >\n");
      out.write("      <div class=\"modal-content\" style=\"background-image: radial-gradient(circle at 31.7% -18.3%, #dcffff 0, #c8ffff 10%, #b4ffff 20%, #a3ffff 30%, #96fff7 40%, #8bece6 50%, #83d1d2 60%, #7ebabf 70%, #7aa7ae 80%, #76979f 90%, #738b93 100%);\">\n");
      out.write("      <div class=\"modal-header\">\n");
      out.write("        <h5 class=\"modal-title\" id=\"Modal-vert-center-demo-label\">");
      out.print(rs.getString("Name"));
      out.write(" proclaims:</h5>\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("          <span aria-hidden=\"true\">×</span>\n");
      out.write("        </button>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("          \n");
      out.write("        \"I will raise the barriers of the college and accomplish new heights for the college\"\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-footer\">\n");
      out.write("        <button type=\"button\" class=\"btn btn-dark\" data-dismiss=\"modal\">Close</button>\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write(" </div>\n");
      out.write("      \n");
      out.write("    \n");
      out.write("      \n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
}
                con.close();
            } catch (Exception e) {
                System.out.println("Error " + e.getMessage());
            }
        
      out.write("\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <!--TPR-->\n");
      out.write("        <div style=\"background-image: url('img/bgd7.jpg');\n");
      out.write("          background-repeat: no-repeat;\n");
      out.write("          background-attachment: fixed;\n");
      out.write("          background-size: 100% 100%;\" id=\"tpr\">\n");
      out.write("            <div>\n");
      out.write("                <h1 style=\"font-family:Garamond;font-size: 80px;margin-left: 300px;color: gray;padding-top: 40px\" >TPR &nbsp; CANDIDATES</h1>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container\">\n");
      out.write("              <div class=\"row\">\n");
      out.write("                    ");

                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kucchbhi", "root", "");
                            String sql = "select * from users where Post='TPR' ";
                            PreparedStatement smt = con.prepareStatement(sql);
                            ResultSet rs = smt.executeQuery();
                            int i = 1;
                while (rs.next()) {
      out.write("\n");
      out.write("       \n");
      out.write("             \n");
      out.write("                 <div class=\"card text-center col col-md-3 h-50 w-50\" style=\"width: 28rem;border-radius: 50%;margin-right: 30px;margin-left: 50px;margin-bottom: 10px;background-color: gray\">\n");
      out.write("  <img src=\"");
      out.print(rs.getString("image"));
      out.write("\" class=\"card-img-top rounded-circle\" alt=\"...\" width=\"150px\" height=\"250px\" style=\"padding-top: 1px;padding-left: 10px;padding-right: 10px\">\n");
      out.write("  <div class=\"card-body\">\n");
      out.write("    <h5 class=\"card-title\">");
      out.print(rs.getString("Name"));
      out.write("</h5>\n");
      out.write("    <p class=\"card-text\">Proficient in ");
      out.print(rs.getString("Skills"));
      out.write("</p>\n");
      out.write("    <button type=\"button\" class=\"btn btn-dark\" data-toggle=\"modal\" data-target=\"#Modal-vert-center-demo2\">\n");
      out.write("  PROCLAIMATION\n");
      out.write("</button>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write(" \n");
      out.write("    \n");
      out.write("\n");
      out.write("    <div class=\"modal fade\" id=\"Modal-vert-center-demo2\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"Modal-vert-center-demo-label\" aria-hidden=\"true\" >\n");
      out.write("  <div class=\"modal-dialog modal-dialog-centered\" role=\"document\" >\n");
      out.write("      <div class=\"modal-content\" style=\"background-image: radial-gradient(circle at 31.7% -18.3%, #dcffff 0, #c8ffff 10%, #b4ffff 20%, #a3ffff 30%, #96fff7 40%, #8bece6 50%, #83d1d2 60%, #7ebabf 70%, #7aa7ae 80%, #76979f 90%, #738b93 100%);\">\n");
      out.write("      <div class=\"modal-header\">\n");
      out.write("        <h5 class=\"modal-title\" id=\"Modal-vert-center-demo-label\">");
      out.print(rs.getString("Name"));
      out.write(" proclaims:</h5>\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("          <span aria-hidden=\"true\">×</span>\n");
      out.write("        </button>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("          \n");
      out.write("        \"I  assure that every deserving student gets placed to its full potential.\"\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-footer\">\n");
      out.write("        <button type=\"button\" class=\"btn btn-dark\" data-dismiss=\"modal\">Close</button>\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write(" </div>\n");
      out.write("      \n");
      out.write("    \n");
      out.write("      \n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
}
                con.close();
            } catch (Exception e) {
                System.out.println("Error " + e.getMessage());
            }
        
      out.write("\n");
      out.write("        </div>\n");
      out.write("        </div>    \n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <!--EXECUTIVE-->\n");
      out.write("        <div style=\"background-image: url('img/bgd6.jpg');\n");
      out.write("          background-repeat: no-repeat;\n");
      out.write("          background-attachment: fixed;\n");
      out.write("          background-size: 100% 100%;\" id=\"ex\">\n");
      out.write("            <div>\n");
      out.write("                <h1 style=\"font-family:Garamond;font-size: 80px;margin-left: 120px;color: wheat;padding-top: 40px;\" >EXECUTIVE &nbsp; CANDIDATES</h1>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container\">\n");
      out.write("              <div class=\"row\">\n");
      out.write("                    ");

                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kucchbhi", "root", "");
                            String sql = "select * from users where Post='EXCECUTIVE' ";
                            PreparedStatement smt = con.prepareStatement(sql);
                            ResultSet rs = smt.executeQuery();
                            int i = 1;
                while (rs.next()) {
      out.write("\n");
      out.write("       \n");
      out.write("             \n");
      out.write("                 <div class=\"card text-center col col-md-3 h-50\" style=\"width: 50%;border-radius: 50%;margin-right: 30px;margin-left: 50px;margin-bottom: 10px;background-color: white\">\n");
      out.write("  <img src=\"");
      out.print(rs.getString("image"));
      out.write("\" class=\"card-img-top rounded-circle\" alt=\"...\" width=\"150px\" height=\"250px\" style=\"padding-top: 1px;padding-left: 10px;padding-right: 10px\">\n");
      out.write("  <div class=\"card-body\">\n");
      out.write("    <h5 class=\"card-title\">");
      out.print(rs.getString("Name"));
      out.write("</h5>\n");
      out.write("    <p class=\"card-text\">Proficient in ");
      out.print(rs.getString("Skills"));
      out.write("</p>\n");
      out.write("    <button type=\"button\" class=\"btn btn-dark\" data-toggle=\"modal\" data-target=\"#Modal-vert-center-demo\">\n");
      out.write("  PROCLAIMATION\n");
      out.write("</button>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write(" \n");
      out.write("    \n");
      out.write("\n");
      out.write("    <div class=\"modal fade\" id=\"Modal-vert-center-demo\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"Modal-vert-center-demo-label\" aria-hidden=\"true\" >\n");
      out.write("  <div class=\"modal-dialog modal-dialog-centered\" role=\"document\" >\n");
      out.write("      <div class=\"modal-content\" style=\"background-image: radial-gradient(circle at 31.7% -18.3%, #dcffff 0, #c8ffff 10%, #b4ffff 20%, #a3ffff 30%, #96fff7 40%, #8bece6 50%, #83d1d2 60%, #7ebabf 70%, #7aa7ae 80%, #76979f 90%, #738b93 100%);\">\n");
      out.write("      <div class=\"modal-header\">\n");
      out.write("        <h5 class=\"modal-title\" id=\"Modal-vert-center-demo-label\">");
      out.print(rs.getString("Name"));
      out.write(" proclaims:</h5>\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("          <span aria-hidden=\"true\">×</span>\n");
      out.write("        </button>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("         \n");
      out.write("        \"I will maintain the discipline and decorum of the department.\"\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-footer\">\n");
      out.write("        <button type=\"button\" class=\"btn btn-dark\" data-dismiss=\"modal\">Close</button>\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write(" </div>\n");
      out.write("      \n");
      out.write("    \n");
      out.write("      \n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
}
                con.close();
            } catch (Exception e) {
                System.out.println("Error " + e.getMessage());
            }
        
      out.write("\n");
      out.write("        </div>\n");
      out.write("        </div>    \n");
      out.write("        \n");
      out.write("                \n");
      out.write("        </div>\n");
      out.write("           \n");
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
