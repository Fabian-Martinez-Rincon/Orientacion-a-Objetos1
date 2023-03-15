package ar.edu.unlp.info.oo1.Ejercicio1WallPost;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonaTest {
	
	Persona james, guido;
	
	@BeforeEach
	void setUp() throws Exception {
		james = new Persona();
		guido = new Persona();
		james.setApellido("Glosing");
		james.setNombre("James");
		guido.setApellido("van Rossum");
		guido.setNombre("Guido");
		
	}
	
    @Test
    public void testNombreCompleto() {
        assertEquals("Glosing, James", james.getNombreCompleto());
        assertEquals("van Rossum, Guido", guido.getNombreCompleto());
    }
}
