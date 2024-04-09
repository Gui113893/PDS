public abstract class PizzaBuilder {
    protected Pizza pizza;

    public Pizza getPizza() {
        Pizza pizza = this.pizza;
        this.reset();
        return pizza;
    }
    public void reset() {pizza = new Pizza();}

    public abstract void setDough();
    public abstract void setSauce();
    public abstract void setTopping();
}
