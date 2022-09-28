package ar.edu.unlp.info.oo1.Ejercicion5;
import java.time.LocalDate;

public class Mamifero {
	private String identificador;
	private String especie;
	private LocalDate fecha;
	private Mamifero padre;
	private Mamifero madre;
	
	public Mamifero(String nombre){
		this.identificador = nombre;
	}
	public Mamifero() {
	}
	
	public String getIdentificador() {
		return this.identificador;
	}
	
	public void setIdentificador(String id) {
		this.identificador = id;
	}
	
	public String getEspecie() {
		return this.especie;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public LocalDate getFechaNacimiento() {
		return fecha;
	}
	public void setFechaNacimiento(LocalDate fecha) {
		this.fecha=fecha;
	} 
	
	public Mamifero getPadre() {
		return this.padre;
	}
	
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	
	public Mamifero getMadre() {
		return this.madre;
	}
	
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	

	public Mamifero getAbueloMaterno() {
		return (this.madre != null)?this.madre.getPadre():null;
	} 
	public Mamifero getAbuelaMaterna() {
		return (this.madre != null)?this.madre.getMadre():null;
	}
	
	public Mamifero getAbueloPaterno() {
		return (this.padre != null)?this.padre.getPadre():null;
	}
	
	public Mamifero getAbuelaPaterna() {
		return (this.padre != null)?this.padre.getMadre():null;
	}
	
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		  boolean ok = false;
		  if((this.getMadre() == unMamifero) || (this.getPadre() == unMamifero)) {
		      ok = true;
		  }else {
			  if(this.madre != null) {
				  ok = this.getMadre().tieneComoAncestroA(unMamifero);
			  }
			  if((this.padre !=null) && (!ok)){
				  ok = this.getPadre().tieneComoAncestroA(unMamifero); 
			  }	  
		  }
		  return ok;
	 }
	
}
