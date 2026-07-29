package ar.edu.unlp.info.oo1.Ejercicio_17_Facturas_de_llamadas;

import java.time.LocalDate;

public class Factura {
	private Cliente cliente;
	private LocalDate fechaFacturacion;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private double montoTotal;
	
	public Factura(Cliente cliente, LocalDate fechaFacturacion, LocalDate fechaInicio, LocalDate fechaFin, double montoTotal) {
		this.cliente=cliente;
		this.fechaFacturacion=fechaFacturacion;
		this.fechaFacturacion=fechaInicio;
		this.fechaFin=fechaFin;
		this.montoTotal=montoTotal;
	}
}
