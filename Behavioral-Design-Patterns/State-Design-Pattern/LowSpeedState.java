public class LowSpeedState implements State {
    @Override
    public void turnUp(Fan fan) {
        fan.setState(new MediumSpeedState());
        System.out.println("Fan is now on medium speed.");
    }

    @Override
    public void turnDown(Fan fan) {
        fan.setState(new OffState());
        System.out.println("Fan is now off.");
    }

    @Override
    public void printState() {
        System.out.println("Fan is on low speed.");
    }
}
