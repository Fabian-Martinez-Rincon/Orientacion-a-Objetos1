package ar.edu.unlp.info.oo1.Ejercicio_14_Intervalo_de_tiempo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DateLapseTest {
	
	DateLapse fecha;
	DateLapse fecha2;
	LocalDate inicio = LocalDate.of(2000, Month.JANUARY, 1);
	LocalDate fin = LocalDate.of(2000, Month.JANUARY, 30);
	LocalDate inicio2 = LocalDate.of(2000, Month.JANUARY, 5);
	LocalDate fin2 = LocalDate.of(2000, Month.JANUARY, 10);
	
	@BeforeEach
	void setUp() throws Exception {
		fecha = new DateLapse(inicio, fin);
		fecha2 = new DateLapse(inicio2, fin2);
	}
	
    @Test
    public void testDias() {
        assertEquals(1, fecha.getFrom().getDayOfMonth());
        assertEquals(30, ((DateLapse) fecha).getTo().getDayOfMonth());
    }
    
    @Test
    public void testCantidadDias() {
        assertEquals(29, fecha.sizeInDays());
        assertEquals(5, fecha2.sizeInDays());
    }
    
    @Test
    public void testContieneFecha() {
        assertTrue(fecha.includesDate(inicio2));
        assertTrue(fecha.includesDate(fin2));
        assertFalse(fecha.includesDate(inicio));// No incluye los valores borde
        assertFalse(fecha.includesDate(fin));
    }
}