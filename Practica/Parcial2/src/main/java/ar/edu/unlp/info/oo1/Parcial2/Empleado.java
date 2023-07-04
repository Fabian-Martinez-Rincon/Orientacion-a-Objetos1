package ar.edu.unlp.info.oo1.Parcial2;

import java.util.*;
import java.util.stream.Collectors;

public class Empleado {
	private String nombre;
	private double valorHora;
	private List<Orden> ordenes = new ArrayList<>();
	
	public Empleado(String nombre, double valorHora) {
		this.nombre=nombre;
		this.valorHora=valorHora;
	}
	
	public void registrarOrden(Orden o) {
		this.ordenes.add(o);
	}
	
	public double getValorHora() {
		return this.valorHora;
	}
	
	public List<Factura> facturarOrdenes(List<Orden> ordenes ){
		return ordenes.stream()
				.map(orden -> orden.generarFactura())
				.collect(Collectors.toList());
	}
	
	public Boolean tieneOrden12Meses(Orden o) {
		return this.ordenes.stream()
				.allMatch(orden -> (
					orden.equals(o) && orden.antiguedad() == 1
					));
	}
}
