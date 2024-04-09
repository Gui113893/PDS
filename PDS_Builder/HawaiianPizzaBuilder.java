public class HawaiianPizzaBuilder extends PizzaBuilder{

    public HawaiianPizzaBuilder(){
        super.reset();
    }

    @Override
    public void setDough() {
        super.pizza.setDough("Large");
    }

    @Override
    public void setSauce() {
        super.pizza.setSauce("Little");
    }

    @Override
    public void setTopping() {
        super.pizza.setTopping("Very");
    }
}
