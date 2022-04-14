package Masina;

public class InginerAuto {
    private BuilderMasina b;
    public InginerAuto(String tipMasini){

    }
    public  void buildMasina(String interior, String motor, String sasiu, String roti){
        b.buildInterior(interior);
        b.buildMotor(motor);
        b.buildSasiu(sasiu);
        b.buildRoti(roti);
    }
    public Masina getMasina(){
        return b.getMasina();
    }
}
