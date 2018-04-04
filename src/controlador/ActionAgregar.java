package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionAgregar implements ActionListener {
	
	private Bridge bridge;
	
	public ActionAgregar(Bridge bridge) {
		this.bridge = bridge;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(bridge.validarCampos(bridge.getTxtNombre().getText(), bridge.getTxtDisco().getText())) {
			bridge.agregarCantante();
			bridge.actualizarLista();
			bridge.actualizarCantidadElementos();
			bridge.mostrarMensaje();
		} else {
			bridge.mostrarMensaje();
		}
	}

}
