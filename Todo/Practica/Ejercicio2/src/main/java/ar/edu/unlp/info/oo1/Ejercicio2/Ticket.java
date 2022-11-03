package ar.edu.unlp.info.oo1.Ejercicio2;
import java.time.LocalDate;

public class Ticket {
	private LocalDate fecha;
	private int cantidadDeProductos;
	private double pesoTotal = 0;
	private double precioTotal;
	
	public double impuesto() {
		return this.precioTotal*(0.21);
	}
	
	public Ticket(LocalDate fecha, int cantidadDeProductos, double precioTotal, double pesoTotal) {
		this.fecha = fecha;
		this.cantidadDeProductos = cantidadDeProductos;
		this.pesoTotal = pesoTotal;
		this.precioTotal = precioTotal;
	}
	
	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}
	public LocalDate getFecha() {
		return this.fecha;
	}

	public double getPrecioTotal() {
		return this.precioTotal;
	}
	public double getPesoTotal() {
		return this.pesoTotal;
	}

}

