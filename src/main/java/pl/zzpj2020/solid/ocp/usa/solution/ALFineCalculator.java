package pl.zzpj2020.solid.ocp.usa.solution;

public class ALFineCalculator implements StateFineCalculator{
    private static final int AL_MAX_SPEED = 0;

    @Override
    public float calculateFine(float speed) {
        int fine = 0;
        if (speed > AL_MAX_SPEED) {
            // calculate...
        }
        return fine;
    }
}
