public class Colleague {
    private ChatMediator mediator;

    public Colleague(ChatMediator mediator){
        this.mediator = mediator;
    }

    public void sendMessage(String message){
        mediator.notify(message);
    }

    public void receiveMessage(String message){
        System.out.println("Message received - " + message);
    }
}
