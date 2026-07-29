package ar.edu.unlp.info.oo1.Ejercicio_15_Alquiler_de_propiedades;

public class Reserva {
	private Propiedad propiedad;
	private DateLapse periodo;
	private Usuario inquilino;
	
	public Reserva(Propiedad propiedad, DateLapse periodo, Usuario inquilino) {
		this.propiedad=propiedad;
		this.periodo=periodo;
		this.inquilino=inquilino;
	}
	
	public DateLapse getPeriodo() {
		return this.periodo;
	}
	
	public boolean cumple(DateLapse periodo) {
		return this.periodo.overlaps(periodo);
	}
	
	public double calcularPrecio() {
		return this.propiedad.getPrecioNoche() * this.periodo.sizeInDays();
	}
	
	public void eliminarReserva() {
		
	}
}
