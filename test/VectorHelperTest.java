

package main;

import java.util.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DELL XPS
 */
public class VectorHelperTest {
    
    public VectorHelperTest() {
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
     * Test of main method, of class TP1_V1.
     * @throws java.lang.Exception
     */
    @Test(expected = NumberFormatException.class)
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        main.main(args);
    }

    /**
     * Test of getInt method, of class TP1_V1.
     */
    @Test(expected = NoSuchElementException.class)
    public void testGetInt() {
        System.out.println("getInt");
        String prompt = "";
        int expResult = 1;
        int result = VectorHelper.getInt(prompt);
        assertEquals(expResult, result);
    }

    /**
     * Test of RemplirTab method, of class TP1_V1.
     */
    @Test(expected=NoSuchElementException.class)
    public void testRemplirTab() {
        System.out.println("RemplirTab");
        int n = 6;
        int[] expResult = {1,15,3,45,35,90};
        int[] result = VectorHelper.RemplirTab(n);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of AfficherTab method, of class TP1_V1.
     */
    @Test
    public void testAfficherTab() {
        System.out.println("AfficherTab");
        int[] tab = {1,5,20,18,11,3};
        VectorHelper.AfficherTab(tab);
    }

    /**
     * Test of InverserTab method, of class TP1_V1.
     */
    @Test
    public void testInverserTab() {
        System.out.println("InverserTab");
        int[] tab = {1,5,20,18,11,3};
        int[] expResult = {3,11,18,20,5,1};
        int[] result = VectorHelper.InverserTab(tab);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of TriBulles method, of class TP1_V1.
     */
    @Test
    public void testTriBulles() {
        System.out.println("TriBulles");
        int[] tab = {1,5,20,18,11,3};
        int[] expResult = {1,3,5,11,18,20};
        int[] result = VectorHelper.TriBulles(tab);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of SomVector method, of class TP1_V1.
     * @throws java.lang.Exception
     */
    @Test
    public void testSomVector() throws Exception {
        System.out.println("SomVector");
        int[] T = {1,5,20,18,11,3};
        int[] S = {15,8,2,35,90,7};
        int[] expResult = {16,13,22,53,101,10};
        int[] result = VectorHelper.SomVector(T, S);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of MaxMin method, of class TP1_V1.
     */
    @Test
    public void testMaxMin() {
        System.out.println("MaxMin");
        int[] tab = {1,5,20,18,11,3};
        VectorHelper.MaxMin(tab);
    }

    /**
     * Test of gestion_menu method, of class TP1_V1.
     * @throws java.lang.Exception
     */
    @Test(expected=NumberFormatException.class)
    public void testGestion_menu() throws Exception {
        System.out.println("gestion_menu");
        VectorHelper.gestion_menu();
    }
}
