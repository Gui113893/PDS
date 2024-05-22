public class NumberProcessor {
    private Strategy strategy;

    public NumberProcessor(Strategy strategy){
        this.strategy = strategy;
    }

    public int performOperation(int v1, int v2){
        return strategy.execute(v1, v2);
    }

    public void setOperation(Strategy strategy){
        this.strategy = strategy;
    }
}
