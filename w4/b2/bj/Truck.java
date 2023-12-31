public class Truck extends Vehicle
{
    private int tonnage;
    private static final String NAME = "Truck";
    private final int FACTOR = 100;
    
    public Truck(String registration, double acceleration, int tonnage)
    {
        super(NAME, registration, acceleration);
        this.tonnage = tonnage;
    }
    
    @Override
    public double calcDistance (int time)
    {
        return acceleration * tonnage/FACTOR * time;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + " and tonnage " + tonnage;
    }
}