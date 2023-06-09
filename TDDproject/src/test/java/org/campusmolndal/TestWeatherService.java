package org.campusmolndal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

/**
 * Test class for WeatherService class
 */
public class TestWeatherService {


    // Set the mockWeatherAPI object to be used by the WeatherService object

    @Mock
    WeatherAPI mockWeatherAPI;
    WeatherService weatherService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        weatherService = new WeatherService(mockWeatherAPI);
    }

    @Test
    void testGetWeatherByValidCity() {
        // Arrange
        String mockJSONResponse = """
                {
                "city": "Stockholm",
                "temperature": 20.5,
                "humidity": 65,
                "clouds": 30
                }
                """; // mocked JSON response from the API (förslag från chatGPT)

        String expectedWeather = mockJSONResponse;
        when(mockWeatherAPI.getWeatherFromAPI("Stockholm")).thenReturn(expectedWeather);

        // Act
        String actualWeather = weatherService.getWeather("Stockholm");

        // Assert
        assertEquals(expectedWeather, actualWeather);
    }

    @Test
    void testGetTemperatureByValidCity() {
        // Arrange
        Double expectedTemperature = null;
        when(mockWeatherAPI.getTemperatureFromAPI("Stockholm")).thenReturn(expectedTemperature);

        // Act
        Double actualTemperature = weatherService.getTemperature("Stockholm");

        // Assert
        assertNull(actualTemperature);
    }



    @Test
    void testGetHumidityByValidCity() {
        Integer expectedHumidity = null;
        when(mockWeatherAPI.getHumidityFromAPI("Stockholm")).thenReturn(expectedHumidity);

        Integer actualHumidity = weatherService.getHumidity("Stockholm");

        assertNull(actualHumidity);
    }

    @Test
    void testGetCloudsByValidCity() {
        Integer expectedClouds = null;
        when(mockWeatherAPI.getCloudsFromAPI("Stockholm")).thenReturn(expectedClouds);

        Integer actualClouds = weatherService.getClouds("Stockholm");

        assertNull(actualClouds);
    }
    @Test
    void getWeatherByInvalidCity() {
        //arrange
        when(mockWeatherAPI.getWeatherFromAPI("Invalid City")).thenReturn(null);

        //act
        String actualWeather = weatherService.getWeather("Invalid City");

        //assert
        assertNull(actualWeather);
    }
}
