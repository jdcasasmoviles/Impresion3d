<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
  <%String cadena =(String)session.getAttribute("usuario");
     if(cadena!=null){%>  
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu Principal Impresion 3d</title>
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css" rel="stylesheet">	
        <link rel="stylesheet" href="/Impresion3d/css/input.css">
        <link rel="stylesheet" href="/Impresion3d/css/table.css">
        <link rel="stylesheet" href="/Impresion3d/css/newcss.css">
        <link rel="stylesheet" href="/Impresion3d/css/style.css" />
        <script src="/Impresion3d/js/packFunciones.js"></script>
    </head>
    <body>
     
    <header>
       <div class="hrAzul"></div>
    <div class="rectanguloGris">
    <FONT SIZE="6"COLOR="GREEN"FACE="Verdana" class="vete-izq"><B>Bienvenido a la impresion 3D</B></FONT><br><br>
    <% String monto =(String)session.getAttribute("Monto");%> 
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
    <div id="page-wrap">
    <div class="hrRojo"></div>   
    <div class="text-left">
    <FONT SIZE="5"COLOR="RED"FACE="Verdana"> <B>Pagar pedido</B></FONT>
    </div>
    <div class="hrRojo"></div>   
    <%String mensajePago =(String)session.getAttribute("mensajePago"); 
    if(mensajePago!=null){
    %>
     <br><FONT SIZE="4"COLOR="BLACK"FACE="Verdana"> <B><%=mensajePago%></B></FONT><br><br>
    <%}%> 
    <%
   if(monto!=null && !monto.equals("")){%>
   <form id="FormularioDatosEntrega" name="DatosEntrega" method="GEt" action="/Impresion3d/PagarPedido">    
   <div  class='col-md-6 text-left'> Total a pagar   :</div>
   <div  class='col-md-4 text-left'><input type="text" name="TotalPagar" id="TotalPagar" value="<%=monto%>" readonly="readonly"></div><br><br>
   <div  class='col-md-6 text-left'> Forma de pago   :</div>
   <div  class='col-md-4 text-left'> 
   <select name="FormaPago"   style="width: 160px" id="FormaPago" >
         	<option value="Tarjeta">Tarjeta</option>
		<option value="Vale">Vale</option>
   </select>
   </div><br><br> 
   <div  class='col-md-6 text-left'>  
    <FONT SIZE="3" COLOR="BLUE"FACE="Verdana"> 
    <B>Forma de entrega :</B>
   </FONT>
   </div><br><br>
    <div  class='col-md-6 text-left'> 
    <input type="checkbox" id="RecogerTienda" name="RecogerTienda" value="RecogerTienda" onclick="formaEntregaTienda()">Recoger tienda
    </div><br><br>
    <div  class='col-md-6 text-left'> 
    <input type="checkbox" id="EnviarDestino" name="EnviarDestino" value="EnviarDestino" onclick="formaEntregaDestino()">Enviar a destino
    </div><br><br><br>
    <div id="DatosEntrega"></div>
    <input type="hidden" name="nomUsuario" value="<%=cadena%>">
    <div  class='col-md-6 text-left'>
    <input id="ConfirmarImpresion"  type="submit" name="ConfirmarImpresion" value="Confirmar Impresion">
    </div><br><br>
    </form>
    <div  class='col-md-3 text-left'>
     <input id="ConfirmarImpresion"  onClick="parent.location='/Impresion3d/views/ValidarLogin/PagarPedido.jsp'" type="submit" name="ConfirmarImpresion" value="Limpiar">
    </div><br>
     <% }
         session.setAttribute("mensajePago", "");  
     %>   
    </div>
   
    </section>

      <footer>
    Copyright © 2016-I 
    </footer>
    </body>
</html>
 <%}%>
