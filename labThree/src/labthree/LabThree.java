/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labthree;


import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Allie Kalhorn
 */
public class LabThree {

    /**
     * @param args the command line arguments
     * 
     * 
     */
    public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
        
    System.out.println("Welcome to Lab 3!");
    String response; 
    int sizeInt;
    int [] fillArray;
    
    
    
    do
    {
        sizeInt=arraySize(keyboard);
        
        System.out.println("The original array size is " + sizeInt);

        int[] firstArray = new int[sizeInt];
        fillArray = fillArray(sizeInt, firstArray);
        
        System.out.println(Arrays.toString(fillArray)); 
        
                       
        
        do //loop to do this again 
        {
        System.out.println("Do you want to do this again? (Yes or No only)");
        
        keyboard.nextLine();
        response = keyboard.nextLine();
        
        if(response.equals("Yes") || response.equals("No")) //Yes do it again No get me out
        {
            break;
        }
        else //only say yes or no
        {
            System.out.println("Please enter only \"Yes\" or \"No\".");
        }
        }
        while(!"No".equals(response));
                
    } while(response.equals("Yes"));
    
    } //end main

    public static int arraySize(Scanner keyboard) {
        //get array size, read size and return back to main
        
        System.out.print("Please enter size of original array: ");
        int arrayInt;
        arrayInt = keyboard.nextInt(); 
        return arrayInt; 
        } //end arraySize
    
 
    public static int[] fillArray(int sizeInt, int[] firstArray){
        //fill the array
        for (int i = 0; i < sizeInt; i++)
        {
            firstArray[i] = i;
            // make 0 and 1 -1 in the array
            firstArray[0] = -1;
            firstArray[1] = -1;
        }
        return firstArray; 
        
    } //end fillArray
    
    public static void findPrimes(int[] firstArray) {
        
        
        
    } //end findPrimes
    
    public static int[] printColumns(int[] firstArray){
       for ( int i = 0; i <= 5; i++){
           System.out.print("\n");   
       }
       return firstArray;        
    } //end printColumns
    
    
    
    
} //end class LabThree
