public class Empleado {
	private String nombre;
	
	public Empleado(String string) {
		this.nombre = string;
	}

	public double montoBasico() {
		return 35000;
	}
	
	public double aportes() {
		return 13500;
	}
	
	public double sueldoBasico() {
		System.out.println("Estoy dentro de sueldo basico de e: " + (this.montoBasico() + this.aportes()));
		return this.montoBasico() + this.aportes();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}