public class TextEditor {
    private StringBuilder content;

    public TextEditor() {
        this.content = new StringBuilder();
    }

    public void type(String words) {
        content.append(words);
    }

    public String getContent() {
        return content.toString();
    }

    public Memento save() {
        return new Memento(content.toString());
    }

    public void restore(Memento memento) {
        content = new StringBuilder(memento.getState());
    }
}
