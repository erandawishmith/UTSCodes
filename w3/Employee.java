import java.text.DecimalFormat;

public abstract class Employee
{
    protected int id;
    protected String name;
    protected String dob;
    
    public Employee(int id, String name, String dob)
    {
        this.id = id;
        this.name = name;
        this.dob = dob;
    }
    
    public void pay()
    {
        System.out.println("Payrun for " + toString());
        System.out.println("Amount $ " + new DecimalFormat("0.0").format(calcPay()));
    }
    
    public abstract double calcPay();
    
    @Override
    public String toString()
    {
        return "employee " + id + " " + name;
    }
}
