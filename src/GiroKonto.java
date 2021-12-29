public class GiroKonto extends Konto{
    protected double limit;

    public GiroKonto(String inhaber, double limit) {
        super(inhaber);
        this.limit = limit;
    }

    public double getLimit() {
        return limit;
    }

    @Override
    public void auszahlen(double wert) {
        double limit = getLimit() * -1;
        if ((kontostand - wert) < limit) {
            kontostand = limit;
            System.out.println("Ihr Kontostand beträgt: " + kontostand);

        }
        else {
            super.auszahlen(wert);
        }
    }
}
