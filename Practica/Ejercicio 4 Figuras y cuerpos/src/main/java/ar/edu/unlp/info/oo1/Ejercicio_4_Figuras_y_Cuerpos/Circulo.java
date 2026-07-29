package ar.edu.unlp.info.oo1.Ejercicio_4_Figuras_y_Cuerpos;

public class Circulo implements Figura{
	private double diametro;
	private double radio;
	
	
	public double getDiametro() {
		return this.diametro;
	}
	public void setDiametro(double diametro) {
		this.diametro = diametro;
		this.radio = diametro / 2;
	}
	
	public double getRadio() {
		return this.radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
		this.diametro = radio * 2;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(this.radio, 2);
	}
	
	public double getPerimetro() {
		return Math.PI * this.diametro;
	}
	
	
	
}
