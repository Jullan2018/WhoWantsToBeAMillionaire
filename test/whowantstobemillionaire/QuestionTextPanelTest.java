/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whowantstobemillionaire;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This is unit testing for QuestionTextPanel
 * 
 * Jullan Quevedo pkd2015 17981982
 * Matt McLuskie hmj5785 15900932
 */
public class QuestionTextPanelTest {
    
    public QuestionTextPanelTest() {
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
     * Test of getHintButton method, of class QuestionTextPanel.
     */
    @Test
    public void testGetHintButton() {
        System.out.println("getHintButton");
        QuestionTextPanel instance = null;
        JButton expResult = null;
        JButton result = instance.getHintButton();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getButtonGroup1 method, of class QuestionTextPanel.
     */
    @Test
    public void testGetButtonGroup1() {
        System.out.println("getButtonGroup1");
        QuestionTextPanel instance = null;
        ButtonGroup expResult = null;
        ButtonGroup result = instance.getButtonGroup1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMoneyDisplay method, of class QuestionTextPanel.
     */
    @Test
    public void testGetMoneyDisplay() {
        System.out.println("getMoneyDisplay");
        QuestionTextPanel instance = null;
        JLabel expResult = null;
        JLabel result = instance.getMoneyDisplay();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class QuestionTextPanel.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Question question = null;
        QuestionTextPanel instance = null;
        instance.update(question);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAnswer method, of class QuestionTextPanel.
     */
    @Test
    public void testGetAnswer() {
        System.out.println("getAnswer");
        QuestionTextPanel instance = null;
        String expResult = "";
        String result = instance.getAnswer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
