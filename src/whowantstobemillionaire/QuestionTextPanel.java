/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whowantstobemillionaire;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 * The QuestionTextPanel is a class that is responsible for the view in the
 * MVC framework of the game.
 * 
 * Jullan Quevedo pkd2015 17981982
 * Matt McLuskie hmj5785 15900932
 */
public class QuestionTextPanel extends JPanel
{
    WhoWantsToBeMillionaire main;
    private final ButtonGroup buttonGroup1;
    Money getMoney = new Money();
    private final JLabel gameTitle;
    public JLabel moneyDisplay;
    
    private final JButton hintButton;
    private final JButton submitButton;
   
    private final JRadioButton optionA;
    private final JRadioButton optionB;
    private final JRadioButton optionC;
    private final JRadioButton optionD;
    
    private final JTextPane questionTextPane;
   
    public JButton getHintButton()
    {
       return this.hintButton; 
    }
    public ButtonGroup getButtonGroup1()
    {
        return this.buttonGroup1;
    }
    public JLabel getMoneyDisplay()
    {
        return this.moneyDisplay;
    }
    public QuestionTextPanel(WhoWantsToBeMillionaire main2)
    {      
        this.main = main2;
        this.setLayout(null);
        this.setBackground(java.awt.Color.BLUE);
       
        optionA = new JRadioButton();
        optionB = new JRadioButton();
        optionC = new JRadioButton();
        optionD = new JRadioButton();
        
        buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(optionA);
        buttonGroup1.add(optionB);
        buttonGroup1.add(optionC);
        buttonGroup1.add(optionD);
    
        questionTextPane = new JTextPane();
        questionTextPane.setEditable(false);
        questionTextPane.setBounds(70, 95, 670, 220);   
        questionTextPane.setFont(new Font("ARIAL",Font.PLAIN,24));
        this.add(questionTextPane);
        
        submitButton = new JButton();
        hintButton = new JButton();
        moneyDisplay = new JLabel();
          
        gameTitle = new JLabel();
        gameTitle.setForeground(java.awt.Color.WHITE);
        gameTitle.setBounds(125, 10, 900, 100);
        gameTitle.setFont(new Font("Lucida Grande", 1, 32)); 
        gameTitle.setText("WHO WANTS TO BE A MILLIONAIRE");
        this.add(gameTitle);

        optionA.setBounds(100, 350, 350, 50);
        optionA.setForeground(java.awt.Color.WHITE);
        optionA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                optionAActionPerformed(evt);
            }
        });
        this.add(optionA);
    
        optionB.setBounds(100, 400, 350, 50);
        optionB.setForeground(java.awt.Color.WHITE);
        optionB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                optionBActionPerformed(evt);
            }
        });
        this.add(optionB);
        
        optionC.setBounds(100, 450, 350, 50);
        optionC.setForeground(java.awt.Color.WHITE);
        optionC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                optionCActionPerformed(evt);
            }
        });
        this.add(optionC);
        
        optionD.setBounds(100, 500, 350, 50);
        optionD.setForeground(java.awt.Color.WHITE);
        optionD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                optionDActionPerformed(evt);
            }
        });
        this.add(optionD);
       
        submitButton.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        submitButton.setText("SUBMIT HERE!");
        submitButton.setBounds(550, 500, 200, 60);
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        this.add(submitButton);

        hintButton.setText("Click Here for a Hint!");
        hintButton.setBounds(550, 580, 200, 60);
        hintButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                hintButtonActionPerformed(evt);
            }
        });
        
        this.add(hintButton);      
        moneyDisplay = new JLabel();
        moneyDisplay.setText("REWARD: $"+getMoney.getCurrentMoney()+" out of $1,000,000");
        moneyDisplay.setForeground(java.awt.Color.WHITE);
        moneyDisplay.setFont(new Font("ARIAL",Font.BOLD,18));
        moneyDisplay.setBounds(100, 580, 300, 60);
        this.add(moneyDisplay);
    }                 
  
    private void optionDActionPerformed(ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void optionCActionPerformed(ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                      
    private void hintButtonActionPerformed(ActionEvent evt) 
    {                                         
        try {
            main.eventHandleHintButton();
        } catch (SQLException ex) {
            Logger.getLogger(QuestionTextPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                        

    private void submitButtonActionPerformed(ActionEvent evt) 
    {                                             
        try {
            main.eventHandleSubmitButton();
        } catch (SQLException ex) {
            Logger.getLogger(QuestionTextPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                            

    private void optionBActionPerformed(ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void optionAActionPerformed(ActionEvent evt) {                                        
        // TODO add your handling code here:
    }  
    
    //The method updates the game with each elements in the view.
    public void update(Question question)
    {
        questionTextPane.setText(question.getQuestion());
        optionA.setText(question.getA());
        optionB.setText(question.getB());
        optionC.setText(question.getC());
        optionD.setText(question.getD());     
    }
    
    //The method retrieves the user's choice within the game.
    public String getAnswer()
    {
        
        JRadioButton selectedButton = null;
        
        if(optionA.isSelected())
        {
            selectedButton = optionA;
        }
        else if(optionB.isSelected())
        {
            selectedButton = optionB;
        }
        else if(optionC.isSelected())
        {
            selectedButton = optionC;
        }
        else if(optionD.isSelected())
        {
            selectedButton = optionD;
        }
        
         String choice = selectedButton.getText();
         return choice;
    }       
}


