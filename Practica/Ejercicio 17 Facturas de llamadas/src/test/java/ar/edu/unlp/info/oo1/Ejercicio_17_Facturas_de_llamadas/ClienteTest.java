package ar.edu.unlp.info.oo1.Ejercicio_17_Facturas_de_llamadas;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ClienteTest {
	
	Local llamadaLocal;
	Interurbana llamadaInterurbana;
	Internacional llamadaInternacional;
	
	Fisico fisico;
	Juridica juridica;
	
	LocalDate fecha;
	LocalTime hora;
	
	Sistema sistema;
	LocalDate fecha1;
	LocalDate fecha2;
	
	@BeforeEach
	void setUp() throws Exception{
		fisico = new Fisico("Juan", "Los Hornos", "4321032");		
		juridica = new Juridica("Fabian", "Los Hornos", "20312340", "Sociedad Anonima");
		
		fecha = LocalDate.of(2023, 1, 10);
		hora = LocalTime.of(10, 0);
		
		
		sistema=new Sistema();
		sistema.agregarNumero("1111");
		sistema.agregarNumero("2222");
		sistema.altaPersonaFisica(fisico);
		sistema.altaPersonaJurida(juridica);
		
		fecha1 = LocalDate.of(2023, 1, 1);
		fecha2 = LocalDate.of(2023, 1, 20);
		
	}
	@Test
	public void testSistema() {
		sistema.agregarNumero("3333");
		sistema.agregarNumero("4444");
		assertEquals("4444", sistema.getNumeros().get(1));
	}
	
	@Test
	public void testJuridica() {
		llamadaLocal = new Local(fecha, hora, 10, "123", "321");
		juridica.registrarLlamada(llamadaLocal);
	
		assertEquals(1 ,juridica.getLlamadas().size());	
		assertEquals(9, juridica.montoTotal(fecha1, fecha2));
	}
	
	@Test
	public void testLocal() {
		llamadaLocal = new Local(fecha, hora, 10, "123", "321");
		fisico.registrarLlamada(llamadaLocal);
	
		assertEquals(1 ,fisico.getLlamadas().size());	
		assertEquals(10, fisico.montoTotal(fecha1, fecha2));
	}
	
	@Test
	public void testInterurbana() {
		llamadaInterurbana = new Interurbana(fecha, hora, 10, "123", "321", 2000);
		fisico.registrarLlamada(llamadaInterurbana);
		
		assertEquals(1 ,fisico.getLlamadas().size());	
		assertEquals(15, fisico.montoTotal(fecha1, fecha2)); //5 * 3
		
	}
	@Test
	public void testInternacional() {
		llamadaInternacional = new Internacional(fecha, hora, 10, "123", "321", "Argentina", "Brazil");
		fisico.registrarLlamada(llamadaInternacional);
		
		assertEquals(1 ,fisico.getLlamadas().size());	
		assertEquals(40, fisico.montoTotal(fecha1, fecha2)); 

	}
}
