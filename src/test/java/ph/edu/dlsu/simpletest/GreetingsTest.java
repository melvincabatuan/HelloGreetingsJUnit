/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ph.edu.dlsu.simpletest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cobalt
 */
public class GreetingsTest {
    
    public GreetingsTest() {
    }
    
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setMorningGreet method, of class Greetings.
     */
    @org.junit.Test
    public void testSetMorningGreet() {
        System.out.println("setMorningGreet");
        String message = "";
        Greetings instance = new Greetings();
        instance.setMorningGreet(message);
        assertEquals("", instance.getMorningGreet());
        message = "Magandang Umaga";
        instance.setMorningGreet(message);
        assertEquals(message, instance.getMorningGreet());
    }

    /**
     * Test of getMorningGreet method, of class Greetings.
     */
    @org.junit.Test
    public void testGetMorningGreet() {
        System.out.println("getMorningGreet");
        Greetings instance = new Greetings();
        String expResult = "Ohayou Gozaimasu";
        instance.setMorningGreet(expResult);        
        String result = instance.getMorningGreet();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAfternoonGreet method, of class Greetings.
     */
    @org.junit.Test
    public void testSetAfternoonGreet() {
        System.out.println("setAfternoonGreet");
        String message = "";
        Greetings instance = new Greetings();
        instance.setAfternoonGreet(message);
        assertEquals("", instance.getMorningGreet());
        message = "Magandang Tanghali";
        instance.setMorningGreet(message);
        assertEquals(message, instance.getMorningGreet());
    }

    /**
     * Test of getAfternoonGreet method, of class Greetings.
     */
    @org.junit.Test
    public void testGetAfternoonGreet() {
        System.out.println("getAfternoonGreet");
        Greetings instance = new Greetings();
        String expResult = "Konnichiwa";
        instance.setAfternoonGreet(expResult);
        String result = instance.getAfternoonGreet();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNightGreet method, of class Greetings.
     */
    @org.junit.Test
    public void testSetNightGreet() {
        System.out.println("setNightGreet");
        String message = "";
        Greetings instance = new Greetings();
        instance.setNightGreet(message);
        assertEquals("", instance.getMorningGreet());
        message = "Magandang Gabi";
        instance.setMorningGreet(message);
        assertEquals(message, instance.getMorningGreet());
    }

    /**
     * Test of getNightGreet method, of class Greetings.
     */
    @org.junit.Test
    public void testGetNightGreet() {
        System.out.println("getNightGreet");
        Greetings instance = new Greetings();
        String expResult = "Konbanwa";
        instance.setAfternoonGreet(expResult);
        String result = instance.getAfternoonGreet();
        assertEquals(expResult, result);
    }
    
}
