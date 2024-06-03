public class Circle implements Prototype {
    private int radius;
    private String color;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Copy constructor for cloning
    public Circle(Circle target) {
        if (target != null) {
            this.radius = target.radius;
            this.color = target.color;
        }
    }

    @Override
    public Prototype clone() {
        return new Circle(this);
    }

    @Override
    public String toString() {
        return "Circle{" +
               "radius=" + radius +
               ", color='" + color + '\'' +
               '}';
    }
}
