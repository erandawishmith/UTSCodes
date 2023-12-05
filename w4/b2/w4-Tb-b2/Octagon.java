public class Octagon extends RegularPolygon
{
    private static int NUM_OF_SIDES = 8;

    public Octagon(double sideLength)
    {
        super(NUM_OF_SIDES, sideLength);
    }   
    
    @Override
    public double area()
    {
        return 2.0 *(1.0 + Math.sqrt(2)) * Math.pow(sideLength, 2);
    }
    
    @Override
    public String toString()
    {
        return "Octagon: " + super.toString(); 
    }
}