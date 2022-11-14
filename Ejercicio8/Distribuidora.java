import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Distribuidora {
	private double precioKWh;
	private List<Usuario> usuarios = new ArrayList<Usuario>();
	
	public Distribuidora(double d) {
		this.precioKWh = d;
	}

	public void agregarUsuario(Usuario usuario) {
		usuarios.add(usuario);     
	}
	
	public List<Factura> facturar() {
		List<Factura> result = this.usuarios
			.stream()
			.map((Usuario u) -> u.facturarEnBaseA(this.getPrecioKW()))
			.collect(Collectors.toList());
		return result;
	}
	
	public double consumoTotalActiva() {
		return this.usuarios
				.stream()
				.mapToDouble((Usuario u) -> u.ultimoConsumoActiva())
				.sum();
	}
	
	public void precioKWh(double precio) {
		this.precioKWh = precio;
	}
	
	public double getPrecioKW() {
		return this.precioKWh;
	}
	
	public List<Usuario> getUsuarios(){
		return usuarios;
	}
}