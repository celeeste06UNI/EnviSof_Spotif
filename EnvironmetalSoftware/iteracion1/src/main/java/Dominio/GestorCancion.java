package Dominio;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Persistencia.ManejadorBD;

public class GestorCancion {
	
	ManejadorBD manejador = new ManejadorBD();
	
	public GestorCancion() {
		
	}
	
	public boolean conexion() {
		boolean controlConexion;
		controlConexion = manejador.conexion();
		return controlConexion;
		
	}

	public ArrayList<Cancion> cancionesBBDD() {
		ResultSet rs = null;
		ArrayList<Cancion> canciones = new ArrayList();
		rs = manejador.leer("SELECT * FROM canciones;");
		String titulo;
		if (rs != null) {
            System.out.println("El listado de la tabla clientes es:");

            try {
				while (rs.next()) { 
				   titulo = (String) rs.getObject("id_album");
				    System.out.println(titulo);
				    //Cancion cancion = new Cancion(rs.getObject("id_cancion"), rs.getObject("titulo"), rs.getObject("id_album")) ;
				    
				    rs.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
           
        }

		
		return canciones;
	}

}
