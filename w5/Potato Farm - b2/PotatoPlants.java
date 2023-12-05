import java.util.LinkedList;
import java.util.ListIterator;
public class PotatoPlants
{
    private LinkedList<PotatoPlant> potatoPlants = new LinkedList<PotatoPlant>();

    public PotatoPlants(double plantPrice, int numPlants, double initialWeight)
    {
        plantPotatoes(plantPrice, numPlants, initialWeight);
    }

    private void plantPotatoes(double plantPrice, int numPlants, double initialWeight)
    {
        for (int i = 0; i < numPlants; i++)
        {
            // add a new plant to the list of potatoPlants
            potatoPlants.add(new PotatoPlant(plantPrice, initialWeight));
        }
        
        //PotatoPlant first = potatoPlants.get(0); //potatoPlants[0];  
    }

    public void feed(double fert)
    {
        //for each potatoPlant in the list, call feed()
        double fertPerPlant = fert / potatoPlants.size();
        for(PotatoPlant plant : potatoPlants)
        {
            plant.feed(fertPerPlant);
        }
    }

    public void sell()
    {   
        ListIterator<PotatoPlant> iterator = potatoPlants.listIterator();
        while(iterator.hasNext())
        {
            PotatoPlant plant = iterator.next();
            plant.sell();
        }
    }

    public double income()
    {
        double total = 0;
        //for each potatoPlant in the list, add the sellPrice to the total, then return
        for(PotatoPlant plant : potatoPlants)
        {
            total += plant.getSellPrice();
        }
        return total;
    }

    public double totalCost()
    {
        double total = 0;
        //for each potatoPlant in the list, add the cost to the total, then return
        for(PotatoPlant plant : potatoPlants)
        {
            total += plant.getCost();
        }
        return total;
    }
}
