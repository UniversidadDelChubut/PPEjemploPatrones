package edu.udc.pp.patrones.litener;

import java.util.Random;

public class Principal {
	
	
	
	public static void main(String[] args) {
		Cisterna cisterna = new Cisterna();
		Alarma alarma1 = new Alarma();
		Alarma alarma2 = new Alarma();
		Bomba bomba = new Bomba();
		
		
		cisterna.addListener(bomba);
		cisterna.addListener(alarma1);
		cisterna.addListener(alarma2);
		
		bomba.encender();
		
		Random r = new Random();
		
		for (;;) {
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
						
			if (bomba.isEncendida()) {
				cisterna.subirNivel();
			}
			int cant = r.nextInt(2);
			for (int i= 0; i < cant  ; i++) {
				cisterna.bajarNivel();
			}
			
			System.out.println("Nivel: " + cisterna.getNivel());
		}
	}
}
