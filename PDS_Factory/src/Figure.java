public abstract class Figure {
    protected String color;

    public abstract double perimeter();
    public abstract double area();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return getClass().getSimpleName();
    }

    @Override
    public boolean equals(Object o) {
       if (this == o) return true;

       if (!(o instanceof Figure)) {
           return false;
       }

        return this.color.equals(((Figure) o).color);
    }

    @Override
    public String toString() {
        return "Cor: " + color + ", Area: " + area() + ", Perimeter: " + perimeter();
    }
}
