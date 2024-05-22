public class Off implements State{
    private CeilingFan fan;
    
    public void pull(){
        fan.setState(new LowSpeed());
    }

    public void setFan(CeilingFan fan){
        this.fan = fan;
    }
}
