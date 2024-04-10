public class Sugar extends CoffeeDecorator{
    public Sugar(Coffee wrappee){
        super(wrappee);
    }

    public double getCost(){
        return super.getCost() + 0.2;
    }

    public String getDescription(){
        return super.getDescription() + ", Sugar";
    }
}
