public class MediumSpeedState implements State {
    @Override
    public void turnUp(Fan fan) {
        fan.setState(new HighSpeedState());
        System.out.println("Fan is now on high speed.");
    }

    @Override
    public void turnDown(Fan fan) {
        fan.setState(new LowSpeedState());
        System.out.println("Fan is now on low speed.");
    }

    @Override
    public void printState() {
        System.out.println("Fan is on medium speed.");
    }
}
