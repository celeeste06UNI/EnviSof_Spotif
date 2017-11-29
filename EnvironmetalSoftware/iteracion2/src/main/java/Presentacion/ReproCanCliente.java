package Presentacion;

import Dominio.ReproCanServidor;

public class ReproCanCliente {
	private String cancion;
	
	public ReproCanCliente(String cancion) {
		super();
		this.cancion = cancion;
		reproducirCancion(cancion);
	}


	public void reproducirCancion(String cancion) {
		ReproCanServidor rs = new ReproCanServidor(cancion);
		
	}
	

}
