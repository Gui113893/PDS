public class SpicyPizzaBuilder extends PizzaBuilder{
    public SpicyPizzaBuilder(){
        super.reset();
    }

    @Override
    public void setDough() {
        super.pizza.setDough("Slim");
    }

    @Override
    public void setSauce() {
        super.pizza.setSauce("Hot");
    }

    @Override
    public void setTopping() {
        super.pizza.setTopping("Special");
    }
}
