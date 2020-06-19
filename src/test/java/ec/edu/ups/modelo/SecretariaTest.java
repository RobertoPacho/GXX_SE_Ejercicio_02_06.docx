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
public class SecretariaTest {
    
    public SecretariaTest() {
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
     * Test of getContrasena method, of class Secretaria.
     */
    @Test
    public void testGetContrasena() {
        System.out.println("getContrasena");
        Secretaria instance = new Secretaria();
        String expResult = "";
        String result = instance.getContrasena();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContrasena method, of class Secretaria.
     */
    @Test
    public void testSetContrasena() {
        System.out.println("setContrasena");
        String contrasena = "";
        Secretaria instance = new Secretaria();
        instance.setContrasena(contrasena);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularEdad method, of class Secretaria.
     */
    @Test
    public void testCalcularEdad() {
        System.out.println("calcularEdad");
        Secretaria instance = new Secretaria();
        int expResult = 0;
        int result = instance.calcularEdad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
