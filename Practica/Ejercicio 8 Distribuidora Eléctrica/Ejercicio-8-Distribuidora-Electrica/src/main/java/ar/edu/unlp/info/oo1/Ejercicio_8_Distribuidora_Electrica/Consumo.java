package ar.edu.unlp.info.oo1.Ejercicio_8_Distribuidora_Electrica;
import  java.time.LocalDate;


public class Consumo {
	private LocalDate fecha;
	private double consumoEnergiaActiva;
	private double consumoEnergiaReactiva;
	
	public double costoEnBaseA(double precioKWh) {
		return this.consumoEnergiaActiva * precioKWh;
	}
	
	public double factorDePotencia() {
		double divisor = 
				Math.pow(this.consumoEnergiaActiva, 2)
				+
				Math.pow(this.consumoEnergiaActiva, 2);
		return this.consumoEnergiaActiva / Math.sqrt(divisor);
	}
}
