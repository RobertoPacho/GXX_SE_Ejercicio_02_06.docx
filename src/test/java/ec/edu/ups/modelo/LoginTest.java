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
public class LoginTest {
    
    public LoginTest() {
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
     * Test of getPersona method, of class Login.
     */
    @Test
    public void testGetPersona() {
        System.out.println("getPersona");
        Login instance = new Login();
        Persona expResult = null;
        Persona result = instance.getPersona();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPersona method, of class Login.
     */
    @Test
    public void testSetPersona() {
        System.out.println("setPersona");
        Persona persona = null;
        Login instance = new Login();
        instance.setPersona(persona);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCorreo method, of class Login.
     */
    @Test
    public void testGetCorreo() {
        System.out.println("getCorreo");
        Login instance = new Login();
        String expResult = "";
        String result = instance.getCorreo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCorreo method, of class Login.
     */
    @Test
    public void testSetCorreo() {
        System.out.println("setCorreo");
        String correo = "";
        Login instance = new Login();
        instance.setCorreo(correo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContrasena method, of class Login.
     */
    @Test
    public void testGetContrasena() {
        System.out.println("getContrasena");
        Login instance = new Login();
        String expResult = "";
        String result = instance.getContrasena();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContrasena method, of class Login.
     */
    @Test
    public void testSetContrasena() {
        System.out.println("setContrasena");
        String contrasena = "";
        Login instance = new Login();
        instance.setContrasena(contrasena);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validarCorreo method, of class Login.
     */
    @Test
    public void testValidarCorreo() {
        System.out.println("validarCorreo");
        Login instance = new Login();
        instance.validarCorreo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validarContrasena method, of class Login.
     */
    @Test
    public void testValidarContrasena() {
        System.out.println("validarContrasena");
        Login instance = new Login();
        instance.validarContrasena();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
