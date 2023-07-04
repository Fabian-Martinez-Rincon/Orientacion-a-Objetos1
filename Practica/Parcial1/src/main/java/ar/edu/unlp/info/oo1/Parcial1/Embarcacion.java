package ar.edu.unlp.info.oo1.Parcial1;

import java.time.LocalDate;

public class Embarcacion extends Vehiculo{
	private String nombre;
	public Embarcacion(String patente, LocalDate fechaFabricacion, double valor, Contribuyente c,String nombre) {
		super(patente, fechaFabricacion, valor, c);
		this.nombre=nombre;
	}
	@Override
	public int porcentaje() {
		if (super.getValor() < 1000000) {
			return 10;
		}
		return 15;
	}
}
