package Masina;

public class BuilderAutoturismElectric implements BuilderMasina{
    private Masina auto;

    public BuilderAutoturismElectric() {
        auto = new AutoturismElectric();
    }

    @Override
    public void buildSasiu(String sasiu) {
        auto.setSasiu(sasiu);
    }

    @Override
    public void buildRoti(String roti) {
        auto.setRoti(roti);
    }

    @Override
    public void buildMotor(String motor) {
        auto.setMotor(motor);
    }

    @Override
    public void buildInterior(String interior) {
        auto.setInterior(interior);
    }

    @Override
    public Masina getMasina() {
        return auto;
    }
}
