public class Esfera extends Pieza{
	private int radio;

	public Esfera(int r, String m, String c) {
		super(m,c);
		this.radio = r;
	}
	
	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}
	
	public double getVolumen() {
		return 1.33333333333 * Math.PI * Math.pow(this.getRadio(), 3);
	}
	
	public double getSuperficie() {
		return 4 * Math.PI * Math.pow(radio, 2);
	}
	
}