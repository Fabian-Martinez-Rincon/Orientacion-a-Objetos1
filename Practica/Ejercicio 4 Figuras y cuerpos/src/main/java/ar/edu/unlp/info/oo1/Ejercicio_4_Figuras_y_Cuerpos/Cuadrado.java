package ar.edu.unlp.info.oo1.Ejercicio_4_Figuras_y_Cuerpos;

public class Cuadrado implements Figura{
	private double lado;
	
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double getLado() {
		return this.lado;
	}
	
	public double getArea() {
		return this.lado * this.lado;
	}
	public double getPerimetro() {
		return this.lado * 4;
	}
	
}
