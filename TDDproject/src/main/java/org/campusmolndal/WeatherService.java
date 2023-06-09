package org.campusmolndal;

public class WeatherService {
    private WeatherAPI mockWeatherAPI;

    public WeatherService(WeatherAPI mockWeatherAPI) {
        this.mockWeatherAPI = mockWeatherAPI;
    }

    public String getWeather(String city) {
        return mockWeatherAPI.getWeatherFromAPI(city);
    }

    public Double getTemperature(String city) {
        return mockWeatherAPI.getTemperatureFromAPI(city);
    }

    public Integer getHumidity(String city) {
        return mockWeatherAPI.getHumidityFromAPI(city);
    }

    public Integer getClouds(String city) {
        return mockWeatherAPI.getCloudsFromAPI(city);
    }
}
