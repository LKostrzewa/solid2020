package pl.zzpj2020.solid.ocp.usa.solution;

public class Alabama implements State {

    private static final int MAX_SPEED = 40;

    @Override
    public double calculateSpeedLimitFine(int speed) {
        if(speed > MAX_SPEED) {
            return (speed - MAX_SPEED) * 15.0;
        }
        else return 0.0;
    }
}
