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
                getServiceTypeFromUser());
        super.add(service);
        System.out.println(service.toString() + " added");
    }

    public void edit() {
        int id = In.readInt("Enter Service ID to edit: ");
        Service service = find(id);

        if (service != null) {
            System.out.println("Existing service details:");
            System.out.println(service.toString());

            Service newService = new Service(id,
                    In.readName("Name"),
                    In.readName("Model"),
                    In.readName("Date"),
                    getServiceTypeFromUser());

            Service updatedService = updateService(id - 1, newService);
            System.out.println("updated successfully");

        } else {
            System.out.println("Service not found with ID " + id);
        }
    }

    public void delete() {
        int id = In.readInt("Enter service ID to delete: ");
        deleteService(id);
    }

    private ServiceType getServiceTypeFromUser() {
        System.out.println("Choose service type:");
        for (ServiceType type : ServiceType.values()) {
            System.out.println(type.ordinal() + 1 + ". " + type.name());
        }
        int typeChoice = In.readInt("Enter the number for the service type") - 1;

        if (typeChoice >= 0 && typeChoice < ServiceType.values().length) {
            return ServiceType.values()[typeChoice];
        } else {
            System.out.println("Invalid service type choice. Defaulting to BASIC.");
            return ServiceType.BASIC;
        }
    }

    @Override
    public String toString()
    {
        return "test\n" +  super.toString();
    }

//    public Service updateService(Service service){
//        super.records.set((service.id) -1 , service);
//        return (Service)super.find(id-1);
//
//    }

    public void deleteService(int id) {
        Service serviceToDelete = find(id);

        if (serviceToDelete != null) {
            super.records.remove(serviceToDelete);
            System.out.println("Service with ID " + id + " deleted");
        } else {
            System.out.println("Service with ID " + id + " not found");
        }
    }

    public Service updateService(int id, Service newService) {
        // Check if the records list is not empty
        if (!super.records.isEmpty()) {
            // Check if the provided service has a valid ID
            if (id >= 0 && id < super.records.size()) {
                super.records.set(id, newService);
                return (Service) super.find(id);
            } else {
                System.out.println("Invalid service ID for update");
            }
        } else {
            System.out.println("No services available for update");
        }

        return null;
    }

}
