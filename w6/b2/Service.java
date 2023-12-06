import java.util.LinkedList;

public class Service extends Record{

    private String model;
    private String date;
    private String serviceType;

    public Service(int id, String name, String model, String date, String serviceType) {
        super(id, name);
        this.model = model;
        this.date = date;
        this.serviceType = serviceType;
    }
//    public int getId() {
//        return id;
//    }


    @Override
    public String toString()
    {
        String str =  super.toString() + " " + model + " " + date + " " + serviceType ;

        return str;
    }



}
