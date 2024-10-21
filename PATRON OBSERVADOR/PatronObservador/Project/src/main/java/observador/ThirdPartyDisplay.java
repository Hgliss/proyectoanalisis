package observador;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ThirdPartyDisplay implements Observer, DisplayElement{
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public ThirdPartyDisplay( Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Third Party Display - Temperature: " + temperature
                + ", Humidity: " + humidity + ", Pressure: " + pressure);
    }

    public String getDisplay() {
        return "Third Party Display - Temperature: " + temperature + ",% Humidity: " + humidity + ", Pressure: " + pressure;
    }


    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

}
