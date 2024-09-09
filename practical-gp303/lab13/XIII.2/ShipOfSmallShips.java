import java.util.List;
import java.util.ArrayList;

public class ShipOfSmallShips implements Ship{
    private String code;
    private String name;
    private int max_ships;
    private List<Ship> ships;
    private int passengers_capacity;

    public ShipOfSmallShips(String code, String name, int max_ships){
        this.code = code;
        this.name = name;
        this.max_ships = max_ships;
        this.ships = new ArrayList<>();
        this.passengers_capacity = 0;
    }

    public String code(){
        return code;
    }

    public String name(){
        return name;
    }

    public int getPassengersCapacity(){
        return passengers_capacity;
    }

    public List<Ship> getShips(){
        return ships;
    }

    public boolean add(Ship ship){
        if (ship instanceof PassengerShip){
            
            if (ships.size() + 1 <= max_ships){
                try {
                    ships.add(ship);
                    this.passengers_capacity += ((PassengerShip)ship).max_passengers();
                }
                catch (Exception e){
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public boolean remove(Ship ship){
        try {
            this.ships.remove(ship);
        }
        catch (Exception e){
            return false;
        }
        this.passengers_capacity -= ((PassengerShip) ship).max_passengers();
        return true;
    }

    @Override
    public String toString(){
        String string_to_concatenate = "Container Ship with " + getShips().size() + " ships. Total passengers capacity : " + getPassengersCapacity();

        for (Ship ship : ships) {
            string_to_concatenate += "\n\t\t\t" + ship.toString();
        }

        return string_to_concatenate;
    }

}
