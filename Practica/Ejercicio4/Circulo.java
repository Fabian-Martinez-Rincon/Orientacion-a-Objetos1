public class Circulo implements Figura{
	private double diametro;
	
	public void setRadio(double valor){
		this.diametro=valor*2;
	}
	public double getRadio(){
		return (this.diametro/2);
	}
	
	public void setDiametro(double valor){
		this.diametro=valor;
	}
	
	public double getDiametro(){
		return this.diametro;
	}
	
	public double getPerimetro(){
		return Math.PI*this.diametro;
	}
	
	public double getArea(){
		return Math.PI*(Math.pow(this.getRadio(),2));
	}
	
}