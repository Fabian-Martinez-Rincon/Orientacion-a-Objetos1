import java.time.*;
import java.util.ArrayList;
import java.util.List;

public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	private List<Item> items;
	
	public Presupuesto(LocalDate fecha) { //constructor1
		this.fecha=fecha;
		this.items = new ArrayList<>();
	}
	
	public Presupuesto() { //constructor2
		this.fecha=LocalDate.now();
		this.items = new ArrayList<>();
	}
	
	public Presupuesto cliente(String cliente){
		this.cliente=cliente;
		return this;
	}
	
	public void agregarItem(Item item) {
		this.items.add(item);
	}
	
	//SOLUCION TRADICIONAL
	public double calcularTotal(){
		double total=0;
		for(Item item:items){
			total+=item.costo();
		}
		return total;
	}
	
	//SOLUCION LAMDA
	 public double calcularTotalLamda(){
		double total = this.items.stream().mapToDouble(Item::costo).sum();
		return total;
	}
	
}