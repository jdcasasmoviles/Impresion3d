package org.apache.jsp.views.ValidarLogin.RealizarPedido;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdjuntarDiseno_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Adjuntar Diseño</title>\n");
      out.write("       <link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css\" rel=\"stylesheet\">\t\n");
      out.write("       <style type=\"text/css\">\n");
      out.write("        @import \"/Impresion3d/css/newcss.css\";\n");
      out.write("        @import \"/Impresion3d/css/input.css\";\n");
      out.write("        @import \"/Impresion3d/css/style.css\";\n");
      out.write("        </style>\n");
      out.write("         <script src=\"/Impresion3d/js/packFunciones.js\"></script>\n");
      out.write("</head>\n");
      out.write("    <body>\n");
      out.write("    <header>\n");
      out.write("    <div class=\"hrAzul\"></div>\n");
      out.write("    <div class=\"rectanguloGris\">\n");
      out.write("    <FONT SIZE=\"6\"COLOR=\"GREEN\"FACE=\"Verdana\" class=\"vete-izq\"><B>Bienvenido a la impresion 3D</B></FONT><br><br>\n");
      out.write("    ");
String cadena =(String)session.getAttribute("usuario"); 
    
      out.write(" \n");
      out.write("    <FONT SIZE=\"4\"COLOR=\"BLACK\"FACE=\"Verdana\"> <B> Usuario  : ");
      out.print(cadena);
      out.write("</B></FONT>\n");
      out.write("    </div><br><br>  \n");
      out.write("    <div class=\"hrRojo\"></div>    \n");
      out.write("    </header>\n");
      out.write("    <div class=\"hrRojo\">\n");
      out.write("    </div><br>\n");
      out.write("    <div id=\"page-wrap\"> \n");
      out.write("    <br><br><div class=\"hrRojo\"></div>   \n");
      out.write("    <div class=\"text-left\">\n");
      out.write("       \t<FONT SIZE=\"5\"COLOR=\"RED\"FACE=\"Verdana\"> <B>Adjuntar diseño</B></FONT>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"hrRojo\"></div><br>\n");
      out.write("       ");
String mensaje =(String)session.getAttribute("mensajeDisenoAdjunto");
      if(mensaje!=null){
      out.write("\n");
      out.write("      <FONT SIZE=\"4\"COLOR=\"BLACK\"FACE=\"Verdana\"> <B>");
      out.print(mensaje);
      out.write("</B></FONT>\n");
      out.write("      ");
 } 
       session.setAttribute("mensajeDisenoAdjunto", ""); 
      
      out.write("\n");
      out.write("   \n");
      out.write("    <br><form  name=\"formulario\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("    <input id=\"SeleccionarDiseno\" onchange=\"cargarArchivo()\"   type=\"file\"   name=\"SeleccionarDiseno\" value=\"Seleccionar Archivo\"><br>\n");
      out.write("    <input type=\"hidden\" name=\"nombre\" value=\"\">\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("    <form name=\"formulary\" method=\"GET\" action=\"/Impresion3d/AdjuntarDiseno\">\n");
      out.write("     <input type=\"hidden\" name=\"nombreArchivo\" value=\"\">\n");
      out.write("    <div  class=\"col-md-4 text-left\">Nombre de diseño:</div>\n");
      out.write("    <div class=\"col-md-4 text-left\" ><input type=\"text\" name=\"NombreDiseno\" id=\"NombreDiseno\" value=\"\" size=\"30\"></div><br><br><br>\n");
      out.write("    <div  class=\"col-md-4 text-left\">\n");
      out.write("    \t<FONT SIZE=\"3\"COLOR=\"blue\"FACE=\"Verdana\"> <B>Dimensiones</B></FONT></div><br><br>\n");
      out.write("    <center><table cellpadding=\"5\">\n");
      out.write("    <tr>\n");
      out.write("    <td>Ancho(cm)</td> <td>Largo(cm)</td><td>Altura(cm)</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("    <td><input type=\"number\" name=\"ancho\" id=\"ancho\" value=\"30\" ></td> \n");
      out.write("    <td><input type=\"number\" name=\"largo\" id=\"largo\" value=\"30\" ></td>\n");
      out.write("    <td><input type=\"number\" name=\"altura\" id=\"altura\" value=\"30\"></td>\n");
      out.write("    </tr>\n");
      out.write("    </table></center><br><br>\n");
      out.write("    <div  class=\"col-md-4 text-left\">Descripcion:</div>\n");
      out.write("    <div class=\"col-md-4 text-left\" ><textarea type=\"text\" name=\"Descripcion:\" id=\"Descripcion:\" value=\"\" cols=\"70\"></textarea></div><br><br><br>\n");
      out.write("     <div  class=\"col-md-4 text-left\">Precio Diseño</div>\n");
      out.write("    <div class=\"col-md-4 text-left\" ><input type=\"number\" name=\"PrecioDiseno\" id=\"PrecioDiseno\" value=\"0\" size=\"30\"></div><br><br>\n");
      out.write("    <div  class=\"col-md-4 text-left\">usuario</div>\n");
      out.write("    <div class=\"col-md-4 text-left\" ><input type=\"text\" name=\"Usuario\" id=\"Usuario\" readonly=\"readonly\" value=\"");
      out.print(cadena);
      out.write("\"  size=\"30\"></div><br><br><br>\n");
      out.write("    <input id=\"reset\"  type=\"reset\" name=\"reset\" value=\"Limpiar\">  \n");
      out.write("    <input id=\"Guardar\"   type=\"submit\" name=\"Guardar\" value=\"Guardar\">\n");
      out.write("    </form><br>\n");
      out.write("    <input id=\"Volver\" onClick=\"parent.location='/Impresion3d/views/ValidarLogin/RealizarPedido.jsp'\" type=\"submit\" name=\"Volver\" value=\"Volver al catalogo\">\n");
      out.write("    <input id=\"MenuPrincipal\" onClick=\"parent.location='/Impresion3d/views/ValidarLogin/MenuPrincipal.jsp'\" type=\"submit\" name=\"MenuPrincipal\" value=\"Menu Principal\">\n");
      out.write("    <iframe name=\"null\" style=\"display:none;\"> </iframe>\n");
      out.write("  \n");
      out.write("          \n");
      out.write("    </div>\n");
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
