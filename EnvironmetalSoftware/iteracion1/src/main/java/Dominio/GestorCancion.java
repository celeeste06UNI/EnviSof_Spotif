package Dominio;

import Persistencia.ManejadorBD;

public class GestorCancion {
	
	public GestorCancion() {
		
	}
	
	public String ReproducirCancionesS(String titulo) {
		String tituloRespuesta = "";
		ManejadorBD manejador = new ManejadorBD();
		tituloRespuesta = manejador.ReproducirCancionesS(titulo);
		return tituloRespuesta;
		
	}

}
