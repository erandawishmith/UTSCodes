public class Child extends Parent
{    
    private int z;

    public Child(int x, int y, int z)
    {
        super(x, y);
        this.z = z;
    }
    
    @Override
    public A m(int x)
    {
        System.out.println("Child - B m(int x)");
        return new A();
    }  

    /*
    @Override
    public C m(int x)
    {
        System.out.println("Child - B m(int x)");
        return new C();
    }  
    \*/
}