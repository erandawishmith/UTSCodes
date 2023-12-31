public class Bike extends Vehicle
{
    private int capacity;
    private static final String NAME = "Bike";
    private final int FACTOR = 100;
    
    public Bike(String registration, double acceleration, int capacity)
    {
        super(NAME, registration, acceleration);
        this.capacity = capacity;
    }
    
    @Override
    public double calcDistance (int time)
    {
        return acceleration * (capacity/FACTOR) * time;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + " and capacity " + capacity;
    }
}