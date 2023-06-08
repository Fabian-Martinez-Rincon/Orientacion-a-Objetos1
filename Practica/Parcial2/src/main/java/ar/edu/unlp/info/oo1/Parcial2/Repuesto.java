package ar.edu.unlp.info.oo1.Parcial2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Repuesto {
	private String nombre;
	private LocalDate fechaFabricacion;
	public double costo;
	
	public Repuesto(String nombre, LocalDate fechaFabricacion, double costo) {
		this.nombre=nombre;
		this.fechaFabricacion=fechaFabricacion;
		this.costo=costo;
	}
	
	public double getCosto() {
		return this.costo;
	}
	
	public int antiguedad() {
		return (int) ChronoUnit.YEARS.between(this.fechaFabricacion, LocalDate.now());
	}
}
