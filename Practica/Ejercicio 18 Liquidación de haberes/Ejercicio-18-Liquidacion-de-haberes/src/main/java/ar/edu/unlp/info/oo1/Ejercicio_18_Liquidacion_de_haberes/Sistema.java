package ar.edu.unlp.info.oo1.Ejercicio_18_Liquidacion_de_haberes;

import java.util.*;

public class Sistema {
	private List<Empleado> empleados;
	
	public Sistema() {
		this.empleados = new ArrayList<Empleado>();
	}
	
	public void altaEmpleado(Empleado e) {
		this.empleados.add(e);
	}
	
	public Empleado buscarEmpleado(String CUIL) {
		for (Empleado empleado: empleados) {
			if (empleado.getCuil()  == CUIL) {
				return empleado;
			}
		}
		return null;
	}
	
	public void bajaEmpleado(Empleado e) {
		this.empleados.remove(e);
	}
	//public List<Empleado> empleadosVencidos(){
	//	return this.empleados.stream()
	//			.filter(empleado -> empleado)
	//}
}
