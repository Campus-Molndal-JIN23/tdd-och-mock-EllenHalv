package org.campusmolndal;

/**
 * WeatherService is a class that handles data collected from a weather API.
 */
public class WeatherService {
    private WeatherAPI mockWeatherAPI;

    public WeatherService(WeatherAPI mockWeatherAPI) {
        this.mockWeatherAPI = mockWeatherAPI;
    }

    public String getWeather(String city) {
        return mockWeatherAPI.getWeatherFromAPI("Stockholm");
    }

    public double getTemperature(String city) {
        return mockWeatherAPI.getTemperatureFromAPI("Stockholm");
    }

    public int getHumidity(String city) {
        return mockWeatherAPI.getHumidityFromAPI("Stockholm");
    }

    public int getClouds(String city) {
        return mockWeatherAPI.getCloudsFromAPI("Stockholm");
    }
}