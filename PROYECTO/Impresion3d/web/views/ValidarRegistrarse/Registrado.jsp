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
      <div class="hrRojo"></div>
     <FONT SIZE="5"COLOR="RED"FACE="Verdana"> <B>Registro correcto</B></FONT>
     <div class="hrRojo"></div><br><br>
    <%String cadena ="Nombres : "+(String)session.getAttribute("nombres")+
            "<br>Apellidos : "+(String)session.getAttribute("apellidos")+
            "<br>Dni : "+(String)session.getAttribute("dni")+
            "<br>Fecha de Nacimiento : "+(String)session.getAttribute("bday")+
            "<br>Email : "+(String)session.getAttribute("email")+
            "<br>Telefono : "+(String)session.getAttribute("usrtel")+
            "<br>Cuenta : "+(String)session.getAttribute("cuenta")+
            "<br>Usuario : "+(String)session.getAttribute("usuario")+
            "<br><br>Recuerde su password generado  para poder iniciar sesion<br>Password  : "+(String)session.getAttribute("password"); %> 
    <FONT SIZE="4"COLOR="BLACK"FACE="Verdana"> <B><%=cadena%></B></FONT>
    </div><br><br>
    </section>
     <footer>
    Copyright © 2016-I 
    </footer>     
    </body>
</html>