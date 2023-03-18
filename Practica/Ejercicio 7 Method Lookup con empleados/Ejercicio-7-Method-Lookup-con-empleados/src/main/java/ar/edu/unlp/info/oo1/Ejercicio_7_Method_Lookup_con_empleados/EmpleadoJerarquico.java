package ar.edu.unlp.info.oo1.Ejercicio_7_Method_Lookup_con_empleados;

public class EmpleadoJerarquico extends Empleado {
	
	public EmpleadoJerarquico(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}
	public double montoBasico() {
		return 45000;
	}
	public double bonoPorCategoria() {
		return 8000;
	}
	
	public double sueldoBasico() {
		return super.sueldoBasico() + this.bonoPorCategoria();
	}
	
}
