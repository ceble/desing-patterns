package observer.news;

import observer.weather.WeatherForecast;

public class TvNews implements Observer {

    public void updateForecast(final WeatherForecast weatherForecast) {
        System.out.println("Telewizja - nowa prognoza pogody: temperatura: " + weatherForecast.getTemperature()
                + "stopni, ciśnienie: " + weatherForecast.getPressure() + " hPa");
    }
}
