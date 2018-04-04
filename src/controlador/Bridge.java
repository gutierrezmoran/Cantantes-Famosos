package controlador;

import java.awt.Color;
import java.util.Iterator;

import modelo.Cantante;
import modelo.ListaCantantes;
import vista.UI;

public class Bridge extends UI implements Validable {

	private ListaCantantes control = new ListaCantantes();
	private ActionAgregar listenerAgregar = new ActionAgregar(this);

	public Bridge() {
		setListeners();
		actualizarCantidadElementos();
	}

	public void actualizarLista() {
		txtLista.setText("");
		
		for (Iterator<Cantante> iterator = control.getLista().iterator(); iterator.hasNext();) {
			Cantante cantante = (Cantante) iterator.next();
			txtLista.setText(txtLista.getText() + "\nNombre: " + cantante.getNombre() + "\nDisco mas vendido: "
					+ cantante.getDiscoConMasVentas() + "\n");
		}
	}

	public void actualizarCantidadElementos() {
		txtCantidadElementos.setText(String.valueOf((this.control.getLista().size())));
	}

	public void agregarCantante() {
		control.agregarCantante(txtNombre.getText(), txtDisco.getText());
	}

	public ListaCantantes getControl() {
		return control;
	}

	public void setControl(ListaCantantes control) {
		this.control = control;
	}

	@Override
	public boolean validarCampos(String nombre, String disco) {
		return !nombre.isEmpty() || !disco.isEmpty();
	}

	public void mostrarMensaje() {
		if (validarCampos(txtNombre.getText(), txtDisco.getText())) {
			txtMensaje.setText("¡Artista agregado!");
			txtMensaje.setForeground(new Color(0, 117, 104));
		} else {
			txtMensaje.setText("Introduzca algun valor");
			txtMensaje.setForeground(Color.RED);
		}
	}
	
	private void setListeners() {
		btnAgregar.addActionListener(listenerAgregar);
	}
}
