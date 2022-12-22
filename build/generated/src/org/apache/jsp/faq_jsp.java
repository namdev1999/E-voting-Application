package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class faq_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <title>Q & A</title>\n");
      out.write("    <!-- font-awesome -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.14.0/css/all.min.css\" />\n");
      out.write("    <!-- extra fonts -->\n");
      out.write("    <link\n");
      out.write("      href=\"https://fonts.googleapis.com/css?family=Great+Vibes&display=swap\"\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("    />\n");
      out.write("    \n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/styles.css\" />\n");
      out.write("  </head>\n");
      out.write("  <body style=\"background-image: radial-gradient(circle at 36.18% 40.32%, #8f5537 0, #894d38 8.33%, #7f4437 16.67%, #713b35 25%, #603030 33.33%, #4c2528 41.67%, #35191e 50%, #200d12 58.33%, #0e0000 66.67%, #000000 75%, #000000 83.33%, #000000 91.67%, #000000 100%);\">\n");
      out.write("      <section class=\"questions\">\n");
      out.write("        <!-- title -->\n");
      out.write("        <div class=\"title\">\n");
      out.write("            <h2 style=\"font-family: Georgia;\">FREQUENTLY ASKED QUESTIONS</h2>\n");
      out.write("        </div>\n");
      out.write("        <!-- questions -->\n");
      out.write("        <div class=\"section-center\">\n");
      out.write("          <!-- single question -->\n");
      out.write("          <article class=\"question\">\n");
      out.write("            <!-- question title -->\n");
      out.write("            <div class=\"question-title\">\n");
      out.write("              <p>Is this software fully secure?</p>\n");
      out.write("              <button type=\"button\" class=\"question-btn\">\n");
      out.write("                <span class=\"plus-icon\">\n");
      out.write("                  <i class=\"far fa-plus-square\"></i>\n");
      out.write("                </span>\n");
      out.write("                <span class=\"minus-icon\">\n");
      out.write("                  <i class=\"far fa-minus-square\"></i>\n");
      out.write("                </span>\n");
      out.write("              </button>\n");
      out.write("            </div>\n");
      out.write("            <!-- question text -->\n");
      out.write("            <div class=\"question-text\">\n");
      out.write("              <p>\n");
      out.write("               ha hai to its world's best software everrrrrrrrrrrrrrr\n");
      out.write("              </p>\n");
      out.write("            </div>\n");
      out.write("          </article>\n");
      out.write("          <!-- end of single question -->\n");
      out.write("          <!-- single question -->\n");
      out.write("          <article class=\"question\">\n");
      out.write("            <!-- question title -->\n");
      out.write("            <div class=\"question-title\">\n");
      out.write("              <p>How this software works?</p>\n");
      out.write("              <button type=\"button\" class=\"question-btn\">\n");
      out.write("                <span class=\"plus-icon\">\n");
      out.write("                  <i class=\"far fa-plus-square\"></i>\n");
      out.write("                </span>\n");
      out.write("                <span class=\"minus-icon\">\n");
      out.write("                  <i class=\"far fa-minus-square\"></i>\n");
      out.write("                </span>\n");
      out.write("              </button>\n");
      out.write("            </div>\n");
      out.write("            <!-- question text -->\n");
      out.write("            <div class=\"question-text\">\n");
      out.write("              <p>\n");
      out.write("                hum nai btayenge hmara mann\n");
      out.write("              </p>\n");
      out.write("            </div>\n");
      out.write("          </article>\n");
      out.write("          <!-- end of single question -->\n");
      out.write("          <!-- single question -->\n");
      out.write("          <article class=\"question\">\n");
      out.write("            <!-- question title -->\n");
      out.write("            <div class=\"question-title\">\n");
      out.write("              <p>For how much time will OTP be valid for voter?</p>\n");
      out.write("              <!-- button -->\n");
      out.write("              <button type=\"button\" class=\"question-btn\">\n");
      out.write("                <span class=\"plus-icon\">\n");
      out.write("                  <i class=\"far fa-plus-square\"></i>\n");
      out.write("                </span>\n");
      out.write("                <span class=\"minus-icon\">\n");
      out.write("                  <i class=\"far fa-minus-square\"></i>\n");
      out.write("                </span>\n");
      out.write("              </button>\n");
      out.write("            </div>\n");
      out.write("            <!-- question text -->\n");
      out.write("            <div class=\"question-text\">\n");
      out.write("              <p>\n");
      out.write("               hklhkl jknkjnlkj;l jjljlkj; jhjhjhkl hhjjhjhjlk jhjhjl\n");
      out.write("              </p>\n");
      out.write("            </div>\n");
      out.write("          </article>\n");
      out.write("          <article class=\"question\">\n");
      out.write("            <!-- question title -->\n");
      out.write("            <div class=\"question-title\">\n");
      out.write("              <p>When will results be released?</p>\n");
      out.write("              <button type=\"button\" class=\"question-btn\">\n");
      out.write("                <span class=\"plus-icon\">\n");
      out.write("                  <i class=\"far fa-plus-square\"></i>\n");
      out.write("                </span>\n");
      out.write("                <span class=\"minus-icon\">\n");
      out.write("                  <i class=\"far fa-minus-square\"></i>\n");
      out.write("                </span>\n");
      out.write("              </button>\n");
      out.write("            </div>\n");
      out.write("            <!-- question text -->\n");
      out.write("            <div class=\"question-text\">\n");
      out.write("              <p>\n");
      out.write("                dasncnVJDKVDJSK DSJVFJKWKJ   CDDKDVN a d kqkj   nfkjaNKLQ\n");
      out.write("              </p>\n");
      out.write("            </div>\n");
      out.write("          </article>\n");
      out.write("          <!-- end of single question -->\n");
      out.write("      </section>\n");
      out.write("    </main>\n");
      out.write("    <!-- javascript -->\n");
      out.write("    <script>\n");
      out.write("        const questions = document.querySelectorAll(\".question\");\n");
      out.write("\n");
      out.write("questions.forEach(function (question) {\n");
      out.write("  const btn = question.querySelector(\".question-btn\");\n");
      out.write("  // console.log(btn);\n");
      out.write("\n");
      out.write("  btn.addEventListener(\"click\", function () {\n");
      out.write("    // console.log(question);\n");
      out.write("\n");
      out.write("    questions.forEach(function (item) {\n");
      out.write("      if (item !== question) {\n");
      out.write("        item.classList.remove(\"show-text\");\n");
      out.write("      }\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    question.classList.toggle(\"show-text\");\n");
      out.write("  });\n");
      out.write("});\n");
      out.write("    </script>\n");
      out.write("  </body>\n");
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
