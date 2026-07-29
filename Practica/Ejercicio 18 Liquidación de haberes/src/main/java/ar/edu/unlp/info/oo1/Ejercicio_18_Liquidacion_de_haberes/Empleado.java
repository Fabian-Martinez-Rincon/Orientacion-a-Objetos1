package ar.edu.unlp.info.oo1.Ejercicio_18_Liquidacion_de_haberes;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Empleado {
	private String nombre;
	private String apellido;
	private String cuil;
	private LocalDate fechaN;
	private Boolean tieneConyuje;	
	private Boolean tieneHijos;
	private List<Contrato> contratos;
	
	public Empleado (String nombre, String apellido, String cuil, LocalDate fechaN, Boolean tieneConyuje, Boolean tieneHijos) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.cuil=cuil;
		this.fechaN=fechaN;
		this.tieneConyuje=tieneConyuje;
		this.tieneHijos=tieneHijos;
	}
	
	public String getCuil() {
		return this.cuil;
	}
	
	public void CargarContrato(Contrato contrato) {
		this.contratos.add(contrato);
	}
	
	public Contrato actual() {
		return null;
		//return this.contratos.stream().max((Contrato c1, Contrato c2)-> c1.getFechaInicio().compareTo(c2.getFechaInicio()));
	}
	
	public boolean estaVencido() {
		
		return true;
	}
}
