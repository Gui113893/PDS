public class Milk extends CoffeeDecorator{
    public Milk(Coffee wrappee){
        super(wrappee);
    }

    public double getCost(){
        return super.getCost() + 0.5;
    }

    public String getDescription(){
        return super.getDescription() + ", Milk";
    }
}
