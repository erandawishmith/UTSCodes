public class Bus extends Vehicle
{
    private int passengers;
    private static final String NAME = "Bus";
    private final double FACTOR = 100;
    
    public Bus(String registration, double acceleration, int passengers)
    {
        super(NAME, registration, acceleration);
        this.passengers = passengers;
    }
    
    @Override
    public double calcDistance (int time)
    {
        return acceleration * (FACTOR/passengers) * time;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + " and the no of passengers allowed being " + passengers;
    }
}