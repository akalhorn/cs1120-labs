/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmeticlab;

import java.util.Scanner;

/**
 *
 * @author Alu
 */
public class ArithmeticLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int varOne;
        int varTwo;
        int varAdd;
               
        //program takes two integers and adds, subtracts, multiplies, or divides two integers input by the user
        
        System.out.println("Hello, welcome to Lab One!");
        
        Scanner keyboard = new Scanner(System.in);
        //read input from the keyboard to store values as integers 
        
        //addition with two integers
        System.out.println("Performing adition with two integers:");
        System.out.print("Please enter a variable: ");
        varOne = keyboard.nextInt(); 
        System.out.print("Please enter a second variable: ");
        varTwo = keyboard.nextInt();
        varAdd = varOne + varTwo;
        System.out.print(varOne); 
        System.out.print(" + ");
        System.out.print(varTwo);
        System.out.print(" = ");
        System.out.println(varAdd); 
        
        //subtraction with two integers 
        System.out.println("Performing subtraction with two integers:");
        System.out.print("Please enter a variable: ");
        int varThree = keyboard.nextInt();
        System.out.print("Please enter a second variable: ");
        int varFour = keyboard.nextInt();
        int varSub = varThree - varFour;
        System.out.print(varThree);
        System.out.print(" - ");
        System.out.print(varFour);
        System.out.print(" = ");
        System.out.println(varSub);
        
        //multiplication with two integers
        System.out.println("Performing subtraction with two integers:");
        System.out.print("Please enter a variable: ");
        int varFive = keyboard.nextInt();
        System.out.print("Please enter a second variable: ");
        int varSix = keyboard.nextInt();
        int varMult = varFive * varSix;
        System.out.print(varFive);
        System.out.print(" * ");
        System.out.print(varSix);
        System.out.print(" = ");
        System.out.println(varMult);
        
        //division with two integers
        System.out.println("Performing subtraction with two integers:");
        System.out.print("Please enter a variable: ");
        int varSeven = keyboard.nextInt();
        System.out.print("Please enter a second variable greater than zero: ");
        int varEight = keyboard.nextInt();
        int varDiv = varSeven / varEight;
        System.out.print(varSeven);
        System.out.print(" / ");
        System.out.print(varEight);
        System.out.print(" = ");
        System.out.println(varDiv);
        
        System.out.println("Thank you! Goodbye.");
             
               
        
        
        
    }
    
}
