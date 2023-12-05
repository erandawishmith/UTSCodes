public class RecursionTest
{    
    public RecursionTest()
    {
       display(1);
    }

    private void display(int x)
    {
        if (x <= 5)
        {
            System.out.println(x);
            display(++x);
        }
    }
}