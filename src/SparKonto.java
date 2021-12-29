public class SparKonto extends Konto{

    public SparKonto(String inhaber) {
        super(inhaber);
    }

    @Override
    public void auszahlen(double wert) {
        double kontostand = getKontostand() - wert;
        if (kontostand < 0) {
            kontostand = 0;
        System.out.println("Ihr Konstostand beträgt " + kontostand);
        }
        else {
            super.auszahlen(wert);
        }
    }
}
