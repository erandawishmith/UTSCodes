public class Pentagon extends RegularPolygon
{
    private static int NUM_OF_SIDES = 5;

    public Pentagon(double sideLength)
    {
        super(NUM_OF_SIDES, sideLength);
    }   
    
    @Override
    public double area()
    {
        return 0.25 * Math.sqrt(NUM_OF_SIDES*(NUM_OF_SIDES+2 * Math.sqrt(NUM_OF_SIDES))) 
            * Math.pow(sideLength, 2);
    }
    
    @Override
    public String toString()
    {
        return "Pentagon: " + super.toString(); 
    }
}