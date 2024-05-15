import java.util.ArrayList;

public class WeatherData {
    private ArrayList<Display> displays;
    private double temperature;
    private double humidity;

    public WeatherData(){
        this.displays = new ArrayList<Display>();
    }

    public void registerObserver(Display o){
        this.displays.add(o);
    }

    public void removeObserver(Display o){
        this.displays.remove(o);
    }

    public void notifySubscribers(){
        for(Display display: this.displays){
            display.update(this);
        }
    }

    public void setMeasurements(int temp, int humidity){
        this.temperature = temp;
        this.humidity = humidity;
        notifySubscribers();
    }

    public double getTemperature(){
        return this.temperature;
    }

    public double getHumidity(){
        return this.humidity;
    }
}
