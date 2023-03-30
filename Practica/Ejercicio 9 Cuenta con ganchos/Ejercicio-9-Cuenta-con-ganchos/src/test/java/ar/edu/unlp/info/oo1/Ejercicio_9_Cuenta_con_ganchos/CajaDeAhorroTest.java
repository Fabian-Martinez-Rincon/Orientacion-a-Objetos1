package ar.edu.unlp.info.oo1.Ejercicio_9_Cuenta_con_ganchos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CajaDeAhorroTest {
	CajaDeAhorro ca;
	
	@BeforeEach
	void setUp() throws Exception {
		ca = new CajaDeAhorro();
		ca.depositar(10);
	}
	/*
	@Test
	public void testDepositar() {
		assertEquals(9.8 ,ca.getSaldo());
	}
	
	@Test
	public void testPuedeExtraer() {
		assertEquals(true ,ca.puedeExtraer(15));
		assertEquals(false ,ca.puedeExtraer(16));
	}
	@Test
	public void testTransferirCuenta() {
		CuentaCorriente ccTransferir = new CuentaCorriente(0, 0);
		
		
		assertEquals(true ,ca.transferirACuenta(10, ccTransferir));
		assertEquals(true ,ccTransferir.puedeExtraer(10));
		assertEquals(false ,ccTransferir.puedeExtraer(11));
		
		
	}*/
}