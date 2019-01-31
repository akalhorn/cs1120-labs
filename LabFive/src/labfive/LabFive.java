package labfive;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 *
 * @author Allie
 * 
 * 
 * this lab creates a department store from a text file, taking the first word
 * from every line to create the departments and all other words as the things
 * that are sold in the section
 * 
 */
public class LabFive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        //name the store and print it out
        
        Scanner keyboard = new Scanner(System.in);
        String response;
        
        System.out.print("Please enter a name for your department store: ");
        response = keyboard.nextLine();
        
        System.out.println("Here are the sections in the store \"" + response + "\"");        
        
        //initialize the number of sections
        final int NUM_SECTIONS = 5;
        
        departments dep = new departments();
        
        dep.intializeMySections(NUM_SECTIONS);
        
        //get file
        
        File storesFile = new File("sections.txt");
        Scanner scanStores = new Scanner(storesFile);
        
        //use methods to read file, sort sections, and print sections
        readFile(scanStores, dep);
        dep.sortMySections();
        dep.printSections();
        
    } //end main
    
    public static void readFile(Scanner scanStores, departments d)
    {
        int index = 0;
        
        while(scanStores.hasNext())
        {
            Scanner scanOne = new Scanner(scanStores.nextLine());
            
            d.getMySections()[index].setName(scanOne.next());
           
            while(scanOne.hasNext())
            {
                
              d.getMySections()[index].getSections().add(scanOne.next());
                                
            }//end innder while
            
            index ++;
            
        }//end outer while
        
    }//end method readFile
    
} //end class labFive
