package pl.zzpj2020.solid.dip.weathertracker.solution;


import pl.zzpj2020.solid.dip.weathertracker.violation.Emailer;
import pl.zzpj2020.solid.dip.weathertracker.violation.Phone;

import java.util.List;

public class WeatherTracker {
    String currentConditions;
    CommDevice rainCommDevice;
    CommDevice sunCommDevice;

    public WeatherTracker(CommDevice rainCommDevice, CommDevice sunCommDevice) {
        this.rainCommDevice = rainCommDevice;
        this.sunCommDevice = sunCommDevice;
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        if (weatherDescription == "rainy") {
            String alert = rainCommDevice.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
        if (weatherDescription == "sunny") {
            String alert = sunCommDevice.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
    }
}
