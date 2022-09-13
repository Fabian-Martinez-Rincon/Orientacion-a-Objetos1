package ar.edu.unlp.info.oo1.Ejercicio2;
import java.time.LocalDate;


public class Balanza {
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	
	public void ponerEnCero(){
		this.cantidadDeProductos = 0;
		this.precioTotal = 0;
		this.pesoTotal = 0;
	}
	
	public void agregarProducto(Producto producto) {
		this.cantidadDeProductos++;
		this.pesoTotal += producto.getPeso();
		this.precioTotal += producto.getPrecio();
	}
	
	public Ticket emitirTicket() {
		Ticket t = new Ticket(LocalDate.now() ,this.cantidadDeProductos,this.precioTotal,this.pesoTotal);
		return t;
	}
	public int getCantidadDeProductos() {
		return this.cantidadDeProductos;
	}
	public double getPrecioTotal() {
		return this.precioTotal;
	}
	public double getPesoTotal() {
		return this.pesoTotal;
	}
}
