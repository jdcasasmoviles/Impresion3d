package org.apache.jsp.views.ValidarLogin.RealizarPedido;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SeleccionarDiseño_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <head>\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\"  >\n");
      out.write("    <title>Seleccionar Diseño</title>\n");
      out.write("       <link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css\" rel=\"stylesheet\">\t\n");
      out.write("       <style type=\"text/css\">\n");
      out.write("        @import \"/Impresion3d/css/newcss.css\";\n");
      out.write("        @import \"/Impresion3d/css/input.css\";\n");
      out.write("        @import \"/Impresion3d/css/style.css\";\n");
      out.write("        </style>\n");
      out.write("</head>\n");
      out.write("    <body>\n");
      out.write("    <header>\n");
      out.write("    <div class=\"hrAzul\"></div>\n");
      out.write("    <div class=\"rectanguloGris\">\n");
      out.write("    <FONT SIZE=\"6\"COLOR=\"GREEN\"FACE=\"Verdana\" class=\"vete-izq\"><B>Bienvenido a la impresion 3D</B></FONT><br><br>\n");
      out.write("    ");
String cadena ="Usuario  : "+(String)session.getAttribute("usuario"); 
      out.write(" \n");
      out.write("    <FONT SIZE=\"4\"COLOR=\"BLACK\"FACE=\"Verdana\"> <B>");
      out.print(cadena);
      out.write("</B></FONT>\n");
      out.write("    </div><br><br>  \n");
      out.write("    <input align=\"left\" type=\"image\" onClick=\"parent.location='/Impresion3d/views/ValidarLogin/MenuPrincipal.jsp'\" src=\"/Impresion3d/img/Atras.png\" ><br><br>\n");
      out.write("    <div class=\"hrRojo\"></div>    \n");
      out.write("    </header>\n");
      out.write("    <div class=\"hrRojo\">\n");
      out.write("    <FONT SIZE=\"5\"COLOR=\"RED\"FACE=\"Verdana\"> <B>Seleccionar diseño</B></FONT>\n");
      out.write("    </div><br><br><br><br>\n");
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
