package ar.edu.unlp.info.oo1.Ejercicio_17_Facturas_de_llamadas;

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
	
	public boolean cumpleIncio(LocalDate other) {
		if(other.isAfter(getFrom()) || other.equals(getFrom()))
			return true;
		else
			return false;
	}
	
	public boolean cumpleFin(LocalDate other) {
		if(other.isBefore(getTo()) || other.equals(getTo()))
			return true;
		else
			return false;
	}
	
	public boolean includesDate(LocalDate other) {
		if(this.cumpleIncio(other) && this.cumpleFin(other))
			return true;
		else
			return false;
	}
	
	public boolean overlaps (DateLapse periodo) {
		if ( this.cumpleIncio(periodo.getFrom()) && this.cumpleFin(periodo.getTo()) )
			return true;
		else
			return false;
	}
}
