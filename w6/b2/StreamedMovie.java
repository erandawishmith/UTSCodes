public class StreamedMovie extends Record
{ 
    private double price;    
    private int numDays;
    private Status status;

    public StreamedMovie(int id, String name, double price, int numDays, Status status)
    {  
        super(id, name);
        this.price = price;
        this.numDays = numDays;
        this.status = status;
    }

    // overloaded constructor
    public StreamedMovie(int id, String name, double price, int numDays)
    {
        super(id, name);
        this.price = price;
        this.numDays = numDays;
        this.status = Status.FOR_RENT;      // available
    }

    public void rent()
    {  
        System.out.println("\tVideo rented: " + name);
        status = Status.UNAVAILABLE;
    }        

    public double getPrice()
    {
        return price;
    }

    public boolean isAvailable()
    {
        return status == Status.FOR_RENT;
    }

    @Override
    public String toString()
    {  
        String str =  super.toString() + " " + numDays + " days" ;   
        if(isAvailable())
            str += " is available for rent";
        return str;
    }           
}