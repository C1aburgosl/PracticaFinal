/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesmatematicas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 */
public class OperacionesMatematicasTest {
    
    public OperacionesMatematicasTest() {
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
     * Test of main method, of class OperacionesMatematicas.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        OperacionesMatematicas.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of probando method, of class OperacionesMatematicas.
     */
    @Test
    public void testProbando() {
        System.out.println("probando");
        OperacionesMatematicas instance = new OperacionesMatematicas();
        int expResult = 0;
        int result = instance.probando();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
