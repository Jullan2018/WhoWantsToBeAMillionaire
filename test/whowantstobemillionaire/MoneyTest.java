/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whowantstobemillionaire;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This is unit testing for class Money.
 * 
 * Jullan Quevedo pkd2015 17981982
 * Matt McLuskie hmj5785 15900932
 */
public class MoneyTest {
    
    public MoneyTest() {
    }
   
    @Test
    public void testGetCurrentMoney() {
        System.out.println("getCurrentMoney");
        Money instance = new Money();
        int expResult = 0;
        int result = instance.getCurrentMoney();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of setCurrentMoney method, of class Money.
     */
    @Test
    public void testSetCurrentMoney() {
        System.out.println("setCurrentMoney");
        int index = 1;
        Money instance = new Money();
        instance.setCurrentMoney(index);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of maxMoney method, of class Money.
     */
    @Test
    public void testMaxMoney() {
        System.out.println("maxMoney");
        Money instance = new Money();
        int expResult = 1000000;
        int result = instance.maxMoney();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
