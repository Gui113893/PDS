public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle() {

    }

    public Rectangle(double width, double height, String color) {
        if (width > 0 && height > 0) {
            this.width = width;
            this.height = height;
        }
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        }
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        }
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2*width + 2*height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Rectangle)) {
            return false;
        }

        Rectangle rect = (Rectangle) o;
        return super.equals(o) && rect.width == this.width && rect.height == this.height;
    }


    @Override
    public String toString() {
        return String.format("Retangulo { %s, comprimento=%f, altura=%f }", super.toString(), width, height);
    }
}
