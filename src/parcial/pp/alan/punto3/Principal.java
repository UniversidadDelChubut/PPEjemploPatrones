package parcial.pp.alan.punto3;

public class Principal {
	/**NOMBRE Y APELLIDO: Alan Marchan.
	 * TRABAJO: 2° Parcial (Orientacion a Objetos) Polimorfismo.
	 * PUNTO: N° 3.*/
	
	public static void main(String[] args) {
		
		/** Creamos un Club.*/
		Club club = new Club("Defensores del Baldio");
		
		/** Agregamos varios socios de distinto tipo.*/
		club.agregarSocio(new Vitalicio("Pepe"));
		club.agregarSocio(new Adherente("Nacho"));
		club.agregarSocio(new Pleno("Moncho"));
		
		/** Agregamos otro moncho.*/
		club.agregarSocio(new Pleno("Moncho"));
		
		club.agregarSocio(new Vitalicio("Jose"));
		club.agregarSocio(new Pleno("Ramon"));
		club.agregarSocio(new Pleno("Ignacio"));
		
		/** Se imprime el listado.*/
		club.imprimirListado();
		
		/** Y se imprime el importe mensual total.*/
		System.out.println("\nEl importe total de las cuotas mensuales es: " + club.getImporteTotal());
		
	}
}
