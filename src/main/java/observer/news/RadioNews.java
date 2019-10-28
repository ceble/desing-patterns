package observer.news;

import observer.weather.WeatherForecast;

public class RadioNews implements Observer{

    public void updateForecast(final WeatherForecast weatherForecast) {
        System.out.println("Radio - nowa prognoza pogody: temperatura: " + weatherForecast.getTemperature() + "stopni, ciśnienie: " + weatherForecast.getPressure() +" hPa");
    }
}
