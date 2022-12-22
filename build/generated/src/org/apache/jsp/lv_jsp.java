package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class lv_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link href=\"assets/css/bootstrap.min.css\" type=\"text/css\" rel=\"stylesheet\"/>\n");
      out.write("        <script src=\"assets/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body style=\" background-image: url('img/bgd7.jpg');\n");
      out.write("          background-repeat: no-repeat;\n");
      out.write("          background-attachment: fixed;\n");
      out.write("          background-size: 100% 100%;\">\n");
      out.write("        <h1 style=\"text-align: center;font-family:Garamond;font-size: 60px\"><strong>LIVE &nbsp; VOTING</strong></h1>\n");
      out.write("        \n");
      out.write("   <!--fffffff-->\n");
      out.write("   \n");
      out.write("   <!---------- -->\n");
      out.write("   <p style=\"padding-left: 500px;margin-top: 100px\">\n");
      out.write("  <a class=\"btn btn-dark active\" data-toggle=\"collapse\" href=\"#collapseExample\" role=\"button\" aria-expanded=\"false\" aria-controls=\"collapseExample\">\n");
      out.write("    ROOBAROO\n");
      out.write("  </a>\n");
      out.write("       <a class=\"btn btn-dark\" data-toggle=\"collapse\" href=\"#collapseExample1\" role=\"button\" aria-expanded=\"false\" aria-controls=\"collapseExample\">\n");
      out.write("    AE SE AENAK\n");
      out.write("  </a>\n");
      out.write("  \n");
      out.write("</p>\n");
      out.write("\n");
      out.write("<div class=\"collapse active\" id=\"collapseExample\" >\n");
      out.write("    <div class=\"card card-body active\" style=\"background-image: url('img/concert.jpg');\n");
      out.write("          background-repeat: no-repeat;\n");
      out.write("          background-attachment: fixed;\n");
      out.write("          background-size: 100% 100%;filter: grayscale(95%)\">\n");
      out.write("   <div style=\"text-align: center\" style=\"color: wheat\">\n");
      out.write("        <div class=\"form-check\" style=\"margin-bottom: 30px;\">\n");
      out.write("  <input class=\"form-check-input\" type=\"radio\" name=\"exampleRadios\" id=\"exampleRadios1\" value=\"option1\" checked>\n");
      out.write("  <label class=\"form-check-label\" for=\"exampleRadios1\" style=\"color: white\">\n");
      out.write("      <strong>TEAM DISCO DIWANE</strong>\n");
      out.write("  </label>\n");
      out.write("</div>\n");
      out.write("<div class=\"form-check\" style=\"margin-bottom: 30px\">\n");
      out.write("  <input class=\"form-check-input\" type=\"radio\" name=\"exampleRadios\" id=\"exampleRadios2\" value=\"option2\">\n");
      out.write("  <label class=\"form-check-label\" for=\"exampleRadios2\" style=\"color: white\">\n");
      out.write("      <strong>TEAM DANCE PE CHANCE</strong>\n");
      out.write("  </label>\n");
      out.write("</div>\n");
      out.write("        <div class=\"form-check\" style=\"margin-bottom: 30px\">\n");
      out.write("  <input class=\"form-check-input\" type=\"radio\" name=\"exampleRadios\" id=\"exampleRadios2\" value=\"option2\">\n");
      out.write("  <label class=\"form-check-label\" for=\"exampleRadios2\" style=\"color: white\">\n");
      out.write("      <strong>TEAM ROCK AND ROLL</strong>\n");
      out.write("  </label>\n");
      out.write("</div>\n");
      out.write("        <div class=\"form-check\" style=\"margin-bottom: 30px\">\n");
      out.write("  <input class=\"form-check-input\" type=\"radio\" name=\"exampleRadios\" id=\"exampleRadios2\" value=\"option2\">\n");
      out.write("  <label class=\"form-check-label\" for=\"exampleRadios2\" style=\"color: white\">\n");
      out.write("      <strong>TEAM MASAKALI</strong>\n");
      out.write("  </label>\n");
      out.write("</div>\n");
      out.write("        <div class=\"form-check\" style=\"margin-bottom: 30px\">\n");
      out.write("  <input class=\"form-check-input\" type=\"radio\" name=\"exampleRadios\" id=\"exampleRadios2\" value=\"option2\">\n");
      out.write("  <label class=\"form-check-label\" for=\"exampleRadios2\" style=\"color: white\">\n");
      out.write("      <strong>TEAM THE KINGS</strong>\n");
      out.write("  </label>\n");
      out.write("</div>\n");
      out.write("        <button type=\"submit\" class=\"btn btn-dark\" style=\"margin-left: 180px\">Submit</button>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"collapse\" id=\"collapseExample1\">\n");
      out.write("  <div class=\"card card-body\" style=\"background-image: url('img/aeseaenak.jpg');\n");
      out.write("          background-repeat: no-repeat;\n");
      out.write("          background-attachment: fixed;\n");
      out.write("          background-size: 100% 100%;filter: grayscale(95%)\">\n");
      out.write("    <div style=\"text-align: center\">\n");
      out.write("        <div class=\"form-check\" style=\"margin-bottom: 30px\">\n");
      out.write("  <input class=\"form-check-input\" type=\"radio\" name=\"exampleRadios\" id=\"exampleRadios1\" value=\"option1\" checked>\n");
      out.write("  <label class=\"form-check-label\" for=\"exampleRadios1\" style=\"color: white\">\n");
      out.write("      <strong>TEAM BANDITS</strong>\n");
      out.write("  </label>\n");
      out.write("</div>\n");
      out.write("<div class=\"form-check\" style=\"margin-bottom: 30px\">\n");
      out.write("  <input class=\"form-check-input\" type=\"radio\" name=\"exampleRadios\" id=\"exampleRadios2\" value=\"option2\">\n");
      out.write("  <label class=\"form-check-label\" for=\"exampleRadios2\" style=\"color: white\">\n");
      out.write("      <strong>TEAM AAYINA</strong>\n");
      out.write("  </label>\n");
      out.write("</div>\n");
      out.write("        <div class=\"form-check\" style=\"margin-bottom: 30px\">\n");
      out.write("  <input class=\"form-check-input\" type=\"radio\" name=\"exampleRadios\" id=\"exampleRadios2\" value=\"option2\">\n");
      out.write("  <label class=\"form-check-label\" for=\"exampleRadios2\" style=\"color: white\">\n");
      out.write("      <strong>TEAM AAKANSHA</strong>\n");
      out.write("  </label>\n");
      out.write("</div>\n");
      out.write("        <div class=\"form-check\" style=\"margin-bottom: 30px\">\n");
      out.write("  <input class=\"form-check-input\" type=\"radio\" name=\"exampleRadios\" id=\"exampleRadios2\" value=\"option2\">\n");
      out.write("  <label class=\"form-check-label\" for=\"exampleRadios2\" style=\"color: white\">\n");
      out.write("      <strong>TEAM VIKINGS</strong>\n");
      out.write("  </label>\n");
      out.write("</div>\n");
      out.write("        <div class=\"form-check\" style=\"margin-bottom: 30px\">\n");
      out.write("  <input class=\"form-check-input\" type=\"radio\" name=\"exampleRadios\" id=\"exampleRadios2\" value=\"option2\">\n");
      out.write("  <label class=\"form-check-label\" for=\"exampleRadios2\" style=\"color: white\">\n");
      out.write("      <strong>TEAM JUSTICE</strong>\n");
      out.write("  </label>\n");
      out.write("</div>\n");
      out.write("        <button type=\"submit\" class=\"btn btn-dark\"  style=\"padding-left: 300px\">Submit</button>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<p style=\"font-family:Garamond;margin-bottom: 30px ;margin-top: 40px\">\"<strong>Roobaroo</strong>\" is the cultural society of MANIT. A nexus of the variegated talent of the college, Roobaroo provides a platform for individuals endowed with artistic abilities, ranging from music, dance, art, anchoring, writing, designing and theatre to other unconventional talents. Established in 2008 by creative enthusiasts, the society has grown significantly in the period, and in prevalent times, organises several events. Monthly live dance and music sessions, titled 'GIG-A-NIGHT' are held to facilitate a platform for honing local talent and to provide entertainment to the youth body. Selections for the society are done through annual audition events, entitled 'TICKET TO ROOBAROO’. The society also performs in the celebrations of Republic day, Independence day and Engineers' day. Teams of artists from Roobaroo also participate in Inter-college cultural events and fests.\"</p>\n");
      out.write("<p style=\"font-family:Garamond \"><strong>\"ऐ से ऐनक\"</strong> is the street play society of MANIT-Bhopal. It performs street-plays on social issues at public places, college festivals and inter college events. A streetplay better known as ‘nukad natak’ today, is perhaps the best way to connect with the common man and the youth.These are much intimate, brief, direct and address the social or political message head-on with the help of drama and at the same time educate the audience on a variety of social evils.These plays really stir up emotions, create awareness and lead the way towards a positive change.</p>\n");
      out.write("    <a href=\"index.jsp\"  class=\"btn btn-dark\" style=\"margin-left: 180px\">HOME</a>\n");
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
