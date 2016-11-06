package Controlador;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
@WebServlet("/CotizarPedido")
public class CotizarPedido extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
        
    public CotizarPedido() {
        super();
     
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
                response.setContentType("text/html");
              
		if(request.getParameter("Monto").equals("0.0")){
                request.getSession().setAttribute("usuario",request.getParameter("nomUsuario"));
                response.sendRedirect("/Impresion3d/views/ValidarLogin/CotizarPedido.jsp");
                }
                else{
                 request.getSession().setAttribute("Monto",request.getParameter("Monto"));
                request.getSession().setAttribute("usuario",request.getParameter("nomUsuario"));
                response.sendRedirect("/Impresion3d/views/ValidarLogin/PagarPedido.jsp");    
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
