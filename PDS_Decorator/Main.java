public class Main {
    public static void main(String[] args) {
        Coffee basicCoffe = new BasicCoffe();
        System.out.println(basicCoffe.getDescription() + " $" + basicCoffe.getCost());
        
        Coffee caramelCoffe = new Caramel(basicCoffe);
        System.out.println(caramelCoffe.getDescription() + " $" + caramelCoffe.getCost());
        
        Coffee caramelMochaCoffe = new Sugar(caramelCoffe);
        System.out.println(caramelMochaCoffe.getDescription() + " $" + caramelMochaCoffe.getCost());
    }
}
