import java.util.ArrayList;

public class LandDemo {

    public static void main(String[] args) {
        Bundesstaat oesterreich = new Bundesstaat();
        Bundesland graz = new Bundesland(50400);
        Bundesland wien = new Bundesland(96417);
        oesterreich.add(graz);
        oesterreich.add(wien);
        System.out.println(oesterreich.getBruttoSozialProdukt());
    }
}
