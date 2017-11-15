package edu.udc.pp.patrones.listener;

import java.util.Collection;
import java.util.LinkedList;

public class Cisterna {

	private int nivel = 0;
	private int nivelMaximo =  20;
	private int nivelCritico =  2;
	private int nivelRecarga =  5;
	
	private Collection<CisternaListener> listeners 
					= new LinkedList<CisternaListener>();
	
	public void addListener(CisternaListener l){
		listeners.add(l);
	}
	
	public int getNivel() {
		return nivel;
	}
	
	public void subirNivel() {
		this.nivel++;
		
		if (this.nivel == this.nivelMaximo){
			for (CisternaListener l: this.listeners){
				l.llegoNivelMaximo();
			}
		}
		
		if (this.nivel == this.nivelMaximo + 1){
			for (CisternaListener l: this.listeners){
				l.pasoNivelMaximo();
			}
		}
	}
	
	public void bajarNivel(){
		this.nivel --;
		if (this.nivel == this.nivelRecarga){
			for (CisternaListener l: this.listeners){
				l.llegoNivelRecarga();
			}
		}
	}
}
