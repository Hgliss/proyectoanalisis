package observador;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ForecastDisplay implements Observer, DisplayElement{
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Forecast Display - Temperature: " + temperature
                + ", Humidity: " + humidity + ", Pressure: " + pressure);
    }

    public String getDisplay() {
        return "Forecast Display - Temperature: " + temperature + ",% Humidity: " + humidity + ", Pressure: " + pressure;
    }


    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

}
