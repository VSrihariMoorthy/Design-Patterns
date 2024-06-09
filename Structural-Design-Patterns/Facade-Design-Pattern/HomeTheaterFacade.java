public class HomeTheaterFacade {
    private DVDPlayer dvd;
    private Projector projector;
    private TheaterLights lights;
    private Screen screen;

    public HomeTheaterFacade() {
        this.dvd = DVDPlayer.getInstance();
        this.projector = Projector.getInstance();
        this.lights = TheaterLights.getInstance();
        this.screen = Screen.getInstance();
    }

    public void watchMovie() {
        System.out.println("Get ready to watch a movie...");
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        dvd.on();
        dvd.play();
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        lights.on();
        screen.up();
        projector.off();
        dvd.stop();
        dvd.off();
    }
}
