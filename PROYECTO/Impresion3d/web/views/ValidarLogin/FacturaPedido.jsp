<%@page import="Controlador.ControladorEstilo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%String cadena =(String)session.getAttribute("usuario"); %>
<%String id_factura =(String)session.getAttribute("id_factura"); %>
<%String datosParaFactura =(String)session.getAttribute("datosParaFactura"); %>
<%String datosEntregaPedido =(String)session.getAttribute("datosEntregaPedido"); %>
<%String mensajePago =(String)session.getAttribute("mensajePago"); %>
<% session.setAttribute("Monto",null);%> 
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
    <FONT SIZE="4"COLOR="BLACK"FACE="Verdana"> <B>Usuario : <%=cadena%></B></FONT>
    </div><br><br>       
    <div class="hrRojo"></div>    
    </header>
               
    <nav>
    <br><FONT SIZE="4" COLOR="RED"FACE="Verdana" class="vete-izq"><B>Opciones</B></FONT><img align="right" src="/Impresion3d/img/vineta2.png">
    <br><hr class="hrNegro">
    <div id="menu" >
        <ul>
         <li><a  href="/Impresion3d/CerrarSesion" title="..."><img src="/Impresion3d/img/vineta.png">Cerrar Sesion</a></li>
          <li><a  href="/Impresion3d/views/ValidarLogin/RealizarPedido.jsp" title="..."><img src="/Impresion3d/img/vineta.png">Realizar pedido</a></li>
         <li><a  href="/Impresion3d/views/ValidarLogin/CotizarPedido.jsp" title="..."><img src="/Impresion3d/img/vineta.png">Cotizar pedido</a></li>  
        </ul>
    </div><BR>
    </nav>

    <section>
     <div>
    <div class="hrRojo"></div>   
    <div class="text-left">
    <FONT SIZE="5"COLOR="RED"FACE="Verdana"> <B>Factura de pedido</B></FONT>
    </div>
    <div class="hrRojo"></div><br><br>
    <div  class='col-md-12 text-left'>  
    <FONT SIZE="3" COLOR="BLUE"FACE="Verdana"> 
    <B>Datos de la factura :</B>
    </FONT>
    <%=datosParaFactura%>
    </div><br><br>
     <div  class='col-md-12 text-left'>  
    <FONT SIZE="3" COLOR="BLUE"FACE="Verdana"> 
    <B>Datos de la entrega :</B>
    </FONT>
    <%=datosEntregaPedido%>
    </div><br><br>
     <%ControladorEstilo plantilla=new ControladorEstilo();
          String codHtml=plantilla.cargarTablaFactura(id_factura);
                %>
      <%=codHtml %>
    </div><br><br>    
    </section>

     <footer>
    Copyright © 2016-I 
    </footer>
   

    </body>
  
</html>
