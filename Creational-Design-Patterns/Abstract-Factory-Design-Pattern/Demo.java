public class Demo {
    public static void main(String[] args) {
        GUIFactory factory = new WindowsFactory();
        Application app = new Application(factory);
        app.paint();
        
        factory = new MacOSFactory();
        app = new Application(factory);
        app.paint();
    }
}
