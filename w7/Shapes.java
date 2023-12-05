import java.util.LinkedList;
public class Shapes
{
    //instance variables
    private LinkedList<Shape> shapes  = new LinkedList<Shape>();
        
    public Shapes()
    {         
        shapes.add(new Circle(2));
        shapes.add(new Rectangle(2, 5));
        shapes.add(new Triangle(3, 4, 5, 3));
        listProperties();
        
        //Shape s = new Circle(2);
    }
     
    
    public void listProperties()
    {
        for(Shape current : shapes)
        {
            System.out.println("Area is:" + current.area());
            System.out.println("Perimeter is:" + current.perimeter());
            
            //if(current instanceof Circle)
            //    System.out.println("Diameter is:" + ((Circle)current).diameter());
        }
    }
}