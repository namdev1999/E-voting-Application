package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class gitaddcand_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!-- Copyright (c) Nishit Tated. All Rights Reserved.\n");
      out.write(" *  Project name: Online Election Voting System  \n");
      out.write(" * This project is licensed under the MIT License, see LICENSE.\n");
      out.write(" */ -->\n");
      out.write(" \n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("\n");
      out.write("<link href=\"css/forms.css\" rel='stylesheet' type='text/css'/> \n");
      out.write("<title>Add Candidate</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header_admin.jsp", out, false);
      out.write("\n");
      out.write("<br><br><br><br><br><br>\n");
      out.write("<center><a href=\"add_Candidate.jsp\"><button>Add</button></a>\n");
      out.write("    \t<a href=\"edit_Candidate.jsp\"><button>Edit</button></a>\n");
      out.write("    \t<a href=\"delete_Candidate.jsp\"><button>Delete</button></a>\n");
      out.write("    \t<a href=\"viewcandidate.jsp\"><button>View</button></a>\n");
      out.write("</center>\n");
      out.write("<form name=\"add_candidate\" action=\"AddCandidateServlet\" method=\"post\">\n");
      out.write("<ul class=\"form-style-1\">\n");
      out.write("\n");
      out.write("<li>\n");
      out.write("    \t\n");
      out.write("    </li>   \n");
      out.write("\n");
      out.write("    <li><label>Party Name <span class=\"required\">*</span></label>\n");
      out.write("    \t<input type=\"text\" name=\"party\" class=\"field-divided\" placeholder=\"Party Name\" />\n");
      out.write("    \t \n");
      out.write("    </li>\n");
      out.write("    <li><label>Name <span class=\"required\">*</span></label>\n");
      out.write("    \t<input type=\"text\" name=\"fname\" class=\"field-divided\" placeholder=\"Name\" />\n");
      out.write("    \t\n");
      out.write("    </li>\n");
      out.write("    <li><label>Age <span class=\"required\">*</span></label>\n");
      out.write("    \t<input type=\"text\" name=\"age\" class=\"field-divided\" placeholder=\"Age\" />\n");
      out.write("     \t\n");
      out.write("    </li>\n");
      out.write("    \n");
      out.write("    <li><label>Contact <span class=\"required\">*</span></label>\n");
      out.write("    \t<input type=\"text\" name=\"con\" class=\"field-divided\" placeholder=\"Contact\" />\n");
      out.write("    </li>\n");
      out.write("    \n");
      out.write("    <li><label>Address <span class=\"required\">*</span></label>\n");
      out.write("    \t<textarea name=\"add\" rows=\"5\" cols=\"10\" class=\"field-divided\" placeholder=\"Address\"> </textarea>\n");
      out.write("    \t\n");
      out.write("    </li>\n");
      out.write("   \n");
      out.write("     <li>\n");
      out.write("\t    <label>Gender<span class=\"required\">*</span></label>\n");
      out.write("        <select name=\"gen\" class=\"field-select\">\n");
      out.write("        <option value=\"option\">Select Option</option>\n");
      out.write("        <option value=\"MALE\">MALE</option>\n");
      out.write("        <option value=\"FEMALE\">FEMALE</option>\n");
      out.write("        <option value=\"OTHER\">OTHER</option>\n");
      out.write("        </select>\n");
      out.write("\t </li>\n");
      out.write("\n");
      out.write("    <li>\n");
      out.write("    <input type=\"submit\" value=\"Add\" />\n");
      out.write("    <input type=\"reset\" value=\"Clear\" />\n");
      out.write("       \n");
      out.write("    </li>\n");
      out.write("<br>\n");
      out.write("     \n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("</body>\n");
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
