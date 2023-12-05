public class Player
{   
    private String name;
    private int score;
    
    public Player(String name)
    {       
        this.name = name;
    }
    
    public void turn(Dice dice)
    {
        int rollValue = dice.roll();
        System.out.println(name + " rolled a " +  rollValue);
        score += rollValue;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getScore()
    {
        return score;
    }
    
    public String toString()
    {
        return name + " " + score;
    }
}