public class FigureFactory {
    public static Figure createFigure(String figureType) {
        return switch (figureType) {
            case "Triangle" -> new Triangle();
            case "Rectangle" -> new Rectangle();
            case "Circle" -> new Circle();
            default -> null;
        };
    }
}
