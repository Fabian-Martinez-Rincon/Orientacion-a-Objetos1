package ar.edu.unlp.info.oo1.Ejercicio_17_Facturas_de_llamadas;

import java.time.LocalDate;
import java.time.LocalTime;

public class Local extends Llamada{

	public Local(LocalDate fecha, LocalTime hora, double duracion, String llama, String recibe) {
		super(fecha, hora, duracion, llama, recibe);
	}

	@Override
	public double calcularCosto() {
		return super.getDuracion();
	}

}
