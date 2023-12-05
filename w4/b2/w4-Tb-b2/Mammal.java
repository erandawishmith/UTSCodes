public abstract class Mammal implements Animal
{
    protected String breed;
    protected String furColour;
    protected boolean fedMilk;
    protected boolean warmBlooded;
    protected String habitat;
    protected int numLegs;

    /**
     * Constructor for objects of class Mammal
     */
    public Mammal(String breed, String furColour, String habitat, int numLegs)
    {
        this.breed = breed;
        this.furColour = furColour;
        this.habitat = habitat;
        this.fedMilk = true;
        this.warmBlooded = true;
        this.numLegs = numLegs;
    }

    /**
     * Feed Method
     */
    public String feed()
    {
        return "Yum";
    }

    /**
     * Habitat Method
     */
    public void displayHabitat()
    {
        System.out.println("I live in the "+ habitat);
    }

    @Override
    public String toString()
    {
        return getName() + " says " + makeNoise();
    }
}
