package ar.edu.unlp.info.oo1.Ejercicio_17_Facturas_de_llamadas;

public class Juridica extends Cliente{
	private String cuit;
	private String tipo;
	
	public Juridica(String nombre, String direccion, String cuit, String tipo) {
		super(nombre, direccion);
		this.cuit=cuit;
		this.tipo=tipo;
	}

	@Override
	public double getDescuento() {
		return 0.1;
	}
	
}
