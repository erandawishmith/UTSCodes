public class Parent
{
    private int x;
    protected int y;

    protected Parent(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    public A m(int x)
    {
        System.out.println("Parent - A m(int x)");
        return new A();
    }  
}