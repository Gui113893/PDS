import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Iterator;

public class SeaPort implements Port{
    private Map<String, Ship> ships;

    public SeaPort(){
        this.ships = new HashMap<>();
    }

    public Map<String, Ship> getShips(){
        return ships;
    }

    public boolean add(String ref, Ship ship){
        try {    
            ships.put(ref, ship);
        }
        catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean exists(String ref){
        return ships.containsKey(ref);
    }

    public Ship remove(String ref){
        Ship removedShip = ships.get(ref);
        ships.remove(ref);
        return removedShip;
    }

    public Iterator<String> iterator(){
        return this.ships.entrySet().stream().map((Entry<String,Ship> entry) -> {
            return "Ref: " + entry.getKey() + " - " + entry.getValue();
        }).iterator();
    }
}
