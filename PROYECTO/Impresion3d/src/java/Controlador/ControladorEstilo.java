/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Consultas;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class ControladorEstilo {
    public ControladorEstilo(){
    
    }
    
    public String cargarTablaFactura(String id_factura) throws SQLException{
        Consultas query=new Consultas();
        String codigoHtml=codigoHtml=query.obtenTablaFactura(id_factura);
         return codigoHtml;
    }
    
      public String cargarTablaCotizar(String nomUsuario) throws SQLException{
        Consultas query=new Consultas();
        String codigoHtml=codigoHtml=query.obtenTablaCotizar(nomUsuario);
         return codigoHtml;
    }
    
     public String cargaImagenesRegistrado() throws SQLException{
        Consultas query=new Consultas();
        String codigoHtml=codigoHtml=query.obtenImagenesRegistrado("nombreArchivo");
         return codigoHtml;
    }
     
    public String cargaImagenes() throws SQLException{
        Consultas query=new Consultas();
        String codigoHtml=codigoHtml=query.obtenImagenes("nombreArchivo");
         return codigoHtml;
    }
    
    public String cargaMateriales() throws SQLException{
        Consultas query=new Consultas();
        String codigoHtml=codigoHtml=query.obtenerComboMateriales();
         return codigoHtml;
    }
    
      public String cargaTipoImpresoras() throws SQLException{
        Consultas query=new Consultas();
        String codigoHtml=codigoHtml=query.obtenerComboTipoImpresora();
         return codigoHtml;
    }
    
    public String htmlEstilo(){
    String codigoHtml="<table width=\"900\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\n" +
"	<tr>\n" +
"		<td>\n" +
"			<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
"				<tr>\n" +
"					<td width=\"300\" class=\"name\" scope=\"col\">Leyeremen<span class=\"name2\">Name</span> </td>\n" +
"					<td scope=\"col\">\n" +
"						<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" id=\"links-bg\">\n" +
"						<tr>\n" +
"							<td></td>\n" +
"							<td>\n" +
"								<table border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\n" +
"									<tr>\n" +
"										<td class=\"toplinks\"><a href=\"#\">Servicios</a></td><td class=\"sap\"></td>\n" +
"										<td class=\"toplinks\"><a href=\"#\">Contacto</a></td><td class=\"sap\"></td>\n" +
"										<td class=\"toplinks\"><a href=\"#\">Nosotros</a></td><td class=\"sap\"></td>\n" +
"										<td class=\"toplinks\"><a href=\"#\">Acerca de</a></td><td class=\"sap\"></td>\n" +
"									</tr>\n" +
"							</table></td>\n" +
"							<td></td>\n" +
"						</tr>\n" +
"					</table></td>\n" +
"					</tr>\n" +
"					<tr>\n" +
"						<td scope=\"col\"></td>\n" +
"						<td height=\"4\" bgcolor=\"#111111\"></td>\n" +
"					</tr>\n" +
"				</table>\n" +
"			</td>\n" +
"		</tr> \n" +
"	<tr>\n" +
"		<td><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
"			<tr><div class=\"inner_copy\"></div>\n" +
"				<td colspan=\"2\"><table width=\"900\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\n" +
"			<tr><td colspan=\"3\" valign=\"top\">&nbsp;</td></tr><tr>\n" +
"				<td colspan=\"3\" valign=\"top\"><table width=\"730\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" id=\"preview\">\n" +
"					<tr>\n" +
"						<td scope=\"col\">&nbsp;</td>\n" +
"					</tr>\n" +
"					<tr>\n" +
"						<td scope=\"col\"><table border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\n" +
"								<tr>\n" +
"									<td scope=\"col\"><img src=\"images/preview.jpg\" alt=\"Photography templates\" width=\"700\" height=\"400\"/></td>\n" +
"								</tr>\n" +
"						</table></td>\n" +
"					</tr>\n" +
"					<tr>\n" +
"						<td scope=\"col\">&nbsp;</td>\n" +
"					</tr>\n" +
"				</table></td>\n" +
"			</tr>\n" +
"			<tr>\n" +
"				<td height=\"10\" colspan=\"3\" valign=\"top\"></td>\n" +
"				</tr>\n" +
"		\n" +
"			<tr>\n" +
"				<td height=\"30\" valign=\"middle\" bgcolor=\"#000\">&nbsp;</td>\n" +
"				<td valign=\"middle\" bgcolor=\"#000\"><table border=\"0\" align=\"right\" cellpadding=\"0\" cellspacing=\"0\">\n" +
"					<tr>\n" +						
"					</tr>\n" +
"				</table></td>\n" +
"				<td width=\"20\" valign=\"middle\" bgcolor=\"#000\">&nbsp;</td>\n" +
"			</tr>\n" +
"			<tr>\n" +
"				<td colspan=\"3\" valign=\"top\" bgcolor=\"#000\"><table width=\"830\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\n" +
"					<tr>\n" +
"						<td width=\"130\" height=\"100\" scope=\"col\"><a href=\"#\"><img src=\"images/image1.jpg\" alt=\"Photography templates\" width=\"130\" height=\"98\" border=\"0\"/></a></td>\n" +
"						<td width=\"10\" scope=\"col\">&nbsp;</td>\n" +
"						<td width=\"130\" scope=\"col\"><a href=\"#\"><img src=\"images/image2.jpg\" alt=\"Photography templates\" width=\"130\" height=\"98\" border=\"0\"/></a></td>\n" +
"						<td width=\"10\" scope=\"col\">&nbsp;</td>\n" +
"						<td width=\"130\" scope=\"col\"><a href=\"#\"><img src=\"images/image3.jpg\" alt=\"Photography templates\" width=\"130\" height=\"98\" border=\"0\"/></a></td>\n" +
"						<td width=\"10\" scope=\"col\">&nbsp;</td>\n" +
"						<td width=\"130\" scope=\"col\"><a href=\"#\"><img src=\"images/image4.jpg\" alt=\"Photography templates\" width=\"130\" height=\"98\" border=\"0\"/></a></td>\n" +
"						<td width=\"10\" scope=\"col\">&nbsp;</td>\n" +
"						<td width=\"130\" scope=\"col\"><a href=\"#\"><img src=\"images/image5.jpg\" alt=\"Photography templates\" width=\"130\" height=\"98\" border=\"0\"/></a></td>\n" +
"						<td width=\"10\" scope=\"col\">&nbsp;</td>\n" +
"						<td width=\"130\" scope=\"col\"><a href=\"#\"><img src=\"images/image6.jpg\" alt=\"Photography templates\" width=\"130\" height=\"98\" border=\"0\"/></a></td>\n" +
"					</tr>\n" +
"				</table></td>\n" +
"			</tr>\n" +
"			<tr>\n" +
"				<td height=\"30\" colspan=\"3\" valign=\"top\" bgcolor=\"#000\">&nbsp;</td>\n" +
"			</tr>\n" +
"		</table></td>\n" +
"			</tr>\n" +
"			<tr>\n" +
"				<td colspan=\"2\">&nbsp;</td>\n" +
"			</tr>\n" +
"			\n" +
"		</table></td>\n" +
"	</tr>\n" +
"</table>";
    return  codigoHtml;
    }
}
