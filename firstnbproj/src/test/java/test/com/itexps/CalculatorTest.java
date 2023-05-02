
package test.com.itexps;

import com.itexps.utility.firstnbproj.Calculator;
import static org.testng.Assert.*;
import org.testng.annotations.Test;


public class CalculatorTest {
    
    Calculator cals ;
    
    public CalculatorTest() {
    }

    

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
        cals = new Calculator ();
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }
    @Test
    public void testAdd(){
        assertEquals(cals.add(2, 4), 6);
        
    }
}
