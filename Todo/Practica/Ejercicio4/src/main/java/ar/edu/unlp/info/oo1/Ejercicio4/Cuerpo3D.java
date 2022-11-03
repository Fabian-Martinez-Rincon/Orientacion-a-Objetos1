package ar.edu.unlp.info.oo1.Ejercicio4;

public class Cuerpo3D {
	private double altura;
	private Figura caraBasal;
	
	public void setAltura(double valor) {
		this.altura = valor;
	}
	
	public double getAltura () {
		return this.altura;
	}
	
	public void setCaraBasal(Figura cara) {
		this.caraBasal = cara;
	}
	
	public double getVolumen() {
		return this.caraBasal.getArea() * this.altura;
	}
	
	public double getSuperficieExterior() {
		return (2 * this.caraBasal.getArea() + this.caraBasal.getPerimetro() * this.altura);
	}
}
