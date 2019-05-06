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
public class Ejercicio06Test {
    
    public Ejercicio06Test() {
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
     * Test of celsius method, of class Ejercicio06.
     */
    @Test
    public void testCelsius() {
        System.out.println("celsius");
        float fahrenheit = 32F;
        Ejercicio06 instance = new Ejercicio06();
        float expResult = 0F;
        float result = instance.celsius(fahrenheit);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of fahrenheit method, of class Ejercicio06.
     */
    @Test
    public void testFahrenheit() {
        System.out.println("fahrenheit");
        float celsius = 32F;
        Ejercicio06 instance = new Ejercicio06();
        float expResult = 89.6F;
        float result = instance.fahrenheit(celsius);
        assertEquals(expResult, result, 0.0);
    }
    
}
