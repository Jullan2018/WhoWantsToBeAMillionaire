/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whowantstobemillionaire;

/**
 * This is the Money class.This class handles an array that stores the money value
 * of each level in the game. This also stores the current Money in each stage the 
 * player is in.
 * 
 * @author 
 * Jullan Quevedo pkd2015 17981982
 * Matt McLuskie hmj5785 15900932
 * 
 */
public class Money 
{
    //stores all the money values in each answered question.
   public int[] prizeMoney = {0,100,200,300,500,1000,2000,4000,8000,16000,32000,64000,125000,250000,500000,1000000};
   
   //updates the money to current level the player is in within the game.
   private int currentMoney;
   
   /**
    * The get method for currentMoney
    * @return currentMoney
    */
   public int getCurrentMoney()
   {
       return this.currentMoney;
   }
   /**
    * The set method for currentMoney which sets the 
    * current prize money to the level the player is in.
    * @param index 
    */
   public void setCurrentMoney(int index)
   {
       this.currentMoney = prizeMoney[index];
   }
   
   public int maxMoney()
   {
       return prizeMoney[15];
   }
       
   /**
    * The default constructor
    */
   public Money()
   {
       this.currentMoney = prizeMoney[0];
   }
   
}
