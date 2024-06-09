public class SpellCheckVisitor implements Visitor {
    @Override
    public void visit(Paragraph paragraph) {
        System.out.println("Checking spelling in Paragraph: " + paragraph.getText());
        // Here you would have spell-checking logic
    }

    @Override
    public void visit(Image image) {
        System.out.println("No spell check for Image: " + image.getImagePath());
    }
}
