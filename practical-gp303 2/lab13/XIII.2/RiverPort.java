import java.util.Iterator;

public class RiverPort implements Port{
    private SeaPort seaPort;
    private RiverLogger riverLogger;

    public RiverPort(){
        this.seaPort = new SeaPort();
        this.riverLogger = new RiverLogger();
    }
    
    public boolean add(String ref, Ship ship){
        riverLogger.addlog("Add: " + ref + ", Ship: " + ship);
        try {
            if (((CargoShip) ship).cargo() > 10 || ((PassengerShip) ship).max_passengers() > 10){
                return false;
            }
            return seaPort.add(ref, ship);
        }
        catch (Exception e) {
            return false;
        }
    }

    public boolean exists(String ref){
        riverLogger.addlog("Exists Ref: " + ref);
        return seaPort.exists(ref);
    }

    public Ship remove(String ref){
        riverLogger.addlog("Remove Ref: " + ref);
        return seaPort.remove(ref);
    }

    public Iterator<String> iterator(){
        return seaPort.iterator();
    }

    public RiverLogger getRiverLogger(){
        return riverLogger;
    }

    @Override
    public String toString(){
        return seaPort.toString();
    }
}
