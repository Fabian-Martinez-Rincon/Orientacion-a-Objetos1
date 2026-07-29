package ar.edu.unlp.info.oo1.Ejercicio_9_Cuenta_con_ganchos;

public class CajaDeAhorro extends Cuenta{
	@Override
	public boolean puedeExtraer(double monto) {
		if ((this.getSaldo() + monto * 0.02) >= monto) {
			return true;
		}
		return false;
	}
}
