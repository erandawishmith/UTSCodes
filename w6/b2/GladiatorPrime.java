public class GladiatorPrime
{
    private final char YES = 'Y';
    
    // group class objecta as attributes
    private Customers customers = new Customers();
    private StreamedMovies streamedMovies = new StreamedMovies();

    public GladiatorPrime()
    {
        menu();
    }

    private void menu()
    {
        char action = readAction();
        switch (action)
        {
            case 'M': addMovie(); break;
            case 'C': addCustomer(); break;
            case 'R': rent(); break;
            case 'S': report(); break;
            case 'X': exit(); break;
            case '?': help(); break;
            default: error();
        }
    }

    private char readAction()
    {
        System.out.println("Please enter your choice (M, C, R, S, X, ?): ");
        return In.nextUpperChar();
    } 
    
    private void addMovie()
    {
        streamedMovies.add();
        menu();
    }
    
    private void addCustomer()
    {
        customers.add();
        menu();
    }
    
    // Programming by contract
    // Client performs validations and calls supplier only if the validations are successfull
    private void rent()
    {
        System.out.println("Rent Movie");
        int customerId = In.readInt("customer id");
        Customer customer = customers.find(customerId);
        if (customer == null)
        {
            System.out.println("No customer with such Id");
        }
        else
        {
            int movieId = In.readInt("movie id");
            StreamedMovie movie = streamedMovies.find(movieId);
            if (movie == null)
                System.out.println("No movie with such Id");
            else if (movie.getPrice() > customer.getBalance())
                System.out.println("Not enough credit");                
            else
                customer.rent(movie);
        }
        menu();
    }
    
    private void report()
    {
        customers.show();
        streamedMovies.show();
        menu();
    }

    private void exit()
    {
        if (!confirm())
            menu();
    }

    private boolean confirm()
    {
        System.out.println("Are you sure (y/n)?: ");
        return In.nextUpperChar() == YES;
    }

    private void help()
    {
        System.out.println("Welcome to my simple menu; enter");
        System.out.println("M for adding a movie");
        System.out.println("C for adding a customer");
        System.out.println("R for renting a movie");
        System.out.println("S for report");
        System.out.println("X to exit");
        menu();
    }

    private void error()
    {
        System.out.println("No action found. Try again");
        menu();
    }
}