public class Van implements Product{
    private String code;
    private String description;
    private int points;

    public Van(String code, String description, int points) {
        this.code = code;
        this.description = description;
        this.points = points;
    }

    public String code() {
        return code;
    }

    public String description() {
        return description;
    }

    public double points() {
        return points;
    }
}
