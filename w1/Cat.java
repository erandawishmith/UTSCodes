/**
 * class Cat 
 */
public class Cat
{
    private String sex;
    private String breed;
    private int age;
    private boolean spayed;
    private String color;

    public Cat()
    {
    }

    public Cat(String sex, String breed, int age, boolean spayed, String color)
    {
        this.sex = sex;
        this.breed = breed;
        this.age = age;
        this.spayed = spayed;
        this.color = color;
    }

    public int getAge()
    {
        return age;
    }
    
    public String getBreed()
    {
        return breed;
    }
    
    /**
     * Miaow Method
     */
    public String miaow()
    {
        return "Miaow";
    }

    /**
     * eat Method
     */
    public String eat()
    {
        return "Munch";
    }

    /**
     * purr Method
     */
    public String purr()
    {
        return "Purrrr Purrrr";
    }

    public String toString()
    { 
        return "This cat is " + age + " years old and " + breed + " and " + color;
    }
}
