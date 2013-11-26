package parcial.pp.alan.punto2;

public class Principal {
	/**NOMBRE Y APELLIDO: Alan Marchan.
	 * TRABAJO: 2° Parcial (Orientacion a Objetos) Polimorfismo.
	 * PUNTO: N° 2.*/
	
	public static void main(String[] args) {
		
		Cuadrado f1 = new Cuadrado(4);
		Triangulo f2 = new Triangulo(2, 2, 3);
		Circulo f3 = new Circulo(2);
		
		System.out.println("Area: " + f1.area() + " Perimetro: " + f1.perimetro());
		System.out.println("Area: " + f2.area() + " Perimetro: " + f2.perimetro());
		System.out.println("Area: " + f3.area() + " Perimetro: " + f3.perimetro());
		
		Poligono f4 = f1;
		Poligono f5 = f2;
		/** NOTA: Poligono f6 = f3; NO es posible.*/
		
		System.out.println("\nArea: " + f4.area() + " Perimetro: " + f4.perimetro());
		System.out.println("Area: " + f5.area() + " Perimetro: " + f5.perimetro());
	}
	
}
