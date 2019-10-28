package observer.news;

import observer.weather.WeatherForecast;

public interface Observer {

    void updateForecast(WeatherForecast weatherForecast);
}
