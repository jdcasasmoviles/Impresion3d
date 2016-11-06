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
import java.util.logging.Level;
import java.util.logging.Logger;
@WebServlet("/SeleccionarDisenoInvitado")
public class SeleccionarDisenoInvitado extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
        
    public SeleccionarDisenoInvitado() {
        super();
     
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            try {
                // TODO Auto-generated method stub
                response.setContentType("text/html");
                Libreria lib=new Libreria();
                Consultas query=new Consultas();
                String datosInsertados[]=new String[10];
                datosInsertados=query.obtenCampoArreglos("nombreArchivo",request.getParameter("nombreArchivo"));
                 request.getSession().setAttribute("idDiseno",datosInsertados[0]);
                request.getSession().setAttribute("nombreDiseno",datosInsertados[1]);
                request.getSession().setAttribute("dimensiones",datosInsertados[2]+"x"+datosInsertados[3]+"x"+datosInsertados[4]);
                request.getSession().setAttribute("descripcion",datosInsertados[5]);
                request.getSession().setAttribute("nombreArchivo",request.getParameter("nombreArchivo"));
                request.getSession().setAttribute("precio_diseno",datosInsertados[6]);
                //Calculando volumen
                double volumen=Double.parseDouble(datosInsertados[2])*Double.parseDouble(datosInsertados[3])*Double.parseDouble(datosInsertados[4]);
                volumen=volumen/1000000.0;
                request.getSession().setAttribute("volumen",""+volumen);
                response.sendRedirect("/Impresion3d/views/SeleccionarDiseno.jsp");
            } catch (SQLException ex) {
                Logger.getLogger(SeleccionarDisenoInvitado.class.getName()).log(Level.SEVERE, null, ex);
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
