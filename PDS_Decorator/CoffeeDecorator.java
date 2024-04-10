public abstract class CoffeeDecorator implements Coffee{
    Coffee wrappee;

    public CoffeeDecorator(Coffee wrappee){
        this.wrappee = wrappee;
    }

    public double getCost(){
        return wrappee.getCost();
    }

    public String getDescription(){
        return wrappee.getDescription();
    }
}
