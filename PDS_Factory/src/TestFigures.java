public class TestFigures {
    public static void main(String[] args) {
        Figure circle = FigureFactory.createFigure("Circle");
        System.out.println("Drawing a " + circle.getType());
        Figure rect = FigureFactory.createFigure("Rectangle");
        System.out.println("Drawing a " + rect.getType());
        Figure triangle = FigureFactory.createFigure("Triangle");
        System.out.println("Drawing a " + triangle.getType());
    }
}
