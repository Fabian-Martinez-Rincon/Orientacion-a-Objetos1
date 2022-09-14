package ar.edu.unlp.info.oo1.Ejercicio3;
import java.time.LocalDate;
public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	
	public void agregarItem(Item item) {
		
	}
	public double calcularTotal() {
		return 2.0;
	}
	public Presupuesto cliente(String cliente) {
		this.cliente = cliente;
		return this;
	}
}
