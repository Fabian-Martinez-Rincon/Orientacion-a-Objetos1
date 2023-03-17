package ar.edu.unlp.info.oo1.Ejercicio_3_Bis_Balansa_Mejorada;
import java.util.ArrayList;
import java.util.List;


public class Balanza {
	private List<Producto> productos;
	
	public Balanza() {
		this.productos = new ArrayList<>();
	}
	public void ponerEnCero() {
		this.productos = new ArrayList<>();
	}
	
	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
	}
	
	public double getPrecioTotal() {
		return productos.stream()
				.mapToDouble(producto -> producto.getPrecio())
				.sum();
	}
	public double getPesoTotal() {
		return productos.stream()
				.mapToDouble(producto -> producto.getPeso())
				.sum();
	}
	public int getCantidadDeProductos() {
		return (int) productos.stream().count();
	}
	
	public Ticket emitirTicket() {
		return new Ticket(this.getCantidadDeProductos(),this.getPesoTotal(),this.getPrecioTotal());
	}
	
	public List<Producto> getProductos(){
		return this.productos;
	}
}
