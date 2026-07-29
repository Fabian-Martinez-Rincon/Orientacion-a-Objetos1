package ar.edu.unlp.info.oo1.Ejercicio_11_El_Inversor;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversion{
	private LocalDate fechaDeConstitucion;
	private double montoDepositado;
	private double porcentajeDeInteresDiario;
	
	public PlazoFijo(LocalDate fechaDeConstitucion, double montoDepositado, double porcentajeDeInteresDiario) {
		this.fechaDeConstitucion=fechaDeConstitucion;
		this.montoDepositado=montoDepositado;
		this.porcentajeDeInteresDiario=porcentajeDeInteresDiario;
	}
	public double porcentaje() {
		return (this.montoDepositado*this.porcentajeDeInteresDiario)/100;
	}
	@Override
	public double valorActual(){
		double dias = ChronoUnit.DAYS.between(this.fechaDeConstitucion,LocalDate.now());
		return (this.montoDepositado + this.porcentaje()) * dias;
	}
	
}
