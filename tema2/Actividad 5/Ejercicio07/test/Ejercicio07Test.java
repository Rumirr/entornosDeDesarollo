/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author horabaixa
 */
public class Ejercicio07Test {
    
    public Ejercicio07Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Romanos method, of class Ejercicio07.
     */
    @Test
    public void testRomanos() {
        System.out.println("Romanos");
        int num = 2016;
        Ejercicio07 instance = new Ejercicio07();
        String expResult = "MMXVI";
        String result = instance.Romanos(num);
        assertEquals(expResult, result);
    }

    /**
     * Test of numEntero method, of class Ejercicio07.
     */
    @Test
    public void testNumEntero() {
        System.out.println("numEntero");
        String numRomano = "XXI";
        Ejercicio07 instance = new Ejercicio07();
        int expResult = 21;
        int result = instance.numEntero(numRomano);
        assertEquals(expResult, result);
    }

    /**
     * Test of dolar method, of class Ejercicio07.
     */
    @Test
    public void testDolar() {
        System.out.println("dolar");
        float euro = 1F;
        Ejercicio07 instance = new Ejercicio07();
        float expResult = 1.14F;
        float result = instance.dolar(euro);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of euro method, of class Ejercicio07.
     */
    @Test
    public void testEuro() {
        System.out.println("euro");
        float dolar = 1F;
        Ejercicio07 instance = new Ejercicio07();
        float expResult = 0.88F;
        float result = instance.euro(dolar);
        assertEquals(expResult, result, 0.0);
    }
    
}
