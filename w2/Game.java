public class Game
{
    private final int WIN_MARK = 10;     
    private Dice dice = new Dice();
    private Player[] players;
    
    public Game()
    {
        setup();
        play();
        display();
    }

    private void setup()
    {
        players =  new Player[readSize()];
        for(int i = 0; i < players.length; i++)
        {
            players[i] = new Player(readName());
        }
    }
    
    private int readSize()
    {
        System.out.println("How many players? ");
        return In.nextInt();
    }
    
    private void play()
    {
        do
        {
            for(Player player : players)
            {
                player.turn(dice);
            }
        }while(!isGameOver());
    }
    
    private void display()
    {
        System.out.println("Game Over");
        for(int i = 0; i < players.length; i++)
        {
            System.out.println("\tPlayer " + (i  + 1) + " score: " 
                + players[i].toString());
        }
        System.out.println(winner() + " won the game.");        
    }
    
    private boolean isGameOver()
    {
        for(Player player : players)
        {
            if (player.getScore() >= WIN_MARK)
            {
                return true;
            }
        }        
        return false;
    }
    
    private String readName()
    {
        System.out.print("Enter player name: ");
        return In.nextLine();
    }
    
    /*
    winner = players[0] 
    for i = 1 to players.length - 1
        if players[i].score > winner.score
            winner = players[i]
    return winner.name
    */
    private String winner()
    {
        Player winner = players[0];
        for(int i = 1; i <= players.length - 1; i++)
        {
            if (players[i].getScore() > winner.getScore())
            {
                winner = players[i];
            }
        }
        return winner.getName();
    }
}