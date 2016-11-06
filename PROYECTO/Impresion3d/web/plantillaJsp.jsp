<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
     <%String cadena =(String)session.getAttribute("usuario"); %>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu Principal Impresion 3d</title>
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css" rel="stylesheet">	
        <link rel="stylesheet" href="/Impresion3d/css/input.css">
        <link rel="stylesheet" href="/Impresion3d/css/table.css">
        <link rel="stylesheet" href="/Impresion3d/css/newcss.css">
        <link rel="stylesheet" href="/Impresion3d/css/style2.css" >
        <link rel="stylesheet" href="/Impresion3d/css/style4.css" >
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
          <li><a  href="/Impresion3d/views/ValidarLogin/PagarPedido.jsp" title="..."><img src="/Impresion3d/img/vineta.png">Pagar pedido</a></li>
         </ul>
    </div><BR>
    </nav>

    <section>
    </section>

     <footer>
    Copyright © 2016-I 
    </footer>
   

    </body>
  
</html>
