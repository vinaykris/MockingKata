package main;

public class WeatherService {
    private WeatherApi weatherApi;

    public WeatherService(WeatherApi weatherApi) {
        this.weatherApi = weatherApi;
    }

    public String getWeatherForecast(String location) {
        return weatherApi.fetchWeather(location);
    }
}
