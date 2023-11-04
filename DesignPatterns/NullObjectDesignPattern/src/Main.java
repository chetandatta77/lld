public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicleObject("bike");
        printVehicleDetails(vehicle);
    }

    private static void printVehicleDetails(Vehicle vehicle) {
        System.out.println("Seating capacity: " + vehicle.getSeatingCapacity());
        System.out.println("Seating capacity: " + vehicle.getTankCapacity());
    }

    private static void printVehicleDetailswith(Vehicle vehicle) {
        if (vehicle!=null){
            System.out.println("Seating capacity: " + vehicle.getSeatingCapacity());
            System.out.println("Seating capacity: " + vehicle.getTankCapacity());
        }
    }
}
