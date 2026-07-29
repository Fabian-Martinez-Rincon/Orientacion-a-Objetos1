package ar.edu.unlp.info.oo1.Ejercicio_15_Alquiler_de_propiedades;

import java.time.LocalDate;
import java.util.*;

public class Propiedad {
	private String nombre;
	private String descripcion;
	private double precioNoche;
	private String direccion;
	private Usuario propietario;
	private List<Reserva> reservas;
	
	public Propiedad(String nombre, String descripcion, double precioNoche, String direccion, Usuario propietario) {
		this.nombre=nombre;
		this.descripcion=descripcion;
		this.precioNoche=precioNoche;
		this.propietario=propietario;
		reservas = new ArrayList<>();
	}
	
	public boolean estaDisponible(DateLapse periodo) {
		return reservas.stream()
				.noneMatch(reserva->reserva.cumple(periodo));
	}
	public void agregarReserva(Reserva reserva) {
		reservas.add(reserva);
	}
	
	
	public void eliminarReserva(Reserva reserva) {
		this.reservas.remove(reserva);
	}
	
	
	public double getPrecioNoche() {
		return this.precioNoche;
	}
	
}
