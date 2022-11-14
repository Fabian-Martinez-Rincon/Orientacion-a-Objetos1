import java.time.LocalDate;

public class Factura {
	private double montoEnergiaActiva;
	private double descuento;
	private LocalDate fecha;
	private Usuario usuario;
	
	
	public Factura(double d, double descuento2, Usuario usuario2) {
		this.montoEnergiaActiva = d;
		this.descuento = descuento2;
		this.fecha = LocalDate.now();
		this.usuario = usuario2;
	}

	public double montoTotal() {
		return this.montoEnergiaActiva - (this.montoEnergiaActiva * (this.descuento/100));
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	
	public double getDescuento() {
		return descuento;
	}

	public double getMontoEnergiaActiva() {
		return montoEnergiaActiva;
	}

}