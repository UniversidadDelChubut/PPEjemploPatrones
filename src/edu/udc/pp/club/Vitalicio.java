package edu.udc.pp.club;

public class Vitalicio extends Socio{
	
	private static final String TIPO = "Vitalicio";
	private static final int PAGO = 0;
	
	public Vitalicio(String nombre) {
		super(nombre, PAGO);
	}
	
	@Override
	public String getTipo() {
		return TIPO;
	}
}
