/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whowantstobemillionaire;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This is unit testing for class DBConnection
 *
 * Jullan Quevedo pkd2015 17981982
 * Matt McLuskie hmj5785 15900932
 */
public class DBConnectionTest {
    
    DBConnection instance;
    public DBConnectionTest() {
    }
    
    /**
     * Test of getQuestion method, of class DBConnection.
     * 
     */
    
    @Test
    public void testGetQuestion()
    {
        int questionNumber = 5;
        instance = new DBConnection();
        
        Question expResult = new Question("This is Test","sampleA","sampleB","sampleC","sampleD","Sample Answer","Sample Hint");
        Question result = instance.getQuestion(questionNumber);
        
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
