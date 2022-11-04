public class Item {
	private String detalle;
	private int cantidad;
	private double costoUnitario;
	
	public double getCostoUnitario() {
		return costoUnitario;
	}

	public Item detalle(String detalle){
		this.detalle=detalle;
		return this;
	}
	
	public Item costoUnitario(double costoUnitario){
		this.costoUnitario=costoUnitario;
		return this;
	}
	
	public Item cantidad(int cantidad){
		this.cantidad=cantidad;
		return this;
	}
	
	public double costo(){
		return this.cantidad*this.costoUnitario;
	}
}