public class RenderVisitor implements Visitor {
    @Override
    public void visit(Paragraph paragraph) {
        System.out.println("Rendering Paragraph: " + paragraph.getText());
    }

    @Override
    public void visit(Image image) {
        System.out.println("Rendering Image: " + image.getImagePath());
    }
}
