import java.util.LinkedList;

public class Test
{
    private LinkedList<StreamedMovie> movies = 
        new LinkedList<StreamedMovie>();
    private Customer customer;
    
    public Test()
    {
        customer = new Customer(1, "Jack");
        movies.add(new StreamedMovie(1, "Harry Potter", 100.0, 7, Status.FOR_RENT));
        movies.add(new StreamedMovie(2, "Jurassic Park", 120.0, 14, Status.UNAVAILABLE));
        rent();
    }  
    
    private void rentMovie(StreamedMovie sm)
    {
        // Programming by contract
        // Client Supplier Agreement
        if (!sm.isAvailable())
        {
            System.out.println("Movie unavailable");
        }
        else if (sm.getPrice() > customer.getBalance())
        {
            System.out.println("Not enough credit");
        }
        else
        {
            customer.rent(sm);
        }
    }
    
    private void rent()
    {
        for(StreamedMovie movie : movies)
            rentMovie(movie);
    }
}