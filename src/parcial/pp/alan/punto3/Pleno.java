package parcial.pp.alan.punto3;

public class Pleno extends Socio{
	
	private static final String TIPO = "Pleno";
	private static final int PAGO = 80;
	
	public Pleno(String nombre) {
		super(nombre, PAGO);
	}
	
	@Override
	public String getTipo() {
		return TIPO;
	}
}
