package observador;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class WeatherData implements Subject {

    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    //Inicio de Constructor
    //Crea un array para almacenar los datos
    public WeatherData(){
        observers = new ArrayList ();
    }

    //Hace la agregacion de observador al array
    public void registerObserver(Observer o){
        observers.add(o);
    }

    //Elimina un observador de la lista de observadores
    public void removeObserver(Observer o){
        int i = observers.indexOf(o);
        if (i >= 0){
            observers.remove(i);
        }
    }

    //notifica a todos los observadores registrado cuando ocurre un cambio
    public void notifyObservers(){
        for (int i = 0; i < observers.size(); i++){
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    //Final de constructor

    //notifica los cambios
    public void measurementsChanged(){
        notifyObservers();
    }

    //recibe parametros de temperatura, humedad, presion
    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "observers=" + observers +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}';
    }
}
