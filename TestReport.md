# Test Report - WeatherService TDD & Mock 

By: Ellen Halvardsson

| Test Description              | Expected Result	                | Actual Result	             | Status	 | Comments                       |
|-------------------------------|---------------------------------|----------------------------|---------|--------------------------------|
| testGetWeatherByValidCity     | Should return valid JSON string | Returned valid JSON string | Passed  | No issues identified           |
| testGetTemperatureByValidCity | 20.5                            | 20.5                       | Passed  | No issues identified           |
| testGetHumidityByValidCity    | 65                              | 65                         | Passed  | No issues identified           |
| testGetCloudsByValidCity      | 30                              | 30                         | Passed  | No issues identified           |
| getWeatherByInvalidCity       | Should return null              | Returned null              | Passed  | Handled invalid city correctly |