/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Contabilidad;
import ec.edu.ups.modelo.Insumos;
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
public class Controlador_AdministradorTest {
    
    public Controlador_AdministradorTest() {
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
     * Test of listarInsumos method, of class Controlador_Administrador.
     */
    @Test
    public void testListarInsumos() {
        System.out.println("listarInsumos");
        Controlador_Administrador instance = new Controlador_Administrador();
        ArrayList<Insumos> expResult = null;
        ArrayList<Insumos> result = instance.listarInsumos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarContabilidad method, of class Controlador_Administrador.
     */
    @Test
    public void testListarContabilidad() {
        System.out.println("listarContabilidad");
        Controlador_Administrador instance = new Controlador_Administrador();
        ArrayList<Contabilidad> expResult = null;
        ArrayList<Contabilidad> result = instance.listarContabilidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
