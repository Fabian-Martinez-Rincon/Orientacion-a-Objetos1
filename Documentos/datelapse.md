```java
package ar.edu.unlp.info.oo1.Ejercicio_14_Intervalo_de_tiempo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DateLapseTest {
	
	DateLapse periodo;
	LocalDate inicio = LocalDate.of(2000, Month.JANUARY, 1);
	LocalDate fin = LocalDate.of(2000, Month.JANUARY, 30);
	
	DateLapse periodo2;
	LocalDate inicio2 = LocalDate.of(2000, Month.JANUARY, 5);
	LocalDate fin2 = LocalDate.of(2000, Month.JANUARY, 10);
	
	DateLapse fecha3;
	LocalDate inicio3 = LocalDate.of(2000, Month.JANUARY, 10);
	LocalDate fin3 = LocalDate.of(2000, Month.JANUARY, 5);
	
	@BeforeEach
	void setUp() throws Exception {
		periodo = new DateLapse(inicio, fin);
		periodo2 = new DateLapse(inicio2, fin2);
	}
	
    @Test
    public void testDias() {
        assertEquals(1, periodo.getFrom().getDayOfMonth());
        assertEquals(30, ((DateLapse) periodo).getTo().getDayOfMonth());
    }
    
    @Test
    public void testCantidadDias() {
        assertEquals(29, periodo.sizeInDays());
        assertEquals(5, periodo2.sizeInDays());
    }
    
    @Test
    public void testContieneFecha() {
        assertTrue(periodo.includesDate(inicio2));
        assertTrue(periodo.includesDate(fin2));
        assertTrue(periodo.includesDate(inicio));// incluye los valores borde
        assertTrue(periodo.includesDate(fin));
    }
    @Test
    public void testSeSuperpone() {
    	assertTrue(periodo.overlaps(periodo2));
    }

```