

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class VendingMachineTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VendingMachineTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class VendingMachineTest
     */
    public VendingMachineTest()
    {
        // initialise instance variables
        x = 0;
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testinsertToken()
    {
        VendingMachine testVend = new VendingMachine();
        testVend.insertToken();
        int tokens = testVend.getTokens();
        int cans = testVend.getCans();
        assertEquals(1, tokens);
        assertEquals(4, cans);
    }
    
    @Test
    public void testgetTokens()
    {
        VendingMachine testVend = new VendingMachine();
        int tokens = testVend.getTokens();
        assertEquals(0, tokens);
        
        testVend.insertToken();
        tokens = testVend.getTokens();
        assertEquals(1, tokens);
    
    }
    
    @Test
    public void testgetCans()
    {
        VendingMachine testVend = new VendingMachine();
        int cans = testVend.getCans();
        assertEquals(5, cans);
        
        testVend.addCans(10);
        cans = testVend.getCans();
        assertEquals(15, cans);
    }
    
    @Test
    public void testaddCans()
    {
        VendingMachine testVend = new VendingMachine();
        testVend.addCans(20);
        int cans = testVend.getCans();
        assertEquals(25, cans);
    }
    
    

    
    
    
    
    
    
    
    
    
    
    

}
