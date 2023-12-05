public class Calculator
{
    private double numberOne;
    private double numberTwo;
    
    public Calculator(double numberOne, double numberTwo)
    {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }
    
    public double add()
    {
        return numberOne + numberTwo;
    }
    
    public double subtract()
    {
        return numberOne - numberTwo;
    }
    
    public double multiply()
    {
        return numberOne * numberTwo;
    }
    
    public double divide()
    {
        return numberOne / numberTwo;
    }
}