public class Customers extends Records
{
    @Override
    public Customer find(int id)
    {
        return (Customer)super.find(id);
    }
     
    public void add()
    {
        System.out.println("Add a customer");
        Customer customer = new Customer(++id, In.readName("customer"));
        super.add(customer);
        System.out.println(customer.toString() + " added");
    }
    
    @Override
    public String toString()
    {
        return "Customers\n" + super.toString();
    }
}