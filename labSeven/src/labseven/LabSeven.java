
package labseven;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Allie Kalhorn
 */
public class LabSeven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Welcome!");
        
        Scanner keyboard = new Scanner(System.in);
        
        Random rng = new Random();
        
        int sI = 0;
        int wS = 0;
        double mTS = 0;
        double sES = 0;
        double mTW = 0;
        double sEW = 0;
        int bCS = 0;
        int bCW = 0;    
        final int NUM_DAYS = 10;
        
        solarCar sC = new solarCar(mTS, sES, bCS);
        windCar wC = new windCar(mTW, sEW, bCW); 
        weather w = new weather(sI, wS);
        
        
        
        chargerQuality(sC, wC, keyboard);
        
        System.out.println("Day  Hour       Wind       Sun         Solar Car      Wind Car");
        System.out.println("               Speed     Intensity    Energy  Miles  Energy   Miles    ");
                
        
        int time = w.getTime();
        
        double sunAvg = 0;
        double windAvg = 0;
        
        double sunMile = 0;
        double windMile = 0;
        
        double solarMiles = 0;
        double solarEnergy = 0;
        
        double windMiles = 0;
        double windEnergy = 0;
        
        for(time = 0; time < (NUM_DAYS * 24); time++)
        {
            w.getTime();
            System.out.print(String.format("%3d", ((time / 24) + 1)));
            System.out.print(String.format("%5d", (time % 24)));
            System.out.print(String.format("%10d", w.getWindSpeed()));
            System.out.print(String.format("%10d", w.getSunIntensity()));
            System.out.print(String.format("%13d", w.getSunIntensity(), w.getWindSpeed()));
            System.out.print("     ");
            sC.milesTravledSolarCar(w.getSunIntensity(), w.getWindSpeed());
            System.out.print(solarMiles);
            System.out.print("     ");
            wC.energyStoredWindCar(w.getSunIntensity(), w.getWindSpeed());
            System.out.print(solarEnergy);
            System.out.print("     ");
            wC.milesTraveledWindCar(w.getSunIntensity(), w.getWindSpeed());
            System.out.print(windEnergy);
            System.out.println("     ");
            System.out.println(windMiles);
            
            solarMiles = solarMiles + sC.displayMilesTravledSolar();
            solarEnergy = solarEnergy + sC.energyStoredSolarCar(w.getSunIntensity(), w.getWindSpeed());
            
            windMiles = windMiles + wC.displayMilesTravledWind();
            windEnergy = windEnergy + wC.energyStoredWindCar(w.getSunIntensity(), w.getWindSpeed());
                    
            
            
            
            sunAvg = sunAvg + w.getSunIntensity();
            windAvg = windAvg + w.getWindSpeed();
            
            sunMile = sunMile + sC.displayMilesTravledSolar();
            windMile = windMile + wC.displayMilesTravledWind();
            
            
        } //end for loop
        
        System.out.print("Average sun intensity: " + sunAvg / 240);
        System.out.println("   Average wind speed: " + windAvg /240);
        
        if(sunMile > windMile)
        {
            System.out.println("The solar car wins!");
        }
        else
        {
            System.out.println("The wind car wins!");
        }
        
        System.out.println("Goodbye!");
    } //end main
    
    
    public static void chargerQuality(solarCar sC, windCar wC, Scanner keyboard)
    {
         System.out.println("What is the quality of the solar car's charger? (1 to 10 only)");
        
        sC.getBatteryChargeSolar(keyboard.nextInt());
        
        System.out.println("What is the quality of the wind car's charger? (1 to 10 only)");
        
        wC.getBatteryChargeWind(keyboard.nextInt());       
    }
    
    
}
