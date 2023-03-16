package ar.edu.unlp.info.oo1.Ejercicio_2_Balanza_Electronica;

public class Balanza {
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	
	public Balanza() {
		this.cantidadDeProductos = 0;
		this.precioTotal = 0;
		this.pesoTotal = 0;
	}
	public void ponerEnCero() {
		this.cantidadDeProductos = 0;
		this.precioTotal = 0;
		this.pesoTotal = 0;
	}
	
	public void agregarProducto(Producto producto) {
		this.cantidadDeProductos++;
		this.precioTotal+=producto.getPrecio();
		this.precioTotal+=producto.getPeso();
	}
	public double getPrecioTotal() {return this.precioTotal;}
	public double getPesoTotal() {return this.pesoTotal;}
	public int getCantidadDeProductos() {return this.cantidadDeProductos;}
	
	public Ticket emitirTicket() {
		return new Ticket(getCantidadDeProductos(),getPrecioTotal(),getPesoTotal());
	}
}
