<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
    <%String cadena =(String)session.getAttribute("usuario"); 
    if(cadena!=null){
    %> 
<html>
  <head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"  >
    <title>Adjuntar Diseño</title>
       <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css" rel="stylesheet">	
       <style type="text/css">
        @import "/Impresion3d/css/newcss.css";
        @import "/Impresion3d/css/input.css";
        @import "/Impresion3d/css/style.css";
        </style>
         <script src="/Impresion3d/js/packFunciones.js"></script>
</head>
    <body>
    <header>
    <div class="hrAzul"></div>
    <div class="rectanguloGris">
    <FONT SIZE="6"COLOR="GREEN"FACE="Verdana" class="vete-izq"><B>Bienvenido a la impresion 3D</B></FONT><br><br>
    <FONT SIZE="4"COLOR="BLACK"FACE="Verdana"> <B> Usuario  : <%=cadena%></B></FONT>
    </div><br><br>  
    <div class="hrRojo"></div>    
    </header>
    <div class="hrRojo">
    </div><br>
    <div id="page-wrap"> 
    <br><br><div class="hrRojo"></div>   
    <div class="text-left">
       	<FONT SIZE="5"COLOR="RED"FACE="Verdana"> <B>Adjuntar diseño</B></FONT>
    </div>
    <div class="hrRojo"></div><br>
       <%String mensaje =(String)session.getAttribute("mensajeDisenoAdjunto");
      if(mensaje!=null){%>
      <FONT SIZE="3"COLOR="BLACK"FACE="Verdana"> <B><%=mensaje%></B></FONT>
      <% } 
       session.setAttribute("mensajeDisenoAdjunto", ""); 
      %>
   
    <br><form  name="formulario" method="post" enctype="multipart/form-data">
    <input id="SeleccionarDiseno" onchange="cargarArchivo()"   type="file"   name="SeleccionarDiseno" value="Seleccionar Archivo"><br>
    <input type="hidden" name="nombre" value="">
    </form>

    <form name="formulary" method="GET" action="/Impresion3d/AdjuntarDiseno">
     <input type="hidden" name="nombreArchivo" value="">
    <div  class="col-md-4 text-left">Nombre de diseño:</div>
    <div class="col-md-4 text-left" ><input type="text" name="NombreDiseno" id="NombreDiseno" value="" size="30"></div><br><br><br>
    <div  class="col-md-4 text-left">
    	<FONT SIZE="3"COLOR="blue"FACE="Verdana"> <B>Dimensiones</B></FONT></div><br><br>
    <center><table cellpadding="5">
    <tr>
    <td>Ancho(cm)</td> <td>Largo(cm)</td><td>Altura(cm)</td>
    </tr>
    <tr>
    <td><input type="number" name="ancho" id="ancho" value="30" max="100" ></td> 
    <td><input type="number" name="largo" id="largo" value="30"  max="100" ></td>
    <td><input type="number" name="altura" id="altura" value="30" max="100" ></td>
    </tr>
    </table></center><br><br>
    <div  class="col-md-4 text-left">Descripcion:</div>
    <div class="col-md-4 text-left" ><textarea type="text" name="Descripcion:" id="Descripcion:" value="" cols="70"></textarea></div><br><br><br>
     <div  class="col-md-4 text-left">Precio Diseño</div>
    <div class="col-md-4 text-left" ><input type="number" name="PrecioDiseno" id="PrecioDiseno" value="0" size="30" max="100" ></div><br><br>
    <div  class="col-md-4 text-left">usuario</div>
    <div class="col-md-4 text-left" ><input type="text" name="Usuario" id="Usuario" readonly="readonly" value="<%=cadena%>"  size="30"></div><br><br><br>
    <input id="reset"  type="reset" name="reset" value="Limpiar">  
    <input id="Guardar"   type="submit" name="Guardar" value="Guardar">
    </form><br>
    <input id="Volver" onClick="parent.location='/Impresion3d/views/ValidarLogin/RealizarPedido.jsp'" type="submit" name="Volver" value="Volver al catalogo">
    <input id="MenuPrincipal" onClick="parent.location='/Impresion3d/views/ValidarLogin/MenuPrincipal.jsp'" type="submit" name="MenuPrincipal" value="Menu Principal">
    <iframe name="null" style="display:none;"> </iframe>
  
          
    </div>
    </body>
</html>
<%}%>