package domain;

public class DieselMotor implements MotorSoort {

    @Override
    public int berekenUitsoot(int verbruik, int kmPerJaar) {
        return verbruik*kmPerJaar*2;
    }
}
