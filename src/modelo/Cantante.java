package modelo;

public class Cantante {
	private String nombre;
	private String discoConMasVentas;
	
	public Cantante(String nombre, String discoConMasVentas) {
		this.nombre = nombre;
		this.discoConMasVentas = discoConMasVentas;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDiscoConMasVentas() {
		return discoConMasVentas;
	}
	public void setDiscoConMasVentas(String discoConMasVentas) {
		this.discoConMasVentas = discoConMasVentas;
	}

}
