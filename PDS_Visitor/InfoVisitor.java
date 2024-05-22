public class InfoVisitor implements Visitor{

    public void visit(Rectangle rectangle){
        rectangle.showPerimeter();
    }

    public void visit(Circle circle){
        circle.showArea();
    }
}
