import java.util.LinkedList;

public class Service extends Record{

    private String model;
    private String date;
    private ServiceType serviceType;
    private Status status;

    public Service(int id, String name, String model, String date, ServiceType serviceType, Status status) {
        super(id, name);
        this.model = model;
        this.date = date;
        this.serviceType = serviceType;
        this.status = status;
    }
//    public int getId() {
//        return id;
//    }


    @Override
    public String toString()
    {
        String str =  super.toString() + " " + model + " " + date + " " + serviceType + " " + status ;

        return str;
    }



}
