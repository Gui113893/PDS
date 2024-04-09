public class Waiter {
    private PizzaBuilder builder; 

    public void setBuilder(PizzaBuilder pizzaBuilder) {
        this.builder = pizzaBuilder;
    }

    public Pizza getPizza() {
        return builder.getPizza();
    }

    public void constructPizza() {
        builder.reset();
        builder.setDough();
        builder.setSauce();
        builder.setTopping();
    }
}
