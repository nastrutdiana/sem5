public class Main extends AdapterMasina {
    public static void main(String[] args) {
        JucarieMobila j = new AdapterMasina();
        j.seDeplaseaza(10);
        j.emiteSunete("Lala");

        JucarieMobila j1 = new MasinaJucarie();
        j1.seDeplaseaza(20);
        j1.emiteSunete("Sound");
    }
}
