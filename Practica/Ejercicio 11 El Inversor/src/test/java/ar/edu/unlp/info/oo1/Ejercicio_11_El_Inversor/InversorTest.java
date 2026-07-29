package ar.edu.unlp.info.oo1.Ejercicio_11_El_Inversor;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class InversorTest {
	Inversor inversor;
	InversionEnAcciones acciones;
	PlazoFijo fijo;
	
	@BeforeEach
	void setUp() throws Exception {
		 inversor = new Inversor("Fabo");
		 acciones = new InversionEnAcciones("Accion", 10, 2);
		 fijo = new PlazoFijo(LocalDate.of(2023, 5, 23), 10.0, 20.0);	 
	}
	
	@Test
	public void testAcciones() {
		assertEquals(20,acciones.valorActual());
	}
	//Este valor puede variar dependiendo de que dia tengamos como
	//Diferencia de la fecha ingresada, el valor es con un dia 
	//de diferencia
	@Test
	public void testPlazoFijo() {
		assertEquals(12,fijo.valorActual());
	}
	@Test
	public void testInversor() {
		assertEquals(0,inversor.valorActual());
		inversor.agregarInversion(acciones);
		assertEquals(20,inversor.valorActual());
		inversor.agregarInversion(fijo);
		assertEquals(32,inversor.valorActual());
	}
	
	
}
