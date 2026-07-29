package ar.edu.unlp.info.oo1.Ejercicio_13_Cliente_con_correo_con_adjuntos;

import java.util.*;
public class Email {
	private String titulo;
	private String cuerpo;
	private List<Archivo> archivos;
	
	public Email(String titulo, String cuerpo) {
		this.titulo=titulo;
		this.cuerpo=cuerpo;
		this.archivos = new ArrayList<>();
	}
	public Email(String titulo, String cuerpo, ArrayList<Archivo> adjuntos) {
		this.titulo=titulo;
		this.cuerpo=cuerpo;
		this.archivos = adjuntos;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	public String getCuerpo() {
		return this.cuerpo;
	}
	public List<Archivo> adjuntos(){
		return this.archivos;
	}
	public double tamanioArchivos() {
		return this.archivos.stream()
				.mapToDouble(archivo -> archivo.tamanio())
				.sum();
	}
	public double tamanio() {
		return this.titulo.length() + this.cuerpo.length() + this.tamanioArchivos();
	}
	
}
