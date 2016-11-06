<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Impresion 3d</title>
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css" rel="stylesheet">	
         <link rel="stylesheet" href="/Impresion3d/css/input.css">
        <link rel="stylesheet" href="/Impresion3d/css/table.css">
        <link rel="stylesheet" href="/Impresion3d/css/newcss.css">
         <link rel="stylesheet" href="/Impresion3d/css/style2.css" />         
    </head>
    <body>
        
    <header>
       <div class="hrAzul"></div>
    <div class="rectanguloGris">
    <FONT SIZE="6"COLOR="GREEN"FACE="Verdana" class="vete-izq"><B>Bienvenido a la impresion 3D</B></FONT><br><br>
    </div><br><br>       
    <div class="hrRojo"></div>    
    </header>
                 
    <nav>
    <br><FONT SIZE="4"COLOR="RED"FACE="Verdana" class="vete-izq"><B>Opciones</B></FONT><img align="right" src="/Impresion3d/img/vineta2.png">
    <br><hr class="hrNegro">
    <div id="menu" >
          <ul>
            <li><a  href="/Impresion3d/views/VerCatalogo.jsp" title="..."><img src="/Impresion3d/img/vineta.png">Ver Catalogo</a></li>
            <li><a href="/Impresion3d/views/IniciarSesionLogin.jsp" title="..."><img src="/Impresion3d/img/vineta.png">Iniciar Sesion</a></li>
            <li><a href="/Impresion3d/views/Registrarse.jsp" title="..."><img src="/Impresion3d/img/vineta.png">Registrarse</a></li>
            <li><a href="/Impresion3d/index.jsp" title="..."><img src="/Impresion3d/img/vineta.png">Inicio</a></li>
          </ul>
    </div><BR>
    </nav>

    <section>
    <div id="page-wrap">
       <!--LOGIN-------------------------------------------------------------------------->
    <br><br>
    <div class="rectanguloBlanco" >
    <div class="hrRojo"></div>      
    <center><FONT SIZE="5"COLOR="RED"FACE="Verdana">Autentificaci&#243;n de Usuario</FONT></center>
    <div class="hrRojo"></div> 
    </div><br>
    <form method="GET" name="formu1" id="formu1" action="/Impresion3d/SesionLogin" >
        <div class="rectangulo" align="center"><br><br>
        <p class="text-center negro">
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Usuario:
        <input type="text" id="usuario" name="usuario" value="" size="20" maxlength="25"><br><br>
        Contraseña:
         <input type="password" id="password" name="password" value="" size="20" maxlength="25"><br><br>
         <input type="image" src="../img/Ingresar.png"><br><br>
         <%String cadena =(String)session.getAttribute("mensajeLogin"); %> 
         <%
         if(cadena!=null){%>
         <FONT SIZE="4"COLOR="BLACK"FACE="Verdana"> <B><%=cadena%></B></FONT>
         <% }
         session.setAttribute("mensajeLogin", "");  
         %>
        </div>
    </form> 
     
    </div><br><br>
    </section>
     <footer>
    Copyright © 2016-I 
    </footer>     
    </body>
</html>