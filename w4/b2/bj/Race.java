public class Race
{
    private Vehicle[] vehicles = new Vehicle[5];
    
    public Race()
    {
       setup();
       displayAll(10);
    }   

    private void setup()
    {
        vehicles[0] = new Car("ABC123", 2, "Coupe");
        vehicles[1] = new Bus("BD-1234", 3, 75);
        vehicles[2] = new Truck("ZXS443", 2, 500);
        vehicles[3] = new Bike("HGD455", 10, 1000);
        vehicles[4] = new Boat("La2yDa3", 1, 40);
    }
    
    private void displayAll(int time)
    {
        for(Vehicle vehicle : vehicles)
        {
            vehicle.display(time);
        }
    }
}