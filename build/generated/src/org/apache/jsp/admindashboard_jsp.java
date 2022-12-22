package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admindashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("<style>\n");
      out.write("    @import url('https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css');\n");
      out.write("@media(min-width:768px) {\n");
      out.write("    body {\n");
      out.write("        margin-top: 50px;\n");
      out.write("    }\n");
      out.write("    /*html, body, #wrapper, #page-wrapper {height: 100%; overflow: hidden;}*/\n");
      out.write("}\n");
      out.write("\n");
      out.write("#wrapper {\n");
      out.write("    padding-left: 0;    \n");
      out.write("}\n");
      out.write("\n");
      out.write("#page-wrapper {\n");
      out.write("    width: 100%;        \n");
      out.write("    padding: 0;\n");
      out.write("    background-color: #fff;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media(min-width:768px) {\n");
      out.write("    #wrapper {\n");
      out.write("        padding-left: 225px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #page-wrapper {\n");
      out.write("        padding: 22px 10px;\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Top Navigation */\n");
      out.write("\n");
      out.write(".top-nav {\n");
      out.write("    padding: 0 15px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".top-nav>li {\n");
      out.write("    display: inline-block;\n");
      out.write("    float: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".top-nav>li>a {\n");
      out.write("    padding-top: 20px;\n");
      out.write("    padding-bottom: 20px;\n");
      out.write("    line-height: 20px;\n");
      out.write("    color: #fff;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".top-nav>li>a:hover,\n");
      out.write(".top-nav>li>a:focus,\n");
      out.write(".top-nav>.open>a,\n");
      out.write(".top-nav>.open>a:hover,\n");
      out.write(".top-nav>.open>a:focus {\n");
      out.write("    color: #fff;\n");
      out.write("    background-color: #1a242f;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".top-nav>.open>.dropdown-menu {\n");
      out.write("    float: left;\n");
      out.write("    position: absolute;\n");
      out.write("    margin-top: 0;\n");
      out.write("    /*border: 1px solid rgba(0,0,0,.15);*/\n");
      out.write("    border-top-left-radius: 0;\n");
      out.write("    border-top-right-radius: 0;\n");
      out.write("    background-color: #fff;\n");
      out.write("    -webkit-box-shadow: 0 6px 12px rgba(0,0,0,.175);\n");
      out.write("    box-shadow: 0 6px 12px rgba(0,0,0,.175);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".top-nav>.open>.dropdown-menu>li>a {\n");
      out.write("    white-space: normal;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Side Navigation */\n");
      out.write("\n");
      out.write("@media(min-width:768px) {\n");
      out.write("    .side-nav {\n");
      out.write("        position: fixed;\n");
      out.write("        top: 60px;\n");
      out.write("        left: 225px;\n");
      out.write("        width: 225px;\n");
      out.write("        margin-left: -225px;\n");
      out.write("        border: none;\n");
      out.write("        border-radius: 0;\n");
      out.write("        border-top: 1px rgba(0,0,0,.5) solid;\n");
      out.write("        overflow-y: auto;\n");
      out.write("        background-color: #222;\n");
      out.write("        /*background-color: #5A6B7D;*/\n");
      out.write("        bottom: 0;\n");
      out.write("        overflow-x: hidden;\n");
      out.write("        padding-bottom: 40px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .side-nav>li>a {\n");
      out.write("        width: 225px;\n");
      out.write("        border-bottom: 1px rgba(0,0,0,.3) solid;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .side-nav li a:hover,\n");
      out.write("    .side-nav li a:focus {\n");
      out.write("        outline: none;\n");
      out.write("        background-color: #1a242f !important;\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("\n");
      out.write(".side-nav>li>ul {\n");
      out.write("    padding: 0;\n");
      out.write("    border-bottom: 1px rgba(0,0,0,.3) solid;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".side-nav>li>ul>li>a {\n");
      out.write("    display: block;\n");
      out.write("    padding: 10px 15px 10px 38px;\n");
      out.write("    text-decoration: none;\n");
      out.write("    /*color: #999;*/\n");
      out.write("    color: #fff;    \n");
      out.write("}\n");
      out.write("\n");
      out.write(".side-nav>li>ul>li>a:hover {\n");
      out.write("    color: #fff;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".navbar .nav > li > a > .label {\n");
      out.write("  -webkit-border-radius: 50%;\n");
      out.write("  -moz-border-radius: 50%;\n");
      out.write("  border-radius: 50%;\n");
      out.write("  position: absolute;\n");
      out.write("  top: 14px;\n");
      out.write("  right: 6px;\n");
      out.write("  font-size: 10px;\n");
      out.write("  font-weight: normal;\n");
      out.write("  min-width: 15px;\n");
      out.write("  min-height: 15px;\n");
      out.write("  line-height: 1.0em;\n");
      out.write("  text-align: center;\n");
      out.write("  padding: 2px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".navbar .nav > li > a:hover > .label {\n");
      out.write("  top: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".navbar-brand {\n");
      out.write("    padding: 5px 15px;\n");
      out.write("}\n");
      out.write("</style>  \n");

	String userName = null;
	Cookie[] cookies = request.getCookies();
	if (cookies != null) {
		for (Cookie cookie : cookies) {
			if (cookie.getName().equals("uname"))
				userName = cookie.getValue();
		}
	}
	if (userName == null)
		response.sendRedirect("adminlogin.jsp");

      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"throbber\" style=\"display:none; min-height:120px;\"></div>\n");
      out.write("<div id=\"noty-holder\"></div>\n");
      out.write("<div id=\"wrapper\">\n");
      out.write("    <!-- Navigation -->\n");
      out.write("    <nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\n");
      out.write("        <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-ex1-collapse\">\n");
      out.write("                <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("            </button>\n");
      out.write("            <a class=\"navbar-brand\" href=\"https://bryanrojasq.wordpress.com\">\n");
      out.write("                <img src=\"http://placehold.it/200x50&text=LOGO\" alt=\"LOGO\">\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("        <!-- Top Menu Items -->\n");
      out.write("        <ul class=\"nav navbar-right top-nav\">\n");
      out.write("            <li><a href=\"#\" data-placement=\"bottom\" data-toggle=\"tooltip\" href=\"#\" data-original-title=\"Stats\"><i class=\"fa fa-bar-chart-o\"></i>\n");
      out.write("                </a>\n");
      out.write("            </li>            \n");
      out.write("            <li class=\"dropdown\">\n");
      out.write("                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Admin <b class=\"fa fa-angle-down\"></b></a>\n");
      out.write("                <ul class=\"dropdown-menu\">\n");
      out.write("                    <li><a href=\"#\"><i class=\"fa fa-fw fa-user\"></i> Edit Profile</a></li>\n");
      out.write("                    <li><a href=\"#\"><i class=\"fa fa-fw fa-cog\"></i> Change Password</a></li>\n");
      out.write("                    <li class=\"divider\"></li>\n");
      out.write("                    <li><a href=\"#\"><i class=\"fa fa-fw fa-power-off\"></i> Logout</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("        <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->\n");
      out.write("        <div class=\"collapse navbar-collapse navbar-ex1-collapse\">\n");
      out.write("            <ul class=\"nav navbar-nav side-nav\">\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"candidateregister.jsp\"><i class=\"fa fa-fw fa-star\"></i>Manage Candidates </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\" data-toggle=\"collapse\" data-target=\"#submenu-1\"><i class=\"fa fa-fw fa-search\"></i> Manage Voters <i class=\"fa fa-fw fa-angle-down pull-right\"></i></a>\n");
      out.write("                    <ul id=\"submenu-1\" class=\"collapse\">\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-angle-double-right\"></i> SUBMENU 1.1</a></li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-angle-double-right\"></i> SUBMENU 1.2</a></li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-angle-double-right\"></i> SUBMENU 1.3</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\" data-toggle=\"collapse\" data-target=\"#submenu-2\"><i class=\"fa fa-fw fa-user-plus\"></i> Voting Statistics <i class=\"fa fa-fw fa-angle-down pull-right\"></i></a>\n");
      out.write("                    <ul id=\"submenu-2\" class=\"collapse\">\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-angle-double-right\"></i> CR 2.1</a></li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-angle-double-right\"></i> Executive 2.2</a></li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-angle-double-right\"></i> TPR 2.3</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"investigaciones/favoritas\"><i class=\"fa fa-fw fa-star\"></i> Voting Statistics</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"sugerencias\"><i class=\"fa fa-fw fa-paper-plane-o\"></i> </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"faq\"><i class=\"fa fa-fw fa fa-question-circle\"></i> </a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <!-- /.navbar-collapse -->\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <div id=\"page-wrapper\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <!-- Page Heading -->\n");
      out.write("            <div class=\"row\" id=\"main\" >\n");
      out.write("                <div class=\"col-sm-12 col-md-12 well\" id=\"content\">\n");
      out.write("                    <h1> Welcome Admin ");
      out.write("</h1>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.row -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /.container-fluid -->\n");
      out.write("    </div>\n");
      out.write("    <!-- /#page-wrapper -->\n");
      out.write("</div><!-- /#wrapper -->\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("$(function(){\n");
      out.write("    $('[data-toggle=\"tooltip\"]').tooltip();\n");
      out.write("    $(\".side-nav .collapse\").on(\"hide.bs.collapse\", function() {                   \n");
      out.write("        $(this).prev().find(\".fa\").eq(1).removeClass(\"fa-angle-right\").addClass(\"fa-angle-down\");\n");
      out.write("    });\n");
      out.write("    $('.side-nav .collapse').on(\"show.bs.collapse\", function() {                        \n");
      out.write("        $(this).prev().find(\".fa\").eq(1).removeClass(\"fa-angle-down\").addClass(\"fa-angle-right\");        \n");
      out.write("    });\n");
      out.write("})    \n");
      out.write(" </script>   \n");
      out.write("    </body>\n");
      out.write("    \n");
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
