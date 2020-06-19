/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

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
public class DiagnosticoTest {
    
    public DiagnosticoTest() {
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
     * Test of getCodigoDiagnostico method, of class Diagnostico.
     */
    @Test
    public void testGetCodigoDiagnostico() {
        System.out.println("getCodigoDiagnostico");
        Diagnostico instance = new Diagnostico();
        int expResult = 0;
        int result = instance.getCodigoDiagnostico();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigoDiagnostico method, of class Diagnostico.
     */
    @Test
    public void testSetCodigoDiagnostico() {
        System.out.println("setCodigoDiagnostico");
        int codigoDiagnostico = 0;
        Diagnostico instance = new Diagnostico();
        instance.setCodigoDiagnostico(codigoDiagnostico);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEnfermedadActual method, of class Diagnostico.
     */
    @Test
    public void testGetEnfermedadActual() {
        System.out.println("getEnfermedadActual");
        Diagnostico instance = new Diagnostico();
        String expResult = "";
        String result = instance.getEnfermedadActual();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEnfermedadActual method, of class Diagnostico.
     */
    @Test
    public void testSetEnfermedadActual() {
        System.out.println("setEnfermedadActual");
        String enfermedadActual = "";
        Diagnostico instance = new Diagnostico();
        instance.setEnfermedadActual(enfermedadActual);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTratamiento method, of class Diagnostico.
     */
    @Test
    public void testGetTratamiento() {
        System.out.println("getTratamiento");
        Diagnostico instance = new Diagnostico();
        String expResult = "";
        String result = instance.getTratamiento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTratamiento method, of class Diagnostico.
     */
    @Test
    public void testSetTratamiento() {
        System.out.println("setTratamiento");
        String tratamiento = "";
        Diagnostico instance = new Diagnostico();
        instance.setTratamiento(tratamiento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCitamedica method, of class Diagnostico.
     */
    @Test
    public void testGetCitamedica() {
        System.out.println("getCitamedica");
        Diagnostico instance = new Diagnostico();
        CitaMedica expResult = null;
        CitaMedica result = instance.getCitamedica();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCitamedica method, of class Diagnostico.
     */
    @Test
    public void testSetCitamedica() {
        System.out.println("setCitamedica");
        CitaMedica citamedica = null;
        Diagnostico instance = new Diagnostico();
        instance.setCitamedica(citamedica);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarDiagnostico method, of class Diagnostico.
     */
    @Test
    public void testMostrarDiagnostico() {
        System.out.println("mostrarDiagnostico");
        Diagnostico instance = new Diagnostico();
        instance.mostrarDiagnostico();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nuevaHistoriaClinica method, of class Diagnostico.
     */
    @Test
    public void testNuevaHistoriaClinica() {
        System.out.println("nuevaHistoriaClinica");
        Diagnostico instance = new Diagnostico();
        instance.nuevaHistoriaClinica();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
