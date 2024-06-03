// Concrete Products for MacOS
class MacOSButton implements Button {
    public void paint() {
        System.out.println("Rendering a button in a MacOS style");
    }
}

class MacOSCheckbox implements Checkbox {
    public void paint() {
        System.out.println("Rendering a checkbox in a MacOS style");
    }
}

// Concrete Factory for MacOS
public class MacOSFactory implements GUIFactory {
    public Button createButton() {
        return new MacOSButton();
    }

    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
