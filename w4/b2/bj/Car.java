public class Car extends Vehicle
{
    private String bodyType;
    private static final String NAME = "Car";
    private final int MULTIPLIER = 20;
    
    public Car(String registration, double acceleration, String bodyType)
    {
        super(NAME, registration, acceleration);
        this.bodyType = bodyType;
    }
    
    @Override
    public double calcDistance (int time)
    {
        return acceleration * MULTIPLIER * time;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + " and body type " + bodyType;
    }
}
