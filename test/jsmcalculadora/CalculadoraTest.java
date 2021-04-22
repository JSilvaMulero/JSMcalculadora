/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsmcalculadora;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 *
 * @author Alumno_T
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
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
     * Test of suma method, of class Calculadora.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        double num1 = 4.0;
        double num2 = 4.0;
        Calculadora instance = new Calculadora();
        double expResult = 8.0;
        double result = instance.suma(num1, num2);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of resta method, of class Calculadora.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        double num1 = 5.0;
        double num2 = 3.0;
        Calculadora instance = new Calculadora();
        double expResult = 2.0;
        double result = instance.resta(num1, num2);
        assertEquals(expResult, result, 0.0);
        
       
    }

    /**
     * Test of multiplicacion method, of class Calculadora.
     */
    @Test
    public void testMultiplicacion() {
        System.out.println("multiplicacion");
        double num1 = 2.0;
        double num2 = 3.0;
        Calculadora instance = new Calculadora();
        double expResult = 6.0;
        double result = instance.multiplicacion(num1, num2);
        assertEquals(expResult, result, 0.0);
      
    }

    /**
     * Test of division method, of class Calculadora.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        double num1 = 6.0;
        double num2 = 2.0;
        Calculadora instance = new Calculadora();
        double expResult = 3.0;
        double result = instance.division(num1, num2);
        assertEquals(expResult, result, 0.0);
      
    }
    
}
