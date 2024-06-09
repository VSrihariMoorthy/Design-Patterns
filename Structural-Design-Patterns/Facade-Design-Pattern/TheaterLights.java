public class TheaterLights {
    private static TheaterLights instance = new TheaterLights();

    private TheaterLights() {}

    public static TheaterLights getInstance() {
        return instance;
    }

    public void dim(int level) {
        System.out.println("Theater Lights dimming to " + level + "%");
    }

    public void on() {
        System.out.println("Theater Lights are ON");
    }
}