<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="Controlador.ControladorEstilo"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Impresion 3d</title>
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css" rel="stylesheet">	
        <link rel="stylesheet" href="css/input.css">
        <link rel="stylesheet" href="css/table.css">
        <link rel="stylesheet" href="css/newcss.css">
        <link rel="stylesheet" href="css/style2.css" />
        <link rel="stylesheet" href="css/style4.css" />
          <script src="/Impresion3d/js/javascript.js"></script>
    </head>
    <body>
        
    <header>
    <div class="hrAzul"></div>
    <div class="rectanguloGris">
    <FONT SIZE="6"COLOR="GREEN"FACE="Verdana" class="vete-izq"><B>Bienvenido a la impresion 3D</B></FONT>
    </div>
    <div class="hrRojo"></div>    
    </header>
                 
    <nav>
    <br><FONT SIZE="4"COLOR="RED"FACE="Verdana" class="vete-izq"><B>Opciones</B></FONT><img align="right" src="img/vineta2.png">
    <br><br><hr class="hrNegro">
    <div id="menu" >
          <ul>
            <li><a  href="/Impresion3d/views/VerCatalogo.jsp" title="..."><img src="/Impresion3d/img/vineta.png">Ver Catalogo</a></li>
            <li><a href="/Impresion3d/views/IniciarSesionLogin.jsp" title="..."><img src="/Impresion3d/img/vineta.png">Iniciar Sesion</a></li>
            <li><a href="/Impresion3d/views/Registrarse.jsp" title="..."><img src="/Impresion3d/img/vineta.png">Registrarse</a></li>
          </ul>
    </div><BR><br>
    <img src="/Impresion3d/img/catalogoImagen.png" > 
    </nav>

    <section>
      <%ControladorEstilo plantilla=new ControladorEstilo();
          String codHtml=plantilla.htmlEstilo();
                %>
      <%=codHtml %>
    </section>

    <footer>
    Copyright © 2016-I 
    </footer>
   

    </body>
</html>
