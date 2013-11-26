package edu.udc.pp.patrones.singleton;

public class Pelota {
	
	private static Pelota pelota = new Pelota();

	public static Pelota getPelota(){
		return Pelota.pelota;
	}

	
	private Pelota() {
		
	}
	
	
	
	private int x = 0;
	private int y = 0;
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	
	
}
