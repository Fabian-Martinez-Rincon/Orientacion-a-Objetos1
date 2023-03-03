public class CajaDeAhorro extends Cuenta{
	
	public CajaDeAhorro() {
		super();
	}
	
	public CajaDeAhorro(int saldo) {
		this.setSaldo(saldo);
	}
	
	private double montoTotal(double monto) {
		return monto * 1.02;
	}
	
	protected boolean puedeExtraer(double monto) {
		return (this.getSaldo() - montoTotal(monto)) >= 0;
	}

	public boolean extraer(double monto) {
		return super.extraer(montoTotal(monto));
	}
	
	public void depositar(double monto) {
		super.depositar(monto * 0.98);
	}
	
	public boolean transferirACuenta(double monto, Cuenta cuentaDestino) {
		return super.transferirACuenta(monto * 0.98, cuentaDestino);
	}
}