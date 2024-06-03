// Abstract Products
interface Button {
    void paint();
}

interface Checkbox {
    void paint();
}

// Abstract Factory
interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
