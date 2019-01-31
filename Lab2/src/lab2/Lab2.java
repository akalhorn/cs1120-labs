/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Scanner;

/**
 *
 * @author Allie Kalhorn
 */
public class Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* This program is meant to resemble ordering food at a cafe
           providing food options, toppings and price to the customer
        */
        
        Scanner keyboard = new Scanner(System.in);
        
        //variables used in code for price
        int burgerPrice = 10;
        int tomatoPrice = 3;
        int onionPrice = 4;
        
        int pizzaPrice = 15;
        int pepperPrice = 5;
        int mushPrice = 6;
        
        int iceCreamPrice = 20;
        int syrupPrice = 7;
        int creamPrice = 8;
        
        int totalCost = 0;
       
        
        System.out.println("Hello! Welcome to the Cozy Cafe!");
        
        //burger
        System.out.println("Would you like a burger?");
        System.out.println("Answer \"Yes\" or \"yes\". If not enter anything else.");
        String response;
        response = keyboard.nextLine();
        
        //yes they want a burger
        if (response.equals("yes") || response.equals("Yes"))
        {   //toppings: burger
            
            System.out.println("Would you like to order a topping?");
            System.out.print("If so type \"tomato\" or \"onion\". ");
            System.out.println("If not type anything else.");
            response = keyboard.nextLine(); 
            
            if (response.equals("tomato") || response.equals("tomatoes"))
            {   //they want tomato
                System.out.print("Okay you have ordered a burger with tomato for ");
                System.out.print(burgerPrice + tomatoPrice);
                System.out.println(" cents");
                totalCost += burgerPrice + tomatoPrice;
            }
            
            else if (response.equals("onion") || response.equals("onions"))
            {   //they want onion
                System.out.print("Okay you have ordered a burger with onion for ");
                System.out.print(burgerPrice + onionPrice);
                System.out.println(" cents.");  
                totalCost += burgerPrice + onionPrice;
            }
            
            else 
            {   //they don't want either topping
                System.out.print("Sorry we don't put " + response);
                System.out.println(" on our burgers.");
                System.out.print("You have ordered a burger with no toppings for ");
                System.out.print(burgerPrice);
                System.out.println(" cents.");
                totalCost += burgerPrice;
            } 
            
        }
        
         // pizza    
        System.out.println("Would you like a pizza?"); 
        System.out.println("Answer \"Yes\" or \"yes\". If not enter anything else");
        response = keyboard.nextLine();
        
        //yes they want a pizza
        if (response.equals("yes") || response.equals("Yes"))
        {   //what topping on the pizza
            
           System.out.println("Would you to order a topping?");
           System.out.print("If so, enter \"green pepper\" or \"mushroom\". ");
           System.out.println("If not enter anything else.");
           response = keyboard.nextLine();
           
           if (response.equals("green pepper") || response.equals("green peppers"))
           {    //they want green pepper
               System.out.print("You have ordered a pizza with green pepper for ");
               System.out.print(pizzaPrice + pepperPrice);
               System.out.println(" cents.");
               totalCost += pizzaPrice + pepperPrice;
           }
           
           else if (response.equals("mushroom") || (response.equals("mushrooms")))
            {  //they want mushroom
               System.out.print("You have ordered a pizza with mushroom for ");
               System.out.print(pizzaPrice + mushPrice);
               System.out.println(" cents.");
               totalCost += pizzaPrice + mushPrice;
            }
           
            else
           {    //they don't want any toppings
               System.out.print("You have ordered a pizza with no topping for ");
               System.out.print(pizzaPrice);
               System.out.println(" cents.");
               totalCost+= pizzaPrice;
           }   
           
           
        }
           
        // ice cream
        System.out.println("Would you like ice cream?");
        System.out.println("Answer \"Yes\" or \"yes\". If not enter anything else");
        response = keyboard.nextLine();
        if (response.equals("yes") || response.equals("Yes"))
        {   //yes they want ice cream
          System.out.println("Would you to order a topping?");
          System.out.print("If so, enter \"chocolate syrup\" or \"whipped cream\". ");
          System.out.println("If not enter anything else.");
          response = keyboard.nextLine();
          
           if (response.equals("chocolate syrup"))
           {    //they want chocolate syrup
               System.out.print("You have ordered an ice cream with chocolate syrup for ");
               System.out.print(iceCreamPrice + syrupPrice);
               System.out.println(" cents.");
               totalCost += iceCreamPrice + syrupPrice;
           }
           
           else if (response.equals("whipped cream"))
            {  //they want whipped cream
               System.out.print("You have ordered an ice cream with whipped cream for ");
               System.out.print(iceCreamPrice + creamPrice);
               System.out.println(" cents.");        
               totalCost += iceCreamPrice + creamPrice;
            }
           
            else
           {    //they don't want any toppings
               System.out.print("You have ordered an ice cream with no topping for ");
               System.out.print(iceCreamPrice);
               System.out.println(" cents.");
               totalCost += iceCreamPrice;
           }             
        }
        
        //total and goodbye
        System.out.print("Your total is: ");
        System.out.print(totalCost);
        System.out.println(" cents.");
        System.out.println("Goodbye!");
       
        
        
        
    //LAB PART 2B ONLY USING SWITCH STATEMENTS
    
    System.out.println("LAB PART 2B SWITCH STATEMENT ONLY");
    
    //cafe welcome
        System.out.println("Welcome to the cozy Cafe!");
        System.out.print("Would you like to order ice cream?");
        System.out.println(" Type \"Yes\" or \"yes\". If not enter anything else.");
       
        // setting up variables to use in the switch
        String yesCream = keyboard.nextLine();
        String yesTop;
        int bCost = 0;
        
        
        
        switch (yesCream)
        {
            case "Yes":
            { //yes they want ice cream 
                
                System.out.println("Would you like to order a topping?");
                System.out.print("If so, enter \"chocolate syrup\" or \"whipped cream\".");
                System.out.println(" If not, enter anything else.");
                yesTop = keyboard.nextLine();
                switch (yesTop)
                { 
                   
                    case "chocolate syrup":
                    {//yes they want chocolate syrup
                        
                        System.out.print("You have ordered an ice cream with chocolate syrup for ");
                        System.out.print(iceCreamPrice + syrupPrice);
                        System.out.println(" cents.");
                        bCost += iceCreamPrice + syrupPrice;
                        System.out.println("Your total is: " + bCost + " cents.");
                        break;
                        
                    }
                    
                    case "whipped cream":
                    { //yes they want whipped cream
                        
                       System.out.print("You have ordered an ice cream with whipped cream for ");
                        System.out.print(iceCreamPrice + creamPrice);
                        System.out.println(" cents.");
                        bCost += iceCreamPrice + creamPrice;
                        System.out.println("Your total is: " + bCost + " cents.");
                        break; 
                    }
                    
                    default:
                    { //no they don't want toppings
                        
                        System.out.println("We do not put " + yesTop + " on ice cream");
                        System.out.println("You have ordered an ice cream for " + iceCreamPrice + " cents.");
                        bCost += iceCreamPrice;
                        System.out.println("Your total is: " + bCost + " cents.");
                        break;
                    }
                }
                
               break; 
            }
            
            case "yes":
            { //yes they want ice cream 
                
                System.out.println("Would you like to order a topping?");
                System.out.print("If so, enter \"chocolate syrup\" or \"whipped cream\".");
                System.out.println(" If not, enter anything else.");
                yesTop = keyboard.nextLine();
                switch (yesTop)
                {
                    case "chocolate syrup":
                    { //yes they want chocolate syrup 
                        
                        System.out.print("You have ordered an ice cream with chocolate syrup for ");
                        System.out.print(iceCreamPrice + syrupPrice);
                        System.out.println(" cents.");
                        bCost += iceCreamPrice + syrupPrice;
                        System.out.println("Your total is: " + bCost + " cents.");
                        break;
                        
                    }
                    
                    case "whipped cream":
                    { //yes they want whipped cream 
                        
                       System.out.print("You have ordered an ice cream with whipped cream for ");
                        System.out.print(iceCreamPrice + creamPrice);
                        System.out.println(" cents.");
                        bCost += iceCreamPrice + creamPrice;
                        System.out.println("Your total is: " + bCost + " cents.");
                        break; 
                    }
                    
                    default:
                    { //no they don't want toppings
                        
                        System.out.println("We do not put " + yesTop + " on ice cream");
                        System.out.println("You have ordered an ice cream for " + iceCreamPrice + " cents.");
                        bCost += iceCreamPrice;
                        System.out.println("Your total is: " + bCost + " cents.");
                        break;
                    }
                }
                
                break;
            }
            
            default:
            { //no they don't want ice cream
                
                System.out.println("Your total cost is zero cents");
                break;
            }
        }
        //cafe goodbye
        
        System.out.println("Goodbye!");
    }
    

    
    
}
