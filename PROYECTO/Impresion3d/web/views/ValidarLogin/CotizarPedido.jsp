<%@page import="Controlador.ControladorEstilo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%String cadena =(String)session.getAttribute("usuario"); %> 
    <%if(cadena!=null){%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu Principal Impresion 3d</title>
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css" rel="stylesheet">	
         <style type="text/css">
        @import "/Impresion3d/css/newcss.css";
        @import "/Impresion3d/css/input.css";
        @import "/Impresion3d/css/style2.css";
        @import "/Impresion3d/css/table2.css";
        </style>
    </head>
    <body>

    <header>
       <div class="hrAzul"></div>
    <div class="rectanguloGris">
    <FONT SIZE="6"COLOR="GREEN"FACE="Verdana" class="vete-izq"><B>Bienvenido a la impresion 3D</B></FONT><br><br>
    
    <FONT SIZE="4"COLOR="BLACK"FACE="Verdana"> <B>Usuario  : <%=cadena%></B></FONT>
    </div><br><br>       
    <div class="hrRojo"></div>    
    </header>
               
    <nav>
    <br><FONT SIZE="4"COLOR="RED"FACE="Verdana" class="vete-izq"><B>Opciones</B></FONT><img align="right" src="/Impresion3d/img/vineta2.png">
    <br><hr class="hrNegro">
    <div id="menu" >
        <ul>
          <li><a  href="/Impresion3d/CerrarSesion" title="..."><img src="/Impresion3d/img/vineta.png">Cerrar Sesion</a></li>  
          <li><a  href="/Impresion3d/views/ValidarLogin/RealizarPedido.jsp" title="..."><img src="/Impresion3d/img/vineta.png">Realizar pedido</a></li>
          <li><a  href="/Impresion3d/views/ValidarLogin/CotizarPedido.jsp" title="..."><img src="/Impresion3d/img/vineta.png">Cotizar pedido</a></li>
          <li><a  href="/Impresion3d/views/ValidarLogin/PagarPedido.jsp" title="..."><img src="/Impresion3d/img/vineta.png">Pagar pedido</a></li>
          <li><a  href="/Impresion3d/views/ValidarLogin/MenuPrincipal.jsp" title="..."><img src="/Impresion3d/img/vineta.png">Menu Principal</a></li> 
        </ul>
    </div><BR>
    </nav>

    <section>
    <div>
    <div class="hrRojo"></div>   
    <div class="text-left">
    <FONT SIZE="5"COLOR="RED"FACE="Verdana"> <B>Cotizar pedido</B></FONT>
    </div>
    <div class="hrRojo"></div><br><br> 
     <%String mensajeErrorEliminar =(String)session.getAttribute("mensajeErrorEliminar"); %> 
     <%
     if(mensajeErrorEliminar!=null){%>
     <FONT SIZE="4"COLOR="BLACK"FACE="Verdana"> <B><%=mensajeErrorEliminar%></B></FONT>
     <% }
     session.setAttribute("mensajeErrorEliminar", "");  
     %>
     <%ControladorEstilo plantilla=new ControladorEstilo();
     String codHtml=plantilla.cargarTablaCotizar(cadena);
     %>
     <%=codHtml %>
    </div><br><br>
    </section>

      <footer>
    Copyright © 2016-I 
    </footer>
 
    </body>
</html>
</html>
<%}%>