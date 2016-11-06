package org.apache.jsp.views.ValidarLogin.RealizarPedido;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Controlador.ControladorEstilo;

public final class SeleccionarDiseno_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\"  >\n");
      out.write("    <title>Seleccionar Diseño</title>\n");
      out.write("       <link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css\" rel=\"stylesheet\">\t\n");
      out.write("         <style type=\"text/css\">\n");
      out.write("        @import \"/Impresion3d/css/newcss.css\";\n");
      out.write("        @import \"/Impresion3d/css/input.css\";\n");
      out.write("        @import \"/Impresion3d/css/style2.css\";\n");
      out.write("        @import \"/Impresion3d/css/table2.css\";\n");
      out.write("        </style>\n");
      out.write("        <script src=\"/Impresion3d/js/packFunciones.js\"></script>\n");
      out.write("</head>\n");
      out.write("    <body>\n");
      out.write("    <header>\n");
      out.write("    <div class=\"hrAzul\"></div>\n");
      out.write("    <div class=\"rectanguloGris\">\n");
      out.write("    <FONT SIZE=\"6\"COLOR=\"GREEN\"FACE=\"Verdana\" class=\"vete-izq\"><B>Bienvenido a la impresion 3D</B></FONT><br><br>\n");
      out.write("    ");
String cadena =(String)session.getAttribute("usuario"); 
      out.write(" \n");
      out.write("    <FONT SIZE=\"4\"COLOR=\"BLACK\"FACE=\"Verdana\"> <B>Usuario  : ");
      out.print(cadena);
      out.write("</B></FONT>\n");
      out.write("    </div><br><br>  \n");
      out.write("    <div class=\"hrRojo\"></div>    \n");
      out.write("    </header>\n");
      out.write("    <div class=\"hrRojo\"></div><br><br>\n");
      out.write("    <nav>\n");
      out.write("    <FONT SIZE=\"2\"COLOR=\"RED\"FACE=\"Verdana\" class=\"vete-izq\"><B>Opciones</B></FONT><img align=\"right\" src=\"/Impresion3d/img/vineta2.png\">\n");
      out.write("    <br><br><hr class=\"hrNegro\">\n");
      out.write("    <div id=\"menu\" >\n");
      out.write("        <ul>\n");
      out.write("          <li><a  href=\"/Impresion3d/RegistrarPedido\" title=\"...\"><img src=\"/Impresion3d/img/vineta.png\">Añadir a Carrito</a></li>\n");
      out.write("          <li><a  href=\"/Impresion3d/views/ValidarLogin/RealizarPedido.jsp\" title=\"...\"><img src=\"/Impresion3d/img/vineta.png\">Volver a catalogo</a></li>\n");
      out.write("           <li><a  href=\"/Impresion3d/views/ValidarLogin/MenuPrincipal.jsp\" title=\"...\"><img src=\"/Impresion3d/img/vineta.png\">Menu Principal</a></li> \n");
      out.write("        \n");
      out.write("        </ul>\n");
      out.write("    </div><BR>\n");
      out.write("    </nav>\n");
      out.write("    \n");
      out.write("    <section>\n");
      out.write("     <br><div class=\"hrRojo\"></div>\n");
      out.write("    <div class=\"text-left\">\n");
      out.write("       \t<FONT SIZE=\"3\"COLOR=\"RED\"FACE=\"Verdana\"> <B>Informacion detallada del diseño</B></FONT>\n");
      out.write("    </div>\n");
      out.write("     ");
String nombreDiseno =(String)session.getAttribute("nombreDisenoRegistrado"); 
       String dimensiones =(String)session.getAttribute("dimensionesRegistrado"); 
       String descripcion =(String)session.getAttribute("descripcionRegistrado"); 
       String nombreArchivo =(String)session.getAttribute("nombreArchivoRegistrado");
       String idDiseno=(String)session.getAttribute("idDisenoRegistrado");
       String precio_diseno=(String)session.getAttribute("precio_diseno");
       double volumen=Double.parseDouble((String)session.getAttribute("volumenRegistrado"));
      
      out.write("\n");
      out.write("        ");
String mensajeAdjuntardiseno =(String)session.getAttribute("mensajeAdjuntardisenoRegistrado");
        if(mensajeAdjuntardiseno!=null){
      out.write("\n");
      out.write("      <FONT SIZE=\"4\"COLOR=\"BLACK\"FACE=\"Verdana\"> <B>");
      out.print(mensajeAdjuntardiseno);
      out.write("</B></FONT>\n");
      out.write("      ");
 } 
       session.setAttribute("mensajeAdjuntardisenoRegistrado", ""); 
      
      out.write("\n");
      out.write("    <input type=\"hidden\" id=\"precio_diseno\" name=\"precio_diseno\" value=\"");
      out.print(precio_diseno);
      out.write("\">\n");
      out.write("    <input type=\"hidden\" id=\"volumen\" name=\"volumen\" value=\"");
      out.print(volumen);
      out.write("\">\n");
      out.write("    <div class=\"hrRojo\"></div><br>\n");
      out.write("    <div  class=\"col-md-6 text-left\">Nombre de diseño:</div>\n");
      out.write("    <div class=\"col-md-4 text-left\" ><input type=\"text\" name=\"NombreDiseno\" id=\"NombreDiseno\" readonly=\"readonly\" value=\"");
      out.print(nombreDiseno);
      out.write("\" size=\"30\"></div><br><br>\n");
      out.write("    <div  class=\"col-md-6 text-left\">Dimensiones:</div>\n");
      out.write("    <div class=\"col-md-4 text-left\" ><input type=\"text\" name=\"Dimensiones:\" id=\"Dimensiones:\" readonly=\"readonly\" value=\"");
      out.print(dimensiones);
      out.write("\" size=\"30\"></div><br><br>\n");
      out.write("    <div  class=\"col-md-6 text-left\">Descripcion:</div>\n");
      out.write("    <div class=\"col-md-4 text-left\" ><input type=\"text\" name=\"Descripcion:\" id=\"Descripcion:\" readonly=\"readonly\" value=\"");
      out.print(descripcion);
      out.write("\" size=\"30\"></div><br><br>\n");
      out.write("     <div  class=\"col-md-6 text-left\">Tipo Material</div>\n");
      out.write("    <div class=\"col-md-4 text-left\" >\n");
      out.write("    <select name=\"ComboMaterial\" class=\"vete-izq\"  id=\"ComboMaterial\">\n");
      out.write("               ");
  
               ControladorEstilo plantilla=new ControladorEstilo();
                String codHtml=plantilla.cargaMateriales();    
                
      out.write("\n");
      out.write("               ");
      out.print(codHtml );
      out.write("\n");
      out.write("    </select>            \n");
      out.write("    </div><br><br>\n");
      out.write("     <div  class=\"col-md-6 text-left\">Tipo Impresora</div>\n");
      out.write("    <div class=\"col-md-4 text-left\" >\n");
      out.write("    <select name=\"ComboTipoImpresora\" class=\"vete-izq\"  id=\"ComboTipoImpresora\">\n");
      out.write("               ");
  
                codHtml=plantilla.cargaTipoImpresoras();    
                
      out.write("\n");
      out.write("               ");
      out.print(codHtml );
      out.write("\n");
      out.write("    </select>            \n");
      out.write("    </div><br><br>\n");
      out.write("    <div  class=\"col-md-6 text-left\">Escala</div>\n");
      out.write("    <div class=\"col-md-4 text-left\" >\n");
      out.write("    <select name=\"ComboEscala\" class=\"vete-izq\"  id=\"ComboEscala\">\n");
      out.write("               ");
  
                codHtml="";
               for(int i=1;i<21;i++){
                double numeroEscala=Math.rint(i*0.1*100)/100;   
                codHtml=codHtml+"<option value='"+numeroEscala+"' >"+numeroEscala+"</option>\n";
               }
                
      out.write("\n");
      out.write("               ");
      out.print(codHtml );
      out.write("\n");
      out.write("    </select>     \n");
      out.write("    </div><br><br>\n");
      out.write("  <div>\n");
      out.write("    <div class=\"col-md-8\" ><IMG SRC=\"/Impresion3d/images/Disenos/");
      out.print(nombreArchivo);
      out.write("\" ></div>\n");
      out.write("    <div class=\"col-md-4\" > \n");
      out.write("    <input id=\"Cotizar\"  onClick=\"cargarCotizar()\" type=\"button\" name=\"Cotizar\" value=\"Cotizar\">\n");
      out.write("    </div>\n");
      out.write("    </div><br><br><br><br><br><br><br><br><br>\n");
      out.write("     <div>\n");
      out.write("    <table id=\"t01\">\n");
      out.write("  <tr>\n");
      out.write("    <th>Id </th>\n");
      out.write("    <th>Nombre</th>\n");
      out.write("    <th>Nro de ejemplares</th>\n");
      out.write("    <th>Precio Unit.</th>\n");
      out.write("    <th> Total</th>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("      <td>");
      out.print(idDiseno);
      out.write("</td>\n");
      out.write("    <td>");
      out.print(nombreDiseno);
      out.write("</td>\n");
      out.write("    <td><select name=\"ComboNroEjemplares\" class=\"vete-izq\"  id=\"ComboNroEjemplares\" onchange=\"calcularTotalRegistrado()\">\n");
      out.write("                <option>Nro.</option>\n");
      out.write("               ");
  
                codHtml="";
               for(int i=1;i<11;i++){
                codHtml=codHtml+"<option value='"+i+"' >"+i+"</option>\n";
               }
                
      out.write("\n");
      out.write("               ");
      out.print(codHtml );
      out.write("\n");
      out.write("            </select> \n");
      out.write("    </td>\n");
      out.write("    <td><input id=\"precioUnitario\"  type=\"text\" name=\"precioUnitario\"  value=\"\"  readonly=\"readonly\"></td>\n");
      out.write("     <td><input id=\"precioTotal\"  type=\"text\" name=\"precioTotal\"  value=\"\"  readonly=\"readonly\"></td>\n");
      out.write("  </tr>\n");
      out.write("    \n");
      out.write("    </table><br><br>\n");
      out.write("    </div> \n");
      out.write("            \n");
      out.write("     <form name=\"formularioAnadirCarrito\" method=\"GET\" action=\"/Impresion3d/AnadirCarrito\" >\n");
      out.write("     <input id=\"AnadirCarrito\"  type=\"submit\" name=\"AnadirCarrito\" value=\"Anadir a Carrito\">\n");
      out.write("     <input type=\"hidden\" id=\"nom_user\" name=\"nom_user\" value=\"");
      out.print(cadena);
      out.write("\">\n");
      out.write("     <input type=\"hidden\" id=\"nom_prod\" name=\"nom_prod\" value=\"");
      out.print(nombreDiseno);
      out.write("\">\n");
      out.write("     \n");
      out.write("     <input type=\"hidden\" id=\"nomMaterial\" name=\"nomMaterial\" value=\"\">\n");
      out.write("     <input type=\"hidden\" id=\"tipoImpresora\" name=\"tipoImpresora\" value=\"\">\n");
      out.write("     <input type=\"hidden\" id=\"escala\" name=\"escala\" value=\"\">\n");
      out.write("     <input type=\"hidden\" id=\"nroEjemplares\" name=\"nroEjemplares\" value=\"\">\n");
      out.write("     <input type=\"hidden\" id=\"HiddenprecioUnitario\" name=\"HiddenprecioUnitario\" value=\"\">     \n");
      out.write("      <input type=\"hidden\" id=\"HiddenSubTotal\" name=\"HiddenSubTotal\" value=\"\"> \n");
      out.write("     </form><br>\n");
      out.write("     \n");
      out.write("     <input id=\"Volver\" onClick=\"parent.location='/Impresion3d/views/ValidarLogin/RealizarPedido.jsp'\" type=\"submit\" name=\"Volver\" value=\"Volver a catalogo\">\n");
      out.write("\n");
      out.write("    \n");
      out.write("    </section>\n");
      out.write("            \n");
      out.write("     <footer>\n");
      out.write("    Copyright © 2016-I \n");
      out.write("    </footer>\n");
      out.write("          \n");
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
