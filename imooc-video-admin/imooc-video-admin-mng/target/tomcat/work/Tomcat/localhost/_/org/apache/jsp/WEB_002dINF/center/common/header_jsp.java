/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-05-30 13:28:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.center.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<!-- BEGIN HEADER -->\n");
      out.write("<div class=\"page-header navbar navbar-fixed-top\">\n");
      out.write("    <!-- BEGIN HEADER INNER -->\n");
      out.write("    <div class=\"page-header-inner \">\n");
      out.write("        <!-- BEGIN LOGO -->\n");
      out.write("        <div class=\"page-logo\">\n");
      out.write("            <a href=\"");
      out.print(request.getContextPath());
      out.write("/\">\n");
      out.write("                <img src=\"");
      out.print(request.getContextPath());
      out.write("/static/pages/img/logos/logo.png\" alt=\"logo\" class=\"logo-default\" /> \n");
      out.write("            </a>\n");
      out.write("            <div class=\"menu-toggler sidebar-toggler\" style=\"width: 19px; height: 19px;\">\n");
      out.write("                <span style=\"top: 8px;\"></span>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- END LOGO -->\n");
      out.write("        <!-- BEGIN RESPONSIVE MENU TOGGLER -->\n");
      out.write("        <a href=\"javascript:;\" class=\"menu-toggler responsive-toggler\" data-toggle=\"collapse\" data-target=\".navbar-collapse\" style=\"width: 19px; height: 19px;\">\n");
      out.write("            <span style=\"top: 8px;\"></span>\n");
      out.write("        </a>\n");
      out.write("        <!-- END RESPONSIVE MENU TOGGLER -->\n");
      out.write("        <!-- BEGIN TOP NAVIGATION MENU -->\n");
      out.write("        <div class=\"top-menu\">\n");
      out.write("            <ul class=\"nav navbar-nav pull-right\">\n");
      out.write("                <!-- BEGIN USER LOGIN DROPDOWN -->\n");
      out.write("                <!-- DOC: Apply \"dropdown-dark\" class after below \"dropdown-extended\" to change the dropdown styte -->\n");
      out.write("                <li class=\"dropdown dropdown-user\">\n");
      out.write("                    <a href=\"");
      out.print(request.getContextPath());
      out.write("/center.shtml\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" data-hover=\"dropdown\" data-close-others=\"true\">\n");
      out.write("                        <span class=\"username username-hide-on-mobile\"> 欢迎登录 </span>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <!-- END USER LOGIN DROPDOWN -->\n");
      out.write("                <!-- BEGIN QUICK SIDEBAR TOGGLER -->\n");
      out.write("                <!-- DOC: Apply \"dropdown-dark\" class after below \"dropdown-extended\" to change the dropdown styte -->\n");
      out.write("                <li class=\"dropdown dropdown-quick-sidebar-toggler\">\n");
      out.write("                    <a href=\"");
      out.print(request.getContextPath() );
      out.write("/users/logout.action\" class=\"dropdown-toggle\">\n");
      out.write("                        <i class=\"icon-logout\"></i>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <!-- END QUICK SIDEBAR TOGGLER -->\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <!-- END TOP NAVIGATION MENU -->\n");
      out.write("    </div>\n");
      out.write("    <!-- END HEADER INNER -->\n");
      out.write("</div>\n");
      out.write("<!-- END HEADER -->");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
