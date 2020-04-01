/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ice4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rajvindersandhu
 */
public class ICE4Test {
    
    public ICE4Test() {
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
     * Test of main method, of class ICE4.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ICE4 instance = new ICE4();
        instance.main(args);

    }

    /**
     * Test of charCount method, of class ICE4.
     */
    @Test
    public void testCharCount() {
        System.out.println("charCount");
        char search = 'p';
        ICE4 instance = new ICE4();
        int expResult = 3;
        int result = instance.charCount(search);
        assertEquals(expResult, result);

    }
    
    public void testCharCountBad() {
        System.out.println("charCount");
        char search = 'z';
        ICE4 instance = new ICE4();
        int expResult = 0;
        int result = instance.charCount(search);
        assertEquals(expResult, result);

    }

    /**
     * Test of ascii method, of class ICE4.
     */
    @Test
    public void testAscii() {
        System.out.println("ascii");
        ICE4 instance = new ICE4();
        char expResult = 'z';
        char result = instance.ascii();
        assertEquals(expResult, result);

    }
    @Test
    public void testAsciiBad() {
        System.out.println("ascii");
        ICE4 instance = new ICE4();
        char expResult = 'z';
        char result = instance.ascii();
        assertEquals(expResult, result);

    }

    /**
     * Test of checkletter method, of class ICE4.
     */
    @Test
    public void testCheckletter() {
        System.out.println("checkletter");
        char search = 'p';
        ICE4 instance = new ICE4();
        boolean expResult = true;
        boolean result = instance.checkletter(search);
        assertEquals(expResult, result);
    }
    @Test
    public void testCheckletterBad() {
        System.out.println("checkletter");
        char search = 'z';
        ICE4 instance = new ICE4();
        boolean expResult = false;
        boolean result = instance.checkletter(search);
        assertEquals(expResult, result);
    }
    
}
