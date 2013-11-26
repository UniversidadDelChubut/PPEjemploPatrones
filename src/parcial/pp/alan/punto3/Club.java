package parcial.pp.alan.punto3;

import java.util.LinkedList;
import java.util.List;

public class Club {
	
	private String nombre;/** Nombre del Club.*/
	private List<Socio> socios = new LinkedList<Socio>();/** Lista de socios.*/
	
	
	public static Club getClub (){
		Club club = new Club("Boca de Rawson");
		club.agregarSocio(new Vitalicio("Pepe"));
		club.agregarSocio(new Adherente("Nacho"));
		club.agregarSocio(new Pleno("Moncho"));
		
		
		club.agregarSocio(new Vitalicio("Jose"));
		club.agregarSocio(new Pleno("Ramon"));
		club.agregarSocio(new Pleno("Ignacio"));
		return club;
	}
	
	public List<Socio> getSocios() {
		return socios;
	}
	
	
	/** El constructor recibe el nombre del Club.*/
	public Club(String nombre) {
		this.nombre = nombre;
	}
	
	/** Agrega un nuevo socio a la lista de socios.*/
	public void agregarSocio(Socio nuevo) {
		boolean bandera = false;
		
		/** Corroboramos que no hayan dos socios con el mismo nombre*/
		for(Socio socio: this.socios){
			if(nuevo.getNombre().equals(socio.getNombre()))
				bandera = true;
		}
		if(bandera)
			System.out.println("Ya hay un Socio llamado " + nuevo.getNombre());
		else
			this.socios.add(nuevo);
	}
	
	/** Imprime un listado de socio mostrando su nombre y el tipo.*/
	public void imprimirListado() {
		System.out.println("\t---------------------------------");
		System.out.println("\t| NOMBRE\t| TIPO\t\t|");
		System.out.println("\t---------------------------------");
		
		/** Se itera por cada socio de la lista, imprimiendo los datos.*/
		for(Socio socio: this.socios){
			System.out.println("\t| " + socio.getNombre() + "\t\t| " + socio.getTipo() + "\t| ");
			System.out.println("\t---------------------------------");
		}
	}
	
	/** Retorna el nombre del Club.*/
	public String getNombre() {
		return nombre;
	}
	
	/** Retorna el importe total mensual.*/
	public int getImporteTotal() {
		int total = 0;
		
		/** Itera por cada socio acumulando la suma del pago por socio.*/
		for(Socio socio: this.socios){
			total += socio.getPago();
		}
		
		return total;
	}
	
}
