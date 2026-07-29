package ar.edu.unlp.info.oo1.Ejercicio_9_Cuenta_con_ganchos;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CuentaCorrienteTest {
	CuentaCorriente cc;
	
	@BeforeEach
	void setUp() throws Exception {
		cc = new CuentaCorriente(10,2);
	
	}
	
	@Test
	public void testDepositar() {
		cc.depositar(10);
		assertEquals(19.8 ,cc.getSaldo());
	}
	
	@Test
	public void testExtraerSinControl() {
		cc.extraerSinControlar(1);
		assertEquals(8.98 ,cc.getSaldo());
	}
	
	@Test
	public void testPuedeExtraer() {
		assertEquals(true ,cc.puedeExtraer(9));
		assertEquals(false ,cc.puedeExtraer(10));
	}
	
	/*
	@Test
	public void testTransferirCuenta() {
		CuentaCorriente ccTransferir = new CuentaCorriente(0, 0);
		
		
		assertEquals(true ,cc.transferirACuenta(10, ccTransferir));
		assertEquals(true ,ccTransferir.puedeExtraer(10));
		assertEquals(false ,ccTransferir.puedeExtraer(11));
		
		
	}*/
}
