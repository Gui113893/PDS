public class PassengerShip implements Ship{
    private String code;
    private String name;
    private int max_passengers;

    public PassengerShip(String code, String name, int max_passengers){
        this.code = code;
        this.name = name;
        this.max_passengers = max_passengers;
    }

    public String code(){
        return this.code;
    }

    public String name(){
        return this.name;
    }

    public int max_passengers(){
        return this.max_passengers;
    }

    @Override
    public String toString(){
        return this.getClass().getCanonicalName() + " [code=" + code() + ", name=" + name() + ", passengers=" + max_passengers() + "]";
    }
}
