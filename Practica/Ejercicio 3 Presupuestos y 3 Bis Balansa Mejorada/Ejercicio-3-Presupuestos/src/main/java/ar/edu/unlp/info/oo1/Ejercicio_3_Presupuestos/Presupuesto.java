package ar.edu.unlp.info.oo1.Ejercicio_3_Presupuestos;

import  java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	private List<Item> items;
	
	public Presupuesto() {
		this.items = new ArrayList<>();
	}
	
	public Presupuesto(LocalDate fecha, String cliente) {
		this.fecha = fecha;
		this.cliente = cliente;
		this.items = new ArrayList<>();
	}
	
	public void agregarItem(Item item) {
		items.add(item);
	}
	public Presupuesto cliente(String cliente) {
		this.cliente = cliente;
		return this;
	}
	public double calcularTotal() {
		return items.stream()
				.mapToDouble(item -> item.costo())
				.sum();
	}
}
