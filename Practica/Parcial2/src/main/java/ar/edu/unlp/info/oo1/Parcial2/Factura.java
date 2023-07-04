package ar.edu.unlp.info.oo1.Parcial2;

import java.time.LocalDate;

public class Factura {
	private LocalDate fecha;
	private String patente;
	private double montoTotal;
	private int descuento;
	
	public Factura(LocalDate fecha, String patente, double montoTotal, int descuento) {
		this.fecha=fecha;
		this.patente=patente;
		this.montoTotal=montoTotal;
		this.descuento=descuento;
	}
}
