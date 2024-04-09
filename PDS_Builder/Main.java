public class Main {
    public static void main(String[] args) {
        
        PizzaBuilder hawaiianBuilder = new HawaiianPizzaBuilder();
        PizzaBuilder spicyBuilder = new SpicyPizzaBuilder();

        Waiter waiter = new Waiter();

        waiter.setBuilder(hawaiianBuilder);
        
        waiter.constructPizza();

        Pizza pizza = waiter.getPizza();
        
        System.out.println(pizza);

        waiter.setBuilder(spicyBuilder);
        
        waiter.constructPizza();

        pizza = waiter.getPizza();

        System.out.println(pizza);

    }
}
