public class PotatoPlant
{
    private final double GROW_FACTOR = 11.5;
    private final double SELL_PRICE = 2.5;  //sale price of potatoes per kilogram is $2.50.
    private final double HARVEST = 7.0;
    
    private double weight;
    private double buyingPrice;
    private double sellPrice;

    public PotatoPlant(double buyingPrice, double weight)
    {
        this.buyingPrice = buyingPrice;
        this.weight = weight;
    }

    public void feed(double fertiliser)
    {
        weight += GROW_FACTOR * fertiliser;
    }

    public void sell()
    {
        sellPrice = weight * SELL_PRICE;
    }

    public double getCost()
    {
        return buyingPrice + HARVEST;
    }

    public double getSellPrice()
    {
        return sellPrice;
    }
}