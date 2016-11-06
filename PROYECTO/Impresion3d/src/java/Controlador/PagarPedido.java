package Controlador;
import Modelo.Consultas;
import Modelo.Libreria;
import beans.beanPedido;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
@WebServlet("/PagarPedido")
public class PagarPedido extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
        
    public PagarPedido() {
        super();
     
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            try {
                // TODO Auto-generated method stub
                beanPedido factura = new beanPedido();
                Libreria lib=new Libreria();
                Consultas query=new Consultas();
                response.setContentType("text/html"); 
                String nombreApeliido=query.obtenCampo("usuarios", "nombres","usuario",request.getParameter("nomUsuario"));
                nombreApeliido=nombreApeliido+" "+query.obtenCampo("usuarios", "apellidos","usuario",request.getParameter("nomUsuario"));
                factura.setNombreApellido(nombreApeliido);
                factura.setDireccion(request.getParameter("direccion"));
                //fecha y hora ENTREGA
                factura.setFecha(request.getParameter("Fecha"));
                factura.setHora(request.getParameter("Hora"));
               //fecha y hora emision FACTURA
               Date date=new Date();
               DateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
               String fechaEmision=dateFormat.format(date);
                DateFormat hourFormat=new SimpleDateFormat("HH:mm:ss");
               String horaEmision=hourFormat.format(date);
               
               factura.setFechaEmision(fechaEmision);
               factura.setHoraEmision(horaEmision);
                
                factura.setPassword(request.getParameter("passSeguirudad"));
                factura.setTotal(request.getParameter("TotalPagar"));
                factura.setDatosFactura();
                if(!factura.validarCampos())
                {
                    request.getSession().setAttribute("mensajePago","Error campo invalido ");
                    request.getSession().setAttribute("usuario",request.getParameter("nomUsuario"));
                    response.sendRedirect("/Impresion3d/views/ValidarLogin/PagarPedido.jsp");
                }
               else if(lib.insertarRegistro("facturas",factura.getDatosFactura()))
               {    
                   String id_factura=query.ultimoIdFactura("facturas");
                   query.copiaATablaPedido(id_factura,request.getParameter("nomUsuario"));
                   //DATOS PARA FACTURA    
                   String datosParaFactura="<br><br>id factura : "+id_factura+"<br>"+
                           "Nombres Apeliidos  : "+nombreApeliido+"<br>"+
                           "Fecha emision : "+fechaEmision+"<br>"+
                           "Hora emision  : "+horaEmision+"<br><br>";
                   request.getSession().setAttribute("datosParaFactura",datosParaFactura);         
 
                   //DATOS DE ENTREGA DE PEDIDO
                   String datosEntregaPedido="<br><br>Direccion : "+request.getParameter("direccion")+"<br>"+
                           "Fecha : "+request.getParameter("Fecha")+"<br>"+
                          "A partir de : "+ request.getParameter("Hora")+"<br>"+
                           "Password : "+request.getParameter("passSeguirudad")+"<br><br>";
                   request.getSession().setAttribute("datosEntregaPedido",datosEntregaPedido);
          
                   request.getSession().setAttribute("id_factura",id_factura);
                   request.getSession().setAttribute("usuario",request.getParameter("nomUsuario"));
                   request.getSession().setAttribute("mensajePago","Pago exitoso ");
                   
                   response.sendRedirect("/Impresion3d/views/ValidarLogin/FacturaPedido.jsp");
              
                }
                
                else {
                    request.getSession().setAttribute("mensajePago","Error ");
                    request.getSession().setAttribute("usuario",request.getParameter("nomUsuario"));
                    response.sendRedirect("/Impresion3d/views/ValidarLogin/PagarPedido.jsp");
                }
            } catch (SQLException ex) {
                Logger.getLogger(PagarPedido.class.getName()).log(Level.SEVERE, null, ex);
            }
               
                
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
        
  
}
