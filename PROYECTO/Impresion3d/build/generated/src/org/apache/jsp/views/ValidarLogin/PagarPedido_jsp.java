package org.apache.jsp.views.ValidarLogin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PagarPedido_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  ");
String cadena =(String)session.getAttribute("usuario");
     if(cadena!=null){
      out.write("  \n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Menu Principal Impresion 3d</title>\n");
      out.write("        <link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css\" rel=\"stylesheet\">\t\n");
      out.write("        <link rel=\"stylesheet\" href=\"/Impresion3d/css/input.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"/Impresion3d/css/table.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"/Impresion3d/css/newcss.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"/Impresion3d/css/style.css\" />\n");
      out.write("        <script src=\"/Impresion3d/js/packFunciones.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("     \n");
      out.write("    <header>\n");
      out.write("       <div class=\"hrAzul\"></div>\n");
      out.write("    <div class=\"rectanguloGris\">\n");
      out.write("    <FONT SIZE=\"6\"COLOR=\"GREEN\"FACE=\"Verdana\" class=\"vete-izq\"><B>Bienvenido a la impresion 3D</B></FONT><br><br>\n");
      out.write("    ");
 String monto =(String)session.getAttribute("Monto");
      out.write(" \n");
      out.write("    <FONT SIZE=\"4\"COLOR=\"BLACK\"FACE=\"Verdana\"> <B>Usuario  : ");
      out.print(cadena);
      out.write("</B></FONT>\n");
      out.write("    </div><br><br>       \n");
      out.write("    <div class=\"hrRojo\"></div>    \n");
      out.write("    </header>\n");
      out.write("               \n");
      out.write("    <nav>\n");
      out.write("    <br><FONT SIZE=\"4\"COLOR=\"RED\"FACE=\"Verdana\" class=\"vete-izq\"><B>Opciones</B></FONT><img align=\"right\" src=\"/Impresion3d/img/vineta2.png\">\n");
      out.write("    <br><hr class=\"hrNegro\">\n");
      out.write("    <div id=\"menu\" >\n");
      out.write("        <ul>\n");
      out.write("          <li><a  href=\"/Impresion3d/CerrarSesion\" title=\"...\"><img src=\"/Impresion3d/img/vineta.png\">Cerrar Sesion</a></li>\n");
      out.write("          <li><a  href=\"/Impresion3d/views/ValidarLogin/RealizarPedido.jsp\" title=\"...\"><img src=\"/Impresion3d/img/vineta.png\">Realizar pedido</a></li>\n");
      out.write("          <li><a  href=\"/Impresion3d/views/ValidarLogin/CotizarPedido.jsp\" title=\"...\"><img src=\"/Impresion3d/img/vineta.png\">Cotizar pedido</a></li>\n");
      out.write("          <li><a  href=\"/Impresion3d/views/ValidarLogin/PagarPedido.jsp\" title=\"...\"><img src=\"/Impresion3d/img/vineta.png\">Pagar pedido</a></li>\n");
      out.write("          <li><a  href=\"/Impresion3d/views/ValidarLogin/MenuPrincipal.jsp\" title=\"...\"><img src=\"/Impresion3d/img/vineta.png\">Menu Principal</a></li> \n");
      out.write("        </ul>\n");
      out.write("    </div><BR>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <section>\n");
      out.write("    <div id=\"page-wrap\">\n");
      out.write("    <div class=\"hrRojo\"></div>   \n");
      out.write("    <div class=\"text-left\">\n");
      out.write("    <FONT SIZE=\"5\"COLOR=\"RED\"FACE=\"Verdana\"> <B>Pagar pedido</B></FONT>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"hrRojo\"></div>   \n");
      out.write("    ");
String mensajePago =(String)session.getAttribute("mensajePago"); 
      out.write(" \n");
      out.write("    ");

   if(monto!=null){
      out.write("\n");
      out.write("         <br><FONT SIZE=\"4\"COLOR=\"BLACK\"FACE=\"Verdana\"> <B>");
      out.print(mensajePago);
      out.write("</B></FONT><br>\n");
      out.write("      \n");
      out.write("   <form id=\"FormularioDatosEntrega\" name=\"DatosEntrega\" method=\"GEt\" action=\"/Impresion3d/PagarPedido\">    \n");
      out.write("   <div  class='col-md-6 text-left'> Total a pagar   :</div>\n");
      out.write("   <div  class='col-md-4 text-left'><input type=\"text\" name=\"TotalPagar\" id=\"TotalPagar\" value=\"");
      out.print(monto);
      out.write("\" readonly=\"readonly\"></div><br><br>\n");
      out.write("   <div  class='col-md-6 text-left'> Forma de pago   :</div>\n");
      out.write("   <div  class='col-md-4 text-left'> \n");
      out.write("   <select name=\"FormaPago\"   style=\"width: 160px\" id=\"FormaPago\" >\n");
      out.write("         \t<option value=\"Tarjeta\">Tarjeta</option>\n");
      out.write("\t\t<option value=\"Vale\">Vale</option>\n");
      out.write("   </select>\n");
      out.write("   </div><br><br> \n");
      out.write("   <div  class='col-md-6 text-left'>  \n");
      out.write("    <FONT SIZE=\"3\" COLOR=\"BLUE\"FACE=\"Verdana\"> \n");
      out.write("    <B>Forma de entrega :</B>\n");
      out.write("   </FONT>\n");
      out.write("   </div><br><br>\n");
      out.write("    <div  class='col-md-6 text-left'> \n");
      out.write("    <input type=\"checkbox\" id=\"RecogerTienda\" name=\"RecogerTienda\" value=\"RecogerTienda\" onclick=\"formaEntregaTienda()\">Recoger tienda\n");
      out.write("    </div><br><br>\n");
      out.write("    <div  class='col-md-6 text-left'> \n");
      out.write("    <input type=\"checkbox\" id=\"EnviarDestino\" name=\"EnviarDestino\" value=\"EnviarDestino\" onclick=\"formaEntregaDestino()\">Enviar a destino\n");
      out.write("    </div><br><br><br>\n");
      out.write("    <div id=\"DatosEntrega\"></div>\n");
      out.write("    <input type=\"hidden\" name=\"nomUsuario\" value=\"");
      out.print(cadena);
      out.write("\">\n");
      out.write("    <br><br>\n");
      out.write("    <div  class='col-md-6 text-left'>\n");
      out.write("    <input id=\"ConfirmarImpresion\"  type=\"submit\" name=\"ConfirmarImpresion\" value=\"Confirmar Impresion\">\n");
      out.write("    </div><br>\n");
      out.write("    </form><br>\n");
      out.write("     ");
 }
         session.setAttribute("mensajePago", "");  
     
      out.write("\n");
      out.write("    <br><div  class='col-md-6 text-left'>\n");
      out.write("    <input id=\"NoImprimir\"  onClick=\"parent.location='/Impresion3d/views/ValidarLogin/MenuPrincipal.jsp'\" type=\"button\" name=\"NoImprimir\" value=\"No Imprimir\"> \n");
      out.write("   </div><br>\n");
      out.write("    </div>\n");
      out.write("   \n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("      <footer>\n");
      out.write("    Copyright © 2016-I \n");
      out.write("    </footer>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write(" ");
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
