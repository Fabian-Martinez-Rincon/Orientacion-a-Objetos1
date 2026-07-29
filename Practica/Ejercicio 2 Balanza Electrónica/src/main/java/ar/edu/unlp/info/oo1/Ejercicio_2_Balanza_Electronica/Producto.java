package ar.edu.unlp.info.oo1.Ejercicio_2_Balanza_Electronica;

public class Producto {
	private double peso;
	private double precioPorKilo;
	private String descripcion;
	
	public Producto() {}
	
	public double getPrecio() {
		return this.precioPorKilo * this.peso;
	}
	public double getPeso() {
		return this.peso;
	}
	public void setPrecioPorKilo(double precioPorKilo) {
		this.precioPorKilo=precioPorKilo;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecioPorKilo() {
		return this.precioPorKilo;
	}
	public String getDescripcion() {
		return this.descripcion;
	}
}
