package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import controlador.Bridge;

class ValidableTest {
	
	Bridge bridge = new Bridge();

	@Test
	void testValidarCampos() {
		
		String[] nombre = {"","prueba","","prueba"};
		String[] disco = {"","","prueba","prueba"};
		boolean[] resultado = {false, true, true, true};
		
		for (int i = 0; i < resultado.length; i++) {
			assertEquals(resultado[i], bridge.validarCampos(nombre[i], disco[i]));
		}
		
	}

}
