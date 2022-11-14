import java.util.ArrayList;

public class Email {
	private String titulo;
	private String cuerpo;
	private ArrayList<Archivo> adjuntos = new ArrayList<Archivo>();;
	
	
	public Email(String titulo, String cuerpo) {
		this.titulo = titulo;
		this.cuerpo = cuerpo;
	}
	
	public Email(String titulo, String cuerpo, ArrayList<Archivo> adjuntos) {
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.adjuntos = adjuntos;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public String getCuerpo() {
		return this.cuerpo;
	}
	
	public ArrayList<Archivo> adjuntos(){
		return this.adjuntos;
	}
	
	public void agregarAdjuntos(Archivo archivo) {
		this.adjuntos.add(archivo);
	}
	
	public double tamanio() {
		double suma = adjuntos.stream()
				.mapToDouble(a -> a.tamanio())
				.sum();
		return suma + this.getCuerpo().length() + this.getTitulo().length();
	}
}