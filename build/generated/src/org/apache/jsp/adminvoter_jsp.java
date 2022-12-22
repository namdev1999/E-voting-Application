package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class adminvoter_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" \n");
 
 
    if(request.getParameter("submit")!=null)
    {
        String ScholarNo = request.getParameter("sno");
        String StudentName = request.getParameter("sname");
        String PhoneNo = request.getParameter("pno");
        
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/Kucchbhi","root","");
        pst = con.prepareStatement("insert into voter(ScholarNo,Name,PhoneNo)values(?,?,?)");
        pst.setString(1, ScholarNo);
        pst.setString(2, StudentName);
        pst.setString(3, PhoneNo);
        pst.executeUpdate();  
        
        
      out.write(" \n");
      out.write("    <script>   \n");
      out.write("        alert(\"Record Added\");     \n");
      out.write("    </script> \n");
      out.write("    ");
             
    }
   
      out.write("\n");
      out.write(" <!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <body style=\" background-image: url('img/bg2.jpg');\n");
      out.write("  background-repeat: no-repeat;\n");
      out.write("  background-attachment: fixed;\n");
      out.write("  background-size: 100% 100%;\">\n");
      out.write("        <h1 style=\"padding-left: 570px;color:wheat \">VOTERS' LIST</h1>\n");
      out.write("        </br>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-3\">\n");
      out.write("                <form  method=\"POST\" action=\"#\" > \n");
      out.write("                    \n");
      out.write("                    <div alight=\"left\" style=\"color: wheat\">\n");
      out.write("                        <label class=\"form-label\">SCHOLAR N0</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Scholar No\" name=\"sno\" id=\"sno\" required >\n");
      out.write("                     </div>\n");
      out.write("                         \n");
      out.write("                    <div alight=\"left\" style=\"color: wheat\">\n");
      out.write("                        <label class=\"form-label\">STUDENT NAME</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Student Name\" name=\"sname\" id=\"sname\" required >\n");
      out.write("                     </div>\n");
      out.write("                         \n");
      out.write("                     <div alight=\"left\" style=\"color: wheat\">\n");
      out.write("                        <label class=\"form-label\">PHONE NO</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Phone No\" name=\"pno\" id=\"pno\" required >\n");
      out.write("                     </div>\n");
      out.write("                         </br>\n");
      out.write("                         \n");
      out.write("                     <div alight=\"right\">\n");
      out.write("                         <input type=\"submit\" id=\"submit\" value=\"SUBMIT\" name=\"submit\" class=\"btn btn-info\">\n");
      out.write("                         <input type=\"reset\" id=\"reset\" value=\"RESET\" name=\"reset\" class=\"btn btn-warning\">\n");
      out.write("                     </div>  \n");
      out.write("                         \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-9\">\n");
      out.write("                 <div class=\"panel-body\">\n");
      out.write("                     <table id=\"tbl-student\" class=\"table table-dark\" cellpadding =\"0\" width=\"100%\">\n");
      out.write("                         <thead>\n");
      out.write("                             <tr>\n");
      out.write("                                    <th>SCHOLAR NO.</th>\n");
      out.write("                                    <th>VOTER NAME</th>\n");
      out.write("                                    <th>PHONE NO.</th>\n");
      out.write("                                    <th>EDIT</th>\n");
      out.write("                                    <th>DELETE</th>\n");
      out.write("                             </tr>  \n");
      out.write("                             \n");
      out.write("                             ");
   
 
                                Connection con;
                                PreparedStatement pst;
                                ResultSet rs;
        
                                Class.forName("com.mysql.jdbc.Driver");
                                con = DriverManager.getConnection("jdbc:mysql://localhost/kucchbhi","root","");
                                
                                  String query = "select * from voter";
                                  Statement st = con.createStatement();
                                  
                                    rs =  st.executeQuery(query);
                                    
                                        while(rs.next())
                                        {
                                            String Id = rs.getString("Id");
                                   
      out.write("\n");
      out.write("             \n");
      out.write("                             <tr>\n");
      out.write("                                 <td>");
      out.print(rs.getString("ScholarNo") );
      out.write("</td>\n");
      out.write("                                 <td>");
      out.print(rs.getString("Name") );
      out.write("</td>\n");
      out.write("                                 <td>");
      out.print(rs.getString("PhoneNo") );
      out.write("</td>\n");
      out.write("                                 <td><button><a href=\"adminvoterupdate.jsp?Id=");
      out.print(Id);
      out.write("\">Edit</a></button></td>\n");
      out.write("                                 <td><button><a href=\"adminvoterdelete.jsp?Id=");
      out.print(Id);
      out.write("\">Delete</a></button></td>\n");
      out.write("                             </tr> \n");
      out.write("                             \n");
      out.write("                             \n");
      out.write("                                ");

                                 
                                 }
                               
      out.write("\n");
      out.write("                             \n");
      out.write("                     </table>    \n");
      out.write("                 </div>\n");
      out.write(" \n");
      out.write("            </div>  \n");
      out.write("        </div>\n");
      out.write(" \n");
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
