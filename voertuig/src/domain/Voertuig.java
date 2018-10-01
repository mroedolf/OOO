package domain;

public class Voertuig {
    private String merk, naam, kleur;
    private int verbruik, kmPerJaar;
    private MotorSoort motorSoort;

    public Voertuig(String merk, String naam, String kleur, int verbruik, int kmPerJaar) {
        this.merk = merk;
        this.naam = naam;
        this.kleur = kleur;
        this.verbruik = verbruik;
        this.kmPerJaar = kmPerJaar;
    }

    public void setMotorSoort(MotorSoort motor){
        this.motorSoort = motor;
    }

    public int berekenUitsoot(){
        return motorSoort.berekenUitsoot(this.verbruik, this.kmPerJaar);
    }

}
