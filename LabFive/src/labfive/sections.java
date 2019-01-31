package labfive;

import java.util.ArrayList;
/**
 *
 * @author Allie
 */
public class sections {
    
    private String name;
    
    private ArrayList<String> sections = new ArrayList<String>();

    //sets
    
    public void setName(String n)
    {
        name = n;
    } //end method setName

    //gets
    
    public String getName()
    {
        return name;
    }//end method getName
    
    public ArrayList<String> getSections()
    {
        //gets sections array
        
        return sections;
    }//end method getSections

    public void printSections()
    {
        //prints sections in a sentence
        
        System.out.print("The " + name + " section sells these items: ");
        
        for(int i = 0; i < sections.size(); i++)
                
        {
            System.out.print(sections.get(i)+" ");
            
            
        }//end for loop
       System.out.println("");
    }//end printSections
    
}//end class sections

