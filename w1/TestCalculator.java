public class TestCalculator
{    
    private Calculator calculator = new Calculator(4.0, 3.0);
    
    public TestCalculator()
    {
        System.out.println("Add : " + calculator.add());
        System.out.println("Subtract : " + calculator.subtract());
        System.out.println("Multiply : " + calculator.multiply());
        System.out.println("Divide : " + calculator.divide());
    }  
}