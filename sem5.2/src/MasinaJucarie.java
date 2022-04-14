public class MasinaJucarie implements JucarieMobila{
    @Override
    public void seDeplaseaza(int viteza) {
        System.out.println(viteza + " km/h");
    }

    @Override
    public void emiteSunete(String melodie) {
        System.out.println("Melodie cantata: " + melodie);
    }
}
