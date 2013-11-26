package parcial.pp.alan.punto2;

public class Triangulo extends Poligono implements Figura{
	
	private float lado1 = 0;
	private float lado2 = 0;
	private float lado3 = 0;
	
	public Triangulo(float lado1, float lado2, float lado3) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	
	@Override
	public float area() {
		return (lado1 * lado2) / 2;
	}
	
	@Override
	public float perimetro() {
		return lado1 + lado2 + lado3;
	}
}
