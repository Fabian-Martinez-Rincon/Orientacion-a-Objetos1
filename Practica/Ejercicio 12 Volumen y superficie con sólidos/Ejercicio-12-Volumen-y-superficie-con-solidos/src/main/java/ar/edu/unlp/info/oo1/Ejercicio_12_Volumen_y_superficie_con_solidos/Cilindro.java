package ar.edu.unlp.info.oo1.Ejercicio_12_Volumen_y_superficie_con_solidos;

public class Cilindro extends Pieza{
	private int radio;
	private int altura;
	
	public Cilindro(int radio, int altura, String material, String color) {
		super(material,color);
		this.radio=radio;
		this.altura=altura;
	}
	
	public double getVolumen(){
		return (int) Math.round(Math.PI*(Math.pow(this.radio,2))*this.altura);
	}
	public double getSuperficie(){
		return (int) Math.round(2*Math.PI*this.radio*this.altura+2*Math.PI*Math.pow(this.radio,2));
	}
}