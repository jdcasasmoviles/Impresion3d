package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class VerCatalogo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Menu Principal Impresion 3d</title>\n");
      out.write("        <link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css\" rel=\"stylesheet\">\t\n");
      out.write("        <link rel=\"stylesheet\" href=\"/Impresion3d/css/input.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"/Impresion3d/css/table.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"/Impresion3d/css/newcss.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"/Impresion3d/css/style.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Mostrar imagenes</title>\n");
      out.write("    <script src=\"http://code.jquery.com/jquery-latest.js\"></script>\n");
      out.write("    <script src=\"/Impresion3d/javascript.js\"></script>\n");
      out.write("    <link href=\"style.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("        <header>\n");
      out.write("       <div class=\"hrAzul\"></div>\n");
      out.write("    <div class=\"rectanguloGris\">\n");
      out.write("    <FONT SIZE=\"6\"COLOR=\"GREEN\"FACE=\"Verdana\" class=\"vete-izq\"><B>Bienveido a la impresion 3D</B></FONT><br><br>\n");
      out.write("    </div><br><br>       \n");
      out.write("    <div class=\"hrRojo\"></div>    \n");
      out.write("    </header>\n");
      out.write("                 \n");
      out.write("    <nav>\n");
      out.write("    <FONT SIZE=\"2\"COLOR=\"RED\"FACE=\"Verdana\" class=\"vete-izq\"><B>Opciones</B></FONT><img align=\"right\" src=\"img/vineta2.png\">\n");
      out.write("    <br><br><hr class=\"hrNegro\">\n");
      out.write("    <div id=\"menu\" >\n");
      out.write("        <ul>\n");
      out.write("            <li><a  href=\"VerCatalogo.jsp\" title=\"...\"><img src=\"img/vineta.png\">Ver Catalogo</a></li>\n");
      out.write("            <li><a href=\"/Impresion3d/views/IniciarSesionLogin.jsp\" title=\"...\"><img src=\"img/vineta.png\">Iniciar Sesion</a></li>\n");
      out.write("            <li><a href=\"/Impresion3d/views/Registrarse.jsp\" title=\"...\"><img src=\"img/vineta.png\">Registrarse</a></li>\n");
      out.write("         </ul>\n");
      out.write("    </div><BR>\n");
      out.write("    </nav>\n");
      out.write("     <section>\n");
      out.write("   <div style=\" width: 1020px; height: 450px; overflow-y: scroll;  overflow-x:scroll\" name=\"formu1\" id=\"formu1\" class=\"container\">\n");
      out.write("    <FONT SIZE=\"5\"COLOR=\"BLUE\"FACE=\"Verdana\"> <B>    Ver catalogo</B></FONT><br><br>  \n");
      out.write("    <!--div para mostrar las imagenes pequeñas-->\n");
      out.write("    <div id='listimages'>\n");
      out.write("        <img src='img1.jpg'>\n");
      out.write("        <img src='img2.jpg'>\n");
      out.write("        <img src='img3.jpg'>\n");
      out.write("        <img src='img4.jpg'>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <!--div para el fondo de pantalla-->\n");
      out.write("    <div id='background'></div>\n");
      out.write("    <!--div para visualizar la imagen grande con el boton cerrar-->\n");
      out.write("    <div id='preview'><div id='close'></div><div id='content'></div></div>\n");
      out.write("    </div>\n");
      out.write("     </section>     \n");
      out.write("     </body>\n");
      out.write("</html>\n");
      out.write("    \n");
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
