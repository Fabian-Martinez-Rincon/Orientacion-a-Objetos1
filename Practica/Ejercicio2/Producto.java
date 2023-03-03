public class Producto {
	private double peso;
	private double precioPorKilo;
	private String descripcion;
	
	public double getPrecio(){
		return this.peso*this.precioPorKilo;
	}
	
	public double getPeso(){
		return this.peso;
	}
	
	public String getDescripcion(){
		return this.descripcion;
	}

	public double getPrecioPorKilo() {
		return precioPorKilo;
	}

	public void setPrecioPorKilo(double precioPorKilo) {
		this.precioPorKilo = precioPorKilo;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setDescripcion(String description) {
		this.descripcion = description;
	}
}