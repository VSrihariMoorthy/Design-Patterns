public class DVDPlayer {
    private static DVDPlayer instance = new DVDPlayer();

    private DVDPlayer() {}

    public static DVDPlayer getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("DVD Player is ON");
    }

    public void off() {
        System.out.println("DVD Player is OFF");
    }

    public void play() {
        System.out.println("DVD Player is playing");
    }

    public void stop() {
        System.out.println("DVD Player has stopped");
    }
}
