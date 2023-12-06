public class Services extends Records{

    @Override
    public Service find(int id)
    {
        return (Service)super.find(id);
    }

    public void add()
    {
        System.out.println("Add ");
        Service service = new Service(++id,
                In.readName("Name"),
                In.readName("Model"),
                In.readName("Date"),
                In.readName("Type"));
        super.add(service);
        System.out.println(service.toString() + " added");
    }

    @Override
    public String toString()
    {
        return "test\n" +  super.toString();
    }

    public Service updateService(Service service){
        super.records.set((service.id) -1 , service);
        return (Service)super.find(id-1);

    }

    public void deleteService(int id) {
        Service serviceToDelete = find(id);

        if (serviceToDelete != null) {
            super.records.remove(serviceToDelete);
            System.out.println("Service with ID " + id + " deleted");
        } else {
            System.out.println("Service with ID " + id + " not found");
        }
    }

//    public Service updateService(Service service) {
//        // Check if the records list is not empty
//        if (!super.records.isEmpty()) {
//            // Check if the provided service has a valid ID
//            if (service.id >= 0 && service.id < super.records.size()) {
//                super.records.set(service.id, service);
//                return (Service) super.find(service.id);
//            } else {
//                System.out.println("Invalid service ID for update");
//            }
//        } else {
//            System.out.println("No services available for update");
//        }
//
//        return null;
//    }

}
