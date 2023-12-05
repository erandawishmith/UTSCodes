public class CreditAccount extends Account
{    
    private PaymentGateway gateway;
    
    public CreditAccount(double balance, double interest, PaymentGateway gateway)
    {
        super(balance, interest);
        this.gateway = gateway;
    }   
    
    @Override
    public String toString()
    {
        return "CREDIT_ACCOUNT " + gateway.toString() + " " +  super.toString();
    }
}
