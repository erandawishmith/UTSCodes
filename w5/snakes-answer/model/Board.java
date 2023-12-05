package model;
import java.util.LinkedList;


public class Board
{
    private final int NUMBER = 36;
    private LinkedList<Square> squares = new LinkedList<Square>();
    private int counter = 0;
    /**
     * Constructor for objects of class Board
     */
    public Board()
    {
        setBoard();
    }
    private void setBoard()
    {
        addRow1();
        addRow2();
        addRow3();
        addRow4();
        addRow5();
        addRow6();
    }
    private void addRow1()
    {
        squares.add(new Square(++counter, getColour(counter)));
        squares.add(new Square(++counter, getColour(counter)));
        squares.add(new LadderSquare(++counter, getColour(counter), 13));
        squares.add(new Square(++counter, getColour(counter)));
        squares.add(new LadderSquare(++counter, getColour(counter), 2));
        squares.add(new Square(++counter, getColour(counter)));
    }
    private void addRow2()
    {
        squares.add(new Square(++counter, getColour(counter)));
        squares.add(new Square(++counter, getColour(counter)));
        squares.add(new Square(++counter, getColour(counter)));
        squares.add(new Square(++counter, getColour(counter)));
        squares.add(new Square(++counter, getColour(counter)));
        squares.add(new SnakeSquare(++counter, getColour(counter), 10));
    }
    private void addRow3()
    {
        squares.add(new Square(++counter, getColour(counter)));
        squares.add(new SnakeSquare(++counter, getColour(counter), 3));
        squares.add(new LadderSquare(++counter, getColour(counter), 10));
        squares.add(new Square(++counter, getColour(counter)));
        squares.add(new SnakeSquare(++counter, getColour(counter), 13));
        squares.add(new LadderSquare(++counter, getColour(counter), 2));
    }
    private void addRow4()
    {
        squares.add(new Square(++counter, getColour(counter)));
        squares.add(new Square(++counter, getColour(counter)));
        squares.add(new LadderSquare(++counter, getColour(counter), 11));
        squares.add(new Square(++counter, getColour(counter)));
        squares.add(new Square(++counter, getColour(counter)));
        squares.add(new Square(++counter, getColour(counter)));
    }
    private void addRow5()
    {
        squares.add(new Square(++counter, getColour(counter)));
        squares.add(new Square(++counter, getColour(counter)));
        squares.add(new Square(++counter, getColour(counter)));
        squares.add(new Square(++counter, getColour(counter)));
        squares.add(new Square(++counter, getColour(counter)));
        squares.add(new Square(++counter, getColour(counter)));
    }
    private void addRow6()
    {
        squares.add(new SnakeSquare(++counter, getColour(counter), 12));
        squares.add(new Square(++counter, getColour(counter)));
        squares.add(new Square(++counter, getColour(counter)));
        squares.add(new Square(++counter, getColour(counter)));
        squares.add(new SnakeSquare(++counter, getColour(counter), 13));
        squares.add(new Square(++counter, getColour(counter)));
    }
    private String getColour(int counter)
    {
        if(counter % 2 == 0)// if counter is even
            return "Aqua";
        return "Yellow";
    }
    public void move(Player player)
    {
        int score = player.getScore();
        if (score < NUMBER)
        {
            Square square = squares.get(score -1); //squares[score -1];//find the square the player is on
            square.move(player);//move player (if snake or ladder)
        }
    }
}
