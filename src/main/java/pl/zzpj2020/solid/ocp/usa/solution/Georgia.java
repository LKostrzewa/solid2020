package pl.zzpj2020.solid.ocp.usa.solution;

public class Georgia implements State {

    private static final int MAX_SPEED = 60;

    @Override
    public double calculateSpeedLimitFine(int speed) {
        if(speed > MAX_SPEED){
            return 250.0;
        }
        else return 0.0;
    }
}
