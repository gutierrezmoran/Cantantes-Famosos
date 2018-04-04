package controlador;

public interface Validable {
	
	/**
	 * Comprueba el contenido de los campos de texto
	 * 
	 * @return Retorna TRUE si alguno de los campos de texto contienen texto, o FALSE, si ambos estan vacios
	 */
	public boolean validarCampos(String nombre, String disco);
}
