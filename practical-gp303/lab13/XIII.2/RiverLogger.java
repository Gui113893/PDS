import java.util.ArrayList;
import java.util.List;

public class RiverLogger{
    private List<String> logs;

    public RiverLogger(){
        this.logs = new ArrayList<>();
    }

    public void addlog(String log){
        logs.add(log);
    }

    public void printCurrentLogs(){
        for (String log : logs){
            System.out.println(log);
        } 
    }
}