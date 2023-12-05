public class Test
{  
    private Mammal[] mammals = 
    {
        new Dog("German Shepered", "Brown", "Home", 4, 20),
        new Whale("Blue Whale", "blue", "Ocean", 0)
    };
    
    public Test()
    {
        for(Mammal mammal : mammals)
            System.out.println(mammal.toString());
    }  
}