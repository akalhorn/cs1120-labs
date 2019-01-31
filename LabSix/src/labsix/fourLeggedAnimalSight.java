
package labsix;

/**
 *
 * @author Allie
 */
public class fourLeggedAnimalSight {
    
    private String fourLegType;
    
    private int fourLegNum;
    
    private int fourLegSightNum;
    
    
        //constructor 
    
    fourLeggedAnimalSight(String aBT, int bN, int bSN)
    {
        fourLegType = aBT;
        fourLegNum = bN;
        fourLegSightNum = bSN;
    } //end constructor

    
    //gets
    
    public String getFourLeggedAnimalType()
    {
        return fourLegType;
    }
    
    public int getfourLegNum()
    {
        return fourLegNum;
    }
    
    public int getFourLegSightNum()
    {
        return fourLegSightNum;
    }
    
    
    //prints one obj
    
    public void printFourObj()
    {
        System.out.println("At " + fourLegSightNum + " you saw " + fourLegNum + " " + fourLegType);
    } //end printOneObj
    
} //end class
