package ar.edu.unlp.info.oo1.Ejercicio_17_Facturas_de_llamadas;

import java.time.LocalDate;
import java.util.*;

public abstract class Cliente {
	private String nombre;
	private String direccion;
	private String numero;
	private List<Llamada> llamadas;
	
	public Cliente(String nombre, String direccion) {
		this.nombre=nombre;
		this.direccion=direccion;
		this.numero = "";
		this.llamadas = new ArrayList<Llamada>();
	}
	
	public void registrarNumero(String numero) {
		this.numero = numero;
	}
	
	public void registrarLlamada(Llamada llamada) {
		this.llamadas.add(llamada);
	}
	
	
	public double montoTotal(LocalDate fecha1, LocalDate fecha2) {
		double total = this.llamadas.stream()
				.filter(llamada -> llamada.cumple(fecha1, fecha2))
				.mapToDouble(llamada -> llamada.calcularCosto())
				.sum();
		
		return total - (total * getDescuento());
	}
	
	public Factura facturarLlamadas(LocalDate fecha1, LocalDate fecha2) {
		double total = this.montoTotal(fecha1, fecha2);
		return new Factura(this, LocalDate.now(), fecha1,fecha2,total);
	}
	
	abstract public double getDescuento();
	
	public List<Llamada> getLlamadas(){
		return this.llamadas;
	}
}
