package ar.edu.unlp.info.oo1.ejemploTeoriaTesting;

/***
 * Un Robot muy aburrido y raro. Cuando se mueve en los positivos (posicion >= 0)
 * consume solo un punto de energía por movimiento, pero cuando se mueve en los negativos
 *  (posicion < 0) consume 2 puntos de energía por movimiento
 */
public class Robot {

	private int posicion;
	private int energia;

	public Robot(int posicion, int energia) {
		this.posicion = posicion;
		this.energia = energia;
	}

	public int getPosicion() {
		return posicion;
	}

	public int getEnergia() {
		return energia;
	}

	public void avanzar() {
		if (this.energia < this.energiaRequeridaParaMover()) {
			return;
		}
		consumirEnergia();
		this.posicion += 1;
	}

	public void retroceder() {
		if (this.energia < this.energiaRequeridaParaMover()) {
			return;
		}
		consumirEnergia();
		this.posicion -= 1;
	}
	
	private int energiaRequeridaParaMover() {
		if (this.posicion < 0) {
			return 2;
		} else {
			return 1;
		}
	}

	private void consumirEnergia() {
		this.energia -= this.energiaRequeridaParaMover();
	}

}
