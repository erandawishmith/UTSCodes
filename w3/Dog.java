public class Dog extends Mammal
{    
    private double tailLength;
    
    public Dog(String breed, String furColour, String habitat, int numLegs,
        double tailLength)
    { 
        super(breed, furColour, habitat, numLegs);      // calling the parent constructor
        this.tailLength = tailLength;                   // intializing unique attributes of the child class
    }  
    
    public void wag()
    {
        System.out.println("Wag wag...");
    }

    @Override
    public void move()
    {
        System.out.println("Dog moves");
    }
    
    // display breed, furColour and tailLength
    @Override
    public String toString()
    {
        return "Dog - " + super.toString() +   // "Breed: " + breed + " Fur Colour: " + furColour;
            " Tail Length: " + tailLength;
    }
}