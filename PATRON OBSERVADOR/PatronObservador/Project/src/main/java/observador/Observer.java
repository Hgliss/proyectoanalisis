package observador;


//observara y proporcionara los datos al sujeto
public interface Observer {
    public void update(float temperature, float humidity, float pressure);
}
