package ar.edu.unlp.info.oo1.Ejercicio_2_Balanza_Electronica;

import  java.time.LocalDate;

public class Ticket {
	private LocalDate fecha;
	private int cantidadDeProductos;
	private double pesoTotal;
	private double precioTotal;
	
	public Ticket(int cantidadDeProductos,double pesoTotal,double precioTotal) {
		this.fecha = LocalDate.now();
		this.cantidadDeProductos = cantidadDeProductos;
		this.pesoTotal = pesoTotal;
		this.precioTotal = precioTotal;
	}
	public double getPrecioTotal() {return this.precioTotal;}
	public double getPesoTotal() {return this.pesoTotal;}
	public int getCantidadDeProductos() {return this.cantidadDeProductos;}
	public LocalDate getFecha() {return this.fecha;}
	public double impuesto() {
		return this.precioTotal * 0.21;
	}
}
