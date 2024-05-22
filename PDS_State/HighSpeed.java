public class HighSpeed implements State{
    private CeilingFan fan;

    public void pull(){
        fan.setState(new Off());
    }

    public void setFan(CeilingFan fan){
        this.fan = fan;
    }
}
