package pl.zzpj2020.solid.ocp.usa.solution;

public class USASpeedLimitFines {
    public float calculateSpeedLimitFine(StateFineCalculator stateFineCalculator, float speed){
        return stateFineCalculator.calculateFine(speed);
    }
}
