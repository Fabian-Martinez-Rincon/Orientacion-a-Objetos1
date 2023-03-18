package ar.edu.unlp.info.oo1.Ejercicio_6_Red_de_alumbrado;
import java.util.*;

public class Farola {
	private boolean estado;
	private List<Farola> vecinas;

	public Farola () {
		this.estado = false;
		this.vecinas = new ArrayList<>();
		
	}
	/*
	* Crea la relación de vecinos entre las farolas. La relación de vecinos entre las farolas es recíproca, es decir el receptor del mensaje será vecino de otraFarola, al igual que otraFarola también se convertirá en vecina del receptor del mensaje
	*/
	public void pairWithNeighbor( Farola otraFarola ) {
		this.vecinas.add(otraFarola);
		otraFarola.getNeighbors().add(this); 
		// Simplemente, le agrego mi farola a la vecina
		// Para que ambas se tengan como vecinas y no solo
		// la mia
	}
	/*
	* Retorna sus farolas vecinas
	*/
	public List<Farola> getNeighbors (){
		return this.vecinas;
	}


	/*
	* Si la farola no está encendida, la enciende y propaga la acción.
	*/
	public void turnOn() {
		if (this.estado==false) {
			this.estado = true;
			for (Farola vecina : this.vecinas) {
                vecina.turnOn();
            }
		}
	}

	/*
	* Si la farola no está apagada, la apaga y propaga la acción.
	*/
	public void turnOff() {
		if (this.estado == true) {
			this.estado = false;
			for (Farola vecina : this.vecinas) {
                vecina.turnOff();
            }
		}
	}

	/*
	* Retorna true si la farola está encendida.
	*/
	public boolean isOn() {
		if (this.estado) {
			return true;
		}
		return false;
	}
}
