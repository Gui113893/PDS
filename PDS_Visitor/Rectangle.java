public class Rectangle implements Shape{
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void showPerimeter(){
        System.out.println("Rectangle perimeter: " + 2 * (width + height));
    }
}
