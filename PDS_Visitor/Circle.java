public class Circle implements Shape{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void showArea() {
        System.out.println("Circle area: " + Math.PI * radius * radius);
    }
}
