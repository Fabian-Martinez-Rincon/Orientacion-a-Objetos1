package ar.edu.unlp.info.oo1.Ejercicio_13_Cliente_con_correo_con_adjuntos;

import java.util.*;

public class ClienteDeCorreo {
	private Carpeta inbox;
	private List<Carpeta> carpetas;
	
	public ClienteDeCorreo() {
		this.inbox = new Carpeta("imbox");
		this.carpetas = new ArrayList<>();
		this.carpetas.add(inbox);
		
	}
	
	public void recibir(Email email) {
		this.inbox.agregarEmail(email);
	}
	
	public void mover(Email email, Carpeta origen, Carpeta destino) {
		origen.eliminarMail(email);
		destino.agregarEmail(email);
	}
	
	public Email buscar(String texto) {
		Email email=null;
		for(Carpeta c : carpetas) {
			for(Email e : c.getEmails()) {
				if (e.getCuerpo().equals(texto) || e.getTitulo().equals(texto)) {
					return e;
				}
			}
		}
		return email;
	}
	public Carpeta getCarpeta(String nombreCarpeta){
		for(Carpeta c:carpetas){
			if(c.getNombre() == nombreCarpeta){
				return c;
			}
		}
		return null;
	}
	
	public double espacioOcupado() {
		return this.carpetas.stream()
				.mapToDouble(carpeta -> carpeta.tamanio())
				.sum();
	}
	public void agregarCarpeta(Carpeta carpeta) {
		this.carpetas.add(carpeta);
	}
	
}
