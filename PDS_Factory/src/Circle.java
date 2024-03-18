public class Circle extends Figure {
    private double radius;

    public Circle() {

    }

    public Circle(double radius, String color) {
        if (radius > 0) {
            this.radius = radius;
        }
        this.color = color;
    }

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }

    @Override
    public double perimeter() {
        return 2 * radius * Math.PI;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }

    public double getRadius() {
        return radius;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Circle)) {
            return false;
        }

        Circle circle = (Circle) o;
        return super.equals(o) && circle.radius == this.radius;
    }


    @Override
    public String toString() {
        return String.format("Circulo { %s, raio=%f }", super.toString(), radius);
    }
}
