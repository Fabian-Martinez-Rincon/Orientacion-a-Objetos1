package ar.edu.unlp.info.oo1.Parcial1;

import java.time.LocalDate;

public class Automotor extends Vehiculo{
	public Automotor(String patente, LocalDate fechaFabricacion, double valor, Contribuyente c) {
		super(patente, fechaFabricacion, valor, c);
		this.marca=marca;
		this.modelo=modelo;
	}



	private String marca;
	private String modelo;
	


	@Override
	public int porcentaje() {
		return 15;
	}

	
	
}
