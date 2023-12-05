public class Whale extends Mammal
{        
    public Whale(String breed, String furColour, String habitat, int numLegs)
    { 
        super(breed, furColour, habitat, numLegs);      // calling the parent constructor        
    }  
    
    public void swim()
    {
        System.out.println("Splash Splash");
    }
    
    @Override
    public String toString()
    {
        return "Whale - " + super.toString();
    }
}