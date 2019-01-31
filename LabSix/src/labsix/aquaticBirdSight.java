
package labsix;

/**
 *
 * @author Allie
 */
public class aquaticBirdSight {

    private String aqBirdType;
    
    private int birdNum;
    
    private int birdSightNum;
    
    
    //constructor 
    
    aquaticBirdSight(String aBT, int bN, int bSN)
    {
        aqBirdType = aBT;
        birdNum = bN;
        birdSightNum = bSN;
    } //end constructor 

    
    //gets
    
    public String getAqBirdType()
    {
        return aqBirdType;
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
    
    public void printAqObj()
    {
        System.out.println("At " + birdSightNum + " you saw " + birdNum + " " + aqBirdType);
    } //end printOneObj
    
} //end class
