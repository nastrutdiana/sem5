public class AdapterMasina implements JucarieMobila{
    Masina m;

    public AdapterMasina() {
        m = new Autoturism();
    }

    @Override
    public void seDeplaseaza(int viteza) {
        m.ruleazaCuViteza(viteza);
    }

    @Override
    public void emiteSunete(String melodie) {
        m.claxoneaza(melodie);
    }
}
