public class Rectangle implements Prototype {
    private int width;
    private int height;
    private String color;

    public Rectangle(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    // Copy constructor for cloning
    public Rectangle(Rectangle target) {
        if (target != null) {
            this.width = target.width;
            this.height = target.height;
            this.color = target.color;
        }
    }

    @Override
    public Prototype clone() {
        return new Rectangle(this);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
               "width=" + width +
               ", height=" + height +
               ", color='" + color + '\'' +
               '}';
    }
}
