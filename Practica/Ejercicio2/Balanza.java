import java.time.LocalDate;

public class Balanza {
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	
	public void ponerEnCero(){
		this.cantidadDeProductos=0;
		this.precioTotal=0;
		this.pesoTotal=0;
	}
	
	public void agregarProducto(Producto producto){
		this.cantidadDeProductos++;
		this.precioTotal+=producto.getPrecio();
		this.pesoTotal+=producto.getPeso();
	}
	
	public Ticket emitirTicket(){
		Ticket ticket=new Ticket(LocalDate.now(),this.cantidadDeProductos,this.pesoTotal,this.precioTotal);
		return ticket;
	}

	public double getPrecioTotal(){
		return precioTotal;
	}

	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public double getPesoTotal() {
		return pesoTotal;
	}
}