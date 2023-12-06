public class Technicians extends Records {
    @Override
    public Technician find(int id)
    {
        return (Technician)super.find(id);
    }

    public void add()
    {
        System.out.println("Add ");
        Technician technician = new Technician(++id,
                In.readName("Name"),
                In.readName("Contact Number"),
                In.readName("Level"));
        super.add(technician);
        System.out.println(technician.toString() + " added");
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
//
    public void deleteTechnician(int id) {
        Technician technicianToDelete = find(id);

        if (technicianToDelete != null) {
            super.records.remove(technicianToDelete);
            System.out.println("Technician ID " + id + " deleted");
        } else {
            System.out.println("Technician ID " + id + " not found");
        }
    }

    public Technician updateTechnician(int id, Technician newTechnician) {
        if (!super.records.isEmpty()) {
            if (id >= 0 && id < super.records.size()) {
                super.records.set(id, newTechnician);
                return (Technician) super.find(id);
            } else {
                System.out.println("Invalid technician ID for update");
            }
        } else {
            System.out.println("No technicians available for update");
        }

        return null;
    }
}