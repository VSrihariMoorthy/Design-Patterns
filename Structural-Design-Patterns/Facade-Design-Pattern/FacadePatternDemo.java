public class FacadePatternDemo {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade();

        homeTheater.watchMovie();
        System.out.println();
        homeTheater.endMovie();
    }
}
