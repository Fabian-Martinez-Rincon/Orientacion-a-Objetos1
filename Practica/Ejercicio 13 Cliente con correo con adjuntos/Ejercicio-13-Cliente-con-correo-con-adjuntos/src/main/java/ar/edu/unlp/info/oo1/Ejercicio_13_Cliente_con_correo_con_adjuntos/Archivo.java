package ar.edu.unlp.info.oo1.Ejercicio_13_Cliente_con_correo_con_adjuntos;

public class Archivo {
	private String nombre;
	
	public Archivo(String nombre) {
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public double tamanio() {
		return this.nombre.length();
	}
}
