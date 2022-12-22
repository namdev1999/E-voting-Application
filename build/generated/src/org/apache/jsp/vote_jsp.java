package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class vote_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_when_test.release();
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
      out.write("\t\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write(" <link href=\"assets/css/bootstrap.min.css\" type=\"text/css\" rel=\"stylesheet\"/>\n");
      out.write("        <script src=\"assets/js/bootstrap.min.js\" type=\"text/js\"></script>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/newcss.css />\n");
      out.write("<title>Voting System</title>\n");

	String userName = null;
	Cookie[] cookies = request.getCookies();
	if (cookies != null) {
		for (Cookie cookie : cookies) {
			if (cookie.getName().equals("username"))
				userName = cookie.getValue();
		}
	}
	if (userName == null)
		response.sendRedirect("login.jsp");

      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div id=\"page\">\n");
      out.write("\t\t<div id=\"header\">\n");
      out.write("\t\t\t<div id=\"section\">\n");
      out.write("\t\t\t\t<div\n");
      out.write("\t\t\t\t\tstyle=\"text-align: center; color: white; margin: 0px 0 0px 324px;\">\n");
      out.write("\t\t\t\t\t<h1>Online Voting System</h1>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li><a href=\"index.jsp\">Project Description</a></li>\n");
      out.write("\t\t\t\t<li class=\"current\"><a href=\"vote.jsp\">Vote Here</a></li>\n");
      out.write("\t\t\t\t<li><a href=#>Voting Statistics</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"contact.jsp\">Contact us</a></li>\n");
      out.write("\t\t\t\t<li><a href=#>Web Service</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"logoutServlet\">Logout</a></li>\n");
      out.write("\t\t\t\t<li><a class=\"welcome\"><b>Welcome! ");
      out.print(userName);
      out.write("</b></a></li>\n");
      out.write("                                <li>\n");
      out.write("                                \n");
      out.write("                                <marquee> <h2>The voting link will be opened on <b>28/04/2021</b> date from 10 AM to 5 PM.\n");
      out.write("                                     </marquee>   \n");
      out.write("                                  \n");
      out.write("                                </li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t\t<div id=\"tagline\">\n");
      out.write("\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t<h1 style=\"margin: 0px 0px 0px 315px;\">Please register your\n");
      out.write("\t\t\t\t\t\tvote below</h1>\n");
      out.write("\t\t\t\t\t<div style=\"padding: 0px 0px 21px 0;\">\n");
      out.write("\t\t\t\t\t\t<center>\n");
      out.write("\t\t\t\t\t\t\t<form method=\"POST\" action=\"VotingServlet\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"username\" id=\"username\"\n");
      out.write("\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print(userName);
      out.write("\">\n");
      out.write("\t\t\t\t\t\t\t\t<table cellspacing=0 cellpadding=\"10\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<Button name=\"submit\" type=\"submit\" id=\"submit\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tvalue=\"Submit\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"width: 96px; height: 36px; font-size: 16px; color: #295071; margin: 0 0 0 -56px;\">Submit</Button>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t\t\t\t");

								  
								  String msg="Status";
								  msg = (String) request.getAttribute("message");
								  if(msg==null){
									  msg="";
								  }
								
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<p style=\"width: 500px;font-size: 16px;color: #c8085f;\">");
      out.print(msg);
      out.write("</p>\n");
      out.write("\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t</center>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div id=\"footer\">\n");
      out.write("\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t<div class=\"section\">\n");
      out.write("\t\t\t\t\t\t<p style=\"text-align: center;\">Copyright &copy; yashi sharma,\n");
      out.write("\t\t\t\t\t\t\tID: 12457 - All Rights Reserved.</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
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

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                                        ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${(user.vote).equalsIgnoreCase('rohan')}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<tr>\t\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<td></td>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<td align=left><input type=\"radio\" name=\"vote\" value=\"rohan\"/>rohan</td>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<td></td>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<td align=left><input type=\"radio\" name=\"vote\"\tvalue=\"aditya\"/>aditya</td>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<td></td>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<td align=left><input type=\"radio\" name=\"vote\" value=\"naman\" />naman</td>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_when_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_1.setPageContext(_jspx_page_context);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${(user.vote).equalsIgnoreCase('naman')}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td></td>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td align=left><input type=\"radio\" name=\"vote\" value=\"rohan\"/>rohan</td>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td></td>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td align=left><input type=\"radio\" name=\"vote\"\tvalue=\"aditya\"/>aditya</td>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td></td>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td align=left><input type=\"radio\" name=\"vote\" value=\"naman\" />naman</td>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                                        \n");
        out.write("\t\t\t\t\t\t\t\t\t\t\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\n");
        out.write("                                                                                    <td align=left style=\"color: #295071\"><h2><b>Click to Vote for class representative:</h2> </b></td>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\n");
        out.write("                                                                                            \n");
        out.write("                                                                                            <th></th>  <th> CGPA  </th><th> CODING SKILSS </th><th> CONTEST </th>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\n");
        out.write("                                                                                        <tr>\n");
        out.write("                                                                                            <th align=left><input type=\"radio\" name=\"vote\" value=\"rohan\"/>Rohan mishra</th>\n");
        out.write("                                                                                             <td> 9.5 </td>\n");
        out.write("                                                                                             <td> c,c++,java</td>\n");
        out.write("                                                                                              <td> codechef,hackerrank </td>\n");
        out.write("                                                                                        </tr>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t\t\t\t\t\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th align=left><input type=\"radio\" name=\"vote\"\tvalue=\"aditya\"/>Adiya Sharma</th>\n");
        out.write("                                                                                                <td> 9.5 </td>\n");
        out.write("                                                                                             <td> c++,java,python</td>\n");
        out.write("                                                                                              <td> leetcode,codechef </td>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th align=left><input type=\"radio\" name=\"vote\" value=\"naman\" />Naman dubey</th>\n");
        out.write("                                                                                                 <td> 9.5 </td>\n");
        out.write("                                                                                             <td> c++,html,css,js</td>\n");
        out.write("                                                                                              <td> codechef,hackerearth </td>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }
}
