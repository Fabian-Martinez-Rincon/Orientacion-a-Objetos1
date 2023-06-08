package ar.edu.unlp.info.oo1.Parcial2;

import java.time.LocalTime;
import java.util.*;

public class reparacion extends Orden{
	private String descripcion;
	private List<Empleado> empleados = new ArrayList<>();
	private Integer horasNecesarias;
	private LocalTime hora;
	
	public reparacion(String patente, String descripcion, List<Empleado> empleados, Integer horasNecesarias) {
		super(patente);
		this.descripcion=descripcion;
		this.empleados=empleados;
		this.horasNecesarias=horasNecesarias;
		this.hora=LocalTime.now();
	}

	public double totalEmpleados() {
		return this.empleados.stream()
				.mapToDouble(empleado -> empleado.getValorHora())
				.sum() * this.horasNecesarias;
	}


	@Override
	public double costoOrden() {
		return (super.totalRepuesto() + this.totalEmpleados()) * 1.1;
	}
	
	

}
