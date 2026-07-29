package ar.edu.unlp.info.oo1.Ejercicio_12_Volumen_y_superficie_con_solidos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PiezasTest {
	
	ReporteDeConstruccion reporte;
	Cilindro cilindro;
	Esfera esfera;
	PrismaRectangular prisma;
	
    private void initialize() {
        reporte = new ReporteDeConstruccion();
        cilindro = new Cilindro(10,20,"Hierro","Rojo");
        esfera = new Esfera(8,"Hierro","Azul");
        prisma = new PrismaRectangular(10,5,30,"Metal","Azul");
    }
    
    @BeforeEach
    public void setUp() {
        this.initialize();
    }
    
    @Test
    public void testInicial() {
    	assertEquals(6283.185,cilindro.getVolumen(),1e-3);
    	assertEquals(1884.955,cilindro.getSuperficie(),1e-3);
    	assertEquals(2144.660,esfera.getVolumen(),1e-3);
    	assertEquals(804.247,esfera.getSuperficie(),1e-3);
    	assertEquals(1500,prisma.getVolumen());
    	assertEquals(1000,prisma.getSuperficie());
    }
    
    @Test
    void testReportes() {
    	reporte.addPieza(cilindro); reporte.addPieza(esfera);
    	reporte.addPieza(prisma);
    	assertEquals(8427.845,reporte.getVolumenDeMaterial("Hierro"),1e-3);
    	assertEquals(1500,reporte.getVolumenDeMaterial("Metal"));
    	assertEquals(1884.955,reporte.getSuperficieDeColor("Rojo"),1e-3);
    	assertEquals(1804.247,reporte.getSuperficieDeColor("Azul"),1e-3);
    }
}