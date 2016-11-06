package Modelo;
import Modelo.Libreria;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Consultas {
   public Consultas(){
   }
   
   public boolean Autentificacion(String usuario,String password) throws SQLException{
   Libreria lib = new Libreria();
   cifrar_decifrar clasAes=new cifrar_decifrar();    
   ResultSet rs=lib.consulta("select * from usuarios");
   String admin="A";
   while(rs.next()){
       try {
           if(usuario.equals(rs.getString("usuario")) && password.equals(clasAes.descifra(rs.getBytes("password")))) 
           {
               return true;
           }
         
       } catch (Exception ex) {
           Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
           return false;
       }
   }
   return false;
   }
   
      public boolean AutentificacionAdmin(String usuario,String password) throws SQLException{
   Libreria lib = new Libreria();
   cifrar_decifrar clasAes=new cifrar_decifrar();    
   ResultSet rs=lib.consulta("select * from usuarios");
   String admin="A";
   while(rs.next()){
       try {
           if  (usuario.equals(rs.getString("usuario")) && password.equals("cuzcano1234@")
                   && admin.equals(rs.getString("tipoPrivilegio"))  ) {
               return true;
           
           }
       } catch (Exception ex) {
           Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
           return false;
       }
   }
   return false;
   }
   
    public String obtenCampo(String nombreTabla,String campoDeseado,String campoBusqueda,String campoCondicion) throws SQLException{
   String campo="";
   Libreria lib = new Libreria(); 
   ResultSet rs=lib.consulta("select "+campoDeseado+" from "+nombreTabla+" WHERE "+campoBusqueda+"='"+campoCondicion+"' ");
   System.out.println("select "+campoDeseado+" from "+nombreTabla+" WHERE "+campoBusqueda+"='"+campoCondicion+"' ");
    while(rs.next()){
    try{ 
        campo=rs.getString(1); 
    }
    catch(Exception ex) {System.out.println("error en obtener campo :  "+ex);
    return campo;
    }
   }
     return campo;       
   }
    
    public String[]  obtenCampoArreglos(String campoBusqueda,String campoCondicion) throws SQLException{
    String datosInsertados[]=new String[10];
   String campo="";
   Libreria lib = new Libreria(); 
   ResultSet rs=lib.consulta("select * from catalogo WHERE "+campoBusqueda+"='"+campoCondicion+"' ");
    while(rs.next()){
    try{ 
        datosInsertados[0]=rs.getString(1);
        datosInsertados[1]=rs.getString(2); 
        datosInsertados[2]=rs.getString(3); 
        datosInsertados[3]=rs.getString(4); 
        datosInsertados[4]=rs.getString(5); 
        datosInsertados[5]=rs.getString(6); 
        datosInsertados[6]=rs.getString(7); 
        datosInsertados[7]=rs.getString(8); 
        datosInsertados[8]=rs.getString(9); 
        
    }
    catch(Exception ex) {System.out.println("error en obtener campo :  "+ex);
    return datosInsertados;
    }
   }
     return datosInsertados;       
   } 
    
    
   public String obtenImagenes(String campoDeseado) throws SQLException{
   String codigoHtml="";
   Libreria lib = new Libreria(); 
   ResultSet rs=lib.consulta("select "+campoDeseado+" from catalogo");
   int columna=1;
   codigoHtml=codigoHtml+"<table style='width:100%'><tr>";
    while(rs.next()){
    try{ 
    codigoHtml=codigoHtml+" <td><img src='/Impresion3d/images/Disenos/"+rs.getString(1)+"'>"+
   "<form method='GET' action='/Impresion3d/SeleccionarDisenoInvitado'>"+
   "<input type='hidden' name='nombreArchivo' value='"+rs.getString(1)+"'>"+
   " <input id='Seleccionar'  type='submit' name='Seleccionar' value='Seleccionar'><br><br><br>"+
   " </form> </td>";
    if(columna%6==0){
     codigoHtml=codigoHtml+" </tr> <tr>";
    }
    columna++;
    }
    catch(Exception ex) {System.out.println("error en obtener campo :  "+ex);
    return codigoHtml;
    }
   }
    codigoHtml=codigoHtml+"</tr></table>"; 
     return codigoHtml;       
   }
   
      public String obtenImagenesRegistrado(String campoDeseado) throws SQLException{
   String codigoHtml="";
   Libreria lib = new Libreria(); 
   ResultSet rs=lib.consulta("select "+campoDeseado+" from catalogo");
   int columna=1;
   codigoHtml=codigoHtml+"<table style='width:100%'><tr>";
    while(rs.next()){
    try{ 
    codigoHtml=codigoHtml+" <td><img src='/Impresion3d/images/Disenos/"+rs.getString(1)+"'>"+
   "<form method='GET' action='/Impresion3d/SeleccionarDisenoRegistrado'>"+
   "<input type='hidden' name='nombreArchivo' value='"+rs.getString(1)+"'>"+
   " <input id='Seleccionar'  type='submit' name='Seleccionar' value='Seleccionar'><br><br><br>"+
   " </form> </td>";
    if(columna%6==0){
     codigoHtml=codigoHtml+" </tr><tr>";
    }
    columna++;
    }
    catch(Exception ex) {System.out.println("error en obtener campo :  "+ex);
    return codigoHtml;
    }
   }
    codigoHtml=codigoHtml+"</tr></table>"; 
     return codigoHtml;       
   }
   
      public String obtenerCombo(String campoDeseado,String nombreTabla) throws SQLException{
   String codigoHtml="";
   Libreria lib = new Libreria(); 
   ResultSet rs=lib.consulta("select "+campoDeseado+" from "+nombreTabla+"");
    while(rs.next()){
    try{ 
    codigoHtml=codigoHtml+"<option value='"+rs.getString(1)+"' >"+rs.getString(1)+"</option>\n";
    }
    catch(Exception ex) {System.out.println("error en obtener campo :  "+ex);
    return codigoHtml;
    }
   }
    codigoHtml=codigoHtml+"</tr></table>"; 
     return codigoHtml;       
   }
   
   public String obtenTablaCotizar(String nomUsuario) throws SQLException{
   String codigoHtml="";
   Libreria lib = new Libreria(); 
   double valorTotal=0.0;
   ResultSet rs=lib.consulta("select * from pedidoTemporal where nom_user='"+nomUsuario+"'");
   codigoHtml="    <table id='t01'>\n" +
"  <tr>\n" +
"    <th>Usuario</th>\n" +
"    <th>Nombre Diseño</th>\n" +
"    <th>Material</th>\n" +
"    <th>Tipo Impresora</th>\n" +
"     <th>Escala</th>\n" +
"      <th>Nro. Ejemplares</th>\n" +
"     <th>Precio Unit.(S./) </th>\n" +
"    <th>Sub. Total (S./) </th>\n" +
"    <th></th>\n" +
"  </tr>\n" ;
    while(rs.next()){
    try{ 
        codigoHtml=codigoHtml+"<tr>";
     for(int i=2;i<10;i++){
     codigoHtml=codigoHtml+"<td>"+rs.getString(i)+"</td>";
     if(i==9){
         valorTotal=valorTotal+Double.parseDouble(rs.getString(i));
        }
     }
     codigoHtml=codigoHtml+ "<td><form method='GET' action='/Impresion3d/EliminarPedido'>"
             + "<input id='EliminarPedido'  type='submit' name='EliminarPedido' value='Eliminar Pedido'> "
             + "<input type='hidden' name='idPedidoEliminar' value='"+rs.getString(1)+"'>"
             + "<input type='hidden' name='nomUsuario' value='"+nomUsuario+"'>"
             +"</form>"
             + "</td></tr>";
    }
    catch(Exception ex) {System.out.println("error al obtener tabla pedido Temporal :  "+ex);
    return codigoHtml;
    }
   }
    
    valorTotal=Math.rint(valorTotal*100)/100;    
    codigoHtml=codigoHtml+"</table><br><br>"; 
    codigoHtml=codigoHtml+"<form method='GET' action='/Impresion3d/CotizarPedido'>"
            + " <div  class='col-md-6 text-left'>Total (S./) : </div>\n" +
    "<div class='col-md-4 text-left'>  <input type='text' name='Monto' id='Monto' readonly='readonly' value='"+valorTotal+"' size='8'></div><br><br>"
            +  "<input type='hidden' name='nomUsuario' value='"+nomUsuario+"'>"
            +"<input id='Comprar' type='submit' name='Comprar' value='Comprar'> </form><br>";
    if(valorTotal>0){
    codigoHtml=codigoHtml+"<input id='Volver' onClick=parent.location='/Impresion3d/views/ValidarLogin/RealizarPedido.jsp' type='submit' name='Volver' value='Elije otro diseño'>";
    }
     return codigoHtml;       
   }    
      
   public String obtenerComboMateriales() throws SQLException{
   String codigoHtml="";
   Libreria lib = new Libreria(); 
   ResultSet rs=lib.consulta("select nomMaterial,precioMaterial from materiales");
    while(rs.next()){
    try{ 
    codigoHtml=codigoHtml+"<option value='"+rs.getString(2)+"' >"+rs.getString(1)+"</option>\n";
    }
    catch(Exception ex) {System.out.println("error en obtener campo :  "+ex);
    return codigoHtml;
    }
   }
    codigoHtml=codigoHtml+"</tr></table>"; 
     return codigoHtml;       
   }   
   
     public String obtenerComboTipoImpresora() throws SQLException{
   String codigoHtml="";
   Libreria lib = new Libreria(); 
   ResultSet rs=lib.consulta("select tipoImpresora,precioImpresora from impresoras");
    while(rs.next()){
    try{ 
    codigoHtml=codigoHtml+"<option value='"+rs.getString(2)+"' >"+rs.getString(1)+"</option>\n";
    }
    catch(Exception ex) {System.out.println("error en obtener campo :  "+ex);
    return codigoHtml;
    }
   }
    codigoHtml=codigoHtml+"</tr></table>"; 
     return codigoHtml;       
   } 
     
    public void  copiaATablaPedido(String id_factura,String campoCondicion) throws SQLException{
   Libreria lib = new Libreria(); 
   ResultSet rs=lib.consulta("select * from pedidotemporal WHERE nom_user='"+campoCondicion+"' ");
    while(rs.next()){
    try{ 
         String datosInsertados[]=new String[15];
        datosInsertados[0]=id_factura;
        for(int i=2;i<10;i++){
         datosInsertados[i-1]=rs.getString(i); 
        }
        //insertando cada fila de dato a tabla pedido
         Libreria lib2 = new Libreria(); 
        if(lib2.insertarRegistro("pedido",datosInsertados)){
        }  
    }
    catch(Exception ex) {System.out.println("error en obtener campo :  "+ex);
    }
   }
      Libreria lib2 = new Libreria(); 
  //BOrrado de datos de tabla temporal
   if(lib2.borrarRegistro("pedidotemporal","nom_user",campoCondicion)){
       System.out.println("se borro tablatemporal :"+campoCondicion);
   } 
   else
         System.out.println("No se borro tabla");
      
   }   
    
    public String ultimoIdFactura(String tabla) throws SQLException{
             
   String campo="";
   Libreria lib = new Libreria(); 
   ResultSet rs=lib.consulta("SELECT MAX(id_factura) AS id_factura FROM "+tabla+"");
    while(rs.next()){
    try{ 
        campo=rs.getString(1); 
    }
    catch(Exception ex) {System.out.println("error en obtener campo :  "+ex);
    return campo;
    }
   }
     return campo;               
    }
    
   public String obtenTablaFactura(String id_factura) throws SQLException{
   String codigoHtml="";
   Libreria lib = new Libreria(); 
   double valorTotal=0.0;
   ResultSet rs=lib.consulta("select * from pedido where id_factura='"+id_factura+"'");
   codigoHtml="    <table id='t01'>\n" +
"  <tr>\n" +
"   <th>Nro. Ejemplares</th>\n" +
"    <th>Descripcion</th>\n" +  
"     <th>Precio Unit.(S./) </th>\n" +
"    <th>Sub. Total (S./) </th>\n" +
"  </tr>\n" ;
    while(rs.next()){
    try{ 
    codigoHtml=codigoHtml+"<tr>";
     //NroEjemplares
     codigoHtml=codigoHtml+"<td>"+rs.getString(8)+"</td>";
     //Descripcion
     codigoHtml=codigoHtml+"<td>";
     for(int i=4;i<8;i++){
     codigoHtml=codigoHtml+rs.getString(i)+"<br>";
  
     }
     codigoHtml=codigoHtml+"</td>";
      //Precio Unitario
     codigoHtml=codigoHtml+"<td>"+rs.getString(9)+"</td>";
     //subTotal
     codigoHtml=codigoHtml+"<td>"+rs.getString(10)+"</td>";
     valorTotal=valorTotal+Double.parseDouble(rs.getString(10));
     codigoHtml=codigoHtml+"</tr>";
    }
    catch(Exception ex) {System.out.println("error al obtener tabla pedido Temporal :  "+ex);
    return codigoHtml;
    }
   }
    
    valorTotal=Math.rint(valorTotal*100)/100;    
    codigoHtml=codigoHtml+"</table><br><br>"; 
    codigoHtml=codigoHtml+" <div  class='col-md-6 text-left'>Total (S./) : </div>\n" +
    "<div class='col-md-4 text-left'>  <input type='text' name='Monto' id='Monto' readonly='readonly' value='"+valorTotal+"' size='8'></div><br><br>";
     return codigoHtml;       
   }  
          
    
}
