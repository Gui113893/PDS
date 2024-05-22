public class MediumSpeed implements State{
    private CeilingFan fan;
    
    public void pull(){
        fan.setState(new HighSpeed());
    }

    public void setFan(CeilingFan fan){
        this.fan = fan;
    }
}
