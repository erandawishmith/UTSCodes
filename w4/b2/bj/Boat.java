public class Boat extends Vehicle
{
    private int horsePower;
    private static final String NAME = "Boat";
   
    
    public Boat(String registration, double acceleration, int horsePower)
    {
        super(NAME, registration, acceleration);
        this.horsePower = horsePower;
    }
    
    @Override
    public double calcDistance (int time)
    {
        return acceleration * horsePower * time;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + " and horse power " + horsePower;
    }
}