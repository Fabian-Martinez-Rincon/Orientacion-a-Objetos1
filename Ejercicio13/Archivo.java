public class Archivo {
	private String nombre;
	
	public String getNombre() {
		return this.nombre;
	}
	
	public Archivo(String nombre) {
		this.nombre = nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int tamanio() {
		return nombre.length();
	}
}