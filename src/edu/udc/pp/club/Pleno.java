package edu.udc.pp.club;

public class Pleno extends Socio{
	
	private static final String TIPO = "Pleno";
	private static final int PAGO = 80;
	
	public Pleno(String nombre) {
		super(nombre, PAGO);
	}
	
	@Override
	public String getTipo() {
		return TIPO;
	}
}
