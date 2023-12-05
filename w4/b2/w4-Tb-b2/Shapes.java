public class Shapes
{
    private RegularPolygon[] polygons = 
    {
        new Pentagon(10),
        new Octagon(5)
    };
    
    public Shapes()
    {
        for (RegularPolygon polygon: polygons) 
            System.out.println(polygon.toString() + 
                "\n\t Area are = " + polygon.area() + 
                "\n\t Perimeter are = " + polygon.perimeter());
    }   
}