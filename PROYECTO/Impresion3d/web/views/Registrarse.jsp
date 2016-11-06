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
        <link rel="stylesheet" href="/Impresion3d/css/style.css" />
    </head>        
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
    <img src="/Impresion3d/img/catalogoImagen.png" > 
    </nav>

    <section>
     <div id="page-wrap">
    <div class="hrRojo"></div>
    <FONT SIZE="5"COLOR="RED"FACE="Verdana"> <B>    Registro de  Personas</B></FONT>
     <div class="hrRojo"></div><br><br>
    <form method="GET" action="/Impresion3d/Registrarse" >
    <div class="col-md-6 text-left" >   
    Nombres :
    </div> 
    <div class="col-md-6 text-left" >
    <input type="text" name="nombres" id="nombres" maxlength="100">
    </div><br><br>
    <div class="col-md-6 text-left" >
    Apellidos :
    </div>
    <div class="col-md-6 text-left" >
    <input type="text" name="apellidos" id="apellidos" maxlength="100">
    </div><br><br>
    <div class="col-md-6 text-left" >
    Dni :
    </div>
    <div class="col-md-6 text-left" >
    <input type="number" name="dni" id="dni" >
    </div><br><br>
    <div class="col-md-6 text-left" >
    Fecha Nacimiento : 
    </div>
     <div class="col-md-6 text-left" >
    <input type="date" name="bday" id="bday">
    </div><br><br>
    <div class="col-md-6 text-left" >    
    E-mail: 
    </div>
    <div class="col-md-6 text-left" >
    <input type="email" name="email" id="email" min="1930-01-01" max="1997-12-30">
    </div><br><br>
    <div class="col-md-6 text-left" >
    Telefono :
    </div>
    <div class="col-md-6 text-left" >    
    <input type="tel" name="usrtel" id="usrtel">
    </div><br><br>
    <div class="col-md-6 text-left" >
    Nro cuenta bancaria  :
    </div>
    <div class="col-md-6 text-left" >    
    <input type="text" name="cuenta" id="cuenta"maxlength="20" >
    </div><br><br>
    <div class="col-md-6 text-left" >Usuario :
    </div>
     <div class="col-md-6 text-left" >
    <input type="text" name="usuario" id="usuario" maxlength="100">
    </div><br><br><br>
    <div class="col-md-6 text-left" >
    <input type="submit" name="registrar" value="Registar" id="registrar">
    </div><br><br>
    </form>
    </div>    
    </section>
      <footer>
    Copyright © 2016-I 
    </footer>    
    </body>
</html>