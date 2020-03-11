package pl.zzpj2020.solid.dip.weathertracker.solution;


import pl.zzpj2020.solid.dip.weathertracker.violation.Emailer;
import pl.zzpj2020.solid.dip.weathertracker.violation.Phone;

public class WeatherTracker {
    String currentConditions;
    Generator generator;

    public WeatherTracker(Generator generator) {
        this.generator = generator;
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        if (weatherDescription == "rainy") {
            String alert = generator.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
        if (weatherDescription == "sunny") {
            String alert = generator.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
    }
}
