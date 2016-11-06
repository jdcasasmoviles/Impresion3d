<%-- 
    Document   : Pedidos
    Created on : 29-jun-2016, 12:44:47
    Author     : Oskar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
        <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Administrar Pedidos</title>
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css" rel="stylesheet">	
        <link rel="stylesheet" href="/Impresion3d/css/input.css">
        <link rel="stylesheet" href="/Impresion3d/css/table.css">
        <link rel="stylesheet" href="/Impresion3d/css/newcss.css">
        <link rel="stylesheet" href="/Impresion3d/css/style.css" />
    </head>
    <body>
        <script type="text/javascript">
function mostrarCrear(){
document.getElementById('oculto1').style.display = 'block';
document.getElementById('oculto2').style.display = 'none';
document.getElementById('oculto3').style.display = 'none';}
function mostrarModificar(){
document.getElementById('oculto2').style.display = 'block';
document.getElementById('oculto1').style.display = 'none';
document.getElementById('oculto3').style.display = 'none';}
function mostrarEliminar(){
document.getElementById('oculto3').style.display = 'block';
document.getElementById('oculto1').style.display = 'none';
document.getElementById('oculto2').style.display = 'none';}
</script>
        
        <header>
       <div class="hrAzul"></div>
    <div class="rectanguloGris">
    <FONT SIZE="6"COLOR="GREEN"FACE="Verdana" class="vete-izq"><B>Crear, Eliminar, Modificar Pedidos</B></FONT><br><br>
    <%String cadena ="Administrador"; %> 
    <FONT SIZE="4"COLOR="BLACK"FACE="Verdana"> <B><%=cadena%></B></FONT>
    </div><br><br>       
    <div class="hrRojo"></div>    
    </header>
    
    <nav>
    <FONT SIZE="2"COLOR="RED"FACE="Verdana" class="vete-izq"><B>Opciones</B></FONT><img align="right" src="/Impresion3d/img/vineta2.png">
    <br><br><hr class="hrNegro">
    <div id="menu" >
        <ul>
          <li><a  href="/Impresion3d/views/ValidarLogin/menuAdministrador.jsp" title="..."><img src="/Impresion3d/img/vineta.png">Menu</a></li>
          <li><button value="Crear" onclick="mostrarCrear()"><img  src='/Impresion3d/img/vineta.png' > Crear Pedido</button></li>
          <li><button value="Crear" onclick="mostrarModificar()"><img  src='/Impresion3d/img/vineta.png' > Modificar Pedido</button></li>
          <li><button value="Crear" onclick="mostrarEliminar()"><img  src='/Impresion3d/img/vineta.png' > Eliminar Pedido</button></li>
         </ul>
    </div><BR>
    </nav>

    <section>
    <div id="page-wrap">
    </div><br><br>
    </section>

    <section>
     <div id="oculto1" style='display:none;'>
    <div class="hrRojo"'>
    <FONT SIZE="5"COLOR="RED"FACE="Verdana"> <B>    Crear Pedido</B></FONT>
    </div><br><br><br><br>
    <form method="GET" action="/Impresion3d/Registrarse" >
    Impresora : <input type="text" name="impresora" id="impresora"><br><br>
    Material :<input type="text" name="material" id="material"><br><br>
    Diseño :<input type="text" name="diseño" id="diseño"><br><br>
    <input type="submit" name="registrar" value="Registar Pedido" id="registrar"><br><br>
    </form>
    </div>    
        
        
     <div id="oculto2" style='display:none;'>
    <div class="hrRojo"'>
    <FONT SIZE="5"COLOR="RED"FACE="Verdana"> <B>    Modificar Pedido</B></FONT>
    </div><br><br><br><br>
    IdPedido : <input type="text" name="idPedido" id="idPedido"><input type="button" value="buscar" name="go" id="go"><br><br>
    <form method="GET" action="/Impresion3d/Registrarse"> <%-- id="ocultoMod" style="display:none"--%>
    Impresora : <input type="text" name="impresora" id="impresora"><br><br>
    Material :<input type="text" name="material" id="material"><br><br>
    Diseño :<input type="text" name="diseño" id="diseño"><br><br>
    <input type="submit" name="modificar" value="Guardar Cambios" id="modificar"><br><br>
    </form>
    </div> 
        
          <div id="oculto3" style='display:none;'>
    <div class="hrRojo"'>
    <FONT SIZE="5"COLOR="RED"FACE="Verdana"> <B>    Eliminar Pedido</B></FONT>
    </div><br><br><br><br>
    IdPedido : <input type="text" name="idPedido" id="idPedido"><input type="button" value="buscar" name="go" id="go"><br><br>
    <form method="GET" action="/Impresion3d/Registrarse" >
    Impresora : <input type="text" name="impresora" id="impresora"><br><br>
    Material :<input type="text" name="material" id="material"><br><br>
    Diseño :<input type="text" name="diseño" id="diseño"><br><br>
    <input type="submit" name="eliminar" value="Eliminar" id="eliminar"><br><br>
    </form>
    </div> 
    </section>
   
    </body>
</html>
