package modelo;

import java.util.ArrayList;

public class ListaCantantes {
	private ArrayList<Cantante> lista = new ArrayList<>();
	
	public void agregarCantante(String nombre, String disco) {
		assert !nombre.isEmpty() || !disco.isEmpty() : "Valores vacios";

		this.lista.add(new Cantante(nombre, disco));
	}

	public ArrayList<Cantante> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Cantante> lista) {
		this.lista = lista;
	}
}
