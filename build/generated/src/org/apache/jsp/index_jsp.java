package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n");
      out.write("        <title>Global Banking ..</title>\n");
      out.write("        <link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function ctck()\n");
      out.write("            {\n");
      out.write("                var sds = document.getElementById(\"dum\");\n");
      out.write("\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div id=\"top_links\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div id=\"header\">\n");
      out.write("                <h1>ABC - BANK<span class=\"style1\"></span></h1>\n");
      out.write("                <h2>ExtraOrdinary Service</h2>\t\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"navigation\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"create.html\">NEW ACCOUNT</a></li>\n");
      out.write("                    <li><a href=\"balance1.jsp\">BALANCE</a></li>\n");
      out.write("                    <li><a href=\"deposit1.jsp\">DEPOSIT</a></li>\n");
      out.write("                    <li><a href=\"withdraw1.jsp\">WITHDRAW</a></li>\n");
      out.write("                    <li><a href=\"transfer1.jsp\">TRANSFER</a></li>\n");
      out.write("                    <li><a href=\"closeac1.jsp\">CLOSE A/C</a></li>\n");
      out.write("                    <li><a href=\"about.jsp\">ABOUT US</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <table cellpadding=\"0\" cellspacing=\"0\" id=\"content1\"><tr align=\"justify\">\n");
      out.write("                    <td class=\"con\" valign=\"top\">\n");
      out.write("                        <div id=\"heade1\"><h1>Results</h1></div>\n");
      out.write("                        <p>This is  Global Business bank which is under business and finance category.ABC Bank offers personal banking solutions that fit your unique needs and help you reach your goals. Our online services provide you easy access to your money, on your time wherever you go!\n");
      out.write("Whatever your financial needs may be, we have a solution for you.\n");
      out.write("\n");
      out.write("                        </p>\n");
      out.write("                    </td>\n");
      out.write("\n");
      out.write("                    <td class=\"con\" valign=\"top\">\n");
      out.write("                        <div id=\"heade2\"><h1>Opportunities</h1></div>\n");
      out.write("                        <p> These Global Business bank would be idle for building a successful online businesses. ABC Bank is a community bank that has proudly served the Chicago communities since 1891!.<br><br>\n");
      out.write("\n");
      out.write("                            The entire website   are pre-designed websites all you need to do is adding your own personal content and start your own website. \n");
      out.write("\n");
      out.write("                        </p>\n");
      out.write("                    </td>\n");
      out.write("\n");
      out.write("                    <td class=\"con\" valign=\"top\">\n");
      out.write("                        <div id=\"heade3\"><h1>Solutions</h1></div>\n");
      out.write("                        <p>ABC Bank is a community bank that has proudly served the Chicago communities since 1891! We are a locally owned and managed institution, leveraging our grass roots experience to serve the social and economic needs of the communities we serve. At ABC Bank, we offer modern technologies, yet stay true to building and maintaining client relationships.</p>\n");
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                </tr></table>\n");
      out.write("\n");
      out.write("            <table style=\"width:897px; background:#FFFFFF; margin:0 auto;\"><tr align=\"justify\">\n");
      out.write("                    <td width=\"299\" valign=\"top\" style=\"border-right:#666666 1px dotted;\">\n");
      out.write("                        <div id=\"services\"><h1>Services</h1><br>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"#\">www.ABC.com</a></li>\n");
      out.write("                                <li><a href=\"#\">www.ABC/HELP.com </a></li>\n");
      out.write("                                <li><a href=\"#\">www.ABC/CONTACT.com</a></li>\n");
      out.write("                            </ul>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </td>\n");
      out.write("\n");
      out.write("                    <td width=\"299\" valign=\"top\">\n");
      out.write("                        <div id=\"welcome\" style=\"border-right:#666666 1px dotted;\"><h1>Welcome</h1><br>\n");
      out.write("                            <center><img src=\"images/globe_10.gif\" alt=\"business\" width=\"196\" height=\"106\"></center><br>\n");
      out.write("                            <p>Each people can do their business with website a website help a businessman to expand there business easily and shortly .</p>\n");
      out.write("\n");
      out.write("                        </div>      \n");
      out.write("                    </td>\n");
      out.write("\n");
      out.write("                    <td width=\"299\" valign=\"top\">\n");
      out.write("                        <div id=\"news\"><h1>News &amp; Events</h1><br>\n");
      out.write("                            <div class=\"img\"><img src=\"images/globe_12.gif\" alt=\"Business\"></div>\n");
      out.write("                            <h2>Nov. 17, 2008.</h2>\n");
      out.write("                            <p>Get your dream web design at no cost, no extra manpower for your professional website.</p><br>\n");
      out.write("                            <div class=\"img\"><img src=\"images/globe_16.gif\" alt=\"Business\"></div>\n");
      out.write("                            <h2>Nov. 17, 2008.</h2>\n");
      out.write("                            <p>Get your dream web design at no cost, no extra manpower for your professional website.</p>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                </tr></table>\n");
      out.write("\n");
      out.write("            <div id=\"footer_top\">\n");
      out.write("                <div id=\"footer_navigation\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div id=\"footer_copyright\" >\n");
      out.write("\n");
      out.write("                    <center><img  alt=\"business\"  width=\"196\" height=\"106\"></center><br>\n");
      out.write("                    <p>Each people plan their site layouts depending upon their business type. Each people can do their business with website a website help a businessman to expand there business easily and shortly ..</p>\n");
      out.write("\n");
      out.write("                    Copyright © Limon Kanti Dey</div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <script type=\"text/javascript\">\n");
      out.write("                document.onload = ctck();\n");
      out.write("            </script>\n");
      out.write("        </div>\n");
      out.write("\n");
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
