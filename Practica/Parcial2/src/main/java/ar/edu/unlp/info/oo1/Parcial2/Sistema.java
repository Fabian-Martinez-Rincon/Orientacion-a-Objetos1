package ar.edu.unlp.info.oo1.Parcial2;

import java.util.*;

public class Sistema {
	private List<Empleado> empleados = new ArrayList<>();
	
	public void altaEmpleado(Empleado e) {
		this.empleados.add(e);
	}
	
	public Boolean aplicarDescuento(Orden orden) {
		return empleados.stream()
				.anyMatch(empleado -> empleado.tieneOrden12Meses(orden));
	}
}
