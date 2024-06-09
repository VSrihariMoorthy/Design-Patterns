public class CommandPatternDemo {
    public static void main(String[] args) {
        // Create the receiver objects
        Light livingRoomLight = new Light();
        Fan livingRoomFan = new Fan();

        // Create command objects
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);
        Command fanOn = new FanOnCommand(livingRoomFan);
        Command fanOff = new FanOffCommand(livingRoomFan);

        // Create the invoker
        RemoteControl remote = new RemoteControl();

        // Turn on the light
        remote.setCommand(lightOn);
        remote.pressButton();

        // Turn off the light
        remote.setCommand(lightOff);
        remote.pressButton();

        // Turn on the fan
        remote.setCommand(fanOn);
        remote.pressButton();

        // Turn off the fan
        remote.setCommand(fanOff);
        remote.pressButton();
    }
}
