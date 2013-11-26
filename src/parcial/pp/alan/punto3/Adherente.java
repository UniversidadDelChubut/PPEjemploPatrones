package parcial.pp.alan.punto3;

public class Adherente extends Socio{
	
	private static final String TIPO = "Adherente";
	private static final int PAGO = 40;
	
	public Adherente(String nombre) {
		super(nombre, PAGO);
	}
	
	@Override
	public String getTipo() {
		return TIPO;
	}
}
