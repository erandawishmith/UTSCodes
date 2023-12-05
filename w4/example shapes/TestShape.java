public class TestShape
{
    public TestShape()
    {         
           Rectangle rec = new Rectangle(5, 2);
           System.out.println("Rectangle area is:" + rec.area());
           
           Square square = new Square(5);
           System.out.println("square area is:" + square.area());          
           System.out.println("square perimeter is:" + square.perimeter());
           
           Circle circ = new Circle(2);
           System.out.println("Circle area is:" + circ.area());
           
           Triangle tri = new Triangle(3, 4, 5, 3);
           System.out.println("Triangle area is:" + tri.area());
    }
}
