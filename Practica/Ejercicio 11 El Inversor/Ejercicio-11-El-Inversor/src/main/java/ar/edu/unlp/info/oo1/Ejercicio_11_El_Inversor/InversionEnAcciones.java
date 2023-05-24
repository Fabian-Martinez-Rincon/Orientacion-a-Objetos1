package ar.edu.unlp.info.oo1.Ejercicio_11_El_Inversor;

public class InversionEnAcciones implements Inversion{
	private String nombre;
	private Integer cantidad;
	private double valorUnitario;
	public InversionEnAcciones(String nombre, Integer cantidad, double valorUnitario) {
		this.nombre=nombre;
		this.cantidad=cantidad;
		this.valorUnitario=valorUnitario;
	}
	@Override
	public double valorActual() {
		// TODO Auto-generated method stub
		return this.cantidad*this.valorUnitario;
	}
}
