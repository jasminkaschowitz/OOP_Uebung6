public class JugendGiroKonto extends GiroKonto{

    private double buchungslimit;

    public JugendGiroKonto(String inhaber, double limit, double buchungslimit) {
        super(inhaber, limit);
        this.buchungslimit = buchungslimit;
    }

    public double getBuchungslimit() {
        return buchungslimit;
    }

    @Override
    public void auszahlen(double wert) {

        if (wert > getBuchungslimit()) {
            limit = limit * -1;
            if ((kontostand - wert) < getLimit()) {
                kontostand = getLimit();}
            else {
                kontostand = getKontostand() - getBuchungslimit();
            }
            System.out.println("Ihr Kontostand beträgt " + kontostand);
        }
        else {
            super.auszahlen(wert);
        }


    }
}
