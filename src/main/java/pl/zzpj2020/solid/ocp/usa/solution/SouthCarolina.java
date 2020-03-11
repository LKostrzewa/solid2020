package pl.zzpj2020.solid.ocp.usa.solution;

public class SouthCarolina implements State {

    private static final int MAX_SPEED = 55;

    @Override
    public double calculateSpeedLimitFine(int speed) {
        if(speed > MAX_SPEED){
            if(speed > 200){
                return 2000.0;
            }
            else return 150.0;
        }
        else return 0.0;
    }
}
