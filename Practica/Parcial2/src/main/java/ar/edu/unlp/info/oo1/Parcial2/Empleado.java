package ar.edu.unlp.info.oo1.Parcial2;

import java.util.*;

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
}
