package Controlador;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
@WebServlet("/CerrarSesion")
public class CerrarSesion extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
        
    public CerrarSesion() {
        super();
     
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
                response.setContentType("text/html");
                 request.getSession().setAttribute("mensajeDisenoAdjunto",null); 
                 request.getSession().setAttribute("mensajeAdjuntardisenoRegistrado",null); 
                 request.getSession().setAttribute("usuario",null); 
                 request.getSession().setAttribute("Monto",null);
                  request.getSession().setAttribute("mensajeErrorEliminar",null);
                 request.getSession().setAttribute("mensajePago",null);
                 response.sendRedirect("/Impresion3d/views/IniciarSesionLogin.jsp"); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
        
  
}
