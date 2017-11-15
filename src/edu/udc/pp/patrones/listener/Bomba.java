package edu.udc.pp.patrones.listener;

public class Bomba implements CisternaListener {
	private boolean encendida = false;
	
	public void apagar(){
		System.out.println("Me apago");
		this.encendida = false;
	}
	
	public void encender (){
		System.out.println("Me prendo");
		this.encendida = true;
	}
	
	@Override
	public void llegoNivelCritico() { }
	
	@Override
	public void llegoNivelMaximo() {
		this.apagar();
	}
	
	@Override
	public void llegoNivelRecarga() {
		this.encender();
	}
	
	@Override
	public void pasoNivelMaximo() {	}
	
	
	public boolean isEncendida(){
		return this.encendida;
	}
}
