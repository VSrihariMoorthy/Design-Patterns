public class Car {
    private String engine;
    private int wheels;
    private String color;

    // Setters for each field
    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
               "engine='" + engine + '\'' +
               ", wheels=" + wheels +
               ", color='" + color + '\'' +
               '}';
    }
}
