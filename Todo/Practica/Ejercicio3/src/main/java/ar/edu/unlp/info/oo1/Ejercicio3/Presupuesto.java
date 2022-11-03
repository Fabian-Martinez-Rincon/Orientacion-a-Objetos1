package ar.edu.unlp.info.oo1.Ejercicio3;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	private List<Item> items;
	
	public Presupuesto (LocalDate fecha) {
		this.fecha = fecha;
		this.items = new ArrayList<>();
	}
	
	public Presupuesto () {
		this.fecha = LocalDate.now();
		this.items = new ArrayList<>();
	}
	
	public void agregarItem(Item item) {
		this.items.add(item);
	}
	public double calcularTotal() {
		double total = 0;
		for (Item item:items) {
			total+=item.costo();
		}
		return total;
	}
	public Presupuesto cliente(String cliente) {
		this.cliente = cliente;
		return this;
	}
}
