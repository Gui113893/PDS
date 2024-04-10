public class Caramel extends CoffeeDecorator{
    public Caramel(Coffee wrappee){
        super(wrappee);
    }

    public double getCost(){
        return super.getCost() + 0.7;
    }

    public String getDescription(){
        return super.getDescription() + ", Caramel";
    }
}
