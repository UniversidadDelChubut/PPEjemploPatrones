package edu.udc.pp.patrones.litener;

public class Alarma implements CisternaListener {

	@Override
	public void llegoNivelCritico() {
		System.out.println("LLEGO ANIVEL CRITICO!!!");		
	}
	
	@Override
	public void llegoNivelMaximo() {
	}
	
	@Override
	public void llegoNivelRecarga() {
	}
	@Override
	public void pasoNivelMaximo() {
		System.out.println("OJO QUE SE LLENA!!!");
	}
}