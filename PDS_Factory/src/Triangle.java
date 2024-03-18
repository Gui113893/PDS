public class Triangle extends Figure {
    private double l1;
    private double l2;
    private double l3;

    public Triangle() {

    }

    public Triangle(double l1, double l2, double l3, String color) {
        if (!isValid(l1, l2, l3)) {
            throw new IllegalArgumentException("Invalid triangle");
        }

        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
        this.color = color;
    }

    public static boolean isValid(double l1, double l2, double l3) {
        return l1 > 0 && l2 > 0 && l3 > 0 && l1 + l2 > l3 && l1 + l3 > l2 && l2 + l3 > l1;
    }

    public void setL1(double l1) {
        if (l1 > 0) {
            this.l1 = l1;
        }
    }

    public void setL2(double l2) {
        if (l2 > 0) {
            this.l2 = l2;
        }
    }

    public void setL3(double l3) {
        if (l3 > 0) {
            this.l3 = l3;
        }
    }

    public double getL1() {
        return l1;
    }

    public double getL2() {
        return l2;
    }

    public double getL3() {
        return l3;
    }

    @Override
    public double area() {
        double p = (l1+l2+l3)/2;

        return Math.sqrt(p*(p-l1)*(p-l2)*(p-l3));
    }

    @Override
    public double perimeter() {
        return l1 + l2 + l3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Triangle)) {
            return false;
        }

        Triangle triangle = (Triangle) o;

        return super.equals(o) && triangle.l1 == this.l1 && triangle.l2 == triangle.l2 && triangle.l3 == this.l3;
    }

    @Override
    public String  toString() {
        return String.format("Triangulo { %s, l1=%f, l2=%f, l3=%f }", super.toString(), l1, l2, l3);
    }
}
