package observador;

import junit.framework.TestCase;

public class ForecastDisplayTest extends TestCase {
    private WeatherData weatherData;
    private ForecastDisplay forecastDisplay;

    public void setUp() throws Exception {
        weatherData = new WeatherData();
        forecastDisplay = new ForecastDisplay(weatherData);
    }

    public void testDisplay() {
        forecastDisplay.update(80, 65, 30.4f);
        String expectedForecastDisplay = "Forecast Display - Temperature: 80.0,% Humidity: 65.0, Pressure: 30.4";
        assertEquals(expectedForecastDisplay, forecastDisplay.getDisplay());

    }

    public void testUpdate() {
        weatherData.setMeasurements(80,65,30);
        assertEquals(80, forecastDisplay.getTemperature(),0.0001f);
        assertEquals(65, forecastDisplay.getHumidity(),0.0001f);
        assertEquals(30, forecastDisplay.getPressure(), 0.0001f);

    }
}