package Controlador;

import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import Modelo.Consultas;
import java.util.logging.Level;
import java.util.logging.Logger;
@WebServlet("/SesionLogin")
public class SesionLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;  
    public SesionLogin() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
                response.setContentType("text/html");
                Consultas query=new Consultas();
         
            try {
                if(query.Autentificacion(request.getParameter("usuario"),request.getParameter("password") ) ){
                    request.getSession().setAttribute("usuario",request.getParameter("usuario")); 
                    response.sendRedirect("/Impresion3d/views/ValidarLogin/MenuPrincipal.jsp");
                }
                //Administrador
                else if(query.AutentificacionAdmin(request.getParameter("usuario"),request.getParameter("password") )){
                    request.getSession().setAttribute("usuario",request.getParameter("usuario")); 
                    response.sendRedirect("/Impresion3d/views/ValidarLogin/menuAdministrador.jsp");
                }
                else{
                    request.getSession().setAttribute("mensajeLogin","Usuario o password incorrectos ");
                    response.sendRedirect("/Impresion3d/views/IniciarSesionLogin.jsp");
                }
            } catch (SQLException ex) {
                Logger.getLogger(SesionLogin.class.getName()).log(Level.SEVERE, null, ex);
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
