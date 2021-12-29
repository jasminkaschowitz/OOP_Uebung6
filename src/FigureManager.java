import java.util.ArrayList;
import java.util.HashMap;

public class FigureManager {

    private ArrayList<Figure> figuren = new ArrayList<>();

    public void add (Figure f) {
        figuren.add(f);
    }

    public double getMaxPerimeter() {
        double currentWert = 0;
        for (int i = 0; i < figuren.size(); i++) {
            if (currentWert < figuren.get(i).getPerimeter()) {
                currentWert = figuren.get(i).getPerimeter();

            }
        }
        return currentWert;
    }

    public double getAverageAreaSize() {
        double sum = 0;
        for (Figure figur:figuren) {
          sum += figur.getArea();
        }
        return sum / figuren.size();
    }

    public HashMap<String, Double> getAreaBySizeCategories() {
        HashMap<String, Double> areaBySizeCategories = new HashMap<>();
        String kategorie = null;
        for (Figure figur:figuren) {
            if (figur.getArea() < 1000) {
               kategorie = "Klein";}
               else if (figur.getArea() < 4999) {
                   kategorie = "Mittel";
               }
               else  {
                   kategorie = "Groß";
            }
               if (areaBySizeCategories.containsKey(kategorie))
               {
                   areaBySizeCategories.put(kategorie, areaBySizeCategories.get(kategorie) + figur.getArea());
               }
               else {
                 areaBySizeCategories.put(kategorie, figur.getArea());
               }

        }
        return areaBySizeCategories;
    }

}
