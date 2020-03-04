/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whowantstobemillionaire;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This is unit testing for class Question
 * Jullan Quevedo pkd2015 17981982
 * Matt McLuskie hmj5785 15900932
 */
public class QuestionTest 
{
    Question question;
    
    public QuestionTest() {}
    
    @Test
    public void Question_WhenGetQuestionTextIsCalled_ShouldReturnCorrectQuestionText() 
    {
  
        String myQuestionText = "This is my example question";

        question = new Question(myQuestionText, "", "", "","", "","");
        String theQuestionText = question.getQuestion();

        assertEquals(myQuestionText, theQuestionText);
    }
     
    @Test
    public void Question_WhenGetAIsCalled_ShouldReturnOptionA()
    {
        String optionSample = "sampleA";
        
        question = new Question("",optionSample,"","","","","");
        String option = question.getA();
        
        assertEquals(optionSample,option);
    }
    
    @Test
    public void Question_WhenGetBIsCalled_ShouldReturnOptionB()
    {
        String optionSample = "sampleB";
        
        question = new Question("","",optionSample,"","","","");
        String option = question.getB();
        
        assertEquals(optionSample,option);
    }
    
    @Test
    public void Question_WhenGetCIsCalled_ShouldReturnOptionC()
    {
        String optionSample = "sampleC";
        
        question = new Question("","","",optionSample,"","","");
        String option = question.getC();
        
        assertEquals(optionSample,option);
    }
    
    @Test
    public void Question_WhenGetDIsCalled_ShouldReturnOptionD()
    {
        String optionSample = "sampleD";
        
        question = new Question("","","","",optionSample,"","");
        String option = question.getD();
        
        assertEquals(optionSample,option);
    }
    
    @Test
    public void Question_WhenGetAnswerIsCalled_ShouldReturnCorrectAnswer()
    {
        String answer = "Sample Answer";
        
        question = new Question("","","","","",answer,"");
        String getAnswer = question.getAnswer();
        
        assertEquals(answer,getAnswer);
    }
    
    @Test
    public void Question_WhenGetHintisCalled_ShouldReturnGetHint()
    {
        String hint = "Hint Sample";
        
        question = new Question("","","","","","",hint);
        String option = question.getHint();
        
        assertEquals(hint,option);
    }
}