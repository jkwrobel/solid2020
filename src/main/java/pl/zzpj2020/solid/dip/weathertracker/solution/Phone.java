package pl.zzpj2020.solid.dip.weathertracker.solution;

public class Phone implements CommDevice{
    public String generateWeatherAlert(String weatherConditions) {
        return "It is " + weatherConditions;
    }
}
