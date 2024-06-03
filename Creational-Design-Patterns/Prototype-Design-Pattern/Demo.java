public class Demo {
    public static void main(String[] args) {
        Circle originalCircle = new Circle(10, "red");
        Circle clonedCircle = (Circle) originalCircle.clone();

        Rectangle originalRectangle = new Rectangle(20, 30, "blue");
        Rectangle clonedRectangle = (Rectangle) originalRectangle.clone();

        System.out.println("Original Circle: " + originalCircle);
        System.out.println("Cloned Circle: " + clonedCircle);

        System.out.println("Original Rectangle: " + originalRectangle);
        System.out.println("Cloned Rectangle: " + clonedRectangle);
    }
}
