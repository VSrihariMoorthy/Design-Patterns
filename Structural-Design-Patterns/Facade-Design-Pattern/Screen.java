public class Screen {
    private static Screen instance = new Screen();

    private Screen() {}

    public static Screen getInstance() {
        return instance;
    }

    public void down() {
        System.out.println("Theater Screen going down");
    }

    public void up() {
        System.out.println("Theater Screen going up");
    }
}
