public class Cilindro extends Pieza{
	private int radio;
	private int altura;
	
	public Cilindro(int r, int a, String m, String c) {
		super(m,c);
		this.radio = r;
		this.altura = a;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public double getVolumen() {
		return Math.PI * Math.pow(this.getRadio(), 2) * this.getAltura();
	}
	
	public double getSuperficie() {
		return 2 * Math.PI * this.getRadio() * this.getAltura() + 2 * Math.PI * Math.pow(this.getRadio(), 2);
	}
}