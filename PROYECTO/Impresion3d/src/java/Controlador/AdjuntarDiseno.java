package Controlador;
import Modelo.Libreria;
import Modelo.Consultas;
import beans.beanAdjunarDiseno;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.Part;
@WebServlet("/AdjuntarDiseno")
@MultipartConfig
public class AdjuntarDiseno extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
        
    public AdjuntarDiseno() {
        super();
     
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                try {
                // TODO Auto-generated method stub
                beanAdjunarDiseno diseno = new beanAdjunarDiseno();
                Libreria lib=new Libreria();
                Consultas query=new Consultas();
                response.setContentType("text/html");
                //guarda datos en javabeans
                diseno.setNombreDiseno(request.getParameter("NombreDiseno"));
                diseno.setAncho(request.getParameter("ancho"));
                diseno.setLargo(request.getParameter("largo"));
                diseno.setAltura(request.getParameter("altura"));
                diseno.setDescripcion(request.getParameter("Descripcion:"));
                diseno.setPrecioDiseno(request.getParameter("PrecioDiseno"));
                diseno.setIdUsuario(query.obtenCampo("usuarios","id_user","usuario",request.getParameter("Usuario")));
                
                //FORMATO Y NOMBRE DE ARCHIVO
                 String errorArchivo="";
                String nombre=request.getParameter("nombreArchivo");
                String formatoArchivo=nombre.substring(nombre.lastIndexOf( '.' ) + 1, nombre.length()); 
                if(formatoArchivo.equals("png") || formatoArchivo.equals("jpg") || formatoArchivo.equals("jpeg")){
                 diseno.setNombreArchivo(request.getParameter("nombreArchivo"));
                  }
                else{
                errorArchivo="formato"; 
               }
                //llena datos a insertar
                diseno.setDatosInsertados();
               if(!diseno.validarCampos())
               {
               request.getSession().setAttribute("mensajeDisenoAdjunto","Error "+errorArchivo);     
                 response.sendRedirect("/Impresion3d/views/ValidarLogin/RealizarPedido/AdjuntarDiseno.jsp");
               }
               else if(lib.insertarRegistro("catalogo", diseno.getDatosInsertados()))
               { 
               request.getSession().setAttribute("mensajeDisenoAdjunto","Imagen guardada");        
              response.sendRedirect("/Impresion3d/views/ValidarLogin/RealizarPedido/AdjuntarDiseno.jsp");
                }
                else{
                 request.getSession().setAttribute("mensajeDisenoAdjunto","Error ");     
                 response.sendRedirect("/Impresion3d/views/ValidarLogin/RealizarPedido/AdjuntarDiseno.jsp");
                }
                } catch (SQLException ex) {
                Logger.getLogger(AdjuntarDiseno.class.getName()).log(Level.SEVERE, null, ex);
            }   
    
    }
    
   

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
                PrintWriter out=response.getWriter();
                out.println("Bienvenido");
                String nombre=request.getParameter("nombre");
                String formatoArchivo=nombre.substring(nombre.lastIndexOf( '.' ) + 1, nombre.length());
                System.out.println("formatoArchivo : "+formatoArchivo);
                
               if(formatoArchivo.equals("png") || formatoArchivo.equals("jpg") || formatoArchivo.equals("jpeg")){
                Part archivo=request.getPart("SeleccionarDiseno");
                InputStream is=archivo.getInputStream();
                File f=new File("C:/Users/Usuario/Documents/NetBeansProjects/Impresion3d/web/images/Disenos/"+nombre);
                FileOutputStream  ous=new FileOutputStream(f);
                int dato=is.read();
                while(dato!=-1){
                    ous.write(dato);
                    dato=is.read();
                }
                ous.close();
                is.close();
               }
               
	}
        
  
}
