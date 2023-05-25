package ar.edu.unlp.info.oo1.Ejercicio_14_Intervalo_de_tiempo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse {
	private LocalDate from;
	private LocalDate to;
	
	public DateLapse(LocalDate from, LocalDate to) {
		this.from=from;
		this.to=to;
	}
	
	public LocalDate getFrom() {
		return this.from;
	}
	
	public LocalDate getTo() {
		return this.to;
	}
	
	public int sizeInDays() {
		return (int) this.getFrom().until(getTo(),ChronoUnit.DAYS);
	}
	
	public boolean includesDate(LocalDate other) {
		if(other.isAfter(getFrom()) && other.isBefore(getTo()))
			return true;
		else
			return false;
	}
}
