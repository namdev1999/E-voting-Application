package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import com.databeans.voterbean;

public final class votertpr_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>VOTE TPR</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link href=\"assets/css/bootstrap.min.css\" type=\"text/css\" rel=\"stylesheet\"/>\n");
      out.write("        <script src=\"assets/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-image: url('img/bg7.jpg');\n");
      out.write("          background-repeat: no-repeat;\n");
      out.write("          background-attachment: fixed;\n");
      out.write("          background-size: 100% 100%;\">\n");
      out.write("        ");

         voterbean voter = (voterbean)session.getAttribute("voter");
           if(voter==null){
            RequestDispatcher rd = request.getRequestDispatcher("userlogin.jsp");
           rd.forward(request,response);
           }
        
      out.write("\n");
      out.write("          <div class=\"container\">\n");
      out.write("              <div class=\"row\">\n");
      out.write("                  \n");
      out.write("              <h1 style=\"font-family: Georgia;font-size: 50px;color: wheat; margin-left: 350px;padding-bottom: 30px;padding-top: 20px\"><center><font> &nbsp;TPR &nbsp; CANDIDATES</font></center></h1>\n");
      out.write("                   \n");
      out.write("        ");

                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kucchbhi", "root", "");
                            String sql = "select * from users where Post='TPR'";
                            PreparedStatement smt = con.prepareStatement(sql);
                            ResultSet rs = smt.executeQuery();
                            int i = 1;
        
               while (rs.next()) {
      out.write("\n");
      out.write("        \n");
      out.write("      \n");
      out.write("               <div class=\"card  text-center col col-md-5\" style=\"width: 30px;margin-left: 50px;margin-bottom: 10px;background-image: radial-gradient(circle at 75.48% 28.62%, #ffe2ff 0, #ffd2ff 12.5%, #f6c2fa 25%, #e2b2f7 37.5%, #c9a1f3 50%, #ac92f0 62.5%, #8a86ee 75%, #5e7cec 87.5%, #0075ea 100%);\">\n");
      out.write("                   <centre><img align=\"middle\" src=\"");
      out.print(rs.getString("image"));
      out.write("\" class=\"card-img-top rounded-circle\" alt=\"...\"  style=\"width:150px;height: 150px;\"></centre>\n");
      out.write("                   <h6 style=\"margin-top: 10px;margin-bottom: -10px\">");
      out.print(rs.getInt("ScholarNo"));
      out.write("</h6>\n");
      out.write("  <div class=\"card-body\">\n");
      out.write("    <h5 class=\"card-title\">");
      out.print(rs.getString("Name"));
      out.write("</h5>\n");
      out.write("    <p class=\"card-text\">");
      out.print(rs.getString("Skills"));
      out.write("</p>\n");
      out.write("    <p class=\"card-text\"> ");
      out.print(rs.getString("Cgpa"));
      out.write("</p>\n");
      out.write("    \n");
      out.write("    <div class=\"card-footer\">\n");
      out.write("       <a href=\"#\" class=\"btn btn-primary\">VOTE</a>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("   \n");
      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
}
                con.close();
            } catch (Exception e) {
                System.out.println("Error " + e.getMessage());
            }
        
      out.write("\n");
      out.write("  \n");
      out.write("          </div>\n");
      out.write("        </div>    \n");
      out.write("        \n");
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
