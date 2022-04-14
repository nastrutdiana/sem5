public class Autoturism implements Masina{

    @Override
    public void ruleazaCuViteza(int viteza) {
        System.out.println(viteza + " km/h");
    }

    @Override
    public void claxoneaza(String sunet) {
        System.out.println(sunet);
    }
}
