package ar.edu.unlp.info.oo1.ejemploTeoriaTesting; 

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RobotTest {

	private Robot robotEnCero, robotEnMenosUnoConPocaEnergia, 
				robotEnMenosUnoConSuficienteEnergia, robotSinEnergia;

	@BeforeEach
	public void setUp() {
		robotSinEnergia = new Robot(0,0);		
		robotEnCero = new Robot(0, 1);
		robotEnMenosUnoConPocaEnergia = new Robot(-1, 1);
		robotEnMenosUnoConSuficienteEnergia = new Robot(-1, 2);

	}
	
	@Test
	public void testAvanzarSinEnergia() {
		robotSinEnergia.avanzar();
		assertEquals(0, robotSinEnergia.getPosicion());
	}
	
	@Test
	public void testAvanzarEnElCero() {
		robotEnCero.avanzar();
		assertEquals(0, robotEnCero.getEnergia());
		assertEquals(1, robotEnCero.getPosicion());
	}

	@Test
	public void testAvanzarEnMenosUno() {
		robotEnMenosUnoConSuficienteEnergia.avanzar();
		assertEquals(0, robotEnMenosUnoConSuficienteEnergia.getEnergia());
		assertEquals(0, robotEnMenosUnoConSuficienteEnergia.getPosicion());
	}

	@Test
	public void testAvanzarEnMenosUnoConPocaEnergia() {
		robotEnMenosUnoConPocaEnergia.avanzar();
		assertEquals(1, robotEnMenosUnoConPocaEnergia.getEnergia());
		assertEquals(-1, robotEnMenosUnoConPocaEnergia.getPosicion());
	}

	@Test
	public void testRetrocederSinEnergia() {
		robotSinEnergia.retroceder();
		assertEquals(0, robotSinEnergia.getPosicion());
	}	
	
	@Test
	public void testRetrocederEnElCero() {
		robotEnCero.retroceder();
		assertEquals(0, robotEnCero.getEnergia());
		assertEquals(-1, robotEnCero.getPosicion());
	}

	@Test
	public void testRetrocederEnMenosUno() {
		robotEnMenosUnoConSuficienteEnergia.retroceder();
		assertEquals(0, robotEnMenosUnoConSuficienteEnergia.getEnergia());
		assertEquals(-2, robotEnMenosUnoConSuficienteEnergia.getPosicion());
	}

	@Test
	public void testRetrocederEnMenosUnoConPocaEnergia() {
		robotEnMenosUnoConPocaEnergia.retroceder();
		assertEquals(1, robotEnMenosUnoConPocaEnergia.getEnergia());
		assertEquals(-1, robotEnMenosUnoConPocaEnergia.getPosicion());
	}	
}
