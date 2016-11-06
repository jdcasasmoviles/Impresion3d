<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="Controlador.ControladorEstilo"%>
  <%String cadena =(String)session.getAttribute("usuario"); %>
     <%if(cadena!=null){%>
<!DOCTYPE html>
<html>
  <head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"  >
    <title>Realizar pedido</title>
       <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css" rel="stylesheet">	
       <style type="text/css">
        @import "/Impresion3d/css/newcss.css";
        @import "/Impresion3d/css/input.css";
        @import "/Impresion3d/css/style2.css";
        @import "/Impresion3d/css/style3.css";
        </style>
        <script src="http://code.jquery.com/jquery-latest.js"></script>
       <script src="/Impresion3d/js/javascript.js"></script>
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
    <br><FONT SIZE="4"COLOR="RED"FACE="Verdana"> <B>    Realizar pedido</B></FONT> 
    <br><hr class="hrNegro">
    <div id="menu" >
        <ul>
         <li><a  href="/Impresion3d/views/ValidarLogin/RealizarPedido/AdjuntarDiseno.jsp" title="..."><img src="/Impresion3d/img/vineta.png">Adjuntar Diseño</a></li>
          <li><a  href="/Impresion3d/views/ValidarLogin/MenuPrincipal.jsp" title="..."><img src="/Impresion3d/img/vineta.png">Menu Principal</a></li> 
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
          String codHtml=plantilla.cargaImagenesRegistrado();
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
  <%}%>