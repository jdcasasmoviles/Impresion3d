package Controlador;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Arrays;
import beans.beanPersona;
import Modelo.Libreria;

@WebServlet("/Registrarse")
public class Registrarse extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
        
    public Registrarse() {
        super();
     
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
         String tabla="usuarios";
         beanPersona persona = new beanPersona();
         Libreria lib=new Libreria();
         response.setContentType("text/html");
         //guarda datos en javabeans
         persona.setNombres(request.getParameter("nombres"));
         persona.setApellidos(request.getParameter("apellidos"));
         persona.setDni(request.getParameter("dni"));
         persona.setFechaNacimiento(request.getParameter("bday"));
         persona.setEmail(request.getParameter("email"));
         persona.setTelefono(request.getParameter("usrtel"));
         persona.setCuenta(request.getParameter("cuenta"));
         persona.setUsuario(request.getParameter("usuario"));
         //llena datos a insertar
         persona.setDatosInsertados();
         if(lib.insertarRegistroEncriptado(tabla,persona.getDatosInsertados(),persona.getPassCifrado()))
         { response.sendRedirect("/Impresion3d/views/ValidarRegistrarse/Registrado.jsp");
         request.getSession().setAttribute("nombres",request.getParameter("nombres")); 
         request.getSession().setAttribute("apellidos",request.getParameter("apellidos"));
         request.getSession().setAttribute("dni",request.getParameter("dni"));
         request.getSession().setAttribute("bday",request.getParameter("bday"));
         request.getSession().setAttribute("email",request.getParameter("email"));
         request.getSession().setAttribute("usrtel",request.getParameter("usrtel"));
          request.getSession().setAttribute("cuenta",request.getParameter("cuenta"));
         request.getSession().setAttribute("usuario",request.getParameter("usuario")); 
         request.getSession().setAttribute("password", persona.getPassword()); 
         }
         else
             response.sendRedirect("/Impresion3d/views/ValidarRegistrarse/noRegistrado.jsp");
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
        
  
}
