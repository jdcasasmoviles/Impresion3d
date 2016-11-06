<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="Controlador.ControladorEstilo"%>
  <%String cadena =(String)session.getAttribute("usuario"); 
    if(cadena!=null){
    %> 
<!DOCTYPE html>
<html>
  <head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"  >
    <title>Seleccionar Diseño</title>
       <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css" rel="stylesheet">	
         <style type="text/css">
        @import "/Impresion3d/css/newcss.css";
        @import "/Impresion3d/css/input.css";
        @import "/Impresion3d/css/style2.css";
        @import "/Impresion3d/css/table2.css";
        </style>
        <script src="/Impresion3d/js/packFunciones.js"></script>
</head>
    <body>
    <header>
    <div class="hrAzul"></div>
    <div class="rectanguloGris">
    <FONT SIZE="6"COLOR="GREEN"FACE="Verdana" class="vete-izq"><B>Bienvenido a la impresion 3D</B></FONT><br><br>
    <FONT SIZE="4"COLOR="BLACK"FACE="Verdana"> <B>Usuario  : <%=cadena%></B></FONT>
    </div><br><br>  
    <div class="hrRojo"></div>    
    </header>
    <div class="hrRojo"></div><br><br>
    <nav>
    <FONT SIZE="2"COLOR="RED"FACE="Verdana" class="vete-izq"><B>Opciones</B></FONT><img align="right" src="/Impresion3d/img/vineta2.png">
    <br><br><hr class="hrNegro">
    <div id="menu" >
        <ul>
          <li><a  href="/Impresion3d/RegistrarPedido" title="..."><img src="/Impresion3d/img/vineta.png">Añadir a Carrito</a></li>
          <li><a  href="/Impresion3d/views/ValidarLogin/RealizarPedido.jsp" title="..."><img src="/Impresion3d/img/vineta.png">Volver a catalogo</a></li>
           <li><a  href="/Impresion3d/views/ValidarLogin/MenuPrincipal.jsp" title="..."><img src="/Impresion3d/img/vineta.png">Menu Principal</a></li> 
        
        </ul>
    </div><BR>
    </nav>
    
    <section>
     <br><div class="hrRojo"></div>
    <div class="text-left">
       	<FONT SIZE="3"COLOR="RED"FACE="Verdana"> <B>Informacion detallada del diseño</B></FONT>
    </div>
     <%String nombreDiseno =(String)session.getAttribute("nombreDisenoRegistrado"); 
       String dimensiones =(String)session.getAttribute("dimensionesRegistrado"); 
       String descripcion =(String)session.getAttribute("descripcionRegistrado"); 
       String nombreArchivo =(String)session.getAttribute("nombreArchivoRegistrado");
       String idDiseno=(String)session.getAttribute("idDisenoRegistrado");
       String precio_diseno=(String)session.getAttribute("precio_disenoRegistrado");
       double volumen=Double.parseDouble((String)session.getAttribute("volumenRegistrado"));
      %>
        <%String mensajeAdjuntardiseno =(String)session.getAttribute("mensajeAdjuntardisenoRegistrado");
        if(mensajeAdjuntardiseno!=null){%>
      <FONT SIZE="4"COLOR="BLACK"FACE="Verdana"> <B><%=mensajeAdjuntardiseno%></B></FONT>
      <% } 
       session.setAttribute("mensajeAdjuntardisenoRegistrado", ""); 
      %>
    <input type="hidden" id="precio_diseno" name="precio_diseno" value="<%=precio_diseno%>">
    <input type="hidden" id="volumen" name="volumen" value="<%=volumen%>">
    <div class="hrRojo"></div><br>
    <div  class="col-md-6 text-left">Nombre de diseño:</div>
    <div class="col-md-4 text-left" ><input type="text" name="NombreDiseno" id="NombreDiseno" readonly="readonly" value="<%=nombreDiseno%>" size="30"></div><br><br>
    <div  class="col-md-6 text-left">Dimensiones:</div>
    <div class="col-md-4 text-left" ><input type="text" name="Dimensiones:" id="Dimensiones:" readonly="readonly" value="<%=dimensiones%>" size="30"></div><br><br>
    <div  class="col-md-6 text-left">Descripcion:</div>
    <div class="col-md-4 text-left" ><input type="text" name="Descripcion:" id="Descripcion:" readonly="readonly" value="<%=descripcion%>" size="30"></div><br><br>
     <div  class="col-md-6 text-left">Tipo Material</div>
    <div class="col-md-4 text-left" >
    <select name="ComboMaterial" class="vete-izq"  id="ComboMaterial">
               <%  
               ControladorEstilo plantilla=new ControladorEstilo();
                String codHtml=plantilla.cargaMateriales();    
                %>
               <%=codHtml %>
    </select>            
    </div><br><br>
     <div  class="col-md-6 text-left">Tipo Impresora</div>
    <div class="col-md-4 text-left" >
    <select name="ComboTipoImpresora" class="vete-izq"  id="ComboTipoImpresora">
               <%  
                codHtml=plantilla.cargaTipoImpresoras();    
                %>
               <%=codHtml %>
    </select>            
    </div><br><br>
    <div  class="col-md-6 text-left">Escala</div>
    <div class="col-md-4 text-left" >
    <select name="ComboEscala" class="vete-izq"  id="ComboEscala">
               <%  
                codHtml="";
               for(int i=1;i<21;i++){
                double numeroEscala=Math.rint(i*0.1*100)/100;   
                codHtml=codHtml+"<option value='"+numeroEscala+"' >"+numeroEscala+"</option>\n";
               }
                %>
               <%=codHtml %>
    </select>     
    </div><br><br>
  <div>
    <div class="col-md-8" ><IMG SRC="/Impresion3d/images/Disenos/<%=nombreArchivo%>" ></div>
    <div class="col-md-4" > 
    <input id="Cotizar"  onClick="cargarCotizar()" type="button" name="Cotizar" value="Cotizar">
    </div>
    </div><br><br><br><br><br><br><br><br><br>
     <div>
    <table id="t01">
  <tr>
    <th>Id </th>
    <th>Nombre</th>
    <th>Nro de ejemplares</th>
    <th>Precio Unit.</th>
    <th> Total</th>
  </tr>
  <tr>
      <td><%=idDiseno%></td>
    <td><%=nombreDiseno%></td>
    <td><select name="ComboNroEjemplares" class="vete-izq"  id="ComboNroEjemplares" onchange="calcularTotalRegistrado()">
                <option>Nro.</option>
               <%  
                codHtml="";
               for(int i=1;i<11;i++){
                codHtml=codHtml+"<option value='"+i+"' >"+i+"</option>\n";
               }
                %>
               <%=codHtml %>
            </select> 
    </td>
    <td><input id="precioUnitario"  type="text" name="precioUnitario"  value=""  readonly="readonly"></td>
     <td><input id="precioTotal"  type="text" name="precioTotal"  value=""  readonly="readonly"></td>
  </tr>
    
    </table><br><br>
    </div> 
            
     <form name="formularioAnadirCarrito" method="GET" action="/Impresion3d/AnadirCarrito" >
     <input id="AnadirCarrito"  type="submit" name="AnadirCarrito" value="Anadir a Carrito">
     <input type="hidden" id="nom_user" name="nom_user" value="<%=cadena%>">
     <input type="hidden" id="nom_prod" name="nom_prod" value="<%=nombreDiseno%>">
     
     <input type="hidden" id="nomMaterial" name="nomMaterial" value="">
     <input type="hidden" id="tipoImpresora" name="tipoImpresora" value="">
     <input type="hidden" id="escala" name="escala" value="">
     <input type="hidden" id="nroEjemplares" name="nroEjemplares" value="">
     <input type="hidden" id="HiddenprecioUnitario" name="HiddenprecioUnitario" value="">     
      <input type="hidden" id="HiddenSubTotal" name="HiddenSubTotal" value=""> 
     </form><br>
     
     <input id="Volver" onClick="parent.location='/Impresion3d/views/ValidarLogin/RealizarPedido.jsp'" type="submit" name="Volver" value="Volver a catalogo">

    
    </section>
            
     <footer>
    Copyright © 2016-I 
    </footer>
          
    </body>
</html>
<%}%>