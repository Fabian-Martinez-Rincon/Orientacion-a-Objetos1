package ar.edu.unlp.info.oo1.Ejercicio_15_Alquiler_de_propiedades;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class UsuarioTest {
	
	DateLapse periodo;
	LocalDate inicio= LocalDate.of(10, 2, 10);;
	LocalDate fin= LocalDate.of(10, 3, 10);;
	
	Usuario fabian;
	Propiedad casa;
	Propiedad hotel;
	
	Sistema sistema;
	
	
	@BeforeEach
	void setUp() throws Exception {
		sistema = new Sistema();
		fabian = new Usuario("Fabian", "Los Hornos", "777");
		sistema.registrarUsuario(fabian);
		periodo = new DateLapse(inicio,fin);
		
		
		casa = new Propiedad("Mansion", "Grande", 20.0, "Gonet", fabian);
		hotel = new Propiedad("5 Estrellas", "Muchos pisos", 10.0, "Los Hornos", fabian);
	}
	
    @Test
    public void testPropiedades() {

    }
}
