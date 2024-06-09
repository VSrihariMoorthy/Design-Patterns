public class MementoPatternDemo {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        textEditor.type("First sentence. ");
        caretaker.save(textEditor);

        textEditor.type("Second sentence. ");
        caretaker.save(textEditor);

        textEditor.type("Third sentence. ");
        System.out.println("Current Content: " + textEditor.getContent());

        caretaker.undo(textEditor);
        System.out.println("After first undo: " + textEditor.getContent());

        caretaker.undo(textEditor);
        System.out.println("After second undo: " + textEditor.getContent());
    }
}
