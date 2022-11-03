package ar.edu.unlp.info.oo1.Ejercicio6;
import java.util.List;
import java.util.ArrayList;

public class Farola {
	private List<Farola> farolas;
	private boolean estado;
	
	public Farola(){
		farolas = new ArrayList<>();
		this.estado = false;
	}
	
	public void pairWithNeighbor(Farola otraFarola) {
		this.farolas.add(otraFarola);
	}
	
	public List<Farola> getNeighbors(){
		return List.copyOf(this.farolas);
	}
	
	public void turnOn() {
		if (!this.estado) {
			this.estado = true;
			farolas.forEach(cosa -> cosa.turnOn());
		}
	}
	
	public void turnOff() {
		if (this.estado) {
			this.estado = false;
			farolas.forEach(cosa -> cosa.turnOff());
		}
	}
	public boolean isOn() {
		return this.estado;
	}
	
}
