package edu.udc.pp.patrones.mvc;

import java.util.List;

import parcial.pp.alan.punto3.Socio;

public interface Vista {
	public void mostrarError (String s);
	public void mostrarSocios (List <Socio> socios);
}
