/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalexam;

/**
 *
 * @author Allie Kalhorn
 */
public class jedi {
    
    private int forceStrength;
    
    private int jediSpeed;
    
    private static int jediCadets = 1;
    
    //constructor 
    
    jedi(int fS, int jS, int jC)
    {
        forceStrength = fS;
        jediSpeed = jS;
        jediCadets = jC;

        if(forceStrength > 10)
        {
            System.out.println("The force is strong in this one.");
        }
    } //end constructor 
    
    //gets
    
    public int getForceStrength(int i)
    {
        forceStrength = i;
        return forceStrength;
    }
    
    public int getJedispeed(int i)
    {
        jediSpeed = i;
        return jediSpeed;
    }
    
    public static int cadetCounter()
    {
        jediCadets++;
        return jediCadets;
    }
    
    //print method 
    
    public static String printJediStats(int fS, int jS, int jC)
    {
        System.out.print("Cadet " + jC + ": Force is " + fS + ", speed is " + jS);
        
        return ".";       
    }
    
}//end class
