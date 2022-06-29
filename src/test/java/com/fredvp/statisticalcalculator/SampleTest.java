/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.fredvp.statisticalcalculator;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Feu's m15 R6
 * 
 * to do: functions must sort sample first (median most)
 */
public class SampleTest {
    
    private static Sample sampleEven;
    private static Sample sampleOdd;
    
    public SampleTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        sampleOdd = new Sample("1.1, 0.9, 2, 2, 2, 3, 3");
        //mean = 2
        //median = 2
        //moda = 2
        //standard deviation = 
        //variance = 

        sampleEven = new Sample("3, 3, 4, 5, 8.0, 10");
        //mean = 5,5
        //median = 4,5
        //moda = 3
        //standard deviation = 
        //variance = 
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
     * Test of mean method, of class Sample.
     */
    @Test
    public void testMean() {
        System.out.println("mean test");
        float expResultEven = 5.5f;
        float resultEven = sampleEven.mean();
        float expResultOdd = 2.0f;
        float resultOdd = sampleOdd.mean();
        assertEquals(resultOdd, expResultOdd, 0.0);
        assertEquals(resultEven, expResultEven, 0.0);
    }

    /**
     * Test of moda method, of class Sample.
     */
    @Test
    public void testModa() {
        System.out.println("moda test");
        float expResultEven = 3.0F;
        float resultEven = sampleEven.moda();
        float expResultOdd = 2.0F;
        float resultOdd = sampleOdd.moda();
        assertEquals(resultOdd, expResultOdd, 0.0);
        assertEquals(resultEven, expResultEven);
    }

    /**
     * Test of median method, of class Sample.
     */
    @Test
    public void testMedian() {
        System.out.println("median test");
        float expResultEven = 4.5F;
        float resultEven = sampleEven.median();
        float expResultOdd = 2.0f;
        float resultOdd = sampleOdd.median();
        assertEquals(resultOdd, expResultOdd, 0.0);
        assertEquals(resultEven, expResultEven, 0.0);

    }

    /**
     * Test of transformToArray method, of class Sample.
     
    @Test
    public void testTransformToArray() {
        System.out.println("transformToArray");
        String sample = "";
        Sample instance = null;
        ArrayList<Float> expResult = null;
        ArrayList<Float> result = instance.transformToArray(sample);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    **/
    
}
