public class Test
{
    private final char YES = 'Y';
    private Cat[] cats = new Cat[3];

    public Test()
    {             
        populateArray();
        menu();
    }
    
    private void populateArray()
    {
        cats[0] =  new Cat("m", "Siamese", 10, false, "Brown");
        cats[1] =  new Cat("f", "Tabby", 3, true, "White");
        cats[2] =  new Cat("m", "Ginger", 20, true, "Gray");      
    }

    private void menu()
    {
        char action = readAction();
        switch (action)
        {
            case 'D': display(); break;
            case 'R': report(); break;
            case 'X': exit(); break;
            case '?': help(); break;
            default: error();
        }
    }

    private char readAction()
    {
        System.out.println("Please enter your choice (D, R, X, ?): ");
        return In.nextUpperChar();
    }

    private void display(Cat cat)
    {
        System.out.println(cat.toString());
    }

    private void display()
    {
        /*
        for(int i = 0; i < cats.length; i++)
        {
        display(cats[i]);
        }
         */

        for(Cat cat : cats)
        {
            display(cat);
        }
        menu();
    }

    private void report()
    {
        int minAge = readMinAge();        
        for(Cat cat : cats)
        {
            if (cat.getAge() >= minAge)
                display(cat);
        }
        menu();
    }

    private int readMinAge()
    {
        System.out.println("Min age ? ");
        return In.nextInt();
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
        System.out.println("Welcome to my cats menu; enter");
        System.out.println("D for Displaying All");
        System.out.println("R for Report");        
        System.out.println("X to exit");
        menu();
    }

    private void error()
    {
        System.out.println("No action found. Try again");
        menu();
    }
}
