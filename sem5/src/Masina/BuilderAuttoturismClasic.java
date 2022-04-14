package Masina;

public class BuilderAuttoturismClasic implements BuilderMasina{
    private Masina auto;

    public BuilderAuttoturismClasic() {
        auto = new AutoturismClasic();
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
