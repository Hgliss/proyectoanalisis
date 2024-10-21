package observador;
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;


    //Construcgor que hara notificaciones al sujeto
    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    //actualizar y mostrar datos
    public void update (float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;

    }
    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and" + humidity + "% humidity");
    }

    public String getDisplayData() {
        return "Current conditions: " + temperature + "F degrees and " + humidity + "% humidity";
    }
}
