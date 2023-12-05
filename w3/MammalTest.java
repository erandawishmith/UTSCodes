public class MammalTest
{
    private Dog[] dogs = new Dog[3];
    private Whale[] whales = new Whale[3];
    private Rabbit[] rabbits = new Rabbit[3];

    public MammalTest()
    {    
        setupDogs();
        setupWhales();
        setupRabbits();
        displayAll();
    }    

    private void displayAll()
    {
        System.out.println("Dog details:");
        displayDogs();
        System.out.println("\nWhale details");
        displayWhales();
        System.out.println("\nRabbit details");
        displayRabbits();
    }

    private void displayDogs()
    {
        for(Dog dog : dogs)
        {
            //dog.wag();
            //System.out.println(dog.feed());
            //dog.displayHabitat();
            System.out.println(dog.toString());
        }
    }

    private void displayWhales()
    {
        for(Whale whale : whales)
        {
            //whale.swim();
            //System.out.println(whale.feed());
            //whale.displayHabitat();
            System.out.println(whale.toString());
        }
    }
    
    private void displayRabbits()
    {
        for(Rabbit rabbit : rabbits)
        {
            //rabbit.hop();
            //System.out.println(rabbit.feed());
            //rabbit.displayHabitat();
            System.out.println(rabbit.toString());
        }
    }

    private void setupDogs()
    {
        dogs[0] = new Dog("German Shepered", "Black", "House", 4, 25.0);  
        dogs[1] = new Dog("Golden Retriever", "Gold", "Dog Home", 4, 20.0); 
        dogs[2] = new Dog("Labrodor", "Brown", "Dog House", 4, 20.0);   
    }

    private void setupWhales()
    {
        whales[0] = new Whale("Blue Whale", "Blue", "Pacific Ocean", 0);
        whales[1] = new Whale("White Whale", "White", "Atlantic Ocean", 0);
        whales[2] = new Whale("Gray Whale", "Silver", "Indian Ocean", 0);
    }
    
    private void setupRabbits()
    {
        rabbits[0] = new Rabbit("White Rabbit", "White", "House", 4, 10.0); 
        rabbits[1] = new Rabbit("Black Rabbit", "Black", "Jungle", 4, 15.0); 
        rabbits[2] = new Rabbit("Brown Rabbit", "Brown", "Caves", 4, 15.0);        
    }
}