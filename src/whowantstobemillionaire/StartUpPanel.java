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
 * This is the StartUpPanel, the start up panel is a JPanel that 
 * is the main menu within the game.
 * 
 * Jullan Quevedo pkd2015 17981982
 * Matt McLuskie hmj5785 15900932
 */
public class StartUpPanel extends JPanel
{
    WhoWantsToBeMillionaire main;
    private final JLabel gameTitle;   
    private final JButton startButton;
    private final JTextArea text;
    
    public StartUpPanel(WhoWantsToBeMillionaire newMain)
    {
        main = newMain;    
        this.setLayout(null);
        
        gameTitle = new JLabel("WHO WANTS TO BE A MILLIONAIRE");
        this.gameTitle.setBounds(50, 50, 800, 200);
        this.gameTitle.setFont(new Font("ARIAL",Font.BOLD,40));
        this.add(gameTitle);
        
        this.startButton = new JButton("START GAME");
          startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });
        this.startButton.setBounds(250, 400, 300, 100);
        this.startButton.setFont(new Font("ARIAL",Font.BOLD,32));
        this.add(startButton);
        
        this.text = new JTextArea();
        this.text.setBounds(200, 190, 400, 200);
        this.text.setText(" - Welcome to Who Wants to Be A Millionaire" + "\n"
                        + " - Read each question carefully." + "\n" + 
                          " - There's $1 Million Dollar on the online!" + "\n"
                        + " - Press START GAME to begin the game."+ "\n\n\n" + "  GOOD LUCK!");
        this.text.setFont(new Font("ARIAL",Font.BOLD,18));
        this.add(text);      
    }
    
    private void startButtonActionPerformed(ActionEvent evt) 
    {
        try {
            main.eventHandleStartButton();
        } catch (SQLException ex) {
            Logger.getLogger(StartUpPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }       
}
