package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/bootstraplinks.jsp");
    _jspx_dependants.add("/navbar.jsp");
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
      out.write("<!--bootstrap css CDN(Content Delivery Network) Link-->\n");
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" integrity=\"sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("<!--bootstrap js CDN(Content Delivery Network) Link-->\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\" integrity=\"sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\" integrity=\"sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("<!--fontawesome5 js link-->\n");
      out.write("<script src='https://kit.fontawesome.com/a076d05399.js'></script>");
      out.write('\n');
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
      out.write("<!--fontawesome5 js link-->\n");
      out.write("<script src='https://kit.fontawesome.com/a076d05399.js'></script>");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <style>.nav-img{\n");
      out.write("                width:6vh;\n");
      out.write("            }</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
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
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"Index.jsp#Courses\">Courses</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"Index.jsp#\">Take Quiz</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"Index.jsp#About us\">About us</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"Index.jsp#Contact us\">Contact us</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"navbar-nav ml-auto mr-5 mt-2 mt-lg-0\">\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"login.jsp\">Login</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"registration.jsp\">Register</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <title>Registration</title>\n");
      out.write("        <!-- Required meta tags -->\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <!--css file-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/registrationstyle.css\" >\n");
      out.write("        <script src=\"https://kit.fontawesome.com/a076d05399.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body onload=\"myLoader()\">\n");
      out.write("        <div id=\"loading\"></div>\n");
      out.write("        <div class=\"container mt-5\">\n");
      out.write("            <div class=\"row mymedia\">\n");
      out.write("                <div class=\"col-md-8 mx-auto\">\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col\">\n");
      out.write("                                <div class=\"card-header header text-center\"><h1>Registration</h1></div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <form action=\"register\" id=\"form\" method=\"POST\" class=\"form\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <label>Name</label>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" name=\"name\" id=\"name\" placeholder=\"Enter your name\"/>\n");
      out.write("                                            <i class=\"far fa-check-circle\"></i>\n");
      out.write("                                            <i class=\"fas fa-exclamation-circle\"></i>\n");
      out.write("                                            <small>hello</small>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <label>Username</label>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" name=\"username\" id=\"username\" placeholder=\"Enter a Username\" />\n");
      out.write("                                            <i class=\"far fa-check-circle\"></i>\n");
      out.write("                                            <i class=\"fas fa-exclamation-circle\"></i>\n");
      out.write("                                            <small>hello</small>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <label>Email</label>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"email\" class=\"form-control\" name=\"email\" id=\"email\" placeholder=\"Enter your email\" autocomplete=\"false\"/>\n");
      out.write("                                            <i class=\"far fa-check-circle\"></i>\n");
      out.write("                                            <i class=\"fas fa-exclamation-circle\"></i>\n");
      out.write("                                            <small>hello</small>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <label>Contact</label>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" name=\"contact\" id=\"contact\" placeholder=\"Enter your contact\" />\n");
      out.write("                                            <i class=\"far fa-check-circle\"></i>\n");
      out.write("                                            <i class=\"fas fa-exclamation-circle\"></i>\n");
      out.write("                                            <small>hello</small>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <label>Password</label>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"password\" class=\"form-control\" name=\"password\" id=\"password\" placeholder=\"Enter a password\"/>\n");
      out.write("                                            <i class=\"far fa-check-circle\"></i>\n");
      out.write("                                            <i class=\"fas fa-exclamation-circle\"></i>\n");
      out.write("                                            <small>hello</small>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <label>Confirm Password</label>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"password\" class=\"form-control\" name=\"cpassword\" id=\"cpassword\" placeholder=\"Confirm your password\"/>\n");
      out.write("                                            <i class=\"far fa-check-circle\"></i>\n");
      out.write("                                            <i class=\"fas fa-exclamation-circle\"></i>\n");
      out.write("                                            <small>hello</small>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"row justify-content-center\">\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <input type=\"submit\" value=\"Submit\" class=\"btn\" />\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"row justify-content-center mt-2\">\n");
      out.write("                                    <div class=\"col-md-6 text-center text-danger\">\n");
      out.write("                                        <a href=\"login.jsp\">Already have an account</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            const form = document.getElementById(\"form\");\n");
      out.write("            const name = document.getElementById(\"name\");\n");
      out.write("            const username = document.getElementById(\"username\");\n");
      out.write("            const email = document.getElementById(\"email\");\n");
      out.write("            const contact = document.getElementById(\"contact\");\n");
      out.write("            const password = document.getElementById(\"password\");\n");
      out.write("            const cpassword = document.getElementById(\"cpassword\");\n");
      out.write("\n");
      out.write("            form.addEventListener(\"submit\", (event) => {\n");
      out.write("                event.preventDefault(); //it will not allow to submit a value\n");
      out.write("                validate();\n");
      out.write("            });\n");
      out.write("            const sendData = (sRate, scount) => {\n");
      out.write("                if (sRate === scount) {\n");
      out.write("                    alert('registration successfull');\n");
      out.write("//                    location.href=\"login.jsp\";\n");
      out.write("                }\n");
      out.write("                else{\n");
      out.write("                    \n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            //for final data validation\n");
      out.write("            const SuccessMsg = () => {\n");
      out.write("                let formGroup = document.getElementsByClassName('form-group');\n");
      out.write("                let formval = document.getElementById('form');\n");
      out.write("                var count = formGroup.length - 1;\n");
      out.write("                for (var i = 0; i < formGroup.length; i++) {\n");
      out.write("                    if (formGroup[i].className === \"form-group success\") {\n");
      out.write("                        var successRate = 0 + i;\n");
      out.write("                        console.log(successRate);\n");
      out.write("                        sendData(successRate, count);//passing argument\n");
      out.write("\n");
      out.write("                    } else {\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("//                if (count === 5 ) {\n");
      out.write("//                    alert('registration successfull1');\n");
      out.write("//                    formval.addEventListener(\"submit\", (event) => {\n");
      out.write("//                        event.stopPropagation();\n");
      out.write("//                        location.href=\"login.jsp\"\n");
      out.write("//                    });\n");
      out.write("//                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            const isEmail = (emailpar) => {\n");
      out.write("                var atSymbol = emailpar.indexOf(\"@\");\n");
      out.write("                if (atSymbol < 1)\n");
      out.write("                    return false;\n");
      out.write("                var dot = emailpar.lastIndexOf(\".\");\n");
      out.write("                if (dot <= atSymbol + 2)\n");
      out.write("                    return false;\n");
      out.write("                if (dot === emailpar.length - 1)\n");
      out.write("                    return false;\n");
      out.write("                return true;\n");
      out.write("            };\n");
      out.write("\n");
      out.write("            const validate = () => {\n");
      out.write("                const nameVal = name.value.trim();\n");
      out.write("                const usernameVal = username.value.trim();\n");
      out.write("                const emailVal = email.value.trim();\n");
      out.write("                const contactVal = contact.value.trim();\n");
      out.write("                const passwordVal = password.value.trim();\n");
      out.write("                const cpasswordVal = cpassword.value.trim();\n");
      out.write("\n");
      out.write("                // validate name\n");
      out.write("                if (nameVal === \"\") {\n");
      out.write("                    //         field name,error msg\n");
      out.write("                    setErrorMsg(name, \"Name cannot be empty\");\n");
      out.write("                } else {\n");
      out.write("                    setSuccessMsg(name);\n");
      out.write("                }\n");
      out.write("                // validate username\n");
      out.write("                if (usernameVal === \"\") {\n");
      out.write("                    //         field name,error msg\n");
      out.write("                    setErrorMsg(username, \"Username cannot be empty\");\n");
      out.write("                } else if (usernameVal.length < 3) {\n");
      out.write("                    setErrorMsg(username, \"Username min 3 character\");\n");
      out.write("                } else {\n");
      out.write("                    setSuccessMsg(username);\n");
      out.write("                }\n");
      out.write("                // validate email\n");
      out.write("                if (emailVal === \"\") {\n");
      out.write("                    setErrorMsg(email, \"Email cannot be empty\");\n");
      out.write("                } else if (!isEmail(emailVal)) {\n");
      out.write("                    setErrorMsg(email, \"email is not valid\");\n");
      out.write("                } else {\n");
      out.write("                    setSuccessMsg(email);\n");
      out.write("                }\n");
      out.write("                // validate contact\n");
      out.write("                if (contactVal === \"\") {\n");
      out.write("                    setErrorMsg(contact, \"Contact cannot be empty\");\n");
      out.write("                } else if (contactVal.length < 10) {\n");
      out.write("                    setErrorMsg(contact, \"Contact length is not valid\");\n");
      out.write("                } else {\n");
      out.write("                    setSuccessMsg(contact);\n");
      out.write("                }\n");
      out.write("                // validate password\n");
      out.write("                if (passwordVal === \"\") {\n");
      out.write("                    setErrorMsg(password, \"Password cannot be empty\");\n");
      out.write("                } else if (passwordVal.length < 5) {\n");
      out.write("                    setErrorMsg(password, \"Password min 5 character\");\n");
      out.write("                } else {\n");
      out.write("                    setSuccessMsg(password);\n");
      out.write("                }\n");
      out.write("                // validate cpassword\n");
      out.write("                if (cpasswordVal === \"\") {\n");
      out.write("                    setErrorMsg(cpassword, \"Confirm Password cannot be empty\");\n");
      out.write("                } else if (passwordVal !== cpasswordVal) {\n");
      out.write("                    setErrorMsg(cpassword, \"Password does not match\");\n");
      out.write("                } else {\n");
      out.write("                    setSuccessMsg(cpassword);\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                SuccessMsg();\n");
      out.write("            };\n");
      out.write("\n");
      out.write("            function setErrorMsg(input, errormsg) {\n");
      out.write("                const formGroup = input.parentElement;\n");
      out.write("                const small = formGroup.querySelector(\"small\");\n");
      out.write("                formGroup.className = \"form-group error\";\n");
      out.write("                small.innerText = errormsg;\n");
      out.write("            }\n");
      out.write("            function setSuccessMsg(input) {\n");
      out.write("                const formGroup = input.parentElement;\n");
      out.write("                formGroup.className = \"form-group success\";\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            var preloader = document.getElementById('loading');\n");
      out.write("            const myLoader = () => {\n");
      out.write("                preloader.style.display = 'none';\n");
      out.write("            }\n");
      out.write("        </script>\n");
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