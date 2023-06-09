package org.campusmolndal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

/**
 * Test class for WeatherService class
 */
public class TestWeatherService {

    @Mock
    WeatherAPI mockWeatherAPI;
    WeatherService weatherService;

    // Set up the mockWeatherAPI object
    @BeforeEach
    public void setUp() {
        mockWeatherAPI = Mockito.mock(WeatherAPI.class);
        weatherService = new WeatherService(mockWeatherAPI);

        // Set up the behavior of the mockWeatherAPI object
        when(mockWeatherAPI.getWeatherFromAPI("Stockholm")).thenReturn(
                "{\n" +
                        "   \"city\": \"Stockholm\",\n" +
                        "   \"temperature\": 20.5,\n" +
                        "   \"humidity\": 65,\n" +
                        "   \"clouds\": 30\n" +
                        "}"
        );

        when(mockWeatherAPI.getTemperatureFromAPI("Stockholm")).thenReturn(20.5);
        when(mockWeatherAPI.getHumidityFromAPI("Stockholm")).thenReturn(65);
        when(mockWeatherAPI.getCloudsFromAPI("Stockholm")).thenReturn(30);
    }

    @Test
    void testGetWeatherByValidCity() {
        // Arrange
        String expectedWeather = "{\n" +
                "   \"city\": \"Stockholm\",\n" +
                "   \"temperature\": 20.5,\n" +
                "   \"humidity\": 65,\n" +
                "   \"clouds\": 30\n" +
                "}";

        // Act
        String actualWeather = weatherService.getWeather("Stockholm");

        // Assert
        assertEquals(expectedWeather, actualWeather);
    }

    @Test
    void testGetTemperatureByValidCity() {
        // Arrange
        double expectedTemperature = 20.5;

        // Act
        double actualTemperature = weatherService.getTemperature("Stockholm");

        // Assert
        assertEquals(expectedTemperature, actualTemperature);
    }

    @Test
    void testGetHumidityByValidCity() {
        // Arrange
        int expectedHumidity = 65;

        // Act
        int actualHumidity = weatherService.getHumidity("Stockholm");

        // Assert
        assertEquals(expectedHumidity, actualHumidity);
    }

    @Test
    void testGetCloudsByValidCity() {
        // Arrange
        int expectedClouds = 30;

        // Act
        int actualClouds = weatherService.getClouds("Stockholm");

        // Assert
        assertEquals(expectedClouds, actualClouds);
    }

    @Test
    void testGetWeatherByInvalidCity() {
        // Arrange
        when(mockWeatherAPI.getWeatherFromAPI("Invalid City")).thenReturn(null);

        // Act
        String actualWeather = weatherService.getWeather("Invalid City");

        // Assert
        assertNull(actualWeather);
    }
}
