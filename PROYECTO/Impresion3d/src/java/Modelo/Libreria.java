package Modelo;
import java.sql.*;
import java.io.*;
import java.util.*;
public class Libreria {
    public Connection con;                                         //Variable que permite conectarme con la base de datos
    public Statement sen;                                          //Con esta variable, para decir que cualquier consulta, update, etc que ejecute va a afectar a la variable con
    public ResultSet datos;                                        //Guardar los valores devueltos por un select
    public ResultSetMetaData meta;                                 //sirve para guardar la estructura de un conjunto de datos
    public PreparedStatement sentencia;
    public int num_campos;
    public int num_filas;
    public String d_mysql="com.mysql.jdbc.Driver";                  //Driver MySQL
    public String c_mysql="jdbc:mysql://localhost/impresion3d";  //BD MySQL
    public String u_mysql="root";                                   //Usuario MySQL     
    public String p_mysql="";
    public Libreria(){
    if(conectar_mysql()){}
    }
    //Metodo para saber si se conecta a MySql
    public boolean conectar_mysql(){
        try{
            Class.forName(d_mysql);  //Utilizo el driver 
            con=DriverManager.getConnection(c_mysql,u_mysql,p_mysql); //Me conecto
            sen=con.createStatement(); //La modificacion de cualquier consulta..//Mediante la variable sen paso la sentencia a la base de datos
            System.out.println("Conexion MySql OK......");
        }catch(ClassNotFoundException e1){
        	System.out.println("Error en el driver MySQL");
                return false;
        }catch(SQLException e2){
        	System.out.println("Error en la B.D. MySQL");
                return false;
        }
         return true;   
    }
    //INGRESO UNA CONSULTA
       public ResultSet consulta(String consultaSql){
        try{
            datos=sen.executeQuery(consultaSql);//Procesamos la sentencia sql, //Obtengo todas las filas
            meta=datos.getMetaData();//Acceso a los datos de la consulta mediante metodos get 
            num_campos=meta.getColumnCount();//Cuento el numero de columnas 
        }catch(SQLException e3){
           System.out.println("Error en la consulta");
        }
        return datos;
    }

 
       
    //MOSTRAR TABLA DE CUALQUIER CONSULTA
    public String  mostrarTabla(String consultaSql){
        String codHtml="";
        conectar_mysql();
        try{
            datos=sen.executeQuery(consultaSql);
           codHtml=tablaQueryHtml(datos);
        }catch(SQLException e3){
        	System.out.println( "Error en la consulta");
        }
        return codHtml;
    }
 
   //IMPRIME CUALQUIER CONSULTA
    public String tablaQueryHtml(ResultSet valor){
        String codigoHtml="";
        
            try{
                 meta=valor.getMetaData();//Acceso a los datos de la consulta mediante metodos get 
                num_campos=meta.getColumnCount();//Cuento el numero de columnas    
	       codigoHtml=codigoHtml+"<table>";
               codigoHtml=codigoHtml+"<tr>";
               for(int i=1;i<=num_campos;i++){
                     codigoHtml=codigoHtml+"<td>"+meta.getColumnName(i)+"</td>";
               }
               codigoHtml=codigoHtml+"</tr>";
               int filas=1;
	       while(valor.next()){ //Mientras exista
                        codigoHtml=codigoHtml+"<tr>";
                        for(int i=1;i<=num_campos;i++){
                        codigoHtml=codigoHtml+"<td>"+valor.getString(i)+"</td>";
                        }
                        codigoHtml=codigoHtml+ "</tr>";
	       filas++;
               }
               num_filas=filas;
	        codigoHtml=codigoHtml+"</table>";
	       }
            catch(SQLException ex){}
        return codigoHtml;
    }
    
    
   //INSERTA CUALQUIER REGISTRO
    public boolean insertarRegistro(String nombreTabla,String[] datosInsertados){
        try{
            datos=sen.executeQuery("Select * from "+nombreTabla+"");//Procesamos la sentencia sql, //Obtengo todas las filas
            meta=datos.getMetaData();//Acceso a los datos de la consulta mediante metodos get 
            num_campos=meta.getColumnCount();//Cuento el numero de columnas 
            //Construyendo Consulta insert
            String insertSql="insert into "+nombreTabla+" values (NULL";
            for(int i=2;i<=num_campos;i++){
            insertSql=insertSql+ ",'"+datosInsertados[i-2]+"'";
            }
            insertSql=insertSql+")";
            System.out.println(insertSql);
            sen.executeUpdate(insertSql);
        }catch(SQLException e3){
        	System.out.println("Error al insertar registro"+e3);
        	return false;
        }
        return true;
    }
    
    //ELIMINA CUALQUIER REGISTRO
    public boolean borrarRegistro(String nombreTabla,String campoId,String valorId){
         try
         {
        	 sen.executeUpdate("DELETE FROM  "+nombreTabla+" WHERE "+campoId+"='"+valorId+"' ");
         }
         catch (SQLException SQLE)
         {
          System.out.println("ERROR AL ELIMINAR EL REGISTRO DE LA BD \n ERROR : ");
          return false;
         }
        return true;
    }
    
      //INSERTA CUALQUIER REGISTRO , CON ULTIMO CAMPO ENCRIPTADO
    public boolean insertarRegistroEncriptado(String nombreTabla,String[] datosInsertados,byte[] passCifrado){
        try{
            datos=sen.executeQuery("Select * from "+nombreTabla+"");//Procesamos la sentencia sql, //Obtengo todas las filas
            meta=datos.getMetaData();//Acceso a los datos de la consulta mediante metodos get 
            num_campos=meta.getColumnCount();//Cuento el numero de columnas 
            String consultaInsertSql="";
            consultaInsertSql = "INSERT INTO "+nombreTabla+" (";
           //llena nombres_columnas a insertar
            for(int i=2;i<=num_campos;i++){
            if(i==num_campos) consultaInsertSql=consultaInsertSql+""+meta.getColumnName(i)+"";
            else consultaInsertSql=consultaInsertSql+""+meta.getColumnName(i)+",";
            }
            consultaInsertSql=consultaInsertSql+") VALUES (";
            //llena de ????
              for(int i=2;i<=num_campos;i++){
            if(i==num_campos) consultaInsertSql=consultaInsertSql+"?)";
            else consultaInsertSql=consultaInsertSql+"?,";
            }
              sentencia = con.prepareStatement(consultaInsertSql);
             //llenando datos q se insertaran
            for(int i=2;i<=num_campos;i++){
            if(i==num_campos) 
            {  sentencia.setBytes(i-1, passCifrado);
            }
            else {
                sentencia.setString(i-1,datosInsertados[i-2]);
            }
            }
              sentencia.execute();
        }catch(SQLException e3){
        	System.out.println("Error al insertar registro  "+e3);
        	return false;
        }
        return true;
    }
    
    //PARA CERRAR LA B.D.
    public void salir(){
        try{
            datos.close();
            sen.close();
            con.close();
        }catch(SQLException e3){
        	System.out.println( "Error al cerrar la BD");
        }
    }
    
}
