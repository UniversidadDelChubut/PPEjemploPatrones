package edu.udc.pp.patrones.mvc;

import java.util.List;

import edu.udc.pp.club.Socio;


public interface Vista {
	public void mostrarError (String s);
	public void mostrarSocios (List <Socio> socios);
}
