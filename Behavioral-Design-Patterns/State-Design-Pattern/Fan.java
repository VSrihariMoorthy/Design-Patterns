public class Fan {
    private State state;

    public Fan() {
        this.state = new OffState(); // Initial state
    }

    public void setState(State state) {
        this.state = state;
    }

    public void turnUp() {
        state.turnUp(this);
    }

    public void turnDown() {
        state.turnDown(this);
    }

    public void printState() {
        state.printState();
    }
}
