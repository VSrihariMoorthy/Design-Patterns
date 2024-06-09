public class OffState implements State {
    @Override
    public void turnUp(Fan fan) {
        fan.setState(new LowSpeedState());
        System.out.println("Fan is now on low speed.");
    }

    @Override
    public void turnDown(Fan fan) {
        System.out.println("Fan is already off.");
    }

    @Override
    public void printState() {
        System.out.println("Fan is off.");
    }
}
