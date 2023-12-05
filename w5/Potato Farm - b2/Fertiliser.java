public class Fertiliser
{
    private double amount;
    private final double PRICE = 6.5;

    public Fertiliser(double amount)
    {
        this.amount = amount;
    }

    public double cost()
    {
        return amount * PRICE;
    }

    public double getAmount()
    {
        return amount;
    }
}