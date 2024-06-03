public class Main {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedColor());
        Shape blueSquare = new Square(new BlueColor());

        redCircle.draw(); // Drawing circle Applying red color
        blueSquare.draw(); // Drawing square Applying blue color
    }
}
