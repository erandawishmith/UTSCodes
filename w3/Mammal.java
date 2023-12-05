public class Mammal
{
    protected String breed;
    protected String furColour;
    protected boolean fedMilk;
    protected boolean warmBlooded;
    protected String habitat;
    protected int numLegs;

    public Mammal(String breed, String furColour, String habitat, int numLegs)
    {
        this.breed = breed;
        this.furColour = furColour;
        this.habitat = habitat;
        this.fedMilk = true;
        this.warmBlooded = true;
        this.numLegs = numLegs;
    }

    public void move()
    {
        System.out.println("Mammal moves");
    }

    public String feed()
    {
        return "Yum";
    }

    public void displayHabitat()
    {
        System.out.println("I live in the " + habitat);
    }

    @Override
    public String toString()
    {
        return "Breed: " + breed + " Fur Colour: " + furColour;
    }
}