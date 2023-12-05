public class PartTimeEmployee extends Employee
{
    private double numOfHours;
    private double hourlyRate;

    public PartTimeEmployee(int id, String name, String dob, 
        double hourlyRate)
    {
        super(id, name, dob);
        this.hourlyRate = hourlyRate;        
    }
    
    @Override
    public double calcPay()
    {
        return numOfHours * hourlyRate;
    }
    
    public void setNumOfHours(double numOfHours)
    {
        this.numOfHours = numOfHours;
    }
}