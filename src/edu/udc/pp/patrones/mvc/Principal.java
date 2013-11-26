package edu.udc.pp.patrones.mvc;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Controlador controlador = new Controlador();
		new VistaGUI(controlador);
	}

}
