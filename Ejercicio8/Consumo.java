public class Consumo {
	private LocalDate fecha;
	private double consumoEnergiaActiva;
	private double consumoEnergiaReactiva;
	
	public Consumo(LocalDate localDate, double consumoEnergiaActiva, double consumoEnergiaReactiva){
		this.setFecha(localDate);
		this.consumoEnergiaActiva = consumoEnergiaActiva;
		this.consumoEnergiaReactiva = consumoEnergiaReactiva;
	}
	
	public double costoEnBaseA(double precioKWh) {
		return this.consumoEnergiaActiva * precioKWh;
	}
	
	public double factorDePotencia() {
		return consumoEnergiaActiva / (Math.sqrt(Math.pow(consumoEnergiaReactiva,2) + Math.pow(consumoEnergiaActiva, 2)));
	}

	public LocalDate getFecha() {
		return fecha;
	}
	

	public double getConsumoDeEnergiaActiva() {
		return consumoEnergiaActiva;
	}

	public double getConsumoDeEnergiaReactiva() {
		return consumoEnergiaReactiva;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
}