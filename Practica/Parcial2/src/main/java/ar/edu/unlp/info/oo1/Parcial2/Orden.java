package ar.edu.unlp.info.oo1.Parcial2;

import java.time.LocalDate;
import java.util.List;

public abstract class Orden {
	private String patente;
	protected List<Repuesto> repuestos;
	
	public Orden(String patente) {
		this.patente=patente;
	}
	public Factura generarFactura() {
		return new Factura(LocalDate.now(),this.patente, this.costoOrden(),getDescuento());
	}
	
	public double totalRepuesto() {
		return this.repuestos.stream()
		.mapToDouble(repuesto -> repuesto.getCosto())
		.sum();
	}
	
	public int getDescuento() {
		return 0;
	}
	
	abstract public double costoOrden();

}
