package edu.udc.pp.patrones.mvc;

import java.util.List;
import java.util.Scanner;

import parcial.pp.alan.punto3.Socio;

public class VistaConsola implements Vista {
	
	
	private Controlador controlador;
	
	
	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}
	
	public VistaConsola(Controlador controlador) {
		this.controlador = controlador;
		controlador.setVista(this);
		this.mostrarOpciones();
	}

	
	public void mostrarError (String s){
		System.out.println("Error: " + s);
	}
	
	public void mostrarOpciones(){
		System.out.println(" LISTADO DE SOCIOS ");
		System.out.println("   1 - Todos");
		System.out.println("   2 - Vitalicios ");
		System.out.println("   3 - Adherentes ");
		System.out.println("   4 - Plenos");
		System.out.println("  Elija su opcion ");
		
		Scanner s = new Scanner(System.in);
		int opcion = s.nextInt();
		
	
		controlador.getListadoSocios(opcion);
	}
		//LLamar al controladosr cone l codigo ingresa
	public void mostrarSocios (List <Socio> socios){
		for (Socio s : socios)
			System.out.println(s);
	}
	
	
	
	
	
	
}
