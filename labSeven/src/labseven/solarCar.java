
package labseven;

/**
 *
 * @author Allie
 */
public class solarCar {
    
    private double storedEnergySolar = 0;
    
    private int batteryChargerSolar; 
    
    private double milesTraveledSolar;
    
    
    //constructor 
    
    solarCar(double sES, double mTS, int bCS)
    {
        storedEnergySolar = sES;
        batteryChargerSolar = bCS;
        milesTraveledSolar = mTS;
    }
    
    //gets 
    
    public double getStoredEnergySolar()
    {
        return storedEnergySolar;
    }
    
    public int getBatteryChargeSolar(int i)
    {
        i = batteryChargerSolar;
        return batteryChargerSolar;
    }
    
    public double getMilesTraveledSolar()
    {
        return milesTraveledSolar;
    }
    
    //sets
    
    public double displayStoredEnergySolar()
    {
        return storedEnergySolar;
    }
    
    public int displayBatteryChargerSolar()
    {
        
        return batteryChargerSolar;
    }
    
    public double displayMilesTravledSolar()
    {
        return milesTraveledSolar;
    }
    
    public double milesTravledSolarCar(int sI, int wS)
    {
        
        milesTraveledSolar = (sI * 5) + (wS * .5);
        
        
        if(milesTraveledSolar < 0)
        {
            return milesTraveledSolar = 0;
        }
        else
        {
            return milesTraveledSolar;
        }
        
        
    }
    
    public double energyStoredSolarCar(int sI, int wS)
    {
        storedEnergySolar = sI * batteryChargerSolar;
        
        if(milesTraveledSolar < 10 && storedEnergySolar > 10)
        {
            storedEnergySolar -= 10;
            milesTraveledSolar += 10;
        }
        
        return storedEnergySolar;
    }
}
