public class Rabbit extends Mammal
{ 
    private double earLength;

    public Rabbit( String breed, String furColour, String habitat, int numLegs,
        double earLength)
    {      
        super(breed, furColour, habitat, numLegs);
        this.earLength = earLength;
    }

    public void hop()
    {
        System.out.println("Hop hop");
    }
    
    @Override
    public String toString()
    {
        return "Rabbit - " + super.toString() +   
            " Ear Length: " + earLength;
    }
}