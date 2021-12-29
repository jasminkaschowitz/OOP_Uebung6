public class Konto {

    protected String inhaber;
    protected double kontostand;

    public Konto(String inhaber) {
        this.inhaber = inhaber;
        kontostand = 0;
    }

    public String getInhaber() {
        return inhaber;
    }

    public void setInhaber(String inhaber) {
        this.inhaber = inhaber;
    }

    public double getKontostand() {
        return kontostand;
    }

    public void setKontostand(double kontostand) {
        this.kontostand = kontostand;
    }

    public void einzahlen (double wert) {
        kontostand += wert;
        System.out.println("Ihr Kontostand beträgt " + kontostand);
    }

    public void auszahlen (double wert) {
        kontostand -= wert;
        System.out.println("Ihr Kontostand beträgt: " + kontostand);
    }
}
