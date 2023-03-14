import java.util.ArrayList;

public class Carpeta {
	private String nombre;
	private ArrayList<Email> emails;
	
	public Carpeta(String nombre) {
		this.nombre = nombre;
		this.emails = new ArrayList<Email>();
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public ArrayList<Email> getEmails() {
		return this.emails;
	}
	
	public double tamanio() {
		return emails.stream()
				.mapToDouble(e -> e.tamanio())
				.sum();
	}
	
	public void agregarMail(Email email) {
		emails.add(email);
	}
	
	public void eliminarMail(Email email) {
		emails.remove(email);
	}
}