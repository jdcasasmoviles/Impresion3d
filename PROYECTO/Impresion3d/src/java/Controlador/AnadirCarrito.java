package Controlador;
import Modelo.Consultas;
import Modelo.Libreria;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
@WebServlet("/AnadirCarrito")
public class AnadirCarrito extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
        
    public AnadirCarrito() {
        super();
     
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
                response.setContentType("text/html");
		PrintWriter mensaje=response.getWriter();
                 Libreria lib=new Libreria();
                //INICIO DE CODIGO HTML
                String datosInsertados[]=new String[10];
                datosInsertados[0]=request.getParameter("nom_user");
                datosInsertados[1]=request.getParameter("nom_prod");
                datosInsertados[2]=request.getParameter("nomMaterial");
                datosInsertados[3]=request.getParameter("tipoImpresora");
                datosInsertados[4]=request.getParameter("escala");
                datosInsertados[5]=request.getParameter("nroEjemplares");
                datosInsertados[6]=request.getParameter("HiddenprecioUnitario");
                datosInsertados[7]=request.getParameter("HiddenSubTotal");
                if(!validarCampos(datosInsertados))
               {
                 request.getSession().setAttribute("mensajeAdjuntardisenoRegistrado","Error"); 
                 request.getSession().setAttribute("usuario",request.getParameter("nom_user"));     
                response.sendRedirect("/Impresion3d/views/ValidarLogin/RealizarPedido/SeleccionarDiseno.jsp");
               } 
                else if(lib.insertarRegistro("pedidoTemporal",datosInsertados)){
                   request.getSession().setAttribute("usuario",request.getParameter("nom_user"));
                 response.sendRedirect("/Impresion3d/views/ValidarLogin/CotizarPedido.jsp");
                  }
                else{ 
                  request.getSession().setAttribute("mensajeAdjuntardisenoRegistrado","Error");   
                  request.getSession().setAttribute("usuario",request.getParameter("nom_user"));     
                 response.sendRedirect("/Impresion3d/views/ValidarLogin/RealizarPedido/SeleccionarDiseno.jsp");
                }
	}
    
         public boolean validarCampos(String [] datosInsertados ){
     for(int i=0;i<8;i++){
      if(datosInsertados[i]==null || datosInsertados[i].equals("")||datosInsertados[i].equals("NaN")){
          System.out.println(datosInsertados[i]+"----"+i);
       return false;
       }
     }
    return true;
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
        
  
}
