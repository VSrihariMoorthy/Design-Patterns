public class Demo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.draw(10, 20); // Drawing a rectangle with width: 10 and height: 20

        Square square = new Square();
        SquareAdapter squareAdapter = new SquareAdapter(square);
        squareAdapter.draw(10, 10); // Drawing a square with side: 10

        // This will fail because width and height are different
        squareAdapter.draw(10, 20); // Cannot draw a square with different width and height
    }
}
