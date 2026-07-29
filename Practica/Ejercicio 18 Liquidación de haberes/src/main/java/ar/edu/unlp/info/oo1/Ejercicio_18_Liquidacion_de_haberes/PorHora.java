package ar.edu.unlp.info.oo1.Ejercicio_18_Liquidacion_de_haberes;

import java.time.LocalDate;

public class PorHora extends Contrato{
	private double valorHora;
	private double horas;
	
	public PorHora(Empleado empleado, LocalDate fechaInicio, LocalDate fechaFin, double valorHora, double horas) {
		super(empleado, fechaInicio, fechaFin);
		this.valorHora=valorHora;
		this.horas=horas;
	}

}
