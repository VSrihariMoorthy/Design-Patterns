import java.util.Stack;

public class Caretaker {
    private Stack<Memento> history = new Stack<>();

    public void save(TextEditor textEditor) {
        history.push(textEditor.save());
    }

    public void undo(TextEditor textEditor) {
        if (!history.isEmpty()) {
            textEditor.restore(history.pop());
        } else {
            System.out.println("No states to undo");
        }
    }
}
