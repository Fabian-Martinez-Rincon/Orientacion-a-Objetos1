package ar.edu.info.oo1.ej3_presupuestos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ItemTest {

	private Item item;

	@BeforeEach
	public void setUp() {
		item = new Item().detalle("azucar").costoUnitario(60).cantidad(2);
	}

	@Test
	public void testCosto() {
		assertEquals(120, item.costo());
	}

	@Test
	public void testCostoUnitario() {
		assertEquals(60, item.getCostoUnitario());
	}
}
