public class HighSpeedState implements State {
    @Override
    public void turnUp(Fan fan) {
        System.out.println("Fan is already on high speed.");
    }

    @Override
    public void turnDown(Fan fan) {
        fan.setState(new MediumSpeedState());
        System.out.println("Fan is now on medium speed.");
    }

    @Override
    public void printState() {
        System.out.println("Fan is on high speed.");
    }
}
