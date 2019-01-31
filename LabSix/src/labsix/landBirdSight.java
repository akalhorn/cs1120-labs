
package labsix;

/**
 *
 * @author Allie
 */
public class landBirdSight {
    
    private String lndBirdType;
    
    private int birdNum;
    
    private int birdSightNum;
    
    
        //constructor 
    
    landBirdSight(String lBT, int bN, int bSN)
    {
        lndBirdType = lBT;
        birdNum = bN;
        birdSightNum = bSN;
    } //end constructor 

    
    //gets
    
    public String getLndBirdType()
    {
        return lndBirdType;
    }
    
    public int getBirdNum()
    {
        return birdNum;
    }
    
    public int getBirdSightNum()
    {
        return birdSightNum;
    }
    
    
    //prints one obj
    
    public void printLndObj()
    {
        System.out.println("At " + birdSightNum + " you saw " + birdNum + " " + lndBirdType);
    } //end printOneObj
    
} //end class
