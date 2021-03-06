package edu.udc.pp.patrones.mvc;

import java.util.LinkedList;
import java.util.List;

import edu.udc.pp.club.Adherente;
import edu.udc.pp.club.Club;
import edu.udc.pp.club.Pleno;
import edu.udc.pp.club.Socio;
import edu.udc.pp.club.Vitalicio;


public class Controlador {
	
	private Vista vista;
	
	public void setVista(Vista vista) {
		this.vista = vista;
	}
	
	public void getListadoSocios(int opcion){
		
		List <Socio> socios = new LinkedList<Socio>();
		
		
		for (Socio socio : Club.getClub().getSocios()) {
			switch (opcion) {
			case 1:
				socios.add(socio);
				break;
			case 2: 
				if (socio instanceof Adherente){
					socios.add(socio);
				}
				break;					
			case 3: 
				if (socio instanceof Pleno){
					socios.add(socio);
				}
				break;					
					
			case 4: 
				if (socio instanceof Vitalicio){
					socios.add(socio);
				}
				break;					
			}
			
		}
			
		if (socios.size() > 0)
			vista.mostrarSocios(socios);
		else {
			vista.mostrarError("No hay socios");
		}
	}
	
	
}
