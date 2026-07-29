package ar.edu.unlp.info.oo1.Ejercicio_9_Cuenta_con_ganchos;

public class CuentaCorriente extends Cuenta {
	private double descubierto;
	
	public CuentaCorriente() {
		this.descubierto = 0;
	}
	
	public CuentaCorriente(double saldo, double descubierto) {
		super(saldo);
		this.descubierto = descubierto * -1;
	}
	
	public double getDescubierto() {
		return this.descubierto;
	}

	public void setDescubierto(double descubierto) {
		this.descubierto = descubierto * -1;
	}
	@Override
	public boolean puedeExtraer(double monto) {
		double permitirDescubierto = this.masImpuestos(this.getSaldo()) + this.descubierto;
		if ( permitirDescubierto >= this.masImpuestos(monto)) {
			return true;
		}
		return false;
	}
	
	public double masImpuestos(double monto) {
		return monto + ( this.getSaldo() * 0.02 );
	}

	public void depositar(double monto) {
		double descontado = monto - ( monto * 0.02 );
		super.depositar(descontado);
	}
	public void extraerSinControlar(double monto) {
		double descontado = monto + ( monto * 0.02 );
		super.extraerSinControlar(descontado);
	}
	public boolean transferirACuenta(double monto, Cuenta cuentaDestino) {
		double descontado = monto - ( monto * 0.02 );
		return super.transferirACuenta(descontado,cuentaDestino);
	}
	
	
}
