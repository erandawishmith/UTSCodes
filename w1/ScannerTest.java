
import java.util.Scanner;

public class ScannerTest
{
    public ScannerTest()
    {

        Scanner scanner = new Scanner(System.in);

        System.out.println("First Name ?");           
        String fName = scanner.nextLine();        
        System.out.println("Your first name : " + fName);
        
        System.out.println("Age ?");        
        int age = scanner.nextInt();  
        scanner.nextLine();
        System.out.println("Your age : " + age);
        
        System.out.println("Sur Name ?");
        String surName = scanner.nextLine();    
        System.out.println("Your first name : " + fName + 
            " last name : " + surName + " and your age : " + age);
            
        System.out.println("Done");

    }
}
