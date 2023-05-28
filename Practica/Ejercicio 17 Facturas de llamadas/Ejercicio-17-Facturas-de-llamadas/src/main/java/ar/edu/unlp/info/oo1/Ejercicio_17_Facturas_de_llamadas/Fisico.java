package ar.edu.unlp.info.oo1.Ejercicio_17_Facturas_de_llamadas;

import java.util.ArrayList;

public class Fisico extends Cliente{
	private String dni;
	
	public Fisico(String nombre, String direccion, String dni) {
		super(nombre, direccion);
		this.dni=dni;
		
	}

	@Override
	public double getDescuento() {
		return 0;
	}

	
}
