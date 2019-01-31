
package labsix;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Allie Kalhorn
 */
public class LabSix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.print("Welcome! How long is your hike today? ");
        
        int mins = howManyMins();
        
        System.out.println("Your hike is: " + mins + " minutes. You found: ");
        
        Random rng = new Random();
        
        wildLifeReport wLR = new wildLifeReport();
        
        theHike(rng, mins, wLR);
        
        System.out.println("Aquatic Birds:");
        wLR.displayAqBirdSight();
        System.out.println("Land Birds:");
        wLR.displayLndBirdSight();
        System.out.println("Four Legged Animals:");
        wLR.displayFourLegSight();
        
        wLR.displayTotals();
        
        System.out.println("Goodbye!");
        
    } //end main
    
    
    public static int howManyMins ()
    {
        Scanner keyboard = new Scanner (System.in);
        
        int min;
        
        min = keyboard.nextInt();
        
        return min;
    }
    
    public static void theHike (Random rng, int min, wildLifeReport wLR)
    {
        wLR.setMinSight(min);
        
        for (int i = 1; i <= min; i++)
        {
            int randomInt = rng.nextInt(100) + 1;
            
            if (randomInt < 6)
            {
                foundAqBird(rng, i, wLR);
            }
            else if (randomInt< 11)
            {
                foundLndBird(rng, i, wLR);
            }
            else if (randomInt < 16)
            {
                foundFourLeggedAnimal(rng, i, wLR);
            }
            
            
        }//for loop
        
        
    } //end method theHike
    
    public static void foundAqBird (Random rng, int min, wildLifeReport wLR)
    {
        int randomInt = rng.nextInt(3);
        
        switch(randomInt)
        {
            case 0:
                int randInt0 = rng.nextInt(4) + 2;
                wLR.setAnimalSight(randInt0);
                aquaticBirdSight aqB0 = new aquaticBirdSight ("ducks", randInt0, min);
                wLR.getAqBirdSight().add(aqB0);
                break;
                
            case 1:
                int randInt1 = rng.nextInt(4) + 2;
                wLR.setAnimalSight(randInt1);
                aquaticBirdSight aqB1 = new aquaticBirdSight("geese", randInt1, min);
                wLR.getAqBirdSight().add(aqB1);
                break;
                
            case 2:
                int randInt2 = rng.nextInt(4) + 2;
                wLR.setAnimalSight(randInt2);
                aquaticBirdSight aqB2 = new aquaticBirdSight("swans", randInt2, min);
                wLR.getAqBirdSight().add(aqB2);
                
            default:
               
                break;
                
        }//end switch
        
    }//end foundAqBird
    
    
    public static void foundLndBird (Random rng, int min, wildLifeReport wLR)
    {
        int randomInt = rng.nextInt(4);
        
        switch(randomInt)
        {
            case 0:
                int randInt0 = rng.nextInt(4) + 2;
                wLR.setAnimalSight(randInt0);
                landBirdSight lndB0 = new landBirdSight ("robins", randInt0, min);
                wLR.getLndBirdSight().add(lndB0);
                break;
                
            case 1:
                int randInt1 = rng.nextInt(4) + 2;
                wLR.setAnimalSight(randInt1);
                landBirdSight lndB1 = new landBirdSight("sparrows", randInt1, min);
                wLR.getLndBirdSight().add(lndB1);
                break;
                
            case 2:
                int randInt2 = rng.nextInt(4) + 2;
                wLR.setAnimalSight(randInt2);
                landBirdSight lndB2 = new landBirdSight("cardinals", randInt2, min);
                wLR.getLndBirdSight().add(lndB2);
                
                
            case 3:
                int randInt3 = rng.nextInt(4) + 2;
                wLR.setAnimalSight(randInt3);
                landBirdSight lndB3 = new landBirdSight("blackbirds", randInt3, min);
                wLR.getLndBirdSight().add(lndB3);    
                
            default:
               
                break;
                
        }//end switch
        
    }//end foundLndBird
    
    
    
    public static void foundFourLeggedAnimal (Random rng, int min, wildLifeReport wLR)
    {
        int randomInt = rng.nextInt(4);
        
        switch(randomInt)
        {
            case 0:
                int randInt0 = rng.nextInt(4) + 2;
                wLR.setAnimalSight(randInt0);
                fourLeggedAnimalSight fLA0 = new fourLeggedAnimalSight ("deer", randInt0, min);
                wLR.getFourLegSight().add(fLA0);
                break;
                
            case 1:
                int randInt1 = rng.nextInt(4) + 2;
                wLR.setAnimalSight(randInt1);
                fourLeggedAnimalSight fLA1 = new fourLeggedAnimalSight("gray squirrels", randInt1, min);
                wLR.getFourLegSight().add(fLA1);
                break;
                
            case 2:
                int randInt2 = rng.nextInt(4) + 2;
                wLR.setAnimalSight(randInt2);
                fourLeggedAnimalSight fLA2 = new fourLeggedAnimalSight("black squirrels", randInt2, min);
                wLR.getFourLegSight().add(fLA2);
                
                
            case 3:
                int randInt3 = rng.nextInt(4) + 2;
                wLR.setAnimalSight(randInt3);
                fourLeggedAnimalSight fLA3 = new fourLeggedAnimalSight("brown squirrels", randInt3, min);
                wLR.getFourLegSight().add(fLA3);    
                
            default:
            
                break;
                
        }//end switch
        
    }//end fourLeggedAnimalSight
    
} //end class 
