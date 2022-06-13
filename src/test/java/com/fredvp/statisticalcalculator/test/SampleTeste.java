/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.fredvp.statisticalcalculator.test;

import com.fredvp.statisticalcalculator.Sample;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Feu's m15 R6
 */
public class SampleTeste {

    private static Sample sampleEven;
    private static Sample sampleOdd;

    public SampleTeste() {

    }

    @BeforeAll
    public static void setUpClass() {
        sampleOdd = new Sample("1, 1, 2, 2, 2, 3, 3");
        //mean = 2
        //median = 2
        //moda = 2
        //standard deviation = 
        //variance = 

        sampleEven = new Sample("3, 3, 4, 5, 8, 10");
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    void testMean() {
        assertEquals(sampleOdd.mean(), 2);
        assertEquals(sampleEven.mean(), 5, 5);
    }

    @Test
    void testMedian() {
        assertEquals(sampleOdd.median(), 2);
        assertEquals(sampleEven.median(), 4, 5);
    }

    @Test
    void testModa() {
        assertEquals(sampleOdd.moda(), 2);
        assertEquals(sampleEven.moda(), 3);
    }
}
