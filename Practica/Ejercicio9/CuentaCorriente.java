public class CuentaCorriente extends Cuenta{
	private double descubierto;
	
	public CuentaCorriente() {
		super();
		this.descubierto = 0;
	}
	
	public CuentaCorriente(double saldo, double descubierto) {
		this.descubierto = -descubierto;
		this.setSaldo(saldo);
	}
	
	public double getDescubierto() {
		return descubierto;
	}

	public void setDescubierto(double descubierto) {
		this.descubierto = descubierto;
	}
	
	protected boolean puedeExtraer(double monto) {
		return this.getSaldo() - monto >= descubierto;
	}
	
}