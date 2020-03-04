/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whowantstobemillionaire;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 * This class is the main class.
 * 
 * @author 
 * Jullan Quevedo pkd2015 17981982
 * Matt McLuskie hmj5785 15900932
 */
public class WhoWantsToBeMillionaire 
{ 
    private  int totalHints = 3;
    JFrame frame;
    StartUpPanel startUp;
    DBConnection db = new DBConnection();
    QuestionTextPanel textPanel;
    Question currentQuestion;
    int questionNumber = 1;
    boolean wrongAnswer = false;
    int totalCorrectAnswer = 0;
    Question previousQuestion;
    
    public void eventHandleSubmitButton() throws SQLException
    {
          if(textPanel.getButtonGroup1().getSelection() != null)
          {
         
          int confirmed = JOptionPane.showConfirmDialog(frame, "Are You Sure?","Confirmation",JOptionPane.YES_NO_OPTION);
          
          if(confirmed == JOptionPane.YES_OPTION) 
          {   
             if(textPanel.getAnswer() == null ? currentQuestion.getAnswer() == null : textPanel.getAnswer().equals(currentQuestion.getAnswer()))
             {
                totalCorrectAnswer++;
                
                JOptionPane.showMessageDialog(frame, "Correct!");
                nextQuestion();
                textPanel.getButtonGroup1().clearSelection();
                textPanel.getMoney.setCurrentMoney(totalCorrectAnswer);
                textPanel.moneyDisplay.setText("REWARD: $"+Integer.toString(textPanel.getMoney.getCurrentMoney())+" out of $1,000,000");
             }
             else
             {
                int restart = JOptionPane.showConfirmDialog(frame, "Incorrect Answer!DO you want Play Again? ","Try Again?",JOptionPane.YES_NO_OPTION);
                
                if(restart == JOptionPane.YES_OPTION)
                {
                    Question question1 = db.getQuestion(1);
                    textPanel.update(question1);
                }
                else
                {
                    System.exit(0);
                }   
             }
          }
          }
          else
          {
              JOptionPane.showMessageDialog(frame, "Oh no! You haven't chosen anything! Please choose an answer!");
          }
            
    }     
    
    public void eventHandleHintButton() throws SQLException
    {      
      frame = new JFrame();    
      //if(previousQuestion == currentQuestion)
     // {
        JOptionPane.showMessageDialog(frame,currentQuestion.getHint());        
     // }
     // else
     // {
        if(totalHints == 0)
        {
            JOptionPane.showMessageDialog(frame, "Sorry, YOU RAN OUT OF HINTS!");       
        }
        else 
        {
            JOptionPane.showMessageDialog(frame,currentQuestion.getHint()); 
            totalHints--;
        }         
      //}
    }
       
    public void eventHandleStartButton() throws SQLException
    { 
         textPanel = new QuestionTextPanel(this);
         this.nextQuestion();
         frame.setContentPane(textPanel);        
    }
        
        
     public static void main(String[] args) throws SQLException 
    {
        WhoWantsToBeMillionaire main = new WhoWantsToBeMillionaire();
        main.frame = new JFrame();
        
        StartUpPanel startUp = new StartUpPanel(main);        
       
        
        main.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.frame.setSize(800, 700);
        main.frame.setLocation(140,35);
        main.frame.add(startUp);
        main.frame.setContentPane(startUp);
        //frame.setContentPane(question);
        main.frame.setVisible(true);
       
    }
    
     public void nextQuestion()
     {
           
          currentQuestion = db.getQuestion(questionNumber++);
          textPanel.update(currentQuestion);    
     }
     
     public void setPanel(QuestionTextPanel panel){
         textPanel = panel;
         
     }
     
}
