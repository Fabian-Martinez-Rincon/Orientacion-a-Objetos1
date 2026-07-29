package ar.edu.unlp.info.oo1.Ejercicio_17_Facturas_de_llamadas;

import java.time.LocalDate;
import java.time.LocalTime;

public class Interurbana extends Llamada{
	private Integer distancia;
	
	public Interurbana(LocalDate fecha, LocalTime hora, double duracion, String llama, String recibe, Integer distancia) {
		super(fecha, hora, duracion, llama, recibe);
		this.distancia=distancia;
	}

	@Override
	public double calcularCosto() {
		
		if (this.distancia<100) {
			return 5 * 2;
		}
		if (this.distancia>100 && this.distancia<500) {
			return 5 * 2.5;
		}
		return 5 * 3;
	}

}
