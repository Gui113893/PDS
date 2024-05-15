public class Main{
    public static void main(String[] args) {
        WeatherData weatherdata = new WeatherData();

        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();

        weatherdata.registerObserver(currentDisplay);
        weatherdata.registerObserver(statisticsDisplay);

        weatherdata.setMeasurements(28, 65);
        weatherdata.setMeasurements(22, 70);
        weatherdata.setMeasurements(26, 90);
    }
}