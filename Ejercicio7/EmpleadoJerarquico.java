public class EmpleadoJerarquico extends Empleado {
	

	public EmpleadoJerarquico(String string) {
		super(string);
	}

	public double sueldoBasico() {
		System.out.println("Estoy dentro de sueldo basico de ej: " + super.sueldoBasico());
		return super.sueldoBasico() + this.bonoPorCategoria();
	}
	
	public double montoBasico() {
		return 45000;
	}
	
	public double bonoPorCategoria() {
		return 8000;
	}
}