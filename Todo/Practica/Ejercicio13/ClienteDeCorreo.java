import java.util.ArrayList;

public class ClienteDeCorreo {
	private ArrayList<Carpeta> carpetas = new ArrayList<Carpeta>();
	/*el inbox esta en la pos 0*/
	
	
	public ArrayList<Carpeta> getCarpetas() {
		return carpetas;
	}

	public Carpeta getInbox() {
		return carpetas.get(0);
	}

	public ClienteDeCorreo() {
		carpetas.add(new Carpeta("inbox"));
	}

	public void recibir(Email email) {
		carpetas.get(0).agregarMail(email);
		//carpetas.add(getInbox());
	}
	
	public void agregarCarpeta(Carpeta carpeta) {
		this.carpetas.add(carpeta);
	}
	
	public void mover(Email email, Carpeta origen, Carpeta destino) {
		origen.eliminarMail(email);
		destino.agregarMail(email);
	}
	
	public Email buscar(String texto) {
		Email em=null;
		for(Carpeta c : carpetas) {
			for(Email e : c.getEmails()) {
				if (e.getCuerpo().equals(texto) || e.getTitulo().equals(texto)) {
					return e;
				}
			}
		}
		return em;
	}
	
	public double espacioOcupado() {
		return carpetas.stream()
				.mapToDouble(c -> c.tamanio())
				.sum();	
		}
}