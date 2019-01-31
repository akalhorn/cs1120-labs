/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labfour;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Allie Kalhorn
 * 
 * This lab will take the strings from files with animal names and animal sounds
 * and put them together randomly, then put the correct sound with the correct animal
 * 
 */
public class LabFour {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        //declaring variables 
        int animalFileSize;
        File animals = new File("animals.txt");
        Scanner scanAnimals = new Scanner(animals);
        
        int soundFileSize;
        File sounds = new File("sounds.txt");
        Scanner scanSounds = new Scanner(sounds);
        
        Scanner keyboard = new Scanner(System.in);
        
        String response;
        
        //pulls array size from method
        animalFileSize = arraySize(animals, scanAnimals);
        soundFileSize = arraySize(sounds, scanSounds);
                
        //pulls array filled from method
        String[] animalArray = new String[animalFileSize];
        animalArray = arrayFill(animals, scanAnimals, animalFileSize);
        
        String[] soundArray = new String[soundFileSize];
        soundArray = arrayFill(sounds, scanSounds, soundFileSize);
        
        System.out.println("Animals array:");
        arrayPrint(animalArray);
          
        System.out.println("Sounds array:");  
        arrayPrint(soundArray);
        
          
        do{
        
            arrayRandom(animalArray, soundArray);
            
            System.out.println("Do you want to do this again?");
            
           response = keyboard.nextLine();        
        } 
       while (response.equals("y") || response.equals("Y") || response.equals("yes") || response.equals("Yes"));
       
        System.out.println("Goodbye");
        
    } //end main
    
    public static int arraySize(File newFile, Scanner newScanner){
        //reads array size from file        
        int i = 0;
        File x = newFile;
        Scanner y = newScanner;
        
        while(y.hasNextInt()){
            i = y.nextInt();                           
        }  
        
        return i;
        
    } //end arraySize
    
    public static String[] arrayFill(File arrayFile, Scanner arrayScanner, int arraySize)
    {
        //fills text into the array
        
        int fileIndex = 0;
        int size = arraySize;
        
        File a = arrayFile;
        Scanner z = arrayScanner;
        
        String[] arrayFill = new String[size];
        
        String nextWord;
        
        z.nextLine();
        while(z.hasNext()){
            
            arrayFill[fileIndex] = z.nextLine();
            fileIndex++;
        }
                
        return arrayFill;
        
    } //end arrayFill
    
    public static void arrayPrint(String[] array){
        //method to print array
        
        for (int i = 0; i < array.length ; i++)
        {
            System.out.println(array[i]);
        }
        
    } //end arrayPrint
    
    public static void arrayRandom(String[] arrayA, String[] arrayS){
        //method to print a random string from text file from array
        
       Random rand = new Random();
       int randomAnimal = rand.nextInt(arrayA.length);
       
       int randomSound = rand.nextInt(arrayS.length);
       
       System.out.println("Does a " + arrayA[randomAnimal] + " say, \"" + arrayS[randomSound] + "\"? No, a " + arrayA[randomAnimal] + " says, \"" + arrayS[randomAnimal] + ".\"");
        
    } //end arrayRandom
    
    
} //end class
