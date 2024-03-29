package entities;

public class Retangulo {
	
	public double largura;
	public double altura;
	
	public double area() {
		return largura * altura;
	}
	
	public double perimetro() {
		return 2 * (largura + altura);
	}
	
	public double diagonal() {
		double d = Math.sqrt((Math.pow(altura, 2.00)) + (Math.pow(largura, 2.00)));
		return d;
	}
}
