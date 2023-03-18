package ar.edu.unlp.info.oo1.Ejercicio_6_Red_de_alumbrado;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class FarolaTest {
	 private Farola farolaUno;
	  private Farola farolaDos;
	  
	  

	  @BeforeEach
	  void setUp() throws Exception {
	    this.farolaUno = new Farola();
	    this.farolaDos = new Farola();

	  }

	  @Test
	  void testConstructor() {
	    assertFalse(farolaUno.isOn(), "La farolaUno no está apagada");
	    assertFalse(farolaUno.isOn(), "La farolaUno no está apagada");
	    assertTrue(farolaUno.getNeighbors().isEmpty(), "La farolaUno no debería tener vecinos");
	  }
	 
	  @Test
	  void testPairWithNeighbor() {
	    farolaUno.pairWithNeighbor(farolaDos);
	    assertTrue(farolaUno.getNeighbors().contains(farolaDos));
	    assertTrue(farolaDos.getNeighbors().contains(farolaUno));
	  }
	  
	  @Test
	  void testTurnOnAndOff() {
	    farolaUno.pairWithNeighbor(farolaDos);// Agrego la farola
	    farolaUno.turnOn();//Enciendo las farolas
	    assertTrue(farolaUno.isOn());//compruebo true
	    assertTrue(farolaDos.isOn());//compruebo true
	    farolaUno.turnOff(); //Apago las farolas
	    assertFalse(farolaUno.isOn()); //compruebo false
	    assertFalse(farolaDos.isOn()); //compruebo false

	    farolaDos.turnOn(); //Enciendo la farola
	    assertTrue(farolaUno.isOn());
	    assertTrue(farolaDos.isOn());
	    farolaDos.turnOff();
	    assertFalse(farolaUno.isOn());
	    assertFalse(farolaDos.isOn());
	    
	  }
	}	