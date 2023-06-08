package org.campusmolndal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

/**
 * Test class for WeatherService class
 */
public class TestWeatherService {

    @Mock
    WeatherAPI mockWeatherAPI;
    WeatherService mockWeatherService;

    @BeforeEach
    public void setUp() {
        // Create a mock object of the WeatherService class using Mockito
        mockWeatherAPI = Mockito.mock(WeatherAPI.class);

        // Create a WeatherService mock object to test
        mockWeatherService = Mockito.mock(WeatherService.class);

        // Set the mockWeatherAPI object to be used by the mockWeatherService object
        String mockJSONResponse = """
                {
                "city": "Stockholm",
                "temperature": 20.5,
                "humidity": 65,
                "clouds": 30
                }
                """; // mocked JSON response from the API

        Mockito.when(mockWeatherAPI.getWeatherFromAPI("Stockholm")).thenReturn(mockJSONResponse);
        mockWeatherService = new WeatherService(mockWeatherAPI);
    }

    //ex.
    // empty city
    // null city
    // city with special characters
    // invalid city

    // return correct temperature
    // no internet connection

    @Test
    void testGetWeatherByValidCity() {
        //arrange

        //act

        //assert

    }

    @Test
    void testGetTemperatureByValidCity() {

    }

    @Test
    void testGetHumidityByValidCity() {

    }

    @Test
    void testGetCloudsByValidCity() {

    }

    @Test
    void getWeatherByInvalidCity() {

    }

    @Test
    void getWeatherByValidCityWithNoInternetConnection() {

    }

    @Test
    void getWeatherByValidCityWithSpecialCharacters() {

    }
}
