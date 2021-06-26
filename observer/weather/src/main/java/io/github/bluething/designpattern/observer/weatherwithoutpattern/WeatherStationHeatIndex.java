package io.github.bluething.designpattern.observer.weatherwithoutpattern;

public class WeatherStationHeatIndex {

    public static void main(String[] args) {
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();

        WeatherData weatherData = new WeatherData(currentDisplay, statisticsDisplay, forecastDisplay);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
