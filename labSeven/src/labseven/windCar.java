
package labseven;

/**
 *
 * @author Allie
 */
public class windCar {
    
    private double storedEnergyWind = 0;
    
    private int batteryChargerWind;
    
    private double milesTraveledWind;
    
    //constructor 
    
    windCar(double sEW, double mTW, int bCW)
    {
        storedEnergyWind = sEW;
        batteryChargerWind = bCW;
        milesTraveledWind = mTW;
    }
    
    //gets
    
    public double getStoredEnergyWind()
    {
        return storedEnergyWind;
    }
    
    public int getBatteryChargeWind(int i)
    {
        i = batteryChargerWind;
        return batteryChargerWind;
    }
    
    public double getMilesTraveledWind()
    {
        return milesTraveledWind;
    }
    
    
    //sets
    
    public double displayStoredEnergyWind()
    {
        return storedEnergyWind;
    }
    
    public int displayBatteryChargerWind()
    {
        
        return batteryChargerWind;
    }
    
    public double displayMilesTravledWind()
    {
        return milesTraveledWind;
    }    
    
    public double milesTraveledWindCar(int sI, int wS)
    {        
        milesTraveledWind = wS * 5.5;
        
        if(milesTraveledWind < 0)
        {
            return milesTraveledWind = 0;
        }
        else 
        {
            return milesTraveledWind;
        }
        
    }
    
    public double energyStoredWindCar (int sI, int wS)
    {
        if(wS > 0)
        {
            storedEnergyWind = wS * batteryChargerWind * 2.5;
        }
        
        if(milesTraveledWind < 10 && storedEnergyWind > 10)
        {
            storedEnergyWind -= 10;
            milesTraveledWind += 10;
        }
        
        return storedEnergyWind;
        
    }
    
    
}
