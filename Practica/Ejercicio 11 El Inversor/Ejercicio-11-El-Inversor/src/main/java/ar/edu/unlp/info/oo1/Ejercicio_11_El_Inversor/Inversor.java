package ar.edu.unlp.info.oo1.Ejercicio_11_El_Inversor;
import java.util.*;

public class Inversor {
	private String nombre;
	private List<Inversion> inversiones;
	
	public Inversor(String nombre) {
		this.nombre=nombre;
		this.inversiones = new ArrayList<>();
	}
	
	public double valorActual() {
		return this.inversiones.stream()
				.mapToDouble(inversion->inversion.valorActual())
				.sum();
	}
	
	public void agregarInversion(Inversion inversion) {
		inversiones.add(inversion);
	}
}
