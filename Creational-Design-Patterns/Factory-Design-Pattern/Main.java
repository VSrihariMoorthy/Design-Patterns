// Main.java (Usage)
public class Main {
    public static void main(String[] args) {
        // Create vehicles using the factory
        Vehicle car = VehicleFactory.createVehicle("car");
        Vehicle bike = VehicleFactory.createVehicle("bike");

        // Drive vehicles
        car.drive(); // Output: Driving a car...
        bike.drive(); // Output: Riding a bike...
    }
}