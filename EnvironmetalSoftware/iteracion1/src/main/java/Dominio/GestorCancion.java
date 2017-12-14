package Dominio;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Persistencia.ManejadorBD;

public class GestorCancion {
	
	private ManejadorBD manejador = new ManejadorBD();
	
	public GestorCancion() {
		
	}
	
	public boolean conexion() throws SQLException {
		boolean controlConexion;
		controlConexion = manejador.conexion();
		return controlConexion;
		
	}

	public ArrayList<Cancion> cancionesBBDD() throws SQLException {
		ArrayList <Cancion> canciones = new ArrayList();
		Cancion cancion;
		String SQLquery = "SELECT * FROM canciones";
		ResultSet resultados = manejador.leer(SQLquery);
		try {       
            if (resultados != null) { 
                while (resultados.next()) {
                	cancion = new Cancion(resultados.getInt("id_cancion"), resultados.getString("titulo"), resultados.getInt("id_album"),
                			resultados.getDouble("precio"));
                	canciones.add(cancion);                   
                }
                resultados.close();
            }
		}catch (SQLException e) {            
            e.printStackTrace();            
            throw e;
        }
		return canciones;
	}
	
	

}
