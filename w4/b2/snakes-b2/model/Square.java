package model;

public class Square implements BoardPiece
{
    protected int id;
    protected String colour;
    protected int spacesToMove = 0;

    public Square(int id, String colour)
    {
        this.id = id;
        this.colour = colour;
    }

    //print where the player is � use toString() in Player 
    @Override
    public void move(Player player)
    {
        System.out.println(player.toString());
    }

}