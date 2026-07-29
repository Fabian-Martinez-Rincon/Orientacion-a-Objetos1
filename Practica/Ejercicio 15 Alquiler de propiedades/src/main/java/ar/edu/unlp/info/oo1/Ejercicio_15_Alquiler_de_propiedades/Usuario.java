package ar.edu.unlp.info.oo1.Ejercicio_15_Alquiler_de_propiedades;
import java.util.*;
import java.util.stream.Collectors;

public class Usuario {
	private String nombre;
	private String direccion;
	private String dni;
	private List<Propiedad> propiedades;
	private List<Reserva> reservas;
	
	public Usuario (String nombre, String direccion, String dni) {
		this.nombre=nombre;
		this.direccion=direccion;
		this.dni=dni;
	}
	
	public void agregarPropiedad(Propiedad propiedad) {
		this.propiedades.add(propiedad);
	}
	
	public void agregarReserva(Reserva reserva) {
		this.reservas.add(reserva);
	}
	
	public List<Propiedad> propiedadesDisponibles(DateLapse Periodo){
		return this.propiedades.stream()
				.filter(propiedad -> propiedad.estaDisponible(Periodo))
				.collect(Collectors.toList());
	}
	
	public List<Reserva> obtenerReservas(){
		return this.reservas;
	}
	
	public void eliminarReserva(Reserva reserva) {
		this.reservas.remove(reserva);
	}
	
	
	
}
