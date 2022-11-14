import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversion{
	private LocalDate fechaDeConstitucion;
	private double montoDepositado;
	private double porcentajeDelInteresDiario;

	public PlazoFijo(LocalDate fecha, double monto, double porcentaje){
		this.fechaDeConstitucion=fecha;
		this.montoDepositado=monto;
		this.porcentajeDelInteresDiario=porcentaje;
	}
	
	public double valorActual(){
		double dias = ChronoUnit.DAYS.between(this.fechaDeConstitucion,LocalDate.now());
		double interes = ((this.montoDepositado*this.porcentajeDelInteresDiario)/100);
		return interes*dias;
	}
}