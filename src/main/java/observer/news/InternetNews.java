package observer.news;

import observer.weather.WeatherForecast;

public class InternetNews implements Observer {

    public void updateForecast(final WeatherForecast weatherForecast) {
        System.out.println("Internet - nowa prognoza pogody: temperatura: " + weatherForecast.getTemperature() + "stopni, ciśnienie: " + weatherForecast.getPressure() +" hPa");
    }
}
