//ADJUNTAR ARCHIVO
function cargarArchivo(){
    var x=document.getElementById("SeleccionarDiseno");
    var file=x.files[0];
    var objHidden=document.formulario.nombre;
     var objHidden2=document.formulary.nombreArchivo;
    objHidden.value=file.name;
    objHidden2.value=file.name;
    document.formulario.target="null";
    document.formulario.action="/Impresion3d/AdjuntarDiseno";
    document.formulario.submit(); 
    alert("Carga de archivo terminado ");    
   
}    

//SELECCIONAR PEDIDO
function cargarCotizar(){
    var pD=parseFloat(document.getElementById("precio_diseno").value);
    var cMg=parseFloat(document.getElementById("ComboMaterial").value);
    var Ti=parseFloat(document.getElementById("ComboTipoImpresora").value);
    var esc=parseFloat(document.getElementById("ComboEscala").value); 
    esc=Math.pow(esc,3);
    var vol=parseFloat(document.getElementById("volumen").value);
         // formula  C1 = pD+ cMg.V.e+20.Ti+ 5%*(pD + cMg.V.e+20.Ti)
    var valor=pD+cMg*vol*esc+20*Ti;    
    var C1=valor+0.05*(valor);
    //precio unitario
   var precioUnitario=document.getElementById("precioUnitario");
   precioUnitario.value=C1.toFixed(2);
   //guardando escala en hidden y precioUnitario
    var p = document.getElementById("ComboEscala").selectedIndex;
    var q= document.getElementById("ComboEscala").options;
    var objHidden3=document.formularioAnadirCarrito.escala;
    objHidden3.value=q[p].text;
   
     alert("Calculando precio Unitario.... \npD  "+pD+
            "\nTi    "+Ti+
             "\ncmg  "+cMg+
             "\nesc  "+esc+
             "\nvol  "+vol+
              "\nvalor  "+valor+
             "\n c1 "+C1);
}  

function calcularTotalRegistrado(){
      var ComboNroEjemplares=parseFloat(document.getElementById("ComboNroEjemplares").value);
    var precioUnitario=parseFloat(document.getElementById("precioUnitario").value);
     var precioTotal=document.getElementById("precioTotal");
   var total=ComboNroEjemplares*precioUnitario;
   precioTotal.value=total.toFixed(2);
   //obteniendo valores para tabla temporal
    var x = document.getElementById("ComboMaterial").selectedIndex;
    var y = document.getElementById("ComboMaterial").options;
    var m = document.getElementById("ComboTipoImpresora").selectedIndex;
    var n = document.getElementById("ComboTipoImpresora").options;
    
    var objHidden1=document.formularioAnadirCarrito.nomMaterial;
    objHidden1.value=y[x].text;
    var objHidden2=document.formularioAnadirCarrito.tipoImpresora;
    objHidden2.value=n[m].text; 
     var objHidden4=document.formularioAnadirCarrito.HiddenprecioUnitario;
    objHidden4.value=precioUnitario.toFixed(2);
    
     var objHidden5=document.formularioAnadirCarrito.nroEjemplares;
    objHidden5.value=ComboNroEjemplares;
    
     var objHidden6=document.formularioAnadirCarrito.HiddenSubTotal;
    objHidden6.value=total.toFixed(2);
    
}

//Seleccionar diseno-no registrado
function calcularTotal(){
    var ComboNroEjemplares=parseFloat(document.getElementById("ComboNroEjemplares").value);
    var precioUnitario=parseFloat(document.getElementById("precioUnitario").value);
     var precioTotal=document.getElementById("precioTotal");
   var total=ComboNroEjemplares*precioUnitario;
   precioTotal.value=total.toFixed(2);
   
}

//PAGAR PEDIDO
function formaEntregaTienda() {
    var x = document.getElementById("RecogerTienda").checked;
    var hoy=new Date();
    var dd=hoy.getDate();
    var mm=hoy.getMonth()+1; 
    var yyyy=hoy.getFullYear();
    dd=dd+3;
    if(dd>30 && dd<35){
        dd=1;
        mm=mm+1;
        if(mm>12){
            mm=1;
            yyyy=yyyy+1;
        }
    }
    if(dd<10) {dd='0'+dd;} 
    if(mm<10) {    mm='0'+mm;} 
    hoy=yyyy+'-'+mm+'-'+dd;
    if(x){
    document.getElementById("DatosEntrega").innerHTML ="<div  class='col-md-6 text-left'>Direccion del lugar   :</div>"+
    "<div  class='col-md-4 text-left'><input type='text' name='direccion' id='direccion' readonly='readonly' value='Tienda Leyeremen' ></div><br><br> "+ 
    "<div  class='col-md-6 text-left'>Fecha   :</div>"+
    "<div  class='col-md-4 text-left'><input type='date' name='Fecha' id='Fecha' readonly='readonly' value='"+hoy+"'></div><br><br>"+  
   " <div  class='col-md-6 text-left'>A partir de   :</div>"+
   "<div  class='col-md-4 text-left'><input type='time' name='Hora' id='Hora' readonly='readonly' value='09:00' ></div><br><br>"+
   " <div  class='col-md-6 text-left'>Contraseña de seguridad para entrega   :</div>"+
   "<div  class='col-md-4 text-left'><input type='text' name='passSeguirudad' id='passSeguirudad' readonly='readonly' value='"+aleatorio(10000,99999)+"' ></div><br><br><br><br><br>"; 
    }
     document.getElementById("EnviarDestino").disabled = true;
     document.getElementById("RecogerTienda").disabled = true;
}

function formaEntregaDestino() {
    var x = document.getElementById("EnviarDestino").checked;
    var hoy=new Date();
    var dd=hoy.getDate();
    var mm=hoy.getMonth()+1; 
    var yyyy=hoy.getFullYear();
    if(dd<10) {dd='0'+dd;} 
    if(mm<10) {    mm='0'+mm;} 
    hoy=yyyy+'-'+mm+'-'+dd;
    var limite=(yyyy+1)+'-'+mm+'-'+dd;
    if(x){
    document.getElementById("DatosEntrega").innerHTML ="<div  class='col-md-6 text-left'>Direccion del lugar   :</div>"+
    "<div  class='col-md-4 text-left'><input type='text' name='direccion' id='direccion' value='' ></div><br><br> "+ 
    "<div  class='col-md-6 text-left'>Fecha   :</div>"+
    "<div  class='col-md-4 text-left'><input type='date' name='Fecha' id='Fecha' min='"+hoy+"' max='"+limite+"' value='' ></div><br><br>"+  
   " <div  class='col-md-6 text-left'>Hora   :</div>"+
   "<div  class='col-md-4 text-left'><input type='time' name='Hora' id='Hora' min='09:00' max='20:00' value='03:00' ></div><br><br>"+
   " <div  class='col-md-6 text-left'>Contraseña de seguridad para entrega   :</div>"+
   "<div  class='col-md-4 text-left'><input type='text' name='passSeguirudad' id='passSeguirudad' readonly='readonly' value='"+aleatorio(10000,99999)+"'  ></div><br><br><br><br><br>"; 
    }
     document.getElementById("EnviarDestino").disabled = true;
     document.getElementById("RecogerTienda").disabled = true;
}

    function aleatorio(a,b) {
    return Math.round(Math.random()*(b-a)+parseInt(a));
    }











