/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whowantstobemillionaire;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * This DBConnection is a class that connects the Derby Database to the java
 * game. This class also has a method that returns the questionText that to be displayed in 
 * the Panel.
 * 
 * Jullan Quevedo pkd2015 17981982
 * Matt McLuskie hmj5785 15900932
 */
public class DBConnection 
{
    private Connection conn;
    private static String dbURL = "jdbc:derby://localhost:1527/QuestionsDB"; 
   
    public DBConnection()
    {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
  
        try {  
            //Establishes a connection with the "PDC" database.
            conn = DriverManager.getConnection(dbURL, "pdc", "pdc");
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //This method is responsible for retrieving the question in the game in the database.
    public Question getQuestion(int questionNumber)
    {
         String query = " SELECT * FROM QUESTION q,CHOICE c, HINT h " 
                        + " WHERE h.HINTID = q.QUESTIONID AND c.CHOICEID = q.QUESTIONID AND"
                            +    " q.QUESTIONID =" +questionNumber;
         
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            rs.next();
            return new Question(rs.getString("QUESTIONTEXT"),rs.getString("CHOICEA"),rs.getString("CHOICEB"),rs.getString("CHOICEC"),rs.getString("CHOICED"),rs.getString("ANSWER"),rs.getString("HINTTEXT"));
            
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
}
