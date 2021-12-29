import java.util.ArrayList;

public class Bundesstaat extends Land{

    private ArrayList<Land> laender;

    public Bundesstaat() {
        laender = new ArrayList<>();
    }



    public void add (Land a) {
      laender.add(a);
    }

    @Override
    public double getBruttoSozialProdukt() {
        double sum = 0;
        for (Land land:laender) {
            sum += land.getBruttoSozialProdukt();

        }
        return sum;
    }
}
