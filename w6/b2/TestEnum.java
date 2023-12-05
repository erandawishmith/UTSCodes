
public class TestEnum
{
   
    public TestEnum()
    {
        for(Status status : Status.values())
        {
            System.out.println(status);
        }
    }   
}
