package ar.edu.unlp.info.oo1.Parcial1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VehiculoTest {
	Embarcacion embarcacion;
	Embarcacion embarcacion2;
	Embarcacion embarcacion3;
	Automotor automotor;
	
	Contribuyente c;
	Sistema sistema;
	LocalDate fecha;
	LocalDate fecha2;
	
	@BeforeEach
	void setup() throws Exception{
		c = new Contribuyente("Fabian", "777", "fab@gmail.com", "Los Hornos");
		sistema = new Sistema();
		sistema.altaContribuyente(c);
		
		fecha = LocalDate.of(2000, 1, 1);
		fecha2 = LocalDate.of(2022, 1, 1);
	}
	
	@Test
	public void embarcacionTest() {
		embarcacion = new Embarcacion("1",fecha, 10, c,"Barquito");
		embarcacion2 = new Embarcacion("1",fecha2, 10, c,"Barquito");
		embarcacion3 = new Embarcacion("1",fecha2, 1000000, c,"Barquito");
		
		assertEquals(10, embarcacion.calcularImpuesto());
		assertEquals(11, embarcacion2.calcularImpuesto());
		assertEquals(1150000, embarcacion3.calcularImpuesto()); //El valor mas el 15%
	}
}
