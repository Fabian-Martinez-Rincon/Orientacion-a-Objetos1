import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class PruebasFecha {
	
	//Crear fecha determinada (Ej: 15/09/1972)
	LocalDate fecha = LocalDate.of(1972,Month.SEPTEMBER,15);
	
	//determinar si la fecha de hoy se encuentra entre 15/12/1972 y 15/12/2018.
	public boolean entreFechas(){
		LocalDate fecha1 = LocalDate.of(1972,Month.DECEMBER,15);
		LocalDate fecha2 = LocalDate.of(2018,Month.DECEMBER,15);
		LocalDate today = LocalDate.now();
		if((today.isAfter(fecha1)) && (today.isBefore(fecha2))){
			return true;
		}else{
			return false;
		}
	}
	
	//Calcular dias entre dos fechas
	public long calcularDias(LocalDate fecha1, LocalDate fecha2){
		if(fecha1.isBefore(fecha2)){
			return fecha1.until(fecha2,ChronoUnit.DAYS);  
		}
		return fecha2.until(fecha1,ChronoUnit.DAYS);
	}
	

	

}