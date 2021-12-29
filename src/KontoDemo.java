import java.util.ArrayList;
import java.util.HashMap;

public class KontoDemo {

    public static void main(String[] args) {
      GiroKonto giroKonto1 = new GiroKonto("Mustermann", 100);
      SparKonto sparKonto1 = new SparKonto("Mustermann");
      JugendGiroKonto jugendGiroKonto = new JugendGiroKonto("Tweeny", 300, 250);
      Konto konto1 = jugendGiroKonto;

      jugendGiroKonto.einzahlen(100);
      jugendGiroKonto.auszahlen(210);

      GiroKonto giroKonto2 = (GiroKonto) konto1;

      giroKonto1.einzahlen(300);
      giroKonto1.auszahlen(500);
      sparKonto1.einzahlen(400);
      sparKonto1.auszahlen(500);


      ArrayList<Konto> konten = new ArrayList<>();
      konten.add(giroKonto1);
      konten.add(sparKonto1);
      konten.add(jugendGiroKonto);

      HashMap<String, Integer> kontenProInhaber = new HashMap<>();
      for (Konto inhaber: konten) {
        String name = inhaber.getInhaber();
        if (kontenProInhaber.containsKey(name)) {
          kontenProInhaber.put(name, kontenProInhaber.get(name)+1);
        }
        else {
          kontenProInhaber.put(name, 1);
        }

      }
      System.out.println(kontenProInhaber);


    }
}
