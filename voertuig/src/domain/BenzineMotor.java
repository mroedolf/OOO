package domain;

public class BenzineMotor implements MotorSoort {
    @Override
    public int berekenUitsoot(int verbruik, int kmPerJaar) {
        return verbruik*kmPerJaar;
    }
}
