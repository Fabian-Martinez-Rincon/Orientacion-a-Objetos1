package ar.edu.unlp.info.oo1.Ejercicio_8_Distribuidora_Electrica;

import java.util.*;

public class Usuario {
	private String domicilio;
	private String nombre;
	private List<Factura> facturas;
	private List<Consumo> consumos;
	
	public Usuario(String domicilio, String nombre) {
		this.domicilio = domicilio;
		this.nombre = nombre;
	}
	
	
}
