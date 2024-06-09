public class TemplateMethodPatternDemo {
    public static void main(String[] args) {
        Game game = new Chess();
        game.play();
        System.out.println();

        game = new Football();
        game.play();
    }
}
