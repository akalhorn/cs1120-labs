
package labseven;

import java.util.Random;

/**
 *
 * @author Allie
 */
public class weather {
    
    Random rng = new Random();
    
    int solarMin = 0;
    int solarMax = 10;
    int windMin = -10;
    int windMax = 10;
    
    int solarRand = rng.nextInt(solarMax - solarMin) + solarMin;
    int windRand = rng.nextInt(windMax - windMin) + windMin;
            
    private int windSpeed;
    
    private int sunIntensity; 
    
    public static int time = -1;
    
    //constructor 
    
    weather(int sI, int wS)
    {
        windSpeed = wS;
        sunIntensity = sI;   
    }
    
    
    
    //gets
   
        public static int getTime()
    {
        time++;
        if(time >= 24)
        {
            time = 0;
        }
        
        return time;
    }
    
    
    
    public int getWindSpeed()
    {
        windRand = rng.nextInt(windMax - windMin) + windMin;
        windSpeed = windRand;
        return windSpeed;
    }
    
    public int getSunIntensity()
    {
        if(time <= 6 || time >= 23)
        {
            sunIntensity = 0;
            return sunIntensity;
        }
        else
        { 
            solarRand = rng.nextInt(solarMax - solarMin) + solarMin;
            sunIntensity = solarRand;
        }
        
        
        return sunIntensity;
    }
    

    public int displayWindSpeed()
    {
        return windSpeed;
    }
    
    public int displaySunIntensity()
    {
        return sunIntensity;
    }
    
    public int displayTime()
    {
        return time;
    }

}
