<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="Controlador.ControladorEstilo"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu Principal Impresion 3d</title>
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css" rel="stylesheet">	
        <link rel="stylesheet" href="/Impresion3d/css/input.css">
        <link rel="stylesheet" href="/Impresion3d/css/table.css">
        <link rel="stylesheet" href="/Impresion3d/css/newcss.css">
         <link rel="stylesheet" href="/Impresion3d/css/style2.css" />
        <link rel="stylesheet" href="/Impresion3d/css/style3.css" />
    </head>
    <body>
    <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Mostrar imagenes</title>
    <script src="http://code.jquery.com/jquery-latest.js"></script>
    <script src="/Impresion3d/js/javascript.js"></script>
    <link href="style.css" type="text/css" rel="stylesheet">
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
   <div style=" width: 1020px; height: 450px; overflow-y: scroll;  overflow-x:scroll" name="formu1" id="formu1" class="container">
   <div class="hrRojo"></div>   
   <div class="text-left">
   <FONT SIZE="5"COLOR="RED"FACE="Verdana"> <B>Ver catalogo</B></FONT>
   </div>
   <div class="hrRojo"></div><br><br> 
    <!--div para mostrar las imagenes pequeñas-->
    <div id='listimages'>
       <%ControladorEstilo plantilla=new ControladorEstilo();
          String codHtml=plantilla.cargaImagenes();
                %>
      <%=codHtml %>
    </div>
    
    <!--div para el fondo de pantalla-->
    <div id='background'></div>
    <!--div para visualizar la imagen grande con el boton cerrar-->
    <div id='preview'><div id='close'></div><div id='content'></div></div><br><br>
    </div>
         
     </section>  
    
     <footer>
    Copyright © 2016-I 
    </footer> 
     </body>
</html>
    
  