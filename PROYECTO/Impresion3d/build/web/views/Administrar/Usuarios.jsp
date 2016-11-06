<%-- 
    Document   : Usuarios
    Created on : 29-jun-2016, 12:43:04
    Author     : Oskar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Administrar Usuarios</title>
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
    <FONT SIZE="6"COLOR="GREEN"FACE="Verdana" class="vete-izq"><B>Crear, Eliminar, Modificar Usuarios</B></FONT><br><br>
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
          <li><button value="Crear" onclick="mostrarCrear()"><img  src='/Impresion3d/img/vineta.png' > Crear Usuario</button></li>
          <li><button value="Crear" onclick="mostrarModificar()"><img  src='/Impresion3d/img/vineta.png' > Modificar Usuario</button></li>
          <li><button value="Crear" onclick="mostrarEliminar()"><img  src='/Impresion3d/img/vineta.png' > Eliminar Usuario</button></li>
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
    <FONT SIZE="5"COLOR="RED"FACE="Verdana"> <B>    Crear Usuario</B></FONT>
    </div><br><br><br><br>
    <form method="GET" action="/Impresion3d/Registrarse" >
    Nombres : <input type="text" name="nombres" id="nombres"><br><br>
    Apellidos :<input type="text" name="apellidos" id="apellidos"><br><br>
    Dni :<input type="text" name="dni" id="dni"><br><br>
    Fecha Nacimiento : <input type="date" name="bday" id="bday"><br><br>
    E-mail: <input type="email" name="email" id="email"><br><br>
    Telefono :<input type="tel" name="usrtel" id="usrtel"><br><br>
    Nro cuenta bancaria  :<input type="text" name="cuenta" id="cuenta"><br><br>
    Usuario :<input type="text" name="usuario" id="usuario"><br><br>
    <input type="submit" name="registrar" value="Registar" id="registrar"><br><br>
    </form>
    </div>    
        
        
     <div id="oculto2" style='display:none;'>
    <div class="hrRojo"'>
    <FONT SIZE="5"COLOR="RED"FACE="Verdana"> <B>    Modificar Usuario</B></FONT>
    </div><br><br><br><br>
    IdUsuario : <input type="text" name="idUser" id="idUser"><input type="button" value="buscar" name="go" id="go"><br><br>
    <form method="GET" action="/Impresion3d/Registrarse"> <%-- id="ocultoMod" style="display:none"--%>
    Nombres : <input type="text" name="nombres" id="nombres"><br><br>
    Apellidos :<input type="text" name="apellidos" id="apellidos"><br><br>
    Dni :<input type="text" name="dni" id="dni"><br><br>
    Fecha Nacimiento : <input type="date" name="bday" id="bday"><br><br>
    E-mail: <input type="email" name="email" id="email"><br><br>
    Telefono :<input type="tel" name="usrtel" id="usrtel"><br><br>
    Nro cuenta bancaria  :<input type="text" name="cuenta" id="cuenta"><br><br>
    Usuario :<input type="text" name="usuario" id="usuario"><br><br>
    <input type="submit" name="modificar" value="Guardar Cambios" id="modificar"><br><br>
    </form>
    </div> 
        
          <div id="oculto3" style='display:none;'>
    <div class="hrRojo"'>
    <FONT SIZE="5"COLOR="RED"FACE="Verdana"> <B>    Eliminar Usuario</B></FONT>
    </div><br><br><br><br>
    IdUsuario : <input type="text" name="idUser" id="idUser"><input type="button" value="buscar" name="go" id="go"><br><br>
    <form method="GET" action="/Impresion3d/Registrarse" >
    Nombres : <input type="text" name="nombres" id="nombres"><br><br>
    Apellidos :<input type="text" name="apellidos" id="apellidos"><br><br>
    Usuario :<input type="text" name="usuario" id="usuario"><br><br>
    <input type="submit" name="eliminar" value="Eliminar" id="eliminar"><br><br>
    </form>
    </div> 
    </section>
   
    </body>
</html>
