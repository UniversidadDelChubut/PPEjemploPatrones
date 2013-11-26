package parcial.pp.alan.punto3;

public abstract class Socio {
	
	private String nombre;/** El nombre del socio.*/
	private int pago;/** Cuanto debe pagar.*/
	
	/** El constructor recibe el nombre del socio y el pago mensual por socio.*/
	public Socio(String nombre, int pago) {
		this.nombre = nombre;
		this.pago = pago;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public int getPago(){
		return pago;
	}
	
	/** Cada tipo de socio retornara su tipo.*/
	abstract public String getTipo();
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nombre;
	}
	
}
