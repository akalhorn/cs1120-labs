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
public class ball {
    
    private int ballSpeed;
    
    private int ballAccuracy;
    
    private static int ballCounter = 1;
    
    //constructor 
    
    ball(int bS, int bA, int bC)
    {
        ballSpeed = bS;
        ballAccuracy = bA;
        ballCounter = bC;
    }//end constructor 
    
    //gets 
    
    public int getBallSpeed(int i)
    {
        ballSpeed = i;
        return ballSpeed;
    }
    
    public int getBallAccuracy(int i)
    {
        ballAccuracy = i;
        return ballAccuracy;
    }
    
    public static int ballCounter()
    {
        ballCounter++;
        return ballCounter;
    }
    
    //print method
    
    public static String printBallStats(int bS, int bA, int bC)
    {
        System.out.print("Ball " + bC + ": Speed is " + bS + ", accuaracy is " + bA);
                
        return ".";
    }
    
    
    
}//end class
