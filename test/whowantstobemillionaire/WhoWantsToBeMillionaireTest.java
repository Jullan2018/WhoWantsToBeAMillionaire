/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whowantstobemillionaire;
import org.junit.Test;
/**
 * This is unit testing for the main class WhoWantsToBeMillionaire.
 * Jullan Quevedo pkd2015 17981982
 * Matt McLuskie hmj5785 15900932
 */
public class WhoWantsToBeMillionaireTest 
{
    /**
     * Test of eventHandleSubmitButton method, of class WhoWantsToBeMillionaire.
     */
    @Test
    public void testEventHandleSubmitButton() throws Exception {
        System.out.println("eventHandleSubmitButton");
        WhoWantsToBeMillionaire instance = new WhoWantsToBeMillionaire();
        instance.eventHandleSubmitButton();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of eventHandleHintButton method, of class WhoWantsToBeMillionaire.
     */
    @Test
    public void testEventHandleHintButton() throws Exception {
        System.out.println("eventHandleHintButton");
        WhoWantsToBeMillionaire instance = new WhoWantsToBeMillionaire();
        instance.eventHandleHintButton();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of eventHandleStartButton method, of class WhoWantsToBeMillionaire.
     */
    @Test
    public void testEventHandleStartButton() throws Exception {
        System.out.println("eventHandleStartButton");
        WhoWantsToBeMillionaire instance = new WhoWantsToBeMillionaire();
        instance.eventHandleStartButton();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of main method, of class WhoWantsToBeMillionaire.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = {"This", "is", "a", "Test"};
        WhoWantsToBeMillionaire.main(args);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of nextQuestion method, of class WhoWantsToBeMillionaire.
     */
    @Test
    public void testNextQuestion() {
        System.out.println("nextQuestion");
        WhoWantsToBeMillionaire instance = new WhoWantsToBeMillionaire();
        instance.nextQuestion();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setPanel method, of class WhoWantsToBeMillionaire.
     */
    @Test
    public void testSetPanel() {
        System.out.println("setPanel");
        QuestionTextPanel panel = null;
        WhoWantsToBeMillionaire instance = new WhoWantsToBeMillionaire();
        instance.setPanel(panel);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
