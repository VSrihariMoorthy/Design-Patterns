// Concrete Products for Windows
class WindowsButton implements Button {
    public void paint() {
        System.out.println("Rendering a button in a Windows style");
    }
}

class WindowsCheckbox implements Checkbox {
    public void paint() {
        System.out.println("Rendering a checkbox in a Windows style");
    }
}

// Concrete Factory for Windows
public class WindowsFactory implements GUIFactory {
    public Button createButton() {
        return new WindowsButton();
    }

    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
