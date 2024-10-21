package observador;

import junit.framework.TestCase;

public class ThirdPartyDisplayTest extends TestCase {
    private WeatherData weatherData;
    private ThirdPartyDisplay thirdPartyDisplay;

    public void setUp() throws Exception {
        weatherData = new WeatherData();
        thirdPartyDisplay = new ThirdPartyDisplay(weatherData);
    }

    public void testDisplay() {
        thirdPartyDisplay.update(80, 65, 30.4f);
        String expectedThirdDisplay = "Third Party Display - Temperature: 80.0,% Humidity: 65.0, Pressure: 30.4";
        assertEquals(expectedThirdDisplay, thirdPartyDisplay.getDisplay());

    }

    public void testUpdate() {
        weatherData.setMeasurements(80,65,30);
        assertEquals(80, thirdPartyDisplay.getTemperature(),0.0001f);
        assertEquals(65, thirdPartyDisplay.getHumidity(),0.0001f);
        assertEquals(30, thirdPartyDisplay.getPressure(), 0.0001f);

    }
}