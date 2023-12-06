public class GladiatorPrime {
    private final char YES = 'Y';

    // group class objecta as attributes
    private Customers customers = new Customers();
    private StreamedMovies streamedMovies = new StreamedMovies();
    private Services servicesList = new Services();

    private Technicians techniciansList = new Technicians();

    public GladiatorPrime() {
        menu();
    }

    public static void main(String[] args) {
        new GladiatorPrime();
    }

    private void menu() {
        char action = readAction();
        switch (action) {
            case 'M':
                addService();
                break;
            case 'T':
                addTechnician();
                break;
            case 'E':
                edit();
                break;
            case 'S':
                report();
                break;
            case 'X':
                exit();
                break;
            case '?':
                help();
                break;
            case 'D':
                delete();
                break;
            default:
                error();
        }
    }

    private char readAction() {
        System.out.println("Please enter your choice (M, T, E, S, X, D, ?): ");
        return In.nextUpperChar();
    }


    private void addMovie() {
        streamedMovies.add();
        menu();
    }

    private void addService() {
        servicesList.add();
        menu();
    }

    private void addTechnician() {
        techniciansList.add();
        menu();
    }

    private void addCustomer() {
        customers.add();
        menu();
    }

    // Programming by contract
    // Client performs validations and calls supplier only if the validations are
    // successfull
    private void rent() {
        System.out.println("Rent Movie");
        int customerId = In.readInt("customer id");
        Customer customer = customers.find(customerId);
        if (customer == null) {
            System.out.println("No customer with such Id");
        } else {
            int movieId = In.readInt("movie id");
            StreamedMovie movie = streamedMovies.find(movieId);
            if (movie == null)
                System.out.println("No movie with such Id");
            else if (movie.getPrice() > customer.getBalance())
                System.out.println("Not enough credit");
            else
                customer.rent(movie);
        }
        menu();
    }

//    private void editService(){
//        int id = In.readInt("Service id");
//        Service service = servicesList.find(id);
//        System.out.println(service.toString());
//
////        String name = In.readName("Name");
////        String Model = In.readName("Model");
////        String Date = In.readName("Date");
////        String Type = In.readName("Type");
//
//        Service newService1 = new Service(id,
//                In.readName("Name"),
//                In.readName("Model"),
//                In.readName("Date"),
//                In.readName("Type"));
//
//        Service newService = servicesList.updateService(newService1);
//        System.out.println(newService.toString());
//        menu();
//
//    }
private char editAction() {
    System.out.println("Please enter your choice (S,T): ");
    System.out.println("S:Service");
    System.out.println("T:Technician");
    return In.nextUpperChar();
}


    private void edit() {
        switch (editAction()) {
            case 'S':
                editService();
                break;
            case 'T':
                editTechnician();
                break;
        }
    }


    private void editService() {
        int id = In.readInt("Enter Service ID to edit: ");
        Service service = servicesList.find(id);

        if (service != null) {
            System.out.println("Existing service details:");
            System.out.println(service.toString());

            Service newService = new Service(id,
                    In.readName("Name"),
                    In.readName("Model"),
                    In.readName("Date"),
                    In.readName("Type"));

            Service updatedService = servicesList.updateService(id-1, newService);
            System.out.println("updated successfully");
//            if (updatedService != null) {
//                System.out.println("Service with ID " + id + " updated successfully:");
//                System.out.println(updatedService.toString());
//            } else {
//                System.out.println("Failed to update service with ID " + id);
//            }
        } else {
            System.out.println("Service not found with ID " + id);
        }

        menu();
    }
    private void editTechnician() {
        int id = In.readInt("Enter Technician ID to edit: ");
        Technician technician = techniciansList.find(id);

        if (technician != null) {
            System.out.println("Existing Technician details:");
            System.out.println(technician.toString());

            Technician newTechnician = new Technician(id,
                    In.readName("Name"),
                    In.readName("Contact Number"),
                    In.readName("Level"));

            Technician updatedTechnician = techniciansList.updateTechnician(id-1, newTechnician);
            System.out.println("updated successfully");
//            if (updatedService != null) {
//                System.out.println("Service with ID " + id + " updated successfully:");
//                System.out.println(updatedService.toString());
//            } else {
//                System.out.println("Failed to update service with ID " + id);
//            }
        } else {
            System.out.println("Technician not found with ID " + id);
        }

        menu();
    }

    private char readDeleteAction() {
        System.out.println("Please enter your choice (S,T): ");
        return In.nextUpperChar();
    }

    private void delete() {
        switch (readDeleteAction()){
            case 'S':
                deleteService();
                break;
            case 'T':
                deleteTechnician();
                break;
        }
    }

    private void deleteService() {
        int id = In.readInt("Enter service ID to delete: ");
        servicesList.deleteService(id);
        menu();
    }

    private void deleteTechnician() {
        int id = In.readInt("Enter technician ID to delete: ");
        techniciansList.deleteTechnician(id);
        menu();
    }
//    char action = readAction();
    private char readReportAction() {
        System.out.println("Please enter your choice (S,T): ");
        return In.nextUpperChar();
    }
    private void report() {
        switch (readReportAction()){
            case 'S':
                servicesList.show();
                break;
            case 'T':
                techniciansList.show();
        }
        menu();
    }

    private void exit() {
        if (!confirm())
            menu();
    }

    private boolean confirm() {
        System.out.println("Are you sure (y/n)?: ");
        return In.nextUpperChar() == YES;
    }

    private void help() {
        System.out.println("Welcome to my simple menu; enter");
        System.out.println("M for adding a movie");
        System.out.println("C for adding a customer");
        System.out.println("R for renting a movie");
        System.out.println("S for report");
        System.out.println("X to exit");
        menu();
    }

    private void error() {
        System.out.println("No action found. Try again");
        menu();
    }
}