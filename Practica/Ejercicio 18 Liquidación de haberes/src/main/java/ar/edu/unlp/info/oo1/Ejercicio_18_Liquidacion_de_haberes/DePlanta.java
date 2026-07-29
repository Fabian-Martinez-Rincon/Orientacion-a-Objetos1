package ar.edu.unlp.info.oo1.Ejercicio_18_Liquidacion_de_haberes;

import java.time.LocalDate;

public class DePlanta extends Contrato{
	private double sueldo;
	private double montoConyuge;
	private double montoHijos;
	
	public DePlanta(Empleado empleado, LocalDate fechaInicio, LocalDate fechaFin, double sueldo, double montoConyuge, double montoHijos) {
		super(empleado, fechaInicio, fechaFin);
		this.sueldo=sueldo;
		this.montoConyuge=montoConyuge;
		this.montoHijos=montoHijos;
	}
	
	
	
}
