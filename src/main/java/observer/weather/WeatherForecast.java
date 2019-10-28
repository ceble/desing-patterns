package observer.weather;

import java.util.HashSet;
import java.util.Set;

import observer.news.Observer;

public class WeatherForecast implements Observable{
    int temperature;
    int pressure;
    Set<Observer> registeredObservers = new HashSet<Observer>();

    public void updateForecast(final WeatherForecast weatherForecast) {

    }

    private int getTemperature() {
        return temperature;
    }

    private int getPressure() {
        return pressure;
    }

    private Set<Observer> getRegisteredObservers() {
        return registeredObservers;
    }

    public void registerObserver(final Observer observer) {

    }

    public void unregisterObserver(final Observer observer) {

    }

    public void notifyObserver(final Observer observer) {

    }
}
