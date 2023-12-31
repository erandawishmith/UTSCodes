public abstract class Vehicle
{
    protected String name;
    protected String registration;
    protected double acceleration ;
    
    public Vehicle(String name, String registration, double acceleration)
    {
        this.name = name;
        this.registration = registration;
        this.acceleration = acceleration;
    }
    
    public abstract double calcDistance (int time);
    
    public void display(int time)
    {
        System.out.println("After " + time + " seconds the " + 
            toString() + " is " + 
            calcDistance (time) + " metres from the starting line");
    }
    
    @Override
    public String toString()
    {
        return name + " with registration " + registration;
    }
}