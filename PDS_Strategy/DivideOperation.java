public class DivideOperation implements Strategy{
    public int execute(int v1, int v2){
        if (v2 == 0){
            throw new IllegalArgumentException("Cannot divide by zero");
        } else {
            return v1 / v2;
        }
    }
}
