/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package matematica;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author marcelapsilverio
 */
public class NumerosTest {
    
    private Numeros n;
    
    public NumerosTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
        n = new Numeros();
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
    /*@BeforeAll
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
    }*/

    /**
     * Test of numeroPar method, of class Numeros.
     */
    @org.junit.jupiter.api.Test
    public void testNumeroPar() {
        assertEquals(true, n.numeroPar(9));
    }

    /**
     * Test of areaQuadrado method, of class Numeros.
     */
    @org.junit.jupiter.api.Test
    public void testAreaQuadrado() {
        assertEquals(100, n.areaQuadrado(10));
    }

    /**
     * Test of numeroDivisivel method, of class Numeros.
     */
    @org.junit.jupiter.api.Test
    public void testNumeroDivisivel() {
        assertEquals(true, n.numeroDivisivel(4, 2));
    }
    
}
