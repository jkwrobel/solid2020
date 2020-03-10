package pl.zzpj2020.solid.ocp.usa.solution;

public class GAFineCalculator implements StateFineCalculator {
    private static final int GA_MAX_SPEED = 0;

    @Override
    public float calculateFine(float speed) {
        int fine = 0;
        if (speed > GA_MAX_SPEED) {
            // calculate...
        }
        return fine;
    }
}
