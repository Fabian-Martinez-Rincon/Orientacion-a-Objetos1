public class Mamifero {
	private String identificador;
	private String especie;
	private LocalDate fechaNacimiento;
	private Mamifero padre;
	private Mamifero madre;
	
	public Mamifero(String nombre){
		this.identificador=nombre;
	}
	public Mamifero(){
	}
	
	public String getIdentificador(){
		return this.identificador;
	}
	public void setIdentificador(String id){
		this.identificador=id;
	}
	
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie=especie;
	}
	
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fecha) {
		this.fechaNacimiento=fecha;
	}
	
	public Mamifero getPadre() {
		return padre;
	}
	public void setPadre(Mamifero padre) {
		this.padre=padre;
	}
	
	public Mamifero getMadre() {
		return madre;
	}
	public void setMadre(Mamifero madre) {
		this.madre=madre;
	}
	
	public Mamifero getAbueloMaterno(){
		return (this.madre != null) ? this.madre.getPadre() : null;
	}
	public Mamifero getAbuelaMaterna() {
		return (this.madre != null) ? this.madre.getMadre() : null;
	}
	
	public Mamifero getAbueloPaterno(){
		return (this.padre != null) ? this.padre.getPadre() : null;
	}
	public Mamifero getAbuelaPaterna(){
		return (this.padre != null) ? this.padre.getMadre() : null;
	}
	
	public boolean tieneComoAncestroA(Mamifero unMamifero){
		boolean encontro=false;
		if ((this.getPadre() == unMamifero)||(this.getMadre() == unMamifero)){
			encontro=true;
		}else{
			if(this.padre != null){
				encontro=this.getPadre().tieneComoAncestroA(unMamifero);
			}
			if((this.madre != null)&(!encontro)){
				encontro=this.getMadre().tieneComoAncestroA(unMamifero);
			}
		}
		return encontro;
	}
	
}