public class CalculatorMenu
{
    private final char YES = 'Y';
    private Calculator calc = new Calculator(3,4);

    public CalculatorMenu()
    {
        menu();
    }

    private void menu()
    {
        char action = readAction();
        switch (action)
        {
            case 'A': add(); break;
            case 'S': subtract(); break;
            case 'M': multiply(); break;
            case 'D': divide(); break;
            case 'X': exit(); break;
            case '?': help(); break;
            default: error();
        }
    }

    private char readAction()
    {
        System.out.println("Please enter your choice (A, S, M, D, X, ?): ");
        return In.nextUpperChar();
    }

    private void add()
    {
        System.out.println("Add: " + calc.add());
        menu();
    }
    
    private void subtract()
    {
        System.out.println("Add: " + calc.subtract());
        menu();
    }
    
    private void multiply()
    {
        System.out.println("Add: " + calc.multiply());
        menu();
    }
    
    private void divide()
    {
        System.out.println("Divide: " + calc.divide());
        menu();
    }

    private void exit()
    {
        if (!confirm())
            menu();
        else
            System.out.println("Goodbye");
    }

    private boolean confirm()
    {
        System.out.println("Are you sure (y/n)?: ");
        return In.nextUpperChar() == YES;
    }

    private void help()
    {
        System.out.println("Welcome to my simple menu; enter");
        System.out.println("A for Add");
        System.out.println("S for Subtract");
        System.out.println("M for Multiply");
        System.out.println("D for Divide");
        System.out.println("X to exit");
        menu();
    }

    private void error()
    {
        System.out.println("No action found. Try again");
        menu();
    }
}
