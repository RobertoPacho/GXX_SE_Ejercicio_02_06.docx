/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

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
public class Controlador_LoginTest {
    
    public Controlador_LoginTest() {
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
     * Test of validarCorreo method, of class Controlador_Login.
     */
    @Test
    public void testValidarCorreo() {
        System.out.println("validarCorreo");
        Controlador_Login instance = new Controlador_Login();
        instance.validarCorreo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validarContrasena method, of class Controlador_Login.
     */
    @Test
    public void testValidarContrasena() {
        System.out.println("validarContrasena");
        Controlador_Login instance = new Controlador_Login();
        instance.validarContrasena();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
