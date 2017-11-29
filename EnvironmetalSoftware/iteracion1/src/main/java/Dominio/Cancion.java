package Dominio;

public class Cancion {
	
	private int id_cancion;
	private String titulo;
	private int id_album;

	public Cancion(int id_cancion, String titulo, int id_album) {
		super();
		this.id_cancion = id_cancion;
		this.titulo = titulo;
		this.id_album = id_album;
	}

	public int getId_cancion() {
		return id_cancion;
	}

	public void setId_cancion(int id_cancion) {
		this.id_cancion = id_cancion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getId_album() {
		return id_album;
	}

	public void setId_album(int id_album) {
		this.id_album = id_album;
	}

	
	public String toString() {
		return "Cancion [id_cancion=" + id_cancion + ", titulo=" + titulo + ", id_album=" + id_album + "]";
	}
	
	
	
}
