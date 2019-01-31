
package labsix;

import java.util.ArrayList;
        
/**
 *
 * @author Allie
 */
public class wildLifeReport {
    
    private ArrayList<aquaticBirdSight> aqBirdSight;
    private ArrayList<landBirdSight> lndBirdSight;
    private ArrayList<fourLeggedAnimalSight> fourLegSight;
    
    private int totalAnimalSight;
    private int minSight;
    
    //constructor
    
    wildLifeReport()
    {
        aqBirdSight = new ArrayList<>();
        lndBirdSight = new ArrayList<>();
        fourLegSight = new ArrayList<>();
        
        totalAnimalSight = 0;
        minSight = 0;
        
    }
    
    // gets
    
    public ArrayList<aquaticBirdSight> getAqBirdSight()
    {
        return aqBirdSight;
    }
    
    public ArrayList<landBirdSight> getLndBirdSight()
    {
        return lndBirdSight;
    }
    
    public ArrayList<fourLeggedAnimalSight> getFourLegSight()
    {
        return fourLegSight;
    }
    
    //sets
    
    public void setMinSight (int min)
    {
        minSight = min;
    }
    
    public void setAnimalSight (int tot)
    {
        totalAnimalSight = tot;
    }
    
    //display ArrayList
    
    public void displayAqBirdSight()
    {
        for(int i = 0; i < aqBirdSight.size(); i++)
        {
            aqBirdSight.get(i).printAqObj();
        }
    }
    
    public void displayLndBirdSight()
    {
        for(int i = 0; i < lndBirdSight.size(); i++)
        {
            lndBirdSight.get(i).printLndObj();
        }
    }
    
    public void displayFourLegSight()
    {
        for(int i = 0; i < fourLegSight.size(); i++)
        {
            fourLegSight.get(i).printFourObj();
        }
    }
    
    public void displayTotals()
    {
        
        System.out.println("Full Report:");
        
        int aqBirdIndex = 0;
        int lndBirdIndex = 0;
        int fourLegIndex = 0;
        
        for (int i = 1; i <= minSight; i++)
        {
            if (aqBirdSight.size() > 0)
            {
                if (aqBirdSight.get(aqBirdIndex).getBirdSightNum() == i)
                {
                    aqBirdSight.get(aqBirdIndex).printAqObj();
                    if(aqBirdIndex < aqBirdSight.size() - 1)
                    {
                        
                        aqBirdIndex++;
                        
                    } //if 3
                    
                } //if 2
                
            } //if 1
            
            
            if (lndBirdSight.size() > 0)
            {
                if (lndBirdSight.get(lndBirdIndex).getBirdSightNum() == i)
                {
                    lndBirdSight.get(lndBirdIndex).printLndObj();
                    if(lndBirdIndex < lndBirdSight.size() - 1)
                    {
                        
                        lndBirdIndex++;
                        
                    } //if 3
                    
                } //if 2
                
            } //if 1
            
            
            if (fourLegSight.size() > 0)
            {
                if (fourLegSight.get(fourLegIndex).getFourLegSightNum() == i)
                {
                    fourLegSight.get(fourLegIndex).printFourObj();
                    if(fourLegIndex < fourLegSight.size() - 1)
                    {
                        
                        fourLegIndex++;
                        
                    } //if 3
                    
                } //if 2
                
            } //if 1
            
        } //end for loop
        
        
    }//end display totals
    
    
    
    
} //end class
