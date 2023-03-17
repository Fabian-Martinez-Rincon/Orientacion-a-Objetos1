package ar.edu.unlp.info.oo1.Ejercicio_3_Presupuestos;

public class Item {
	private String detalle;
	private int cantidad;
	private double costoUnitario;
	
	public Item() {}
	
	public Item(String detalle, int cantidad, double costoUnitario) {
		this.detalle = detalle;
		this.cantidad = cantidad;
		this.costoUnitario = costoUnitario;
	}
	
	public Item detalle(String detalle) {
		this.detalle=detalle;
		return this;
	}
	public Item cantidad(int cantidad) {
		this.cantidad=cantidad;
		return this;
	}
	public Item costoUnitario(double costoUnitario) {
		this.costoUnitario=costoUnitario;
		return this;
	}
	
	public double costo() {
		return this.cantidad * this.costoUnitario;
	}
	public double getCostoUnitario() {return this.costoUnitario;}
	
}
