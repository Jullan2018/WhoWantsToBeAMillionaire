/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whowantstobemillionaire;
/**
 * This is the Question class, this handles and assigns the different elements 
 * of a question.
 * 
 * @author 
 * Jullan Quevedo pkd2015 17981982
 * Matt McLuskie hmj5785 15900932
 * 
 */
public class Question 
{
    private final String question;
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String answer;
    private final String hint;
   
    public Question(String question, String a, String b, String c, String d, String answer, String hint) {
        this.question = question;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.answer = answer;
        this.hint = hint;
       
    }
    /**
     * The get method for question.
     * @return question.
     */
   
    public String getQuestion() 
    {
       return this.question;
    }
    /**
     * The get method for option a.
     * @return a
     */
    
    public String getA() 
    {
       return this.a;
    }
     /**
     * The get method for option b.
     * @return b
     */
    public String getB()
    {
        return this.b;
    }
     /**
     * The get method for option c.
     * @return c
     */
    public String getC()
    {
        return this.c;
    }
     /**
     * The get method for option d.
     * @return d
     */
    public String getD() 
    {
        return this.d;
    }
    /**
     * The get method for answer.
     * @return answer
     */
    public String getAnswer() 
    {
        return this.answer;
    }
    /**
     * The get method for hint.
     * @return  hint
     */
    public String getHint() {
        return this.hint;
    }
}
