package ar.edu.unlp.info.oo1.Parcial1;

public class Inmueble implements Bien{
	private Integer nroPartida;
	private double valorLote;
	private double valorEdificacion;
	
	public Inmueble(Integer nroPartida, double valorLote, double valorEdificacion) {
		this.nroPartida=nroPartida;
		this.valorLote=valorLote;
		this.valorEdificacion=valorEdificacion;
	}
	@Override
	public double calcularImpuesto() {
		return (this.valorEdificacion + this.valorEdificacion)/100;
	}

}
