package pl.zzpj2020.solid.ocp.usa.solution;

public class SCFineCalculator implements StateFineCalculator {
    private static final int SC_MAX_SPEED = 0;

    @Override
    public float calculateFine(float speed) {
        int fine = 0;
        if (speed > SC_MAX_SPEED) {
            // calculate...
        }
        return fine;
    }
}
