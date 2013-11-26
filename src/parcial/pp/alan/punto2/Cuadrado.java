package parcial.pp.alan.punto2;

public class Cuadrado extends Poligono implements Figura{
	
	private float lado = 0;
	
	public Cuadrado(float lado) {
		this.lado = lado;
	}
	
	@Override
	public float area() {
		return lado * lado;
	}
	
	@Override
	public float perimetro() {
		return lado * lado * lado * lado;
	}
}
