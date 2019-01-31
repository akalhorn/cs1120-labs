
package finalexam;

import java.util.Random;

/**
 *
 * @author Allie Kalhorn
 * 
 * The purpose of this lab is to simulate a jedi trainee practicing with a lightsaber in
 * one class, simulate the ball they're practicing with in another, and to put it together
 * in main so both classes are working together for practice time
 * 
 */
public class FinalExam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Random rng = new Random();
        
        int jF = 0;
        int jS = 0;
        int jC = 1;
        int bS = 0;
        int bA = 0;
        int bC = 1;
        
        final int NUM_TRIES = 9;
        
        
        jedi j = new jedi(jF, jS, jC);
        ball b = new ball(bS, bA, bC);
        
                
        
        int i = 0;
        int ballWin = 0;
        int jediWin = 0;
        int ballWinTotal = 0;
        int jediWinTotal = 0;
        
        for(i = 0; i <= NUM_TRIES; i++)
        {
            System.out.println(j.printJediStats(j.getForceStrength(rng.nextInt(11)), j.getJedispeed(rng.nextInt(6)), jC));
            jC++;
            System.out.println(b.printBallStats(b.getBallSpeed(rng.nextInt(11)), b.getBallAccuracy(rng.nextInt(6)), bC));
            bC++;
            whoWins(j.getForceStrength(rng.nextInt(11)), 
                    j.getForceStrength(rng.nextInt(6)), 
                    b.getBallSpeed(rng.nextInt(11)), 
                    b.getBallAccuracy(rng.nextInt(6)), 
                    rng, jediWin, ballWin, jediWinTotal, ballWinTotal);
            
                       
            System.out.println(" ");
                
        }
        
      // System.out.println("Final score: Jedi " + jediWinTotal + ", Ball " + ballWinTotal + ".");
       
        
    }//end main
    
    public static void whoWins(int jF, int jS, int bS, int bA, Random rng, int jW, int bW, int jWT, int bWT)
    {
        // method to determine if the ball or the jedi wins
        
        
        int i = 0;
        
        jW = 0;
        bW = 0;
        jWT = 0;
        bWT = 0;
                
        for(i = 0; i <= 5; i++)
        {
            if(jF * jS * rng.nextInt(4) > bS * bA * rng.nextInt(4))
            {
                System.out.println("Blocked!");
                jW++;
            }
            else
            {
                System.out.println("Zapped!");
                bW++;
            }
        }//end for loop
        
        if(jW > bW)
        {
            System.out.println("Jedi wins!");
            jWT++;
        }
        else
        {
            System.out.println("Ball wins :(.");
            bWT++;
        }
        
        
            
        
    }//end who wins
    
    
}//end class
