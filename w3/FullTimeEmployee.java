public class FullTimeEmployee extends Employee
{
    private double salary;
    private static final int RATE = 26;

    public FullTimeEmployee(int id, String name, String dob, 
        double salary)
    {
        super(id, name, dob);
        this.salary = salary;       
    }
    
    @Override
    public double calcPay()
    {
        return salary / RATE;
    }
    
    /*
       public void pay()
    {
        System.out.println("Payrun for " + toString());
        System.out.println("Amount $ " + calcPay());
    }
       */
}