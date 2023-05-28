package ar.edu.unlp.info.oo1.Ejercicio_17_Facturas_de_llamadas;

import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Llamada {
	private LocalDate fecha;
	private LocalTime hora;
	private Double duracion;
	private String llama;
	private String recibe;
	
	public Llamada(LocalDate fecha,LocalTime hora, Double duracion, String llama, String recibe) {
		this.fecha=fecha;
		this.hora=hora;
		this.duracion=duracion;
		this.llama=llama;
		this.recibe=recibe;
	}
	
	public boolean cumple(LocalDate fecha1, LocalDate fecha2) {
		if ((fecha.isAfter(fecha1) || fecha.equals(fecha1)) && (fecha.isBefore(fecha2) || fecha.equals(fecha2))) {
			return true;
		}
		return false;
	}
	
	public double getDuracion() {
		return this.duracion;
	}
	
	public LocalTime getHora() {
		return this.hora;
	}
	
	abstract public double calcularCosto();
}
