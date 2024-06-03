public class SquareAdapter extends Rectangle {
    private Square square;

    public SquareAdapter(Square square) {
        this.square = square;
    }

    @Override
    public void draw(int width, int height) {
        if (width == height) {
            square.draw(width);
        } else {
            System.out.println("Cannot draw a square with different width and height");
        }
    }
}
