package ar.edu.unlp.info.oo1.Ejercicio_17_Facturas_de_llamadas;

import java.time.LocalDate;
import java.time.LocalTime;

public class Internacional extends Llamada{
	private String origen;
	private String destino;
	
	public Internacional(LocalDate fecha, LocalTime hora, double duracion, String llama, String recibe, String origen, String destino) {
		super(fecha, hora, duracion, llama, recibe);
		this.origen=origen;
		this.destino=destino;
	}

	@Override
	public double calcularCosto() {
		LocalTime ocho = LocalTime.of(8, 0);
		LocalTime veinte = LocalTime.of(20, 0);
		
		if (super.getHora().isAfter(ocho) && super.getHora().isBefore(veinte)) {
			return super.getDuracion() * 4;
		}
		return super.getDuracion() * 3;
	}

}
