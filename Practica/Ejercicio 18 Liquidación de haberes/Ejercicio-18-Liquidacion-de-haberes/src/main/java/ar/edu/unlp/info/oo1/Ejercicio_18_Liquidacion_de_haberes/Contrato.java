package ar.edu.unlp.info.oo1.Ejercicio_18_Liquidacion_de_haberes;

import java.time.LocalDate;

public abstract class Contrato {
	private Empleado empleado;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	
	public Contrato(Empleado empleado,LocalDate fechaInicio, LocalDate fechaFin) {
		this.empleado=empleado;
		this.fechaInicio=fechaInicio;
		this.fechaFin=fechaFin;
	}
	public LocalDate getFechaInicio() {
		return this.fechaInicio;
	}
}
