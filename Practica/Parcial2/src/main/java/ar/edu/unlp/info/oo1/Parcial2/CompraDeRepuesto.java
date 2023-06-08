package ar.edu.unlp.info.oo1.Parcial2;

public class CompraDeRepuesto extends Orden {

	public CompraDeRepuesto(String patente) {
		super(patente);
		// TODO Auto-generated constructor stub
	}

	public Boolean aplicarDescuento() {
		return super.repuestos.stream()
				.anyMatch(repuesto -> repuesto.antiguedad()>5);
	}

	public double incremento() {
		if (this.aplicarDescuento()) {
			return 1.08;
		}
		return 1.15;
	}

	@Override
	public double costoOrden() {
		return super.totalRepuesto()*this.incremento();
		
	}

}
