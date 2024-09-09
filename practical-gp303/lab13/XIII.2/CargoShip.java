public class CargoShip implements Ship{
    private String code;
    private String name;
    private double cargo;

    public CargoShip(String code, String name, double cargo){
        this.code = code;
        this.name = name;
        this.cargo = cargo;
    }

    public String code(){
        return this.code;
    }

    public String name(){
        return this.name;
    }

    public double cargo(){
        return this.cargo;
    }

    @Override
    public String toString(){
        return this.getClass().getCanonicalName() + " [code=" + code() + ", name=" + name() + ", cargo=" + cargo() + "]";
    }
}


