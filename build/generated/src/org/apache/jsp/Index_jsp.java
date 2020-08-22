package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.portal.LearnDAO;
import com.portal.LearnPOJO;

public final class Index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/bootstraplinks.jsp");
  }

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--bootstrap css CDN(Content Delivery Network) Link-->\n");
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" integrity=\"sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("<!--bootstrap js CDN(Content Delivery Network) Link-->\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\" integrity=\"sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\" integrity=\"sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("<!--sweet alert-2-->\n");
      out.write("<script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\n");
      out.write("\n");
      out.write("<!--font awesome5 js link-->\n");
      out.write("<script src='https://kit.fontawesome.com/a076d05399.js'></script>");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Home</title>\n");
      out.write("        <style>.nav-img{\n");
      out.write("                width:6vh;\n");
      out.write("            }</style>\n");
      out.write("        <!-- animation link -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://unpkg.com/aos@next/dist/aos.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/indexstyle.css\">\n");
      out.write("    </head>\n");
      out.write("    <body onload=\"myLoader()\">\n");
      out.write("        <!--loader-->\n");
      out.write("        <div id=\"loading\"></div>\n");
      out.write("        <!--ed of loader-->\n");
      out.write("\n");
      out.write("        <!--navbar-->\n");
      out.write("        <nav class=\"navbar navbar-expand-sm navbar-dark bg-danger \">\n");
      out.write("            <!-- Logo of our website -->\n");
      out.write("            <a class=\"navbar-brand\" href=\"Index.jsp\"> <img class=\"nav-img\" src=\"Logo/elearning.png\" alt=\"\"> E-learning</a>\n");
      out.write("\n");
      out.write("            <button class=\"navbar-toggler d-lg-none\" type=\"button\" data-toggle=\"collapse\" data-target=\"#collapsibleNavId\" aria-controls=\"collapsibleNavId\"\n");
      out.write("                    aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"collapsibleNavId\">\n");
      out.write("                <ul class=\"navbar-nav mr-auto mt-2 mt-lg-0\">\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                        <a class=\"nav-link\" href=\"Index.jsp#Home\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                    </li>\n");
      out.write("                    ");

                        String username = (String) session.getAttribute("session_name");
                        if (username != null) {
                    
      out.write("\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"Index.jsp#Courses\">Courses</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"Index.jsp#\">Take Quiz</a>\n");
      out.write("                    </li>\n");
      out.write("                    ");
 }
      out.write(" \n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"Index.jsp#About us\">About us</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"Index.jsp#Contact us\">Contact us</a>\n");
      out.write("                    </li>          \n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"navbar-nav ml-auto mr-5 mt-2 mt-lg-0\">\n");
      out.write("                    ");

//                        String username = (String) session.getAttribute("session_name");
                        if (username == null) {
                    
      out.write("\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"login.jsp\">Login</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"registration.jsp\">Register</a>\n");
      out.write("                    </li>\n");
      out.write("                    ");
 } else {
                    
      out.write("\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"profile.jsp?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${session_name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Hello ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${session_name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"logout\">Logout</a>\n");
      out.write("                    </li>\n");
      out.write("                    ");
 }
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <!--End of navbar-->        \n");
      out.write("\n");
      out.write("        <!--banner div-->\n");
      out.write("        <div class=\"container-fluid myhieght\">\n");
      out.write("            <div id=\"carouselExampleInterval\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                <div class=\"carousel-inner\">\n");
      out.write("                    <div class=\"carousel-item active\" data-interval=\"10000\">\n");
      out.write("                        <img src=\"Images/1.jpg\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"carousel-item\" data-interval=\"20000\">\n");
      out.write("                        <img src=\"Images/2.jpg\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"carousel-item\">\n");
      out.write("                        <img src=\"Images/3.jpg\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <a class=\"carousel-control-prev\" href=\"#carouselExampleInterval\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                    <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                    <span class=\"sr-only\">Previous</span>\n");
      out.write("                </a>\n");
      out.write("                <a class=\"carousel-control-next\" href=\"#carouselExampleInterval\" role=\"button\" data-slide=\"next\">\n");
      out.write("                    <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                    <span class=\"sr-only\">Next</span>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--End of banner div-->\n");
      out.write("\n");
      out.write("        <!-- E-larning portal div -->\n");
      out.write("        <section id=\"Home\">\n");
      out.write("            <div class=\"container-fluid banner-img-2 p-5\"> \n");
      out.write("                <div class=\"row mb-4\">\n");
      out.write("                    <div class=\"col text-center\">\n");
      out.write("                        <h1>Achieve your goal with our E-learning Portal</h1>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-3 mb-4\">\n");
      out.write("                                <div class=\"card\">\n");
      out.write("                                    <div class=\"card-title mr-auto ml-auto\">\n");
      out.write("                                        <img src=\"Logo/Free.png\" class=\"header-img img-fluid\" alt=\"free content\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"card-header text-center\">\n");
      out.write("                                        <h3>Free</h3>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        Lorem ipsum dolor sit, amet consectetur adipisicing elit. Deleniti, iste pariatur! Maiores quas.\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-3 mb-4\">\n");
      out.write("                                <div class=\"card\">\n");
      out.write("                                    <div class=\"card-title mr-auto ml-auto\">\n");
      out.write("                                        <img src=\"Logo/Online.png\" class=\"header-img img-fluid\" alt=\"free content\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"card-header text-center\">\n");
      out.write("                                        <h3>Online</h3>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        Lorem ipsum dolor sit, amet consectetur adipisicing elit. Deleniti, iste pariatur! Maiores quas.\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-3 mb-4\">\n");
      out.write("                                <div class=\"card\">\n");
      out.write("                                    <div class=\"card-title mr-auto ml-auto\">\n");
      out.write("                                        <img src=\"Logo/Quiz.png\" class=\"header-img img-fluid\" alt=\"free content\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"card-header text-center\">\n");
      out.write("                                        <h3>Play Quiz</h3>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        Lorem ipsum dolor sit, amet consectetur adipisicing elit. Deleniti, iste pariatur! Maiores quas.\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-3 mb-4\">\n");
      out.write("                                <div class=\"card\">\n");
      out.write("                                    <div class=\"card-title mr-auto ml-auto\">\n");
      out.write("                                        <img src=\"Logo/Certificate.png\" class=\"header-img img-fluid\" alt=\"free content\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"card-header text-center\">\n");
      out.write("                                        <h3>Certificate</h3>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        Lorem ipsum dolor sit, amet consectetur adipisicing elit. Deleniti, iste pariatur! Maiores quas.\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!--End of  E-larning portal div -->\n");
      out.write("\n");
      out.write("        <!-- Courses div -->\n");
      out.write("        <section id=\"Courses\">\n");
      out.write("            <div class=\"container-fluid \">\n");
      out.write("                <div class=\"row mb-4\">\n");
      out.write("                    <div class=\"col text-center\">\n");
      out.write("                        <h1>Courses</h1>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-3 mb-4\">\n");
      out.write("                                <div class=\"card\">\n");
      out.write("                                    <div class=\"card-title mr-auto ml-auto\">\n");
      out.write("                                        <img src=\"Logo/html-css.jpg\" class=\"img-fluid\" alt=\"\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"card-header text-center\">\n");
      out.write("                                        <h3>Html and CSS</h3>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        Lorem ipsum dolor sit amet consectetur adipisicing elit. Veritatis facilis pariatur amet dolore, ipsa sint vero consequuntur error culpa, itaque alias velit rem molestias aspernatur modi odio autem harum odit!\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-3 mb-4\">\n");
      out.write("                                <div class=\"card\">\n");
      out.write("                                    <div class=\"card-title mr-auto ml-auto\">\n");
      out.write("                                        <img src=\"Logo/js.png\" class=\"img-fluid\" alt=\"\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"card-header text-center\">\n");
      out.write("                                        <h3>JavaScript</h3>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        Lorem ipsum dolor sit amet consectetur adipisicing elit. Veritatis facilis pariatur amet dolore, ipsa sint vero consequuntur error culpa, itaque alias velit rem molestias aspernatur modi odio autem harum odit!\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-3 mb-4\">\n");
      out.write("                                <div class=\"card\">\n");
      out.write("                                    <div class=\"card-title mr-auto ml-auto\">\n");
      out.write("                                        <img src=\"Logo/programming.jpg\" class=\"img-fluid\" alt=\"\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"card-header text-center\">\n");
      out.write("                                        <h3>Programming</h3>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        Lorem ipsum dolor sit amet consectetur adipisicing elit. Veritatis facilis pariatur amet dolore, ipsa sint vero consequuntur error culpa, itaque alias velit rem molestias aspernatur modi odio autem harum odit!\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-3 mb-4\">\n");
      out.write("                                <div class=\"card\">\n");
      out.write("                                    <div class=\"card-title mr-auto ml-auto\">\n");
      out.write("                                        <img src=\"Logo/backend-language.jpg\" class=\"img-fluid\" alt=\"\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"card-header text-center\">\n");
      out.write("                                        <h3>Server-Side</h3>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        Lorem ipsum dolor sit amet consectetur adipisicing elit. Veritatis facilis pariatur amet dolore, ipsa sint vero consequuntur error culpa, itaque alias velit rem molestias aspernatur modi odio autem harum odit!\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-3 mb-4\">\n");
      out.write("                                <div class=\"card\">\n");
      out.write("                                    <div class=\"card-title mr-auto ml-auto\">\n");
      out.write("                                        <img src=\"Logo/ds-algo.jpeg\" class=\"img-fluid\" alt=\"\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"card-header text-center\">\n");
      out.write("                                        <h3>DS& Algorithm</h3>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        Lorem ipsum dolor sit amet consectetur adipisicing elit. Veritatis facilis pariatur amet dolore, ipsa sint vero consequuntur error culpa, itaque alias velit rem molestias aspernatur modi odio autem harum odit!\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-3 mb-4\">\n");
      out.write("                                <div class=\"card\">\n");
      out.write("                                    <div class=\"card-title mr-auto ml-auto\">\n");
      out.write("                                        <img src=\"Logo/Artificial-Intelligence.jpg\" class=\"img-fluid\" alt=\"\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"card-header text-center\">\n");
      out.write("                                        <h3>Artifical inteligence</h3>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        Lorem ipsum dolor sit amet consectetur adipisicing elit. Veritatis facilis pariatur amet dolore, ipsa sint vero consequuntur error culpa, itaque alias velit rem molestias aspernatur modi odio autem harum odit!\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-3 mb-4\">\n");
      out.write("                                <div class=\"card\">\n");
      out.write("                                    <div class=\"card-title mr-auto ml-auto\">\n");
      out.write("                                        <img src=\"Logo/project.jpg\" class=\"img-fluid\" alt=\"\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"card-header\">\n");
      out.write("                                        <h3>Learn with Projects</h3>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        Lorem ipsum dolor sit amet consectetur adipisicing elit. Veritatis facilis pariatur amet dolore, ipsa sint vero consequuntur error culpa, itaque alias velit rem molestias aspernatur modi odio autem harum odit!\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-3 mb-4\">\n");
      out.write("                                <div class=\"card\">\n");
      out.write("                                    <div class=\"card-title mr-auto ml-auto\">\n");
      out.write("                                        <img src=\"Logo/interview.jpg\" class=\"img-fluid\" alt=\"\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"card-header text-center\">\n");
      out.write("                                        <h3>Prepare for interview</h3>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        Lorem ipsum dolor sit amet consectetur adipisicing elit. Veritatis facilis pariatur amet dolore, ipsa sint vero consequuntur error culpa, itaque alias velit rem molestias aspernatur modi odio autem harum odit!\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!--End of  Courses div -->\n");
      out.write("\n");
      out.write("        <!-- Join us div -->\n");
      out.write("        <section>\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row join-bg\">\n");
      out.write("                    <div class=\"col-md-6 text-center mt-auto mb-auto\">\n");
      out.write("                        <img src=\"Logo/join.png\" class=\"img-fluid mb-4 mt-3\" style=\"max-width: 400px;max-height: 250px;\" alt=\"\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-6 mt-auto mb-auto\">\n");
      out.write("                        <h3>Take the next step toward your personal and professional goals with E-learning.</h3>\n");
      out.write("                        <p>Join now to receive personalized recommendations from the full E-learning catalog.</p>\n");
      out.write("                        <a href=\"\" class=\"btn btn-warning p-3  mb-4\">Join for free</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- End of Join us div -->\n");
      out.write("\n");
      out.write("        <!-- About us div -->\n");
      out.write("        <section id=\"About us\">\n");
      out.write("            <div class=\"container-fluid p-5 marketing\">\n");
      out.write("                <h1 class=\"text-center\">About us</h1>\n");
      out.write("                <br>\n");
      out.write("                <!-- Three columns of text below the carousel -->\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-3 text-center\">\n");
      out.write("                        <img src=\"Logo/programmer.png\" class=\"bd-placeholder-img rounded-circle\" width=\"140\" height=\"140\"alt=\"\">\n");
      out.write("                        <h2>Pratik</h2>\n");
      out.write("                        <p>Donec sed odio dui. Etiam porta sem malesuada magna mollis euismod. Nullam id dolor id nibh ultricies vehicula ut id elit. Morbi leo risus, porta ac consectetur ac, vestibulum at eros. Praesent commodo cursus magna.</p>\n");
      out.write("                        <p><a class=\"btn btn-danger\" href=\"#\" role=\"button\">View details »</a></p>\n");
      out.write("                    </div><!-- /.col-lg-4 -->\n");
      out.write("                    <div class=\"col-md-3 text-center\">\n");
      out.write("                        <img src=\"Logo/3.png\" class=\"bd-placeholder-img rounded-circle\" width=\"140\" height=\"140\"alt=\"\">\n");
      out.write("                        <h2>Sanklp</h2>\n");
      out.write("                        <p>Donec sed odio dui. Etiam porta sem malesuada magna mollis euismod. Nullam id dolor id nibh ultricies vehicula ut id elit. Morbi leo risus, porta ac consectetur ac, vestibulum at eros. Praesent commodo cursus magna.</p>            \n");
      out.write("                        <p><a class=\"btn btn-danger\" href=\"#\" role=\"button\">View details »</a></p>\n");
      out.write("                    </div><!-- /.col-lg-4 -->\n");
      out.write("                    <div class=\"col-md-3 text-center\">\n");
      out.write("                        <img src=\"Logo/man.png\" class=\"bd-placeholder-img rounded-circle\" width=\"140\" height=\"140\"alt=\"\">\n");
      out.write("                        <h2>Ankit</h2>\n");
      out.write("                        <p>Donec sed odio dui. Etiam porta sem malesuada magna mollis euismod. Nullam id dolor id nibh ultricies vehicula ut id elit. Morbi leo risus, porta ac consectetur ac, vestibulum at eros. Praesent commodo cursus magna.</p>            \n");
      out.write("                        <p><a class=\"btn btn-danger\" href=\"#\" role=\"button\">View details »</a></p>\n");
      out.write("                    </div><!-- /.col-lg-4 -->\n");
      out.write("                    <div class=\"col-md-3 text-center\">\n");
      out.write("                        <img src=\"Logo/user.png\" class=\"bd-placeholder-img rounded-circle\" width=\"140\" height=\"140\"alt=\"\">\n");
      out.write("                        <h2>Sushil</h2>\n");
      out.write("                        <p>Donec sed odio dui. Etiam porta sem malesuada magna mollis euismod. Nullam id dolor id nibh ultricies vehicula ut id elit. Morbi leo risus, porta ac consectetur ac, vestibulum at eros. Praesent commodo cursus magna.</p>            \n");
      out.write("                        <p><a class=\"btn btn-danger\" href=\"#\" role=\"button\">View details »</a></p>\n");
      out.write("                    </div><!-- /.col-lg-4 -->\n");
      out.write("                </div><!-- /.row -->\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- End of About us div -->\n");
      out.write("\n");
      out.write("        <!-- Contact us div -->\n");
      out.write("        <section id=\"Contact us\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <h1 class=\"text-center\">Contact us</h1>\n");
      out.write("                <br>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-6 mb-2\">\n");
      out.write("                        <iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d60353.2758430124!2d73.06793212652421!3d19.0162076031786!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3be7c21a619aaff5%3A0xe1360fab56e52d36!2sAPTECH%20COMPUTER%20EDUCATION!5e0!3m2!1sen!2sin!4v1597309595304!5m2!1sen!2sin\" width=\"100%\" height=\"100%\" frameborder=\"0\" style=\"border:0;\" allowfullscreen=\"\" aria-hidden=\"false\" tabindex=\"0\"></iframe>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <div class=\"header bg-danger text-center text-white\">\n");
      out.write("                            <p class=\"p-3 \">Send us a message</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"body\">\n");
      out.write("                            <form action=\"contactusData.jsp\" method=\"post\" id=\"form\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("                                        <label>Full Name*:</label>\n");
      out.write("                                        <div class=\"form-group \">\n");
      out.write("                                            <input class=\"form-control\" type=\"text\" id=\"fname\" name=\"fname\" required autocomplete=\"off\">\n");
      out.write("                                            <small id=\"funame\"></small>\n");
      out.write("                                        </div>   \n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("                                        <label>Email*:</label>\n");
      out.write("                                        <div class=\"form-group \">\n");
      out.write("                                            <input class=\"form-control\" type=\"email\" id=\"email\" name=\"email\" required autocomplete=\"off\">\n");
      out.write("                                            <small id=\"email\"></small>\n");
      out.write("                                        </div>   \n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("                                        <label for=\"comment\">Type your message here*:</label>\n");
      out.write("                                        <div class=\"form-group \">\n");
      out.write("                                            <textarea class=\"form-control\" rows=\"4\" id=\"comment\" name=\"mesg\" required autocomplete=\"off\"></textarea>\n");
      out.write("                                            <small id=\"mesg\"></small>\n");
      out.write("                                        </div>   \n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"row justify-content-center\">\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <button type=\"submit\" value=\"submit\" class=\"btn btn-dark btn-block\" onsubmit=\"alert('Sussfull');\">Send</button>\n");
      out.write("                                        </div>   \n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- End of contact us div -->\n");
      out.write("        <!-- Contact us div -->\n");
      out.write("\n");
      out.write("        <section id=\"Footer\">\n");
      out.write("            <div class=\"container-fluid bg-danger \">\n");
      out.write("                <div class=\"footer p-3 text-center\">\n");
      out.write("                    <h6 >© 2020 E-learning Inc. All rights reserved.</h4>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- End of contact us div -->\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            var preloader = document.getElementById('loading');\n");
      out.write("            const myLoader = () => {\n");
      out.write("                preloader.style.display = 'none';\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            const form = document.getElementById(\"form\");\n");
      out.write("            form.addEventListener(\"submit\", (event) => {\n");
      out.write("                swal({\n");
      out.write("                    title: \"Thankyou!\",\n");
      out.write("                    text: \"Thankyou for your response!\",\n");
      out.write("                    icon: \"success\",\n");
      out.write("                });\n");
      out.write("            })\n");
      out.write("        </script>\n");
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
