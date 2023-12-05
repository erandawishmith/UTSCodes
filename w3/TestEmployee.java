public class TestEmployee
{  
    FullTimeEmployee fullTimeEmp = new FullTimeEmployee(1, "Mike", "01/10/1985", 60000);
    PartTimeEmployee partTimeEmp = new PartTimeEmployee(1, "Sally", "16/12/1999", 22.50);
    
    public TestEmployee()
    {
        partTimeEmp.setNumOfHours(14);
        fullTimeEmp.pay();
        partTimeEmp.pay();
    }  
}