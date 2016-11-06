package Controlador;
import Modelo.Libreria;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
@WebServlet("/EliminarPedido")
public class EliminarPedido extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
        
    public EliminarPedido() {
        super();
     
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
                response.setContentType("text/html");
                  Libreria lib=new Libreria();
                String idPedidoEliminar=request.getParameter("idPedidoEliminar");
                  if(lib.borrarRegistro("pedidoTemporal","id_pedido",idPedidoEliminar)){
                   request.getSession().setAttribute("usuario",request.getParameter("nomUsuario"));
                  response.sendRedirect("/Impresion3d/views/ValidarLogin/CotizarPedido.jsp");
                  }
                else{ 
                   request.getSession().setAttribute("usuario",request.getParameter("nomUsuario"));
                    request.getSession().setAttribute("mensajeErrorEliminar","Error al eliminar");
                   response.sendRedirect("/Impresion3d/views/ValidarLogin/CotizarPedido.jsp");
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
