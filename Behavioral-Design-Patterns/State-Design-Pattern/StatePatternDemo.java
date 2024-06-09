public class StatePatternDemo {
    public static void main(String[] args) {
        Fan fan = new Fan();

        fan.printState();
        fan.turnUp();
        fan.printState();
        fan.turnUp();
        fan.printState();
        fan.turnUp();
        fan.printState();
        fan.turnUp();
        fan.printState();
        fan.turnDown();
        fan.printState();
        fan.turnDown();
        fan.printState();
        fan.turnDown();
        fan.printState();
        fan.turnDown();
        fan.printState();
    }
}
