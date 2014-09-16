

/**
 * The Car class tracks the fuel remaining in the car as it is driven based on the fuel efficiency.
 * 
 * @author atapicella 
 * @version 9/12/14
 */
public class Car
{
    /** the fuel efficiency if this car measured in miles per gallon */
    private double fuelEfficiency;
    
    /** the number of gallons of fuel left in this car's tank */
    private double fuelInTank;

    /**Constructor for a car of the specified fuel efficiency */
    public Car(double efficiency)
    {
        this.fuelEfficiency = efficiency;
        this.fuelInTank = 0;
    }

    /**
     * Adds the specified number of gallons of fuel to this car's tank
     *
     * @pre        specified number of gallons does not exceed this cars tank capacity
     *            
     * @param    gallons    number if gallons of fuel to add to this car's tank

     */
    public void addGas(double gallons)
    {
        this.fuelInTank += gallons;
        
    }
    

    /**
     * Updates the fuel in this car's tank based on the specified number of miles driven and this
     *      car's fuel efficiency
     *
     * @pre     the specified number of miles does not consume more than the fuel in this car's tank
     * 
     * @param   miles number of miles this car has driven
     */
    public void drive(double miles)
    {
        double gallonsBurned = miles / this.fuelEfficiency;
        this.fuelInTank -= gallonsBurned;
    }
    

    /**
     * Returns the number of gallons of fuel left in this car's tank.
     *
     * @pre     enough room in tank
     * 
     * @return  gallons in tank
     */
    public double getGasInTank()
    {
        return this.fuelInTank;
    }

}
