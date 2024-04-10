public class BasicCoffe implements Coffee{
   private final double cost = 1.0;
    
    public BasicCoffe(){}

    public double getCost(){
        return cost;
    }
    public String getDescription(){
        return "Basic coffe";
    }
}
