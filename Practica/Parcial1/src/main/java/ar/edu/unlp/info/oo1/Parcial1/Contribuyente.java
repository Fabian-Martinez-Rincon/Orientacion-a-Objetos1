package ar.edu.unlp.info.oo1.Parcial1;

import java.util.*;

public class Contribuyente {
	private String nombre;
	private String apellido;
	private String email;
	private String localidad;
	private List<Bien> bienes = new ArrayList<>();
	
	public Contribuyente(String nombre, String apellido, String email, String localidad) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.email=email;
		this.localidad=localidad;
	}
	
	public void altaBien(Bien b){
		this.bienes.add(b);
	}
	public double impuestosAPagar() {
		return this.bienes.stream()
				.mapToDouble(bien -> bien.calcularImpuesto())
				.sum();
	}
}
