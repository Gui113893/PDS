public class LowSpeed implements State{
    private CeilingFan fan;

    public void pull(){
        fan.setState(new MediumSpeed());
    }

    public void setFan(CeilingFan fan){
        this.fan = fan;
    }
}
