package observer.weather;

import java.util.HashSet;
import java.util.Set;

import observer.news.Observer;

public class WeatherForecast implements Observable{
    private int temperature;
    private int pressure;
    private Set<Observer> registeredObservers = new HashSet<Observer>();

    public WeatherForecast(final int temperature, final int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
    }

    public void updateForecast(int temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;

    }

    public int getTemperature() {
        return temperature;
    }

    public int getPressure() {
        return pressure;
    }

    public Set<Observer> getRegisteredObservers() {
        return registeredObservers;
    }

    public void registerObserver(final Observer observer) {
        registeredObservers.add(observer);

    }

    public void unregisterObserver(final Observer observer) {
        registeredObservers.remove(observer);

    }

    public void notifyObservers() {
        registeredObservers.toString();

    }
}
