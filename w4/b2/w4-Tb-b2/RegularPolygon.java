public abstract class RegularPolygon implements Shape
{
    protected int numOfSides;
    protected double sideLength;

    public RegularPolygon(int numOfSides, double sideLength)
    {
        this.numOfSides = numOfSides;
        this.sideLength = sideLength;
    }    

    @Override
    public double perimeter()
    {
        return numOfSides * sideLength;
    }

    @Override
    public String toString()
    {
        return numOfSides + " sides with equal length of " +  sideLength; 
    }
}