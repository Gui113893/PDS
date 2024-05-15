import java.util.ArrayList;

public class ChatMediator implements Mediator{
    private ArrayList<Colleague> colleagues;

    public ChatMediator(){
        this.colleagues = new ArrayList<Colleague>();
    }

    public void addColleague(Colleague colleague){
        colleagues.add(colleague);
    }

    public void notify(String message){
        for(Colleague colleague : colleagues){
            colleague.receiveMessage(message);
        }
    }

}
