package Dominio;

public class ReproCanServidor {
	private String cancion;
	
	public ReproCanServidor(String cancion) {
		super();
		this.cancion = cancion;
		reproducirCancion(cancion);
	}


	public void reproducirCancion(String cancion) {
		ReproCanServidor rs = new ReproCanServidor(cancion);
		
	}
	

}