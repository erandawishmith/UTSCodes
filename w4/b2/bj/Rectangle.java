public class Rectangle implements Shape  
{
    // instance variables 
    protected double length;
    protected double width;

   
    public Rectangle(double length, double width)
    {
        // initialise instance variables
        setLength(length);
        setWidth(width);
    }

 
    /**
     * setLength - Sets the length variable
     */
    public void setLength(double length)
    {
        this.length = length;
    }

    /**
     * setWidth - Sets the width variable
     */
    public void setWidth(double width)
    {
        this.width = width;
    }

    /**
     * area - calculate the area of a rectangle
     */
    public double area()
    {
        return length*width;
    }

    /**
     * perimeter - calculate the perimeter of a rectangle
     */
    public double perimeter()
    {
        return 2*(length + width);
    }
}