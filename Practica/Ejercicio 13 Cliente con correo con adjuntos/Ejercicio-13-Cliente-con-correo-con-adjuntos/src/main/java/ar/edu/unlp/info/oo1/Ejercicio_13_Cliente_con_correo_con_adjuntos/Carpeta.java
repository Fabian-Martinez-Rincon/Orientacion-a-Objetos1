package ar.edu.unlp.info.oo1.Ejercicio_13_Cliente_con_correo_con_adjuntos;

import java.util.*;

public class Carpeta {
	private String nombre;
	private List<Email> emails;
	
	public Carpeta(String nombre) {
		this.nombre = nombre;
		this.emails = new ArrayList<>();
	}
	
	public Carpeta() {
		// TODO Auto-generated constructor stub
	}

	public double tamanio() {
		return this.emails.stream()
				.mapToDouble(mail -> mail.tamanio())
				.sum();
	}
	public List<Email> getEmails(){
		return this.emails;
	}
	public void agregarEmail(Email email) {
		this.emails.add(email);
	}
	public void eliminarMail(Email mail){
		emails.remove(mail);
	}

	public String getNombre() {
		// TODO Auto-generated method stub
		return this.nombre;
	}
}
