package parcial.pp.alan.punto2;

public class Circulo implements Figura{
	
	private float radio;
	
	public Circulo(float radio) {
		this.radio = radio;
	}
	
	@Override
	public float area() {
		return (float) (Math.PI * (radio * radio));
	}
	
	@Override
	public float perimetro() {
		return (float) (Math.PI * (radio * radio)) / 4;	
	}
}
