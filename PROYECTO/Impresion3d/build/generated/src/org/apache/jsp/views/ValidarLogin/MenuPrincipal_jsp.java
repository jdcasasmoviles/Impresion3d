package org.apache.jsp.views.ValidarLogin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class MenuPrincipal_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("     ");
String cadena =(String)session.getAttribute("usuario"); 
 if(cadena!=null) {
      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Menu Principal Impresion 3d</title>\n");
      out.write("        <link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css\" rel=\"stylesheet\">\t\n");
      out.write("        <link rel=\"stylesheet\" href=\"/Impresion3d/css/input.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"/Impresion3d/css/table.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"/Impresion3d/css/newcss.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"/Impresion3d/css/style2.css\" >\n");
      out.write("        <link rel=\"stylesheet\" href=\"/Impresion3d/css/style4.css\" >\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("    <header>\n");
      out.write("       <div class=\"hrAzul\"></div>\n");
      out.write("    <div class=\"rectanguloGris\">\n");
      out.write("    <FONT SIZE=\"6\"COLOR=\"GREEN\"FACE=\"Verdana\" class=\"vete-izq\"><B>Bienvenido a la impresion 3D</B></FONT><br><br> \n");
      out.write("    <FONT SIZE=\"4\"COLOR=\"BLACK\"FACE=\"Verdana\"> <B>Usuario : ");
      out.print(cadena);
      out.write("</B></FONT>\n");
      out.write("    </div><br><br>       \n");
      out.write("    <div class=\"hrRojo\"></div>    \n");
      out.write("    </header>\n");
      out.write("               \n");
      out.write("    <nav>\n");
      out.write("    <br><FONT SIZE=\"4\" COLOR=\"RED\"FACE=\"Verdana\" class=\"vete-izq\"><B>Opciones</B></FONT><img align=\"right\" src=\"/Impresion3d/img/vineta2.png\">\n");
      out.write("    <br><hr class=\"hrNegro\">\n");
      out.write("    <div id=\"menu\" >\n");
      out.write("        <ul>\n");
      out.write("         <li><a  href=\"/Impresion3d/CerrarSesion\" title=\"...\"><img src=\"/Impresion3d/img/vineta.png\">Cerrar Sesion</a></li>\n");
      out.write("          <li><a  href=\"/Impresion3d/views/ValidarLogin/RealizarPedido.jsp\" title=\"...\"><img src=\"/Impresion3d/img/vineta.png\">Realizar pedido</a></li>\n");
      out.write("          <li><a  href=\"/Impresion3d/views/ValidarLogin/CotizarPedido.jsp\" title=\"...\"><img src=\"/Impresion3d/img/vineta.png\">Cotizar pedido</a></li>\n");
      out.write("          <li><a  href=\"/Impresion3d/views/ValidarLogin/PagarPedido.jsp\" title=\"...\"><img src=\"/Impresion3d/img/vineta.png\">Pagar pedido</a></li>\n");
      out.write("         </ul>\n");
      out.write("    </div><BR>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <section>\n");
      out.write("    <table width=\"730\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" id=\"preview\">\n");
      out.write("    <tr>\n");
      out.write("        <td scope=\"col\">&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("\t<td scope=\"col\">\n");
      out.write("            <table border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("                <tr>\n");
      out.write("                    <td scope=\"col\"><img src=\"/Impresion3d/img/catalogo.jpg\" alt=\"Photography templates\" width=\"700\" height=\"400\"/></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("\t<td scope=\"col\">&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    </table>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("     <footer>\n");
      out.write("    Copyright © 2016-I \n");
      out.write("    </footer>\n");
      out.write("   \n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("  \n");
      out.write("</html>\n");
      out.write("  ");
}
      out.write('\n');
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
