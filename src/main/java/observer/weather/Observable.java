package observer.weather;

import observer.news.Observer;

public interface Observable {
    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers(Observer observer);
}
