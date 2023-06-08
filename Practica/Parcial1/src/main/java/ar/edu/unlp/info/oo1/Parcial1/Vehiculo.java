package ar.edu.unlp.info.oo1.Parcial1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Vehiculo implements Bien{
	private String patente;
	private LocalDate fechaFabricacion;
	private double valor;
	private Contribuyente contribuyente;
	
	public Vehiculo(String patente, LocalDate fechaFabricacion, double valor, Contribuyente c) {
		this.patente=patente;
		this.fechaFabricacion=fechaFabricacion;
		this.valor=valor;
		this.contribuyente=c;
	}
	public int antiguedad() {
		return (int) ChronoUnit.YEARS.between(this.fechaFabricacion, LocalDate.now());
	}
	
	@Override
	public double calcularImpuesto() {
		if (this.antiguedad() > 10) {
			return this.valor;
		}
		return this.valor + ((this.valor/100)*porcentaje());
	}
	
	public double getValor() {
		return this.valor;
	}
	
	abstract public int porcentaje();
}
