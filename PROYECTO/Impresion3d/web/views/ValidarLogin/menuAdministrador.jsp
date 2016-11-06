<%-- 
    Document   : menuAdministrador
    Created on : 29-jun-2016, 10:38:38
    Author     : Oskar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu Administrador</title>
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css" rel="stylesheet">	
        <link rel="stylesheet" href="/Impresion3d/css/input.css">
        <link rel="stylesheet" href="/Impresion3d/css/table.css">
        <link rel="stylesheet" href="/Impresion3d/css/newcss.css">
        <link rel="stylesheet" href="/Impresion3d/css/style.css" />
    </head>
    <body>
        <header>
       <div class="hrAzul"></div>
    <div class="rectanguloGris">
    <FONT SIZE="6"COLOR="GREEN"FACE="Verdana" class="vete-izq"><B>Bienvenido a la impresion 3D</B></FONT><br><br>
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
          <li><a  href="/Impresion3d/views/IniciarSesionLogin.jsp" title="..."><img src="/Impresion3d/img/vineta.png">Cerrar Sesion</a></li>
          <li><a  href="/Impresion3d/views/Administrar/Usuarios.jsp" title="..."><img src="/Impresion3d/img/vineta.png">Usuarios</a></li>
          <li><a  href="/Impresion3d/views/Administrar/Impresoras.jsp" title="..."><img src="/Impresion3d/img/vineta.png">Impresoras</a></li>
          <li><a  href="/Impresion3d/views/Administrar/Pedidos.jsp" title="..."><img src="/Impresion3d/img/vineta.png">Pedidos</a></li>
         </ul>
    </div><BR>
    </nav>

    <section>
    <div id="page-wrap">
    </div><br><br>
    </section>

    <footer>
    Copyright © Jesus de las Casas
    </footer>
   
    </body>
</html>
