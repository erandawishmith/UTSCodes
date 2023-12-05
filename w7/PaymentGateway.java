public enum PaymentGateway
{
    MASTERCARD("Matercard"), VISA("Visa");
    private final String NAME;
    private PaymentGateway(String name)
    {
        NAME = name;
    }
    
    @Override
    public String toString()
    {
        return NAME;
    }
}