/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.HistoriaClinica;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author hp
 */
public class Controlador_DiagnosticoTest {
    
    public Controlador_DiagnosticoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of mostrarDiagnostico method, of class Controlador_Diagnostico.
     */
    @Test
    public void testMostrarDiagnostico() {
        System.out.println("mostrarDiagnostico");
        Controlador_Diagnostico instance = new Controlador_Diagnostico();
        instance.mostrarDiagnostico();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nuevaHostoriaClinica method, of class Controlador_Diagnostico.
     */
    @Test
    public void testNuevaHostoriaClinica() {
        System.out.println("nuevaHostoriaClinica");
        HistoriaClinica historiaClinica = null;
        Controlador_Diagnostico instance = new Controlador_Diagnostico();
        instance.nuevaHostoriaClinica(historiaClinica);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
