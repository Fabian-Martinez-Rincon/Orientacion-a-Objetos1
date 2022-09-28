package ar.edu.unlp.info.oo1.Ejercicio4;

public class Circulo implements Figura{
	private double diametro;
	
	public double getDiametro() {
		return this.diametro;
	}
	public void setDiametro(double valor) {
		this.diametro = valor;
	}
	
	public double getRadio() {
		return this.diametro / 2;
	}
	
	public void setRadio(double valor) {
		this.diametro = valor * 2;
	}
	
	public double getPerimetro() {
		return Math.PI*this.diametro;
	}
	
	public double getArea() {
		return Math.PI*(Math.pow(this.getRadio(), 2));
	}
}
