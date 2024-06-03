public class Demo {
    public static void main(String[] args) {
        CarBuilder builder = new SportsCarBuilder(); // Create the builder
        
        // Directly using the builder to construct the car
        builder.buildEngine();
        builder.buildWheels();
        builder.buildColor();
        
        // Get the constructed car
        Car car = builder.getCar();
        System.out.println(car); // Print the car details
    }
}
