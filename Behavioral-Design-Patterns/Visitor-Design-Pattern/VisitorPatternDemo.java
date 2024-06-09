import java.util.ArrayList;
import java.util.List;

public class VisitorPatternDemo {
    public static void main(String[] args) {
        List<Element> elements = new ArrayList<>();
        elements.add(new Paragraph("Hello, this is a paragraph."));
        elements.add(new Image("/images/sample.jpg"));

        Visitor renderVisitor = new RenderVisitor();
        Visitor spellCheckVisitor = new SpellCheckVisitor();

        for (Element element : elements) {
            element.accept(renderVisitor);
        }

        System.out.println();

        for (Element element : elements) {
            element.accept(spellCheckVisitor);
        }
    }
}
