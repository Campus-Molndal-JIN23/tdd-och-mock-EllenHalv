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

    public Double getTemperature(String city) { return mockWeatherAPI.getTemperatureFromAPI("Stockholm");
    }

    public Integer getHumidity(String city) {
        return mockWeatherAPI.getHumidityFromAPI("Stockholm");
    }

    public Integer getClouds(String city) {
        return mockWeatherAPI.getCloudsFromAPI("Stockholm");
    }
}