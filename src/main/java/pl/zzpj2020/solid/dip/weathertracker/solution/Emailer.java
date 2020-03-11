package pl.zzpj2020.solid.dip.weathertracker.solution;


public class Emailer implements CommDevice {

    public String generateWeatherAlert(String weatherConditions) {
        return "It is " + weatherConditions;
    }
}
