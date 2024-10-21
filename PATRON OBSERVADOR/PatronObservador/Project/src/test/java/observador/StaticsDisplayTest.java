package observador;

import junit.framework.TestCase;

public class StaticsDisplayTest extends TestCase {
    private WeatherData weatherData;
    private StaticsDisplay staticsDisplay;

    public void setUp() throws Exception {
        weatherData = new WeatherData();
        staticsDisplay = new StaticsDisplay(weatherData);
    }

    public void testDisplay() {
        staticsDisplay.update(80, 65, 30.4f);
        String expectedThirdDisplay = "Statics Display - Temperature: 80.0,% Humidity: 65.0, Pressure: 30.4";
        assertEquals(expectedThirdDisplay, staticsDisplay.getDisplay());

    }

    public void testUpdate() {
        weatherData.setMeasurements(80,65,30);
        assertEquals(80, staticsDisplay.getTemperature(),0.0001f);
        assertEquals(65, staticsDisplay.getHumidity(),0.0001f);
        assertEquals(30, staticsDisplay.getPressure(), 0.0001f);

    }
}