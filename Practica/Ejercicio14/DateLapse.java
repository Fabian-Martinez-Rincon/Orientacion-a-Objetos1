import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse {
	private LocalDate from;
	private LocalDate to;
	
	public DateLapse(LocalDate from, LocalDate to) {
		this.from=from;
		this.to=to;
	}

	public LocalDate getFrom(){
		return this.from;
	}
	
	public LocalDate getTo(){
		return this.to;
	}
	
	private void fromTo(LocalDate from, LocalDate to){
		this.from=from;
		this.to=to;
	}
	
	public int sizeInDays(){
		return (int) this.from.until(this.to,ChronoUnit.DAYS);  
	}
	
	public boolean includesDate(LocalDate other){
		if((other.isAfter(this.from)) &&
				(other.isBefore(this.from.plusDays(this.sizeInDays()))) ||
				(other.equals(this.from)) ||
				(other.equals(this.to))) return true;
		return false;
	}
	
	public boolean equals(DateLapse other){
		if(this.from.equals(other.getFrom())&&(this.to.equals(other.getTo()))) 
            return true;
		return false;			
	}
	
	public boolean overlaps(DateLapse other){
		//comparo si las dos fechas se superponen
		if ((this.from.isBefore(other.getTo()) && 
			(other.getFrom().isBefore(this.to)))) return true;
		//comparo que la fecha de salida no coincida con una de entrada
		if(this.from.equals(other.getTo()) ||
	            this.to.equals(other.getFrom())) return true;
		return false;
	}
}