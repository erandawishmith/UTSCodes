public abstract class Account
{
    protected double balance;
    protected double interest;
    private static final int DAYS_IN_YEAR = 365;
    
    public Account(double balance, double interest)
    {
        this.balance = balance;
        this.interest = interest;
    }
    
    public double calcInterest ()
    {
        return (balance * interest) / DAYS_IN_YEAR;
    }
    
    public void applyInterest ()
    {
        balance += calcInterest ();
        //balance += (balance * interest) / DAYS_IN_YEAR;
    }
    
    public double getBalance()
    {
        return balance;
    }
    
    public void show()
    {
        System.out.println(toString());
    }
    
    @Override
    public String toString()
    {
        return "Balance: $" + Formatter.format(balance) + 
            " Interest rate: " + Formatter.format(interest);
    }
}