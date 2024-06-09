public class Football extends Game {
    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Game Started. Welcome to Football!");
    }

    @Override
    void endPlay() {
        System.out.println("Game Finished!");
    }
}
