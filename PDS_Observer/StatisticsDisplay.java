public class StatisticsDisplay implements Display{
    public StatisticsDisplay(){}

    public void update(WeatherData data){
        System.out.println(this + " |Temp - " + data.getTemperature() + "; Hum - " + data.getHumidity());
    }

    public String toString(){
        return "StatisticsDisplay";
    }
}
