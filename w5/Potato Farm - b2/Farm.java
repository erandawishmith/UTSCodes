import java.text.*;
import java.util.LinkedList;
import java.util.ListIterator;

public class Farm
{
    private Fertiliser fertiliser;    
    private final double INITIAL_WEIGHT = 0.5;
    private PotatoPlants potatoPlants;              // group class object

    public Farm()
    {    
        setup();
        run();
        show();
    }

    private void setup()
    {
        fertiliser = new Fertiliser(readDouble("How much fertiliser? ")); // create the Fertiliser object
        int numPlants = readInteger("How many potato plants? ");
        double plantPrice = readPrice();        
        potatoPlants = new PotatoPlants(plantPrice, numPlants, INITIAL_WEIGHT);
    }

    private double readDouble(String question)
    {
        System.out.print(question);
        return In.nextDouble();
    }

    private void run()
    {
        potatoPlants.feed(fertiliser.getAmount());
        potatoPlants.sell();
    }

    private void show()
    {
        System.out.println(toString());
    }

    @Override
    public String toString()
    {
        double cost = fertiliser.cost() + potatoPlants.totalCost();
        double income = potatoPlants.income();
        String str = "Cost is $" + formatted(cost);
        str += "\nIncome is $" + formatted(income);
        str += "\nProfit is $" + formatted(income - cost);
        return str;
    }

    private int readInteger(String question)
    {
        System.out.print(question);
        return In.nextInt();
    }

    private double readPrice()
    {
        System.out.print("Price per plant? ");
        return In.nextDouble();
    }

    private String formatted(double amount)
    {   
        DecimalFormat formatter = new DecimalFormat("###,##0.00");
        return formatter.format(amount); 
    }
}
