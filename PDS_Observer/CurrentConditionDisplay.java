public class CurrentConditionDisplay implements Display{
    public CurrentConditionDisplay(){}

    public void update(WeatherData data){
        System.out.println(this+ " |Temp - " + data.getTemperature() + "; Hum - " + data.getHumidity());
    }

    public String toString(){
        return "CurrentConditionDisplay";
    }
}
