public class TransactionsAccount extends Account
{    
    public TransactionsAccount(double balance, double interest)
    {
        super(balance, interest);
    }   
    
    @Override
    public String toString()
    {
        return "TRANSACTION_ACCOUNT " +  super.toString();
    }
}
