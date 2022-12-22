package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.*;
import fusioncharts.*;
import database.*;

public final class Statistics_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("\"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write(" \n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/fusioncharts.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=_\"${pageContext.request.contextPath}/js/themes/fusioncharts.theme.fusion.js\"_></script>\n");
      out.write("  <head>\n");
      out.write("\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <title>Voting Stats</title>\n");
      out.write("<!--\n");
      out.write("\n");
      out.write("TemplateMo 548 Training Studio\n");
      out.write("\n");
      out.write("https://templatemo.com/tm-548-training-studio\n");
      out.write("\n");
      out.write("-->\n");
      out.write("    <!-- Additional CSS Files -->\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/font-awesome.css\">\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body style=\"background-color:#1a242f\">\n");
      out.write("    \n");
      out.write("    <!-- ***** Preloader Start ***** -->\n");
      out.write("    <div id=\"js-preloader\" class=\"js-preloader\">\n");
      out.write("      <div class=\"preloader-inner\">\n");
      out.write("        <span class=\"dot\"></span>\n");
      out.write("        <div class=\"dots\">\n");
      out.write("          <span></span>\n");
      out.write("          <span></span>\n");
      out.write("          <span></span>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- ***** Preloader End ***** -->\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <!-- ***** Header Area Start ***** -->\n");
      out.write("      <!-- ***** Header Area End ***** -->\n");
      out.write("\n");
      out.write("    <!-- ***** Main Banner Area Start ***** -->\n");
      out.write("\n");
      out.write("    <!-- ***** Main Banner Area End ***** -->\n");
      out.write("\n");
      out.write("    <!-- ***** Features Item Start ***** -->\n");
      out.write("    <section class=\"section\" id=\"features\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-6 offset-lg-3\">\n");
      out.write("                    <div class=\"section-heading\">\n");
      out.write("                       \n");
      out.write("                        <h1  > <font color=\"white\">Voting Statistics CR</font></h1>\n");
      out.write("                        \n");
      out.write("         <a valign=\"left\" href=\"adminhome.jsp\" class=\"btn btn-light\">ADMIN HOME</a>\n");
      out.write("          <a valign=\"left\" href=\"StatisticsTPR.jsp\" class=\"btn btn-light\">TPR</a>\n");
      out.write("           <a valign=\"left\" href=\"StatisticsEX.jsp\" class=\"btn btn-light\">EXECUTIVE</a>\n");
      out.write("   \n");
      out.write("                        <br/>\n");
      out.write("                                              \n");
      out.write("\n");
      out.write("\n");
      out.write("                       \n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-6\">\n");
      out.write("                    <h2><i ><font color=\"white\">CLASS REPRESENTATIVE</font></i></h2>\n");
      out.write("                 <div id =  \"chart\" > </div>\n");
      out.write("                  \n");

    Map<String, String> chartConfig = new HashMap<String, String>();
    chartConfig.put("caption", "Votes Obtained");
    chartConfig.put("subCaption", "for the post CR ");
    chartConfig.put("xAxisName", "Candidates(ID)");
    chartConfig.put("yAxisName", "Number of Votes");
    chartConfig.put("numberSuffix", "v");
    chartConfig.put("theme", "fusion");
    StringBuilder jsonData = new StringBuilder();
    // json data to use as chart     data source
    jsonData.append("{'chart':{");
    for(Map.Entry conf:chartConfig.entrySet())
    {
        jsonData.append("'" + conf.getKey()+"':'"+conf.getValue() + "',");
    }
    jsonData.replace(jsonData.length() - 1, jsonData.length() ,"},");

      out.write("\n");
      out.write("  \n");

    Map<String, Integer> dataValuePair = new HashMap<String, Integer>();
     
                try {
                    int votecr;
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection con = dbconnection.getConnection();
                                String sql = "SELECT ID,COUNT(ID),post FROM manivoting GROUP BY ID having post='CR'";
                                PreparedStatement smt = con.prepareStatement(sql);
                                
                                ResultSet rs = smt.executeQuery();
                                
                                
                                int i = 1;
                                while (rs.next()) {
    dataValuePair.put(rs.getString(1), rs.getInt(2));
     }
    StringBuilder data = new StringBuilder();
    // build data object from label-value pair
    data.append("'data':[");
    for(Map.Entry pair:dataValuePair.entrySet())
    {
        data.append("{'label':'" + pair.getKey() + "','value':'" + pair.getValue() +"'},");
    }
    data.replace(data.length() - 1, data.length(),"]");
    jsonData.append(data.toString());
    jsonData.append("}");
    
FusionCharts firstChart = new FusionCharts(
                "column2d",
                "first_chart",
                "700",
                "400",
                "chart",
                "json",
                jsonData.toString()
            );
             
            

      out.write("   \n");
      out.write(" ");
      out.print(firstChart.render() );
      out.write("               \n");
      out.write("             \n");
      out.write("                   ");
  con.close();
                            } catch (Exception e) {
                                System.out.println("Error " + e.getMessage());
                            }
                       
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div  class=\"col-md-2\">\n");
      out.write("                    \n");
      out.write("             \n");
      out.write("                </div>\n");
      out.write("                <div  class=\"col-md-4\">\n");
      out.write("                    \n");
      out.write("                    <h3><font color=\"white\">Post : CR</font></h3>\n");
      out.write("                    \n");
      out.write("             \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    \n");
      out.write("    <!-- ***** Contact Us Area Ends ***** -->\n");
      out.write("    \n");
      out.write("    <!-- ***** Footer Start ***** -->\n");
      out.write("  \n");
      out.write("    \n");
      out.write("    \n");
      out.write("\n");
      out.write("    <!-- jQuery -->\n");
      out.write("    <script src=\"assets/js/jquery-2.1.0.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap -->\n");
      out.write("    <script src=\"assets/js/popper.js\"></script>\n");
      out.write("    <script src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Plugins -->\n");
      out.write("    <script src=\"assets/js/scrollreveal.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/waypoints.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/jquery.counterup.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/imgfix.min.js\"></script> \n");
      out.write("    <script src=\"assets/js/mixitup.js\"></script> \n");
      out.write("    <script src=\"assets/js/accordions.js\"></script>\n");
      out.write("    \n");
      out.write("    <!-- Global Init -->\n");
      out.write("    <script src=\"assets/js/custom.js\"></script>\n");
      out.write("\n");
      out.write("  </body>\n");
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
