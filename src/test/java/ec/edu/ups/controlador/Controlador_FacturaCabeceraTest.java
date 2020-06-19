/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.FacturaDetalle;
import java.util.ArrayList;
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
public class Controlador_FacturaCabeceraTest {
    
    public Controlador_FacturaCabeceraTest() {
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
     * Test of generarFactura method, of class Controlador_FacturaCabecera.
     */
    @Test
    public void testGenerarFactura() {
        System.out.println("generarFactura");
        Controlador_FacturaCabecera instance = new Controlador_FacturaCabecera();
        instance.generarFactura();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listaFacturadetalle method, of class Controlador_FacturaCabecera.
     */
    @Test
    public void testListaFacturadetalle() {
        System.out.println("listaFacturadetalle");
        Controlador_FacturaCabecera instance = new Controlador_FacturaCabecera();
        ArrayList<FacturaDetalle> expResult = null;
        ArrayList<FacturaDetalle> result = instance.listaFacturadetalle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
